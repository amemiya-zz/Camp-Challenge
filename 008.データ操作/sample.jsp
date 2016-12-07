<%-- 
    Document   : sample
    Created on : 2016/12/06, 17:07:17
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
        <%
         request.setCharacterEncoding("UTF-8");
         
         String n = request.getParameter("txtName");
         String r = request.getParameter("rdoSample");
         String m = request.getParameter("mulText");
         
         out.print(n+"<br>");
         out.print(r+"<br>");
         out.print(m+"<br>");
         %>

    </body>
</html>
