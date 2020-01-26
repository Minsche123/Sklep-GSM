/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author  
 */
@WebServlet(name="a_edytuj_3", urlPatterns={"/a_edytuj_3"})
public class a_edytuj_3 extends HttpServlet {
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
    String id_magazyn = request.getParameter("id_magazyn");
    String n = request.getParameter("n");
    String o = request.getParameter("o");
    String c = request.getParameter("c");

        String opis = request.getParameter("opis");
             String id_user= request.getParameter("id_user");
 String opis_skrocony = request.getParameter("opis_skrocony");


    HttpSession session=request.getSession();


   Connection polaczenie;
Statement sql;Statement sql2;


try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
sql=polaczenie.createStatement();sql2=polaczenie.createStatement();
sql.executeUpdate("update magazyn set nazwa=('"+n+"'), cena=('"+c+"'), obraz=('"+o+"') where id_magazyn=('"+id_magazyn+"');");
sql2.executeUpdate("update opis_towaru set opis=('"+opis+"'), opis_skrocony=('"+opis_skrocony+"') where id_magazyn=('"+id_magazyn+"');");

  response.sendRedirect("p_1_3?id_user="+request.getParameter("id_user")+"&id_magazyn="+request.getParameter("id_magazyn")+"");
}
catch (Exception e)
{}

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