<%-- 
    Document   : roguinn
    Created on : 2016/12/27, 17:36:46
    Author     : shuhei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="javax.servlet.http.HttpSession" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理</title>
    </head>
    
    <body>
        <h1>ログイン画面</h1>
    <%
        if(session.getAttribute("login")==null){
        session.setAttribute("login", "out");
        }
    if(((String)session.getAttribute("login")).equals("out")){%>
        
        <form action="/java_db/roguinn1" method="post">
        名前<input type="text" name="userName"><br>
        パスワード<input type="text" name="password"><br>
        <input type="submit" value="送信">
         </form>
        <%}%>
        
        <%if(((String)session.getAttribute("login")).equals("in")){%>
        <h2>商品登録フォーム</h2>
        <form action="/java_db/touroku" method="post">
            商品ID<input type="text" name="txtID"><br>
            名前<input type="text" name="txtName"><br>
            値段<input type="text" name="txtnedan"><br>
            在庫<input type="text" name="txtzaiko"><br>
            <input type="submit" value="商品登録">
        </form>  
        <!--<a href="/java_db/return1"> top </a>-->
        
        <h3>商品一覧</h3>
        
        <form action="/java_db/kanri" method="post">
            <input type="submit" value="検索">
        </form>
        
        <h4>ログアウト</h4>
        <form action="../roguout" method="post">
            <input type="submit" value="ログアウト">            
        </form>
        <%}%>
    </body>
    </html>  
     
    
   
    
    
    
    

