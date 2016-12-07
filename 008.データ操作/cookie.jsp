<%-- 
    Document   : cookie
    Created on : 2016/12/06, 17:41:14
    Author     : shuhei
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.Cookie"%>


<!--//import javax.servlet.http.Cookie;
//import java.util.*;-->


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //ユーザー1回目の訪問
        Date time=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sdate=sdf.format(time);
//            out.println(sdate+"<br>");
        Cookie c =new Cookie("LastLogin",sdate);
        response.addCookie(c);
        
            //2回目以降の訪問
        Cookie cs[]=request.getCookies();
        if(cs!=null){
            for(int i=0;i<cs.length;i++){
                if(cs[i].getName().equals("LastLogin")){
                    out.print("最後のログインは、"+cs[i].getValue());
                    break;
                }
            }
        }
        %>
    </body>
</html>
