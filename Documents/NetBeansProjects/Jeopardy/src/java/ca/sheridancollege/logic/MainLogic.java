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
public class MainLogic {
    
    public static Questions questionSelector(String type)
    {
        if(type == null)
            return null;
        else switch (type) {
            case "R1Q1": 
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(0).getVal(),QuestionMain.getQuestions().get(0).getCategory(),QuestionMain.getQuestions().get(0).getValue(),QuestionMain.getQuestions().get(0).getNum(), QuestionMain.getQuestions().get(0).getQuestion(),QuestionMain.getQuestions().get(0).getAnswer1(),QuestionMain.getQuestions().get(0).getAnswer2(),QuestionMain.getQuestions().get(0).getAnswer3(),QuestionMain.getQuestions().get(0).getAnswer4(),QuestionMain.getQuestions().get(0).getCorrectAnswer());
            case "R2Q1":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(1).getVal(),QuestionMain.getQuestions().get(1).getCategory(),QuestionMain.getQuestions().get(1).getValue(),QuestionMain.getQuestions().get(1).getNum(),QuestionMain.getQuestions().get(1).getQuestion(),QuestionMain.getQuestions().get(1).getAnswer1(),QuestionMain.getQuestions().get(1).getAnswer2(),QuestionMain.getQuestions().get(1).getAnswer3(),QuestionMain.getQuestions().get(1).getAnswer4(),QuestionMain.getQuestions().get(1).getCorrectAnswer());
            case "R3Q1":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(2).getVal(),QuestionMain.getQuestions().get(2).getCategory(),QuestionMain.getQuestions().get(2).getValue(),QuestionMain.getQuestions().get(2).getNum(),QuestionMain.getQuestions().get(2).getQuestion(),QuestionMain.getQuestions().get(2).getAnswer1(),QuestionMain.getQuestions().get(2).getAnswer2(),QuestionMain.getQuestions().get(2).getAnswer3(),QuestionMain.getQuestions().get(2).getAnswer4(),QuestionMain.getQuestions().get(2).getCorrectAnswer());
            case "R4Q1":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(3).getVal(),QuestionMain.getQuestions().get(3).getCategory(),QuestionMain.getQuestions().get(3).getValue(),QuestionMain.getQuestions().get(3).getNum(),QuestionMain.getQuestions().get(3).getQuestion(),QuestionMain.getQuestions().get(3).getAnswer1(),QuestionMain.getQuestions().get(3).getAnswer2(),QuestionMain.getQuestions().get(3).getAnswer3(),QuestionMain.getQuestions().get(3).getAnswer4(),QuestionMain.getQuestions().get(3).getCorrectAnswer());
            case "R5Q1":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(4).getVal(),QuestionMain.getQuestions().get(4).getCategory(),QuestionMain.getQuestions().get(4).getValue(),QuestionMain.getQuestions().get(4).getNum(),QuestionMain.getQuestions().get(4).getQuestion(),QuestionMain.getQuestions().get(4).getAnswer1(),QuestionMain.getQuestions().get(4).getAnswer2(),QuestionMain.getQuestions().get(4).getAnswer3(),QuestionMain.getQuestions().get(4).getAnswer4(),QuestionMain.getQuestions().get(4).getCorrectAnswer());
                
            case "R1Q2":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(5).getVal(),QuestionMain.getQuestions().get(5).getCategory(),QuestionMain.getQuestions().get(5).getValue(),QuestionMain.getQuestions().get(5).getNum(),QuestionMain.getQuestions().get(5).getQuestion(),QuestionMain.getQuestions().get(5).getAnswer1(),QuestionMain.getQuestions().get(5).getAnswer2(),QuestionMain.getQuestions().get(5).getAnswer3(),QuestionMain.getQuestions().get(5).getAnswer4(),QuestionMain.getQuestions().get(5).getCorrectAnswer());
            case "R2Q2":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(6).getVal(),QuestionMain.getQuestions().get(6).getCategory(),QuestionMain.getQuestions().get(6).getValue(),QuestionMain.getQuestions().get(6).getNum(),QuestionMain.getQuestions().get(6).getQuestion(),QuestionMain.getQuestions().get(6).getAnswer1(),QuestionMain.getQuestions().get(6).getAnswer2(),QuestionMain.getQuestions().get(6).getAnswer3(),QuestionMain.getQuestions().get(6).getAnswer4(),QuestionMain.getQuestions().get(6).getCorrectAnswer());
            case "R3Q2":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(7).getVal(),QuestionMain.getQuestions().get(7).getCategory(),QuestionMain.getQuestions().get(7).getValue(),QuestionMain.getQuestions().get(7).getNum(),QuestionMain.getQuestions().get(7).getQuestion(),QuestionMain.getQuestions().get(7).getAnswer1(),QuestionMain.getQuestions().get(7).getAnswer2(),QuestionMain.getQuestions().get(7).getAnswer3(),QuestionMain.getQuestions().get(7).getAnswer4(),QuestionMain.getQuestions().get(7).getCorrectAnswer());
            case "R4Q2":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(8).getVal(),QuestionMain.getQuestions().get(8).getCategory(),QuestionMain.getQuestions().get(8).getValue(),QuestionMain.getQuestions().get(8).getNum(),QuestionMain.getQuestions().get(8).getQuestion(),QuestionMain.getQuestions().get(8).getAnswer1(),QuestionMain.getQuestions().get(8).getAnswer2(),QuestionMain.getQuestions().get(8).getAnswer3(),QuestionMain.getQuestions().get(8).getAnswer4(),QuestionMain.getQuestions().get(8).getCorrectAnswer());
            case "R5Q2":  
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(9).getVal(),QuestionMain.getQuestions().get(9).getCategory(),QuestionMain.getQuestions().get(9).getValue(),QuestionMain.getQuestions().get(9).getNum(),QuestionMain.getQuestions().get(9).getQuestion(),QuestionMain.getQuestions().get(9).getAnswer1(),QuestionMain.getQuestions().get(9).getAnswer2(),QuestionMain.getQuestions().get(9).getAnswer3(),QuestionMain.getQuestions().get(9).getAnswer4(),QuestionMain.getQuestions().get(9).getCorrectAnswer());
            
            case "R1Q3":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(10).getVal(),QuestionMain.getQuestions().get(10).getCategory(),QuestionMain.getQuestions().get(10).getValue(),QuestionMain.getQuestions().get(10).getNum(),QuestionMain.getQuestions().get(10).getQuestion(),QuestionMain.getQuestions().get(10).getAnswer1(),QuestionMain.getQuestions().get(10).getAnswer2(),QuestionMain.getQuestions().get(10).getAnswer3(),QuestionMain.getQuestions().get(10).getAnswer4(),QuestionMain.getQuestions().get(10).getCorrectAnswer());             
            case "R2Q3":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(11).getVal(),QuestionMain.getQuestions().get(11).getCategory(),QuestionMain.getQuestions().get(11).getValue(),QuestionMain.getQuestions().get(11).getNum(),QuestionMain.getQuestions().get(11).getQuestion(),QuestionMain.getQuestions().get(11).getAnswer1(),QuestionMain.getQuestions().get(11).getAnswer2(),QuestionMain.getQuestions().get(11).getAnswer3(),QuestionMain.getQuestions().get(11).getAnswer4(),QuestionMain.getQuestions().get(11).getCorrectAnswer());
            case "R3Q3":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(12).getVal(),QuestionMain.getQuestions().get(12).getCategory(),QuestionMain.getQuestions().get(12).getValue(),QuestionMain.getQuestions().get(12).getNum(),QuestionMain.getQuestions().get(12).getQuestion(),QuestionMain.getQuestions().get(12).getAnswer1(),QuestionMain.getQuestions().get(12).getAnswer2(),QuestionMain.getQuestions().get(12).getAnswer3(),QuestionMain.getQuestions().get(12).getAnswer4(),QuestionMain.getQuestions().get(12).getCorrectAnswer());
            case "R4Q3":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(13).getVal(),QuestionMain.getQuestions().get(13).getCategory(),QuestionMain.getQuestions().get(13).getValue(),QuestionMain.getQuestions().get(13).getNum(),QuestionMain.getQuestions().get(13).getQuestion(),QuestionMain.getQuestions().get(13).getAnswer1(),QuestionMain.getQuestions().get(13).getAnswer2(),QuestionMain.getQuestions().get(13).getAnswer3(),QuestionMain.getQuestions().get(13).getAnswer4(),QuestionMain.getQuestions().get(13).getCorrectAnswer());
            case "R5Q3": 
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(14).getVal(),QuestionMain.getQuestions().get(14).getCategory(),QuestionMain.getQuestions().get(14).getValue(),QuestionMain.getQuestions().get(14).getNum(),QuestionMain.getQuestions().get(14).getQuestion(),QuestionMain.getQuestions().get(14).getAnswer1(),QuestionMain.getQuestions().get(14).getAnswer2(),QuestionMain.getQuestions().get(14).getAnswer3(),QuestionMain.getQuestions().get(14).getAnswer4(),QuestionMain.getQuestions().get(14).getCorrectAnswer());

            case "R1Q4":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(15).getVal(),QuestionMain.getQuestions().get(15).getCategory(),QuestionMain.getQuestions().get(15).getValue(),QuestionMain.getQuestions().get(15).getNum(),QuestionMain.getQuestions().get(15).getQuestion(),QuestionMain.getQuestions().get(15).getAnswer1(),QuestionMain.getQuestions().get(15).getAnswer2(),QuestionMain.getQuestions().get(15).getAnswer3(),QuestionMain.getQuestions().get(15).getAnswer4(),QuestionMain.getQuestions().get(15).getCorrectAnswer());
            case "R2Q4":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(16).getVal(),QuestionMain.getQuestions().get(16).getCategory(),QuestionMain.getQuestions().get(16).getValue(),QuestionMain.getQuestions().get(16).getNum(),QuestionMain.getQuestions().get(16).getQuestion(),QuestionMain.getQuestions().get(16).getAnswer1(),QuestionMain.getQuestions().get(16).getAnswer2(),QuestionMain.getQuestions().get(16).getAnswer3(),QuestionMain.getQuestions().get(16).getAnswer4(),QuestionMain.getQuestions().get(16).getCorrectAnswer());
            case "R3Q4":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(17).getVal(),QuestionMain.getQuestions().get(17).getCategory(),QuestionMain.getQuestions().get(17).getValue(),QuestionMain.getQuestions().get(17).getNum(),QuestionMain.getQuestions().get(17).getQuestion(),QuestionMain.getQuestions().get(17).getAnswer1(),QuestionMain.getQuestions().get(17).getAnswer2(),QuestionMain.getQuestions().get(17).getAnswer3(),QuestionMain.getQuestions().get(17).getAnswer4(),QuestionMain.getQuestions().get(17).getCorrectAnswer());
            case "R4Q4":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(18).getVal(),QuestionMain.getQuestions().get(18).getCategory(),QuestionMain.getQuestions().get(18).getValue(),QuestionMain.getQuestions().get(18).getNum(),QuestionMain.getQuestions().get(18).getQuestion(),QuestionMain.getQuestions().get(18).getAnswer1(),QuestionMain.getQuestions().get(18).getAnswer2(),QuestionMain.getQuestions().get(18).getAnswer3(),QuestionMain.getQuestions().get(18).getAnswer4(),QuestionMain.getQuestions().get(18).getCorrectAnswer());
            case "R5Q4":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(19).getVal(),QuestionMain.getQuestions().get(19).getCategory(),QuestionMain.getQuestions().get(19).getValue(),QuestionMain.getQuestions().get(19).getNum(),QuestionMain.getQuestions().get(19).getQuestion(),QuestionMain.getQuestions().get(19).getAnswer1(),QuestionMain.getQuestions().get(19).getAnswer2(),QuestionMain.getQuestions().get(19).getAnswer3(),QuestionMain.getQuestions().get(19).getAnswer4(),QuestionMain.getQuestions().get(19).getCorrectAnswer());
 
            case "R1Q5":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(20).getVal(),QuestionMain.getQuestions().get(20).getCategory(),QuestionMain.getQuestions().get(20).getValue(),QuestionMain.getQuestions().get(20).getNum(),QuestionMain.getQuestions().get(20).getQuestion(),QuestionMain.getQuestions().get(20).getAnswer1(),QuestionMain.getQuestions().get(20).getAnswer2(),QuestionMain.getQuestions().get(20).getAnswer3(),QuestionMain.getQuestions().get(20).getAnswer4(),QuestionMain.getQuestions().get(20).getCorrectAnswer());
            case "R2Q5":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(21).getVal(),QuestionMain.getQuestions().get(21).getCategory(),QuestionMain.getQuestions().get(21).getValue(),QuestionMain.getQuestions().get(21).getNum(),QuestionMain.getQuestions().get(21).getQuestion(),QuestionMain.getQuestions().get(21).getAnswer1(),QuestionMain.getQuestions().get(21).getAnswer2(),QuestionMain.getQuestions().get(21).getAnswer3(),QuestionMain.getQuestions().get(21).getAnswer4(),QuestionMain.getQuestions().get(21).getCorrectAnswer());
            case "R3Q5":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(22).getVal(),QuestionMain.getQuestions().get(22).getCategory(),QuestionMain.getQuestions().get(22).getValue(),QuestionMain.getQuestions().get(22).getNum(),QuestionMain.getQuestions().get(22).getQuestion(),QuestionMain.getQuestions().get(22).getAnswer1(),QuestionMain.getQuestions().get(22).getAnswer2(),QuestionMain.getQuestions().get(22).getAnswer3(),QuestionMain.getQuestions().get(22).getAnswer4(),QuestionMain.getQuestions().get(22).getCorrectAnswer());
            case "R4Q5":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(23).getVal(),QuestionMain.getQuestions().get(23).getCategory(),QuestionMain.getQuestions().get(23).getValue(),QuestionMain.getQuestions().get(23).getNum(),QuestionMain.getQuestions().get(23).getQuestion(),QuestionMain.getQuestions().get(23).getAnswer1(),QuestionMain.getQuestions().get(23).getAnswer2(),QuestionMain.getQuestions().get(23).getAnswer3(),QuestionMain.getQuestions().get(23).getAnswer4(),QuestionMain.getQuestions().get(23).getCorrectAnswer());
            case "R5Q5":
                QuestionMain.loadQuestions();
                return new Questions(QuestionMain.getQuestions().get(24).getVal(),QuestionMain.getQuestions().get(24).getCategory(),QuestionMain.getQuestions().get(24).getValue(),QuestionMain.getQuestions().get(24).getNum(),QuestionMain.getQuestions().get(24).getQuestion(),QuestionMain.getQuestions().get(24).getAnswer1(),QuestionMain.getQuestions().get(24).getAnswer2(),QuestionMain.getQuestions().get(24).getAnswer3(),QuestionMain.getQuestions().get(24).getAnswer4(),QuestionMain.getQuestions().get(23).getCorrectAnswer());

            default:
                return null;
        } 
    }
}
