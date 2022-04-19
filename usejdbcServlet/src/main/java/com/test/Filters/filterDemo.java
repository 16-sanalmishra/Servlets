package com.test.Filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
@WebFilter("/demoServlet")
public class filterDemo extends HttpFilter implements Filter {
    public filterDemo() {
        super();
    }
	public void destroy() {
		System.out.println("Inside Fiter destroy");

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter writer = response.getWriter();
		writer.println("Hii from doFilter");
		
		chain.doFilter(request, response);
		writer.println("Bye from doFilter");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Inside Fiter Init");
	}

}
