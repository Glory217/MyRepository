/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Servlets;

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

public class DeleteBookstwo extends HttpServlet {

   

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String b = request.getParameter("bname");
        
            String host = getServletContext().getInitParameter("host");
            String user = getServletContext().getInitParameter("username");
            String pass = getServletContext().getInitParameter("password");
            
            
            
            dao d1 = new dao(host, user, pass);
            
            d1.DeleteBooks(b);
            
            response.sendRedirect("Addbook.jsp");
            
            
    }


}
