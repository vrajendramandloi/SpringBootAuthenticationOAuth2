package com.uni.VikkySpringMavnMySqlGCPDemo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
class BearerTokenFilter extends OncePerRequestFilter { // or GenericFilterBean

    private static final String HEADER_NAME = "Authorization";
    private static final String TOKEN_PREFIX = "Bearer ";


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        /*String path = request.getRequestURI(); //get Path
        if (path.startsWith("/public/")) { //check if Path starts with public

            filterChain.doFilter(request, response);
            return;
        }*/

        String header = request.getHeader(HEADER_NAME);
        if (header != null && header.startsWith(TOKEN_PREFIX)) {
            String token = header.substring(TOKEN_PREFIX.length());

            // TODO:  Perform token validation here.  Example:
            if (isValidToken(token)) { // Replace with your token validation logic
                // If valid, continue to the next filter/endpoint
                filterChain.doFilter(request, response);
                return; // Important: exit after successful authentication
            }


        }

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 401 Unauthorized

    }

    // Replace with your actual token validation logic.  This is just a placeholder.
    private boolean isValidToken(String token) {
        return "valid-token".equals(token); // Example: Check against a hardcoded token (for demonstration only)
    }


}