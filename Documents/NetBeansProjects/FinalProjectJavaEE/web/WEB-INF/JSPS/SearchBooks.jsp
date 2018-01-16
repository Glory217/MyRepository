<%-- 
    Document   : SearchBooks
    Created on : 08-Jan-2018, 21:37:39
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.css" />
	<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>JSP Page</title>
        <style>
            h1{
                font-family: verdana;
                font-size: 40px;
                color: #33334d;
            }
             #Link1{
               position:relative;
               left:535px;
               font-size:30px;
               color:#33334d;
               text-decoration: none;
            }
            
            #Link2{
               position:relative;
               left:535px;
               font-size:30px;
               color:#33334d;
               text-decoration: none;
            }
        </style>
        
        
    </head>
    <body>
        
            <Center><h1> Search Books </h1></Center>
         <a id="Link1" href='/FinalProjectJavaEE/Member/StudentLib.jsp'> Main Page Student </a><br>
         <a id="Link2" href='/FinalProjectJavaEE/Member/JspLib.jsp'> Main Page Librarian </a><br>
        
        <c:set var="books" value="${Books}" ></c:set>
        <br>
        <ul data-role="listview" data-inset="true" data-filter="true">
            <br>
             <c:forEach var="b" items='${books}'>
             
            
                <li>${b.getTitle()}</li>
          
            
            </c:forEach>
            
        </ul>
        
    </body>
</html>
