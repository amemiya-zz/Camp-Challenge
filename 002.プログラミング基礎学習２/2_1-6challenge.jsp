<%-- 
    Document   : プログラミング基礎2　
    Created on : 2016/11/08, 10:33:46
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
        <h1></h1>
    </body>
</html>
<%   //課題1
    int num=1;
  String me="";
  switch(num){
      case 1:
          me="one";
          break;
      case 2:
          me="two";
          break;
      default:
          me="想定外";
          break;
  }
      out.println(me + "<br>");
%>

<%
    //課題2
        char i='あ';//Stringでは記述することできず。おそらく一文字の為
        
        switch(i){
        case 'A':
            out.print("英語<br>");
            break;
        case 'あ':
            out.print("日本語<br>");
            break;
    }
%>

<%
    //課題3
    long a=8;
    for(int n=0;n<=20;n++){
    a = a * 8;
    out.print(a+"<br>");
}
%>

<%
    //課題４
    char b='A';
    for(int m=0;m<=30;m++){
        out.print(b + "<br>");
    }
%>

<%
    //課題5
    int c=0;
    for(int p=0;p<=100;p++){
        c=c+p;
        out.print(c + "<br>");
    }
%>

<%
    //課題6
    int f=1000;
    while(f>100){
        f=f/2;
    }
        out.print(f + "<br>");
%>
