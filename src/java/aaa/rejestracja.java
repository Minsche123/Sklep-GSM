/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author  
 */
@WebServlet(name="rejestracja", urlPatterns={"/rejestracja"})
public class rejestracja extends HttpServlet {
   static final String nazwaserwera="localhost";
    static final String nazwabazy="sklep_online_gsm";
    static final String nazwauzytkownika="root";
    static final String haslobazy="krasnal";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    public void destroy() {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html; CHARSET=windows-1250");


        HttpSession session=request.getSession();
    String email = request.getParameter("email");



      Connection polaczenie;
      Statement sql;

      try {

      Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();
      ResultSet rs = sql.executeQuery("SELECT email,id_user from user where email='"+email+"';");


      if (rs.next()){
      if (0==email.compareTo(rs.getString(1))){

      response.sendRedirect("rejestracja2.jsp");



      }
      else
      {

      session.setAttribute("email",email);

       
      response.sendRedirect("rejestracja2?email="+request.getParameter("email")+"");

      }}
      else
      {
     session.setAttribute("email",email);
          response.sendRedirect("rejestracja2?email="+request.getParameter("email")+"");

      }}
      catch (Exception e)
      {}
      finally {}





    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
