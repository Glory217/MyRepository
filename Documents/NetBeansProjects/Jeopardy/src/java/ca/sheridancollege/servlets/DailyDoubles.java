/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ca.sheridancollege.beans.*;
import ca.sheridancollege.logic.MainLogicTwo;
import javax.servlet.http.HttpSession;

/**
 *
 * @author punjabi
 */

public class DailyDoubles extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       HttpSession session = request.getSession();
       
       String s1 = request.getParameter("answer");
       //String S3 = request.getParameter("s");
       
       Questions q = (Questions) session.getAttribute("Question");
       
       Player pla = (Player)session.getAttribute("Player3");
       int score= pla.getScore();
       String nm = pla.getName();
       String Ans = MainLogicTwo.AnswerSelector(s1);
       int count=0;
       session.setAttribute("Count",count);
       
       int t = (int) session.getAttribute("Times2");
       t++;
       
       int tmd = Integer.parseInt(session.getAttribute("Times3").toString());
       session.setAttribute("Times3",t);
        
       if(session.isNew()){
          score = 0;
          session.setAttribute("Score", Integer.toString(score));
          }
       else if(!session.isNew()){
           
           if(Ans.equals(s1)){
           score += q.getValue();
           Player ps = new Player(nm,score);
           session.setAttribute("Player1", ps);
           
           }
           else if(!Ans.equals(s1))
           {
           score = Integer.parseInt(session.getAttribute("Score").toString());
           score -= q.getValue();
           Player ps = new Player(nm,score);
           session.setAttribute("Player1", ps);
           }
        switch(q.getNum())
        {
        case "Q1":
        session.setAttribute("Q1","disabled");   
        break;
        case "Q2":
        session.setAttribute("Q2","disabled");   
        break;
        case "Q3":
        session.setAttribute("Q3","disabled");
        break;
        case "Q4":
        session.setAttribute("Q4","disabled");
        break;
        case "Q5":
        session.setAttribute("Q5","disabled");
        break;
        case "Q6":
        session.setAttribute("Q6","disabled");
        break;
        case "Q7":
        session.setAttribute("Q7","disabled");
        break;
        case "Q8":
        session.setAttribute("Q8","disabled");
        break;
        case "Q9":
        session.setAttribute("Q9","disabled");
        break;
        case "Q10":
        session.setAttribute("Q10","disabled");
        break;
        case "Q11":
        session.setAttribute("Q11","disabled");
        break;
        case "Q12":
        session.setAttribute("Q12","disabled");
        break;
        case "Q13":
        session.setAttribute("Q13","disabled");
        break;
        case "Q14":
        session.setAttribute("Q14","disabled");
        break;
        case "Q15":
        session.setAttribute("Q15","disabled");
        break;
        case "Q16":
        session.setAttribute("Q16","disabled");
        break; 
        case "Q17":
        session.setAttribute("Q17","disabled");
        break; 
        case "Q18":
        session.setAttribute("Q18","disabled");
        break; 
        case "Q19":
        session.setAttribute("Q19","disabled");
        break; 
        case "Q20":
        session.setAttribute("Q20","disabled");
        break; 
        case "Q21":
        session.setAttribute("Q21","disabled");
        break;
        case "Q22":
        session.setAttribute("Q22","disabled");
        break;
        case "Q23":
        session.setAttribute("Q23","disabled");
        break; 
        case "Q24":
        session.setAttribute("Q24","disabled");
        break;
        case "Q25":
        session.setAttribute("Q25","disabled");
        break; 
        }
          request.getRequestDispatcher("GameBoard.jsp").forward(request, response);
          
       }
        
    }
}
