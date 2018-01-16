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
public class Books {
    
    private String Title;
    private String Author;
    private String pages;
    private String ISBN;
   

    public Books(String Title, String Author, String pages, String ISBN) {
        this.Title = Title;
        this.Author = Author;
        this.pages = pages;
        this.ISBN = ISBN;
    }
    
    public Books(){
        
    }
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    

    @Override
    public String toString() {
        return "Books{" + "Title=" + Title + ", Author=" + Author + ", pages=" + pages + ", ISBN=" + ISBN +  '}';
    }
    
    
    
    
}
