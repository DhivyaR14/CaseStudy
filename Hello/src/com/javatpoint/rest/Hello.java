package com.javatpoint.rest;  

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType; 

@Path("/hello")  
public class Hello {  
  // This method is called if HTML and XML is not requested  
  @GET  
  @Produces(MediaType.TEXT_PLAIN)  
  public String sayPlainTextHello() 
  {  
    return "Welcome To TCS ";  
  }  
  // This method is called if XML is requested  
  @Path("/xml") 
  @GET  
  @Produces(MediaType.TEXT_XML)  
  public String sayXMLHello() 
  {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hai" +"<welcome>Welcome to TCS "+"</welcome>"+ "</hello>";  
  }  
  
  // This method is called if HTML is requested  
  @Path("/html") 
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public String sayHtmlHello() 
  {  
    return "<html> " + "<title>" + "Hai" + "</title>"  
        + "<body><h1>" + "Welcome to TCS" +"<p>"+"Siruseri"+"</p>"+ "</h1></body>" + "</html> ";  
  } 
   
}   