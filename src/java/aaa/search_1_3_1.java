/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.security.MessageDigest;
/**
 *
 * @author  
 */
@WebServlet(name="search_1_3_1", urlPatterns={"/search_1_3_1"})
public class search_1_3_1 extends HttpServlet {

   static final String nazwaserwera="localhost";
    static final String nazwabazy="sklep_online_gsm";
    static final String nazwauzytkownika="root";
    static final String haslobazy="krasnal";
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }


    public void destroy() {

    }


    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       response.setContentType("text/html; CHARSET=windows-1250");

        String id_magazyn=request.getParameter("id_magazyn");
String id_user=request.getParameter("id_user");
        String komentarz=request.getParameter("komentarz");
        String imie=request.getParameter("imie");
 

Connection polaczenie;
Statement sql;
HttpSession session=request.getSession();

Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String da = sdf.format(date);
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
sql=polaczenie.createStatement();
sql.executeUpdate("insert into komentarz (opis,data,podpis,id_magazyn) values('"+komentarz+"','"+da+"','"+imie+"','"+id_magazyn+"');");
polaczenie.close();



    



response.sendRedirect("k_1_3?id_magazyn="+request.getParameter("id_magazyn")+"&id_user="+request.getParameter("id_user")+"");
}
catch (Exception e)
{
}

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
