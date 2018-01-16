package ca.sheridancollege.DAO;


import ca.sheridancollege.Beans.Books;
import ca.sheridancollege.Beans.BorrowedBooks;
import ca.sheridancollege.Beans.Student;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author punjabi
 */
public class dao{
    
    
    
    
    public  String userName;
    public  String password;
    public  String host;
    
    public dao(String host, String userName, String password)
    {
        this.userName = userName;
        this.password = password;
        this.host = host;
    }
    
    public void addStudent(Student stu)
    {
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            //Try to connect to the database.  If the database does 
	    //not exist then create it.
	    //The database in this case is called "mycontacts"
	    String database = "MyStudents";
            try
            {
                con = DriverManager.getConnection
			(host + database, userName, password);
            
            }catch(Exception e)
            {
                con = DriverManager.getConnection
                (host, userName, password);
                Statement st = con.createStatement();
                st.executeUpdate("CREATE DATABASE " + database);
                con = DriverManager.getConnection
			(host + database, userName, password);  
            }
            
            String add = "INSERT INTO Students VALUES "+
                    "('"+  stu.getFirstName()
                        +"', '"+stu.getLastName()
                        +"', '"+stu.getEmail()
                        +"', '"+stu.getID()
                        +"', '"+stu.getCourse()
                        +"')";
            Statement st =  con.createStatement();
            //Add the new contact into the SQL table.
            try
            {
                st.executeUpdate(add);
            }catch(Exception e)
            {
                String make = "CREATE TABLE Students (" +
"    FirstName varchar(255)," +
"    LastName varchar(255)," +
"    Email varchar(255)," +  
"    ID varchar(255)," + 
"    Course varchar(255)" + 
")";
                st.executeUpdate(make);
                st.executeUpdate(add);
            }
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void DeleteBooks(String t)
    {
        ArrayList<Books> Books = new ArrayList<Books>();
        String delete = null;
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con;
           
	    String database = "myBooks";
            
            con = DriverManager.getConnection
		 (host + database, userName, password);
            
            String query = "Select *from Books";
            
            Statement st =  con.createStatement();
            
            ResultSet rs =st.executeQuery(query);    
            
            while(rs.next()){
              Books.add(new Books(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
              
        }
        catch(Exception ex){
            System.out.println(ex);
        }
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            //Try to connect to the database.  If the database does 
	    //not exist then create it.
	    //The database in this case is called "mycontacts"
	    String database = "MyBooks";
            try
            {
                con = DriverManager.getConnection
			(host + database, userName, password);
            
            }catch(Exception e)
            {
                out.println("Database does not Exist"); 
            }
            for(int i=0; i<Books.size(); i++){
               if(Books.get(i).getTitle().equals(t))
               delete = "DELETE FROM Books WHERE Title = "+"'"+t+"'";
            }
                    
            Statement st =  con.createStatement();
            //Add the new contact into the SQL table.
            try
            {
                st.executeUpdate(delete);
            }catch(Exception e)
            {
                out.println(e);
            }
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void addBooks(Books b)
    {
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            //Try to connect to the database.  If the database does 
	    //not exist then create it.
	    //The database in this case is called "mycontacts"
	    String database = "MyBooks";
            try
            {
                con = DriverManager.getConnection
			(host + database, userName, password);
            
            }catch(Exception e)
            {
                con = DriverManager.getConnection
                (host, userName, password);
                Statement st = con.createStatement();
                st.executeUpdate("CREATE DATABASE " + database);
                con = DriverManager.getConnection
			(host + database, userName, password);  
            }
            
            String add = "INSERT INTO Books VALUES "+
                    "('"+  b.getTitle()
                        +"', '"+b.getAuthor()
                        +"', '"+b.getPages()
                        +"', '"+b.getISBN()
                        +"')";
            Statement st =  con.createStatement();
            //Add the new contact into the SQL table.
            try
            {
                st.executeUpdate(add);
            }catch(Exception e)
            {
                String make = "CREATE TABLE Books (" +
"    Title varchar(255)," +
"    Author varchar(255)," +
"    Pages varchar(255)," +  
"    ISBN varchar(255)" + 
")";
                st.executeUpdate(make);
                st.executeUpdate(add);
            }
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
     public void addBorrowedBooks(BorrowedBooks b)
    {
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            //Try to connect to the database.  If the database does 
	    //not exist then create it.
	    //The database in this case is called "mycontacts"
	    String database = "MyBorrowedBooks";
            try
            {
                con = DriverManager.getConnection
			(host + database, userName, password);
            
            }catch(Exception e)
            {
                con = DriverManager.getConnection
                (host, userName, password);
                Statement st = con.createStatement();
                st.executeUpdate("CREATE DATABASE " + database);
                con = DriverManager.getConnection
			(host + database, userName, password);  
            }
            
            String add = "INSERT INTO BorrowedBooks VALUES "+
                    "('"+  b.getBname()
                        +"')";
            Statement st =  con.createStatement();
            //Add the new contact into the SQL table.
            try
            {
                st.executeUpdate(add);
            }catch(Exception e)
            {
                String make = "CREATE TABLE BorrowedBooks (" +
"    Title varchar(255)" +
")";
                st.executeUpdate(make);
                st.executeUpdate(add);
            }
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    

    
     public ArrayList<Student> getStudents() 
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con;
           
	    String database = "mystudents";
            
            con = DriverManager.getConnection
		 (host + database, userName, password);
            
            String query = "Select *from Students";
            
            Statement st =  con.createStatement();
            
            ResultSet rs =st.executeQuery(query);    
            
            ArrayList<Student> contacts = new ArrayList<Student>();
            
            while(rs.next()){
              contacts.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return contacts;
            
        }
        catch(Exception ex){
            System.out.println(ex);
        
        return null;
       }
    }
     
     public ArrayList<Books> getBooks() 
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con;
           
	    String database = "myBooks";
            
            con = DriverManager.getConnection
		 (host + database, userName, password);
            
            String query = "Select *from Books";
            
            Statement st =  con.createStatement();
            
            ResultSet rs =st.executeQuery(query);    
            
            ArrayList<Books> Books = new ArrayList<Books>();
            
            while(rs.next()){
              Books.add(new Books(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
            return Books;
            
        }
        catch(Exception ex){
            System.out.println(ex);
        
        return null;
       }
    }
     
     
     public ArrayList<BorrowedBooks> getBorrowedBooks() 
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con;
           
	    String database = "myBorrowedBooks";
            
            con = DriverManager.getConnection
		 (host + database, userName, password);
            
            String query = "Select *from BorrowedBooks";
            
            Statement st =  con.createStatement();
            
            ResultSet rs =st.executeQuery(query);    
            
            ArrayList<BorrowedBooks> Book = new ArrayList<BorrowedBooks>();
            
            while(rs.next()){
              Book.add(new BorrowedBooks(rs.getString(1)));
            }
            return Book;
            
        }
        catch(Exception ex){
            System.out.println(ex);
        
        return null;
       }
    }
}