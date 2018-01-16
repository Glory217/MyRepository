/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.servlets;
import ca.sheridancollege.logic.MainLogicTwo;
import ca.sheridancollege.beans.Questions;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import ca.sheridancollege.beans.*;


/**
 *
 * @author punjabi
 */

public class AnswerSelectServlet extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    
   
       HttpSession session = request.getSession();
       
       int buttonc=0;
       
       String s1 = request.getParameter("answer");
       String s2 = request.getParameter("choice");
       String S3 = request.getParameter("s");
       
       Questions q = (Questions) session.getAttribute("Question");
       
       Player pla = (Player)session.getAttribute("Player3");
       
       int score= pla.getScore();
       
       String nm = pla.getName();
       
       String Ans = MainLogicTwo.AnswerSelector(s1);
       
              
       if(session.isNew()){
          score = 0;
          session.setAttribute("Score", Integer.toString(score));
          }
       else if(!session.isNew()){
           if(Ans.equals(s1)){
           score += q.getValue();
           Player ps = new Player(nm,score);
           session.setAttribute("Player1", ps);
           session.setAttribute("Score", Integer.toString(score));
           }
           else if(!Ans.equals(s1))
           {
           score = Integer.parseInt(session.getAttribute("Score").toString());
           score -= q.getValue();
           Player ps = new Player(nm,score);
           session.setAttribute("Player1", ps);
           session.setAttribute("Score", Integer.toString(score));
           }
        switch(q.getNum())
        {
        case "Q1":
        buttonc++;
        session.setAttribute("Q1","disabled"); 
        break;
        case "Q2":
            buttonc++;
        session.setAttribute("Q2","disabled"); 
        break;
        case "Q3":
            buttonc++;
        session.setAttribute("Q3","disabled");
        break;
        case "Q4":
            buttonc++;
        session.setAttribute("Q4","disabled");
        break;
        case "Q5":
            buttonc++;
        session.setAttribute("Q5","disabled");
        break;
        case "Q6":
            buttonc++;
        session.setAttribute("Q6","disabled");
        break;
        case "Q7":
            buttonc++;
        session.setAttribute("Q7","disabled");
        break;
        case "Q8":
            buttonc++;
        session.setAttribute("Q8","disabled");
        break;
        case "Q9":
            buttonc++;
        session.setAttribute("Q9","disabled");
        break;
        case "Q10":
            buttonc++;
        session.setAttribute("Q10","disabled");
        break;
        case "Q11":
            buttonc++;
        session.setAttribute("Q11","disabled");
        break;
        case "Q12":
            buttonc++;
        session.setAttribute("Q12","disabled");
        break;
        case "Q13":
            buttonc++;
        session.setAttribute("Q13","disabled");
        break;
        case "Q14":
            buttonc++;
        session.setAttribute("Q14","disabled");
        break;
        case "Q15":
            buttonc++;
        session.setAttribute("Q15","disabled");
        break;
        case "Q16":
            buttonc++;
        session.setAttribute("Q16","disabled");
        break; 
        case "Q17":
            buttonc++;
        session.setAttribute("Q17","disabled");
        break; 
        case "Q18":
            buttonc++;
        session.setAttribute("Q18","disabled");
        break; 
        case "Q19":
            buttonc++;
        session.setAttribute("Q19","disabled");
        break; 
        case "Q20":
            buttonc++;
        session.setAttribute("Q20","disabled");
        break; 
        case "Q21":
            buttonc++;
        session.setAttribute("Q21","disabled");
        break;
        case "Q22":
            buttonc++;
        session.setAttribute("Q22","disabled");
        break;
        case "Q23":
            buttonc++;
        session.setAttribute("Q23","disabled");
        break; 
        case "Q24":
            buttonc++;
        session.setAttribute("Q24","disabled");
        break;
        case "Q25":
            buttonc++;
        session.setAttribute("Q25","disabled");
        break; 
        }
          request.getRequestDispatcher("GameBoard.jsp").forward(request, response);
          
          if(buttonc == 25)
              request.getRequestDispatcher("WinPage.jsp").forward(request, response);
          
       }
       
       else if(s2.equals("skip")){
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
          response.sendRedirect("GameBoard.jsp");
       }
    }
    
}