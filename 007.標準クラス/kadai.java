/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.text.*;
import java.io.*;
/**
 *
 * @author shuhei
 */
public class kadai extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            Date date=new Date();
            
            
            //１．2016年1月1日 0時0分0秒のタイムスタンプを作成し、
            //表示してください。
            Calendar cal=Calendar.getInstance();
            cal.set(2016,1,1,0,0,0);
            Date datapast=cal.getTime();
            out.println(datapast.getTime()+"<br>");
            
            //２．現在の日時を「年-月-日 時:分:秒」で表示してください。
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String isdf=sdf.format(date);
            out.println(isdf+"<br>");
            
            //３．2016年11月4日 10時0分0秒のタイムスタンプを作成し、
            //年-月-日 時:分:秒」で表示してください。
            Calendar calen=Calendar.getInstance();
            calen.set(2016,10,4,10,0,0);
            Date data=calen.getTime();
            out.println(data.getTime()+"<br>");
            
            SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String psdf=time.format(data);
            out.println(psdf+"<br>");
            
            //４．2015年1月1日 0時0分0秒と2015年12月31日 
            //23時59分59秒の差（ミリ秒）を表示してください。
            Calendar hikaku1=Calendar.getInstance();
            hikaku1.set(2015,0,1,0,0,0);
            Date da=hikaku1.getTime();
            out.println(da.getTime()+"<br>");
            
            Calendar hikaku2=Calendar.getInstance();
            hikaku2.set(2015,11,31,23,59,59);
            Date d=hikaku2.getTime();
            out.println(d.getTime()+"<br>");
            
//            SimpleDateFormat Time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String csdf=Time.format(d);
//            out.println(csdf+"<br>");
            
            long hikaku3=d.getTime()-da.getTime();
            out.println(hikaku3+"<br>");
            
            //５．自分の氏名について、バイト数と文字数を取得して、
            //表示してください。
            String name="あめみやしゅうへい";
            out.println(name.length()+"<br>");
            out.println(name.getBytes().length+"<br>");
            
            //６．自分のメールアドレスの「@」以降の文字を取得して、
            //表示してください。
            String bubun="sa.happy.515151@gmail.com";
            out.println(bubun.substring(16)+"<br>");
            
            //７．以下の文章の「I」⇒「い」に、「U」⇒「う」に入れ替える
            //処理を作成し、表示してください。
            //「きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます」
            String tikan="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
            tikan=tikan.replace("I", "い");
            out.println(tikan.replace("U","う")+"<br>");
            
            //８、は別ファイル
            
            //９．ファイルから自己紹介を読み出し、表示してください
            File txt=new File("/Applications/NetBeansProjects/sample/src/java/challenge8/sample.txt");
            FileReader fr=new FileReader(txt);
            BufferedReader br=new BufferedReader(fr);
            String str;
            while((str=br.readLine())!=null){
                out.println(str+"<br>");
            }
            br.close();
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
