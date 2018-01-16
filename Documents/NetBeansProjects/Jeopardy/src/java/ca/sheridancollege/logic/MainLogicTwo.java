/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.logic;
import ca.sheridancollege.beans.Questions;
import ca.sheridancollege.beans.QuestionMain;

/**
 *
 * @author punjabi
 */
public class MainLogicTwo {
    
    public static String AnswerSelector(String answer)
    {
        if(answer == null)
           return "Wrong Answer";
        else switch (answer) {
            case "8": 
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(0).getCorrectAnswer();
            case "James Gosling":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(1).getCorrectAnswer();
            case "2":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(2).getCorrectAnswer();
            case "A.length":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(3).getCorrectAnswer();
            case "8.0":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(4).getCorrectAnswer();
                
            case "Nov 6, 1969":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(5).getCorrectAnswer();
            case "Germany":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(6).getCorrectAnswer();
            case "Manchester United":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(7).getCorrectAnswer();
            case "Lionel Messi":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(8).getCorrectAnswer();
            case "Paris Saint-German FC":  
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(9).getCorrectAnswer();
                
            case "JK Rowling":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(10).getCorrectAnswer();
            case "7":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(11).getCorrectAnswer();
            case "Rupert Grint":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(12).getCorrectAnswer();
            case "Gryffindor":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(13).getCorrectAnswer();
            case "2011": 
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(14).getCorrectAnswer();

            case "Neutralisation":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(15).getCorrectAnswer();
            case "Methane":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(16).getCorrectAnswer();
            case "Thermodynamics":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(17).getCorrectAnswer();
            case "Sodium Chloride":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(18).getCorrectAnswer();
            case "Skin":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(19).getCorrectAnswer();
 
            case "Mercury":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(20).getCorrectAnswer();
            case "Neptune":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(21).getCorrectAnswer();
            case "Jupiter":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(22).getCorrectAnswer();
            case "Milkyway":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(23).getCorrectAnswer();
            case "Yuri Gagarin":
                QuestionMain.loadQuestions();
                return QuestionMain.questions.get(24).getCorrectAnswer();
        } 
        return "Wrong Answer";
    }
}
