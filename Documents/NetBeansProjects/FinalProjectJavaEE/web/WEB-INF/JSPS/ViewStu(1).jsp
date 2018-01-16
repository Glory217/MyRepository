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
        
        #Link2{
               position:relative;
               left:465px;
               font-size:30px;
               color:#33334d;
               text-decoration: none;
            }
        
        body{
            background: url('../Images/View.jpg');
        }
        </style>
        
    <body>
        
        <h1><center>Added Students</center></h1>
        <a id="Link2" href='/FinalProjectJavaEE/Member/JspLib.jsp'> Main Page Librarian </a><br><br>
    <center><table border="1" ></center>
            <tr>
                <th>FirstName</th>
                  <th>LastName</th>
                      <th>Email</th>
                          <th>ID</th>
                          <th>Course</th>
            </tr>
            
            
            <c:set var="students" value="${Students}" ></c:set>
            
            <c:forEach var="stu" items='${students}'>
             
            <tr>
                <th>${stu.getFirstName()}</th>
                <th>${stu.getLastName()}</th>
                <th>${stu.getEmail()}</th>
                <th>${stu.getID()}</th>
                <th>${stu.getCourse()}</th>
            </tr>
            
            </c:forEach>
            
           
        </table>
    </body>
</html>
