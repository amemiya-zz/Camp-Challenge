/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguinn_page;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shuhei
 */
public class roguinn1 extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_rs = null;
        
        try{
        request.setCharacterEncoding("UTF-8");
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        out.print("ドライバーへの接続に成功しました<br>");
        db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "root", "root");
        out.print("データベース接続完了<br>");
        
        
        db_st = db_con.prepareStatement("select * from kanri where name=? and password=?");
        db_st.setString(1, request.getParameter("userName"));
        db_st.setString(2, request.getParameter("password"));
        out.print("検索しています<br>");
        
        
        
        db_rs = db_st.executeQuery();
        
        String name = null;
        String password = null;
        
        if(db_rs.next()){
        name = db_rs.getString("name");
        password = db_rs.getString("password");
        }
       
        if (name != null && password != null) {
        HttpSession hs = request.getSession();
        String login = "in";
        hs.setAttribute("login",login);
        }
        RequestDispatcher product = request.getRequestDispatcher("/roguinn_page/roguinn.jsp");
        product.forward(request, response);
        
            } catch (ClassNotFoundException e) {
                out.print(e.getMessage());
            } catch (SQLException e) {
                out.print(e.getMessage());
            } catch (Exception e) {
                out.print(e.getMessage());
            } finally {
                try {
                    if (db_con == null) {
                        db_con.close();
                    }
                    if (db_st == null) {
                        db_st.close();
                    }
                    if (db_rs == null) {
                        db_rs.close();
                    }
                } catch (SQLException e) {
                    out.print(e.getMessage());
                } catch (Exception e) {
                    out.print(e.getMessage());
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(roguinn1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
