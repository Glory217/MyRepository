<%-- 
    Document   : view.jsp
    Created on : 04-Dec-2017, 13:28:41
    Author     : punjabi
--%>

<%@page import="ca.sheridancollege.Beans.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        
        <title>JSP Page</title>
    </head>
    <style>
        h1{
            font-family: verdana;
            font-size: 50px;
            color: #33334d;
        }
        th{
            font-family: verdana;
            font-size: 20px;
            color: #33334d;
        }
         #Link1{
               position:relative;
               left:555px;
               font-size:40px;
               color:#33334d;
               text-decoration: none;
            }
            
            #Link2{
               position:relative;
               left:550px;
               font-size:40px;
               color:#33334d;
               text-decoration: none;
            }
        
        body{
            background: url('../Images/View.jpg');
        }
        </style>
        
    <body>
        
        <h1><center>Added Books</center></h1>
        <a id="Link1" href='/FinalProjectJavaEE/Member/StudentLib.jsp'> Main Page Student </a><br>
         <a id="Link2" href='/FinalProjectJavaEE/Member/JspLib.jsp'> Main Page Librarian </a>
    <center><table border="1" ></center>
            <tr>
                <th>Book Title</th>
                  <th>Author Name</th>
                      <th>Pages</th>
                          <th>ISBN Number</th>
                        
            </tr>
            
            
            <c:set var="books" value="${Books}" ></c:set>
            
            <c:forEach var="b" items='${books}'>
             
            <tr>
                <th>${b.getTitle()}</th>
                <th>${b.getAuthor()}</th>
                <th>${b.getPages()}</th>
                <th>${b.getISBN()}</th>
            </tr>
            
            </c:forEach>
            
          
            
        </table>
    </body>
</html>
