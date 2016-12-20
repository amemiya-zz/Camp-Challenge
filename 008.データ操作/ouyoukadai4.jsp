<%-- 
    Document   : ouyoukadai4
    Created on : 2016/12/20, 14:32:52
    Author     : shuhei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    String n="";
    String r="";
    String m="";
    
    n=(String)session.getAttribute("Name");
    r=(String)session.getAttribute("seibetu");
    m=(String)session.getAttribute("shumi");
    
    boolean sessionsEmpty=true;
    
    //セッションのnullチェック
    if(session!=null){
        sessionsEmpty=false;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フォーム</title>
    </head>
    <body>
        <form action="ouyoukadai3" method="post">
        名前:<input type="text" name="txtName" value="<%if(!sessionsEmpty&&n!=null){out.print(n);}%>"><br>
        性別:
        男性<input type="radio" name="rdoSample" value="M"<%if(!sessionsEmpty&&r!=null&&r.equals("M")){out.print("checked");}%>>
        女性<input type="radio" name="rdoSample" value="J"<%if(!sessionsEmpty&&r!=null&&r.equals("J")){out.print("checked");}%>><br>
        趣味:<textarea name="mulText"><%if(!sessionsEmpty&&m!=null){out.print(m);}%></textarea><br>
        <input type="submit" value="送信">
        <input type="submit" value="戻る">
        </form>
    </body>
</html>
