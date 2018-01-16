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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author punjabi
 */

public class ViewStudents extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String host = getServletContext().getInitParameter("host");
            String user = getServletContext().getInitParameter("username");
            String pass = getServletContext().getInitParameter("password");
            
            
            
            dao d1 = new dao(host, user, pass);
            
            
            ArrayList<Student> students = d1.getStudents();
            
            request.setAttribute("Students", students);
            
            request.getRequestDispatcher("ViewStu.jsp").forward(request, response);
        
    }
}
