<%-- 
    Document   : challenge8_1
    Created on : 2016/12/06, 15:02:36
    Author     : shuhei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>データ操作</title>
    </head>
    <body>
        <form action="./sample.jsp" method="post">
        名前:<input type="text" name="txtName">
        性別:
        男:<input type="radio" name="rdoSample" value="男">
        女:<input type="radio" name="rdoSample" value="女">
        趣味:<textarea name="mulText"></textarea>
        <input type="submit" value="送信">
<!-- <select name="cmbList"></select>-->

    </form>
<!--    <form action="sample.jsp" method="post">
        名前:<input type="text" name="txtName">
        男:<input type="radio" name="rdoSample" value="1">
        女:<input type="radio" name="rdoSample" value="2">
        趣味:<textarea name="mulText"></textarea>
        <input type="submit" value="2">
    </form>-->
  </body>
</html>
