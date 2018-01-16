<%-- 
    Document   : MainPage
    Created on : 17-Dec-2017, 01:52:46
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            fieldset{
            height:600px;
            width:30%;
            position:relative;
            left:450px;
            bottom:10px;
            background:linear-gradient(to bottom,#33334d,#BEBEBE);
            }
            input[type=text]{
            width: 100%;
            background-color: white;
            height:40px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            }
            input[type=email]{
            width: 100%;
            background-color: white;
            height:40px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            }
            
            input[type=submit]{
            width: 50%;
            background-color: white;
            height:40px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            font-family: serif;
            font-size:30px;
            
            }
            legend{
                font-size:60px;
                color:#b1b1cd;
            }
            body{
               background-image: url('../Images/AddStu.jpg');
            }
        </style>
    </head>
    <body>
        <div>
          <form action="Login">
            <fieldset>
            <legend> Add a Student</legend>
            FirstName:<input type="text" name="FirstName" placeholder="firstname"><br><br>
            LastName:<input type="text" name="LastName" placeholder="lastname"><br><br>
            Email:<input type="email" name="Email" placeholder="xyz@email.com"><br><br>
            Course:<input type="text" name="Course" placeholder="course"><br><br>
            ID:<input type="text" name="ID" placeholder="student ID"><br><br>
            <input type="submit"><br><br>
            </fieldset>
            <a href='view'> View Students </a>
       </form>
       </div>
    </body>
</html>

            
     
