<%-- 
    Document   : newjsp1
    Created on : 2016/11/09, 15:36:53
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
    //課題10-2
    String soinnsu=request.getParameter("soinnsu");
      int so = Integer.parseInt(soinnsu);
      
      int soi[]={2,3,5,7};
      int count=0;
      
      out.print("元の値は"+so+"<br>");
      
      if(so!=0&&so!=1){
          for(int i=0;i<soi.length;i++){
          while(so % soi[i]==0){
              so=so / soi[i];
              count++;
          }
          if(count!=0){
          out.print(soi[i]+",,,"+count+"回です<br>");
          count=0;
          }
       }
          if(so>1){
    out.print("元の値　1ケタの素因数　その他"+so);
    }
      }
%>
