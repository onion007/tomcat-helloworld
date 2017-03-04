package heconghua;

import java.io.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;  
import javax.servlet.ServletRequest; 
import javax.servlet.ServletResponse;  
import java.io.IOException;

public class helloworld implements Servlet {
	public void init(ServletConfig parm1) throws ServletException {
		System.out.println("init");
	}
	
	public ServletConfig getServletConfig() {  
        return null;  
    }
	
	public void service(ServletRequest parm1, ServletResponse res) throws ServletException, IOException {
        System.out.println("service it");  
        PrintWriter pw = res.getWriter();     
        pw.println("Hello World!");
    }
	
	public String getServletInfo() {  
        return "";  
    }
	
	public void destroy() {  
        System.out.println("destroy!");  
    }
}
