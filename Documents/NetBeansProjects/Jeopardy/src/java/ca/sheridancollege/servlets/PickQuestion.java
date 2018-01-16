/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.servlets;
import ca.sheridancollege.beans.Questions;
import ca.sheridancollege.logic.MainLogic;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import ca.sheridancollege.beans.Player;



public class PickQuestion extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        HttpSession session = request.getSession();
        
        int times = Integer.parseInt(session.getAttribute("Times1").toString());
        
        session.setAttribute("Times2",times);
        
        String s1 = request.getParameter("type");
        
        Questions q = MainLogic.questionSelector(s1);
        
        session.setAttribute("Question", q);
        
        Player Pl=(Player)session.getAttribute("Player2");
        
        session.setAttribute("Player2", Pl);
        
        double num =((Math.random()*10)+4);
        
        if(num <=8 && times <= 3){
        request.getRequestDispatcher("DailyDoubles.jsp").forward(request, response);}
        else{
        request.getRequestDispatcher("Question.jsp").forward(request, response);
        }  
    }
}