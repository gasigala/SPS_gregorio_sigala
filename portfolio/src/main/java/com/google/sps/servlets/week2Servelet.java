package com.google.sps.servlets;


import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Servlet that returns HTML that contains the page view count. */
@WebServlet("/week2")
public class week2Servelet extends HttpServlet {


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> randomMessage= new ArrayList<String>();
    randomMessage.add("Hello there!");
    randomMessage.add("Hope you enjoy your stay.");
    randomMessage.add("Stay tuned for what to come");

    String json = convertToJsonUsingGson(randomMessage);
    response.setContentType("application/json;");
    response.getWriter().println(json);
    
  }
    private String convertToJsonUsingGson(ArrayList<String> serverStats) {
    Gson gson = new Gson();
    String json = gson.toJson(serverStats);
    return json;
  }
}