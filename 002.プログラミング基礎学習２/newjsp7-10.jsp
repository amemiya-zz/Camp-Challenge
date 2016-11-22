<%-- 
    Document   : newjsp
    Created on : 2016/11/08, 15:21:04
    Author     : shuhei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<%
    //課題7
    String haireru[]={"10","100","soeda","hayashi","-20","118","END"};
%>

<%
    //課題8
    haireru[3]="33";
%>

<%@ page import="java.util.HashMap" %>
<%
    //課題9
    HashMap<String, String> hMap = 
    new HashMap<String, String>();


    hMap.put("1", "AAA");
    hMap.put("hello", "world");
    hMap.put("soeda", "33");
    hMap.put("20", "20");
    
%>

<%
    //課題10-1
     String soinnsu=request.getParameter("soinnsu");
      int so = Integer.parseInt(soinnsu);
      
     int count=0;
     
     out.print("元の値は"+so+"<br>");
     
     if(so !=0&&so !=1){
    while(so%2==0){
    so=so / 2;
    count++;
    }
    if(count!=0){
    out.print("2,,,"+count+"回です<br>");
    count=0;
    }
    
    while(so%3==0){
    so=so/3;
    count++;
    }
    if(count!=0){
    out.print("3,,," + count+"回です<br>");
    count=0;
    }
    
    while(so%5==0){
    so=so/5;
    count++;
    }
    if(count!=0){
    out.print("5,,," + count+"回です<br>");
    count=0;
    }
    
    while(so%7==0){
    so=so/7;
    count++;
    }
    if(count!=0){
    out.print("7,,," + count+"回です<br>");
    count=0;
    }
}
    
    if(so>1){
    out.print("元の値　1ケタの素因数　その他"+so);
    }
%>

