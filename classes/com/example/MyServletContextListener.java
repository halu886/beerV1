package com.example;
import javax.servlet.*;
public class MyServletContextListener implements MyServletContextListener{
    public void contextInitialized(ServletContextEvent event){
        ServletContext sc = event.getServletContext();
        String dogBrand = sc.getInitParameter("brand");
        Dog d = new Dog(dogBrand
        )
    }
}