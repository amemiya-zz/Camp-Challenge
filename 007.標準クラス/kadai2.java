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
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author shuhei
 */
public class kadai2 extends HttpServlet {

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
            out.println("<title>Servlet kadai2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet kadai2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        //１０．紹介していないJAVAの標準クラスを利用して、
        //処理を作成してください。
        //①処理の経過を書き込むログファイルを作成する。
        Date date=new Date();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        String dsdf=sdf.format(date);
//        out.print(date.getTime());
        
        File log=new File("/Applications/NetBeansProjects/sample/src/java/challenge8/rogu.txt");
        
//        //上書きモードの書き方
        date=new Date();
        dsdf=sdf.format(date);
        FileWriter fw=new FileWriter(log);
        fw.write("日時："+dsdf+"　　"+"状況：開始<br>");
        fw.close();

        //開始時刻の追記
//        date=new Date();
//        dsdf=sdf.format(date);
//       FileWriter fw=new FileWriter(log,true);
//       fw.write("日時："+dsdf+"　　"+"状況：開始<br>");
//       fw.close();
        
        //タイムスタンプ型
        date=new Date();
        dsdf=sdf.format(date);
        FileWriter fwa=new FileWriter(log,true);
        fwa.write("日時："+date.getTime()+"<br>");
        fwa.close();
        
        //指定ファイル内を全て呼び出す
//        date=new Date();
//        dsdf=sdf.format(date);
//        FileReader fr=new FileReader(log);
//        BufferedReader br=new BufferedReader(fr);
//        String str;
//        while((str=br.readLine())!=null){
//        out.println(str);
//        }
        
        //Math.maxを使った大きい値を取得する
        for(int i=0;i<1000;i++){
        Random ran=new Random();
        int rnd=ran.nextInt(100);
        int rnd1=ran.nextInt(100);
        out.println(rnd+"と"+rnd1+"では"+Math.max(rnd, rnd1)+"の方が大きい"+"　　");
        }
        out.println("<br>");

        
        //終了時刻の追記
        date=new Date();
        dsdf=sdf.format(date);
        FileWriter fwb=new FileWriter(log,true);
        fwb.write("日時："+dsdf+"　　"+"状況：終了<br>");
        fwb.close();
        
        
        date=new Date();
        dsdf=sdf.format(date);
        FileWriter fwc=new FileWriter(log,true);
        fwc.write("日時："+date.getTime()+"<br>");
        fwc.close();
        
        //指定ファイル内を全て呼びだす。
        //最後にまとめて呼び出す
        FileReader fra=new FileReader(log);
        BufferedReader bra=new BufferedReader(fra);
        String stri;
        while((stri=bra.readLine())!=null){
        out.println(stri);
        }
        
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
