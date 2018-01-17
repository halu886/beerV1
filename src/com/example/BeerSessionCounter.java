package com.example;
import javax.servlet.http.*;

public class BeerSessionCounter implements HttpSessionListener{
    static private int activeSessions;

    public static int getActiveSessions(){
        return activeSessions;
    } 

    public void sessionCreated(HttpSessionEvent event){
        activeSessions++;
        console.log(activeSessions);
    }

    public void sessionDestroyed(HttpSessionEvent event){
        activeSessions--;
        console.log(activeSessions);
    }
} 
