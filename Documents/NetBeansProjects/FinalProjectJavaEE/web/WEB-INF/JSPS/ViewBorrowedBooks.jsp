<%-- 
    Document   : BorrowBooks
    Created on : 09-Jan-2018, 01:14:06
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <%@taglib uri="/WEB-INF/tlds/MyTagLibrary" prefix="mine" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <title>JSP Page</title>
        <style>
            h1{
               font-family:verdana;
               font-size:50px;
               color:#4AC948;
               position:relative;
               bottom:-50px;
               left:400px;
            }
            
            li{
               font-family: verdana;
               font-size:30px;
               color:#4AC948;
               position:relative;
               left:400px;
               bottom:-150px;
            }
           #Link2{
               position:relative;
               left:600px;
               bottom:-70px;
               font-size:30px;
               color:#4AC948;
               text-decoration: none;
            }
            body{
                background:url('../Images/BorrowBooks.jpg')
            }
        </style>
    </head>
    
    <h1><mine:Heading value="borrowed books"/></h1>
    <c:set var="books" value="${BorrowedBooks}" ></c:set>
            <c:forEach var="b" items='${books}'>
                <ul>
                    <li>${b.getBname()}</li>
                </ul>
                </c:forEach>

        <a id="Link2" href='/FinalProjectJavaEE/Member/JspLib.jsp'> Main Page </a>
    
</html>
