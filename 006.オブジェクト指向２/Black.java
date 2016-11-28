/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challemge7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shuhei
 */
public class Black extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Dealer dea = new Dealer();
    User use = new User();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Black</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Black at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            out.println(dea.cards);
            out.println("<br>");
            
            

            out.println("ディーラー手札<br>");
            dea.setCard(dea.deal());

            while (dea.checkSum()) {
                dea.setCard(dea.hit());
            }

            out.println(dea.myCard);
            out.println("<br>");
            out.println(dea.open());
            out.println("<br>");

            out.println("ユーザー手札<br>");
            use.setCard(dea.deal());

            while (use.checkSum()) {
                use.setCard(dea.hit());
            }
            out.println(use.myCard);
            out.println("<br>");
            out.println(use.open());
            out.println("<br>");

            String text="";
            if((dea.open()>=22)&&(use.open()>=22)){
                  out.println("バスト引き分け");
            }else if(22<=use.open()) {
                // user バスト
                out.println("ユーザーバストの為、ディーラーWIN");
            }else if(22<=dea.open()) {
                // dealer バスト
                out.println("ディーラーバストの為、ユーザーWIN");
            }else{ //勝敗判定
                if(dea.open() < use.open()) {
                    out.println("ユーザーWIN");
                }else if (dea.open() > use.open()) {
                    out.println("ディーラーWIN");
                }else {
                    out.println("ドロー");
                }
            }
           
            
            dea.cards.addAll(use.myCard);
            dea.cards.addAll(dea.myCard);
            use.myCard.clear();
            dea.myCard.clear();
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
