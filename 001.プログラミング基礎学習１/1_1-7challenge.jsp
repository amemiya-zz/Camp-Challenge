<%-- 
    Document   : newjsp
    Created on : 2016/11/07, 14:21:59
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
        <h1><%
            //課題1
            out.print("Hello world!!");%></h1>
    </body>
</html>
         <%
             //課題2
         out.print("groove"+"-"+"gear");%>
        
        <%
            //課題3
          String name="雨宮　周平";
          String birthday="1993年9月9日";
          String umare="山梨県";
          String shumi="スポーツ";
          
          out.print("私の名前は"+name+"です" + "<br>");
          out.print("私の誕生日は"+birthday+"です" + "<br>");
          out.print("私は"+umare+"出身です" + "<br>");
          out.print("私の趣味は"+shumi+"です" + "<br>");
          %>
          
          <%
              //課題4.5
            //定数作成
            final int num=3;
            //変数作成
            int nums=5;
            
            int tasi=num+nums;//足し算
            int hiki=num-nums;//引き算
            int kake=num*nums;//掛け算
            int wari=num/nums;//割り算
            int yojo=num%nums;//余剰
            
            out.print(num+nums + "<br>");
            out.print(num-nums + "<br>");
            out.print(num*nums + "<br>");
            out.print(num/nums + "<br>");
            out.print(num%nums + "<br>");
          %>
        
          <%
              //課題6
              int x=2;
              if(x==1){
              out.print("1です！" + "<br>");
              }else if(x==2){
              out.print("プログラミングキャンプ！"+"<br>");
              }else{
              out.print("その他です！" + "<br>");
                  }
             %>
             
             <%
                 //課題7
                  out.print("1:雑貨 2:生鮮食品 3:その他<br>");
                 String zk=request.getParameter("zk");
                 String ss=request.getParameter("ss");
                 String ok=request.getParameter("ok");

                 int zakkaNedan= 800;
                 out.print("雑貨の値段は" + zakkaNedan + "円です！" + "<br>");
                 int seisennNedan = 500;
                 out.print("生鮮食品の値段は" + seisennNedan + "円です" + "<br>");
                 int sonotaNedan = 700;
                 out.print("その他の値段は" + sonotaNedan + "円です" + "<br>");
                 
                 int zakka = Integer.parseInt(zk) * zakkaNedan;
                 int seisenn=Integer.parseInt(ss) * seisennNedan;
                 int sonota=Integer.parseInt(ok) * sonotaNedan;
                 
                 out.print(zakka +" " + seisenn + " " + sonota + "<br>");
                 int sougaku = zakka + seisenn + sonota;
                 out.print(sougaku + "<br>");
                 
                 if(sougaku>5000){
                    int point= sougaku * 5/100;
                 out.print("獲得ポイントは"+point+ "です");
             } else if(sougaku>3000){
                    int point= sougaku * 4/100;
                    out.print("獲得ポイントは"+ point +"です");
             }         
             %>