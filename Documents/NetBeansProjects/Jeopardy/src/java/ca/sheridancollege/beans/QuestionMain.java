/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

import java.util.ArrayList;


/**
 *
 * @author punjabi
 */
public class QuestionMain  {
    
   public static ArrayList<Questions> questions = new ArrayList<>();
    
    public static void loadQuestions(){
        questions.add(new Questions("disabled","Java",200, "Q1","What are the number of primitive data types","4","6","10","8","8"));
        questions.add(new Questions("disabled","Java",400, "Q2","Who invented Java","Brendan Eich","James Gosling","Tim Berners-Lee","Charles Babbage","James Gosling"));
        questions.add(new Questions("disabled","Java",600,"Q3","What is the output of 5%3","2","1","0","6","2"));
        questions.add(new Questions("disabled","Java",800,"Q4","Which method is used to calculate the length of an array A[]","A.length()","A.length","A.size()","A.sizeOf()","A.length"));
        questions.add(new Questions("disabled","Java",1000,"Q5","What is the answer of Math.sqrt(64)","4","6","8.0","8","8.0"));
        
        questions.add(new Questions("disabled","Football",200,"Q6","When was first official football match played","Nov 6, 1979","Nov 6, 1969","Jan 5, 1969","June4, 1875","Nov 6, 1969"));
        questions.add(new Questions("disabled","Football",400,"Q7","Which team is currently world's number one football team","Germany","Brazil","Netherlands","Portugal","Germany"));
        questions.add(new Questions("disabled","Football",600,"Q8","Which is the wealthiest football club","FC Barcelona","Real Madrid","Manchester United","Manchester City","Manchester United"));
        questions.add(new Questions("disabled","Football",800,"Q9","Which of the following holds a record for the most Ballon d'or wins","Neymar Jr.","Christiano Ronaldo","Lionel Messi","James Rodriguez","Lionel Messi"));
        questions.add(new Questions("disabled","Football",1000,"Q10","Neymar Jr. plays for which of the following clubs","FC Barcelone","Real Madrid","Paris Saint-German FC","Manchester City","Paris Saint-German FC"));
        
        questions.add(new Questions("disabled","Harry Potter Series",200,"Q11","Who has written harry potter series","Veronica Roth","JK Rowling","Stephen King","James Patterson","JK Rowling"));
        questions.add(new Questions("disabled","Harry Potter Series",400,"Q12","How many books are there in Harry Potter Series","8","4","9","7","7"));
        questions.add(new Questions("disabled","Harry Potter Series",600,"Q13","Who had played Ron Weasley in Harry Potter movies","Daniel Radcliffe","Rupert Grint","Emma Watson","Tom Felton","Rupert Grint"));
        questions.add(new Questions("disabled","Harry Potter Series",800,"Q14","In harry potter films, Hermione Granger belonged to which hogwarts house","Gryffindor","Slytherin","Hufflepuff","Ravenclaw","Gryffindor"));
        questions.add(new Questions("disabled","Harry Potter Series",1000,"Q15","When did last Harry Potter movie release","2010","2012","2011","2013","2011"));
        
        questions.add(new Questions("disabled","Science",200,"Q16","What is the process of making a salt called","Hydrolysis","Neutralisation","Sulfonation","Reduction","Neutralisation"));
        questions.add(new Questions("disabled","Science",400,"Q17","Which of the following is a primary green house gas","Oxygen","Methane","Nitrogen","Sulphur Oxide","Methane"));
        questions.add(new Questions("disabled","Science",600,"Q18","Which branch of physics deal with heat and related fields","Relativity","Thermodynamics","Quantum Physics","Mechanics","Thermodynamics"));
        questions.add(new Questions("disabled","Science",800,"Q19","What is the scientific name of table salt","Sodium Chloride","Sodium Sulphate","Potassium Chloride","Potassium chlorate","Sodium Chloride"));
        questions.add(new Questions("disabled","Science",1000,"Q20","Which of the following is the largest sense organ","Eyes","Ears","Skin","Tongue","Skin"));
        
        questions.add(new Questions("disabled","Space",200,"Q21","Which is the smallest planet of our solar system","Saturn","Jupiter","Mercury","Earth","Mercury"));
        questions.add(new Questions("disabled","Space",400,"Q22","Which planet is fartherest from the Sun","Neptune","Jupter","Saturn","Mercury","Neptune"));
        questions.add(new Questions("disabled","Space",600,"Q23","Which planet in our Solar System has the most gravity","Saturn","Neptune","Mercury","Jupiter","Jupiter"));
        questions.add(new Questions("disabled","Space",800,"Q24","Which galaxy contains our solar system","Bode's Galaxy","Milkyway","Large Magellanic Cloud","Small Magellanic Cloud","Milkyway"));
        questions.add(new Questions("disabled","Space",1000,"Q25","Who was the first person to travel into space","Liu Yang","Elon Musk","Neil Armstrong","Yuri Gagarin","Yuri Gagarin"));   
    }

    public static ArrayList<Questions> getQuestions() {
        return questions;
    }
}

    

