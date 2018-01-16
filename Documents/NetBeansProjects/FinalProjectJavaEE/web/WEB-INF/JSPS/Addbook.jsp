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
         <script>
            function MyFunction(){  
            if(!isNaN(document.getElementById("MyFormTwo").elements[0].value)){
              alert("You are entering wrong data");
              document.getElementById("MyFormTwo").elements[0].value = prompt("Please enter Correct value for book name");
             }
         if(!isNaN(document.getElementById("MyFormTwo").elements[1].value)){
             alert("You are entering wrong data");
             document.getElementById("MyFormTwo").elements[1].value = prompt("Please enter Correct value for book author");
              }
        if(isNaN(document.getElementById("MyFormTwo").elements[2].value)){
             alert("You are entering wrong data");
             document.getElementById("MyFormTwo").elements[2].value = prompt("Please enter Correct value for Pages");
         }   
         if(isNaN(document.getElementById("MyFormTwo").elements[3].value)){
             alert("You are entering wrong data");
             document.getElementById("MyFormTwo").elements[3].value = prompt("Please enter Correct value for ISBN");
        }
        </script>
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
            #Link1{
               position:relative;
               left:465px;
               font-size:60px;
               color:#33334d;
               text-decoration: none;
            }
            
            #Link2{
               position:relative;
               left:150px;
               bottom:-80px;
               font-size:60px;
               color:#33334d;
               text-decoration: none;
            }
            #Link3{
               position:relative;
               left:-190px;
               bottom:-150px;
               font-size:60px;
               color:#33334d;
               text-decoration: none;
            }
            body{
               background-image: url('../Images/AddStu.jpg');
            }
        </style>
    </head>
    <body>
        <div>
            <form id="MyFormTwo"  action="/FinalProjectJavaEE/Member/Book"  onsubmit="MyFunction()">
            <fieldset>
            <legend> Add a Book</legend>
            Title:<input type="text" name="Title" placeholder="Book title"><br><br>
            Author:<input type="text" name="Author" placeholder="Author"><br><br>
            Pages:<input type="text" name="Pages" placeholder="pages"><br><br>
            ISBN:<input type="text" name="ISBN" placeholder="example:978-3-16-148410-0"><br><br>
            <input type="submit"><br><br>
            </fieldset>
            <a id="Link1" href='/FinalProjectJavaEE/Member/ViewB'> View Books </a>
            <a id="Link2" href='/FinalProjectJavaEE/Member/Delete'> Delete Books </a>
            <a id="Link3" href='/FinalProjectJavaEE/Member/JspLib.jsp'> Main Page </a>
       </form>
       </div>
    </body>
</html>

            
     
