/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Servlets;

import ca.sheridancollege.Beans.Student;
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

public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String FN = request.getParameter("FirstName");
         String LN = request.getParameter("LastName");
         String Em = request.getParameter("Email");
         String id = request.getParameter("ID");
          String Cors = request.getParameter("Course");
         
         String host = getServletContext().getInitParameter("host");
         String user = getServletContext().getInitParameter("username");
         String pass = getServletContext().getInitParameter("password");
         
         Student s1 = new Student(FN,LN,Em,id,Cors);
         
         dao d1 = new dao(host,user,pass);
         
         d1.addStudent(s1);
         
         response.sendRedirect("AddStu.jsp");
         
         
         
         
         
        
       
    }
}
