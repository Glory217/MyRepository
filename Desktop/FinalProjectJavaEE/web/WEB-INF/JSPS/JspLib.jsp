 <%-- 
    Document   : JspLib
    Created on : 06-Jan-2018, 16:33:14
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lib Page</title>
        <style>
            h1{
                font-family:verdana;
                color:black;
                font-size:45px;
            }
            #img1{
                float:right;
                position:relative;
                left:-950px;
            }
            #img2{
                float:right;
                position:relative;
                bottom:70px;
                left:-300px;
            }
             #img3{
                float:right;
                position:relative;
                bottom:138px;
                left:370px;
            }
            
            #img4{
                float:right;
                position:relative;
                bottom:-100px;
                left:235px;
            }

            #par1{
                position:relative;
                left:110px;
                bottom:-250px;
                font-family:verdana;
                color:black;
                font-size:30px;
            }
            #par2{
                position:relative;
                left:570px;
                bottom:-180px;
                font-family:verdana;
                color:black;
                font-size:30px;
            }
            #par3{
                position:relative;
                left:980px;
                bottom:-110px;
                font-family:verdana;
                color:black;
                font-size:30px;
            }
            #par4{
                position:relative;
                left:600px;
                bottom:-310px;
                font-family:verdana;
                color:black;
                font-size:30px;
            }
            a{
                text-decoration: none;
            }
            body{
                background:linear-gradient(to right, lightgray, white);
            }
        </style>
    </head>
    <body>
    <center><h1>Welcome to the Library </h1> </center>
    <a href="AddStu.jsp"><img id="img1" src="../Images/Student.png"><p id= "par1">Manage Students</p></a>
    <a href="Addbook.jsp"><img id="img2" src="../Images/Books.png"><p id="par2">Manage Books</p></a>
    <a href="/FinalProjectJavaEE/Member/Search"><img id="img3" src="../Images/Search.png"><p id="par3">Search Books</p></a>
    <a href="/FinalProjectJavaEE/Member/BorrowTwo"><img id="img4" src="../Images/viewborrowed.png"><p id="par4">Borrowed Books</p></a>  
    </body>
</html>
