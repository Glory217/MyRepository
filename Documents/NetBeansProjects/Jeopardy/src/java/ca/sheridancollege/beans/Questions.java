/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author punjabi
 */
public class Questions implements Serializable {
 
    private String Val;
    private String category;
    private int value;
    private String Num;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    
    private ArrayList<Questions> questions = new ArrayList<>();
    
    
    public Questions()
    {
       Val="";
       category = "";
       value = 0;
       Num="";
       question = "";
       answer1 = "";
       answer2 = "";
       answer3 = "";
       answer4 = "";
       correctAnswer = "";
    }
    
    public Questions(String Val,String cat, int val, String num, String ques, String ans1, String ans2, String ans3, String ans4, String correctAns)
    {
        Val = Val;
        category = cat;
        value = val;
        Num = num;
        question = ques;
        answer1 = ans1;
        answer2 = ans2;
        answer3 = ans3;
        answer4 = ans4;
        correctAnswer = correctAns; 
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }

    
    
    public String getVal() {
        return Val;
    }

    public ArrayList<Questions> getQuestions() {
        return questions;
    }

    public void setVal(String Val) {
        this.Val = Val;
    }

    public void setQuestions(ArrayList<Questions> questions) {
        this.questions = questions;
    }
    
    
    
    public String getCategory() {
        return category;
    }

    public int getValue() {
        return value;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

 
}