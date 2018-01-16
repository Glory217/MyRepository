/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import ca.sheridancollege.beans.*;




public class LoginServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int score=0;
        
       
        int tm = 0;
        
        HttpSession session = request.getSession();
    
        String name = request.getParameter("name");
        Player p = new Player(name, score);
        
        session.setAttribute("Player1",p);
        
       
        
        session.setAttribute("T", tm);
        
        response.sendRedirect("GameBoard.jsp");
        
        
        
    }
}