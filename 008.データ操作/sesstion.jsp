<%-- 
    Document   : sesstion
    Created on : 2016/12/07, 15:40:20
    Author     : shuhei
--%>

<%@page import="java.text.AttributedCharacterIterator.Attribute"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.Date"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //1回目の訪問
        Date time=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sdate=sdf.format(time);//SimpleDateFormat型の現時刻を設定
        HttpSession hs=request.getSession(true);
        hs.setAttribute("LastLogin",sdate);
        
            //2回目以降の訪問
//        HttpSession hs=request.getSession(true);
        out.print("最後のログインは、"+hs.getAttribute("LastLogin"));
        
        
            %>
    </body>
</html>
