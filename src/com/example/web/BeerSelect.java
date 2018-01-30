package com.example.web;

import com.example.model.*;
import foo.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class BeerSelect  extends HttpServlet{
    public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
                    throws IOException,ServletException{
        // response.setContentType("text/html");
        // PrintWriter out = response.getWriter();
        // out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");                
        // out.println("<br>Got beer color " + c);
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        // Iterator it = result.iterator();
        // while (it.hasNext()) {
            // System.out.println("测试!!!!");
        // }
        Person p  = new Person();
        p.setName("Evan");
        request.setAttribute("person",p);
        request.setAttribute("name","name");
        request.setAttribute("styles",result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
    }
    
}