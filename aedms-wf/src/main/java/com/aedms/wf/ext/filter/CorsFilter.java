package com.aedms.wf.ext.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

//@Component(value="corsFilter1")
public class CorsFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	
	        response.setHeader("Access-Control-Allow-Origin", "*");
	        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
	            response.setHeader("Access-Control-Allow-Credentials", "true");
	            response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
	            response.setHeader("Access-Control-Allow-Headers", "accept, x-requested-with, Content-Type, Accept-Language, Accept-Encoding ,Origin, Access-Control-Request-Method ,Access-Control-Request-Headers, Last-Modified, Cookie, Referer");
	            response.setHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin,Accept-Ranges,Content-Encoding,Content-Length,Content-Range");
	            response.setHeader("Access-Control-Max-Age", "100");
	        }

	        filterChain.doFilter(request, response);

		
	}
	
}

