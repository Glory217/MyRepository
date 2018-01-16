/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.Beans;

/**
 *
 * @author punjabi
 */
public class BorrowedBooks {
    private String bname;

    public BorrowedBooks() {
    }

    public BorrowedBooks(String bname) {
        this.bname = bname;
    }

    public String getBname() {
        return bname;
    }

    @Override
    public String toString() {
        return "BorrowedBooks{" + "bname=" + bname + '}';
    }
    
    
    
}
