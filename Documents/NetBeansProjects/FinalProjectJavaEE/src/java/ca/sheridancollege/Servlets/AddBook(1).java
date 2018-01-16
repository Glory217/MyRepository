/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Servlets;

import ca.sheridancollege.Beans.Books;
import ca.sheridancollege.DAO.dao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author punjabi
 */

public class AddBook extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String T = request.getParameter("Title");
         String AN = request.getParameter("Author");
         String Pag = request.getParameter("Pages");
         String isbn = request.getParameter("ISBN");
         
         
         String host = getServletContext().getInitParameter("host");
         String user = getServletContext().getInitParameter("username");
         String pass = getServletContext().getInitParameter("password");
         
         Books b1 = new Books(T,AN,Pag,isbn);
         
         dao d1 = new dao(host,user,pass);
         
         d1.addBooks(b1);
         
         response.sendRedirect("Addbook.jsp");
          
    }
}
