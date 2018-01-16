/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

/**
 *
 * @author punjabi
 */
public class Player {
   private String name;
   private int Score;

    public Player(String name, int Score) {
        this.name = name;
        this.Score = Score;
    }
   
    public Player(){}

    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
}
