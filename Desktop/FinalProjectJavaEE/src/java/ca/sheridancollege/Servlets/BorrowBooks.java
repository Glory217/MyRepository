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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class BorrowBooks extends HttpServlet {

    
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String host = getServletContext().getInitParameter("host");
            String user = getServletContext().getInitParameter("username");
            String pass = getServletContext().getInitParameter("password");
            
            
            
            dao d1 = new dao(host, user, pass);
            
            
            ArrayList<Books> books = d1.getBooks();
            
            request.setAttribute("Books", books);
            
            request.getRequestDispatcher("BorrowBooks.jsp").forward(request, response);
        
    }


}
