<%-- 
    Document   : WinPage
    Created on : 15-Oct-2017, 19:49:34
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "ca.sheridancollege.beans.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Win Page!</title>
        <style>
            h1{
                position:relative;
                left:450px;
                font-size:50px;
                color:#BF4CD8;
                font-family:comic sans ms;
            }
            h2{
                position:relative;
                left:450px;
                font-size:50px;
                color:#BF4CD8;
                font-family:comic sans ms;
            }
            body{
                background:url('Image6.jpg')
            }
            </style>
            
    </head>
    <body>
        <h1> Congratulations! </h1>
        <% Player PL = (Player)session.getAttribute("Player1"); %>
         <% int Sc = PL.getScore(); %>
         <h2> Your Final Score is <%= Sc %> </h2>
    </body>
</html>
