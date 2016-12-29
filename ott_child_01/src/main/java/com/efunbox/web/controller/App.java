package com.efunbox.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello world!
 *
 */
@WebServlet(name="App",urlPatterns="/App")
public class App extends HttpServlet{
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
    	System.out.println("------------------------------");
    	request.setAttribute("message", "hello");
    	request.getRequestDispatcher("WEB-INF/views/app.jsp").forward(request, response);
    }
}
