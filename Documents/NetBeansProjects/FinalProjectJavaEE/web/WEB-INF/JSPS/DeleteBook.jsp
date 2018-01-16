<%-- 
    Document   : BorrowBooks
    Created on : 09-Jan-2018, 01:14:06
    Author     : punjabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            form{
               position:relative;
               bottom:-170px;
               left:400px;
            }
            p{
               font-family: verdana;
               font-size:30px;
               color:#4AC948;
               position:relative;
               left:50px;
               bottom:60px;
            }
            input[type=submit]{
               font-family:verdana;
               font-size:30px;
               color:#4AC948;
               background: white;
            }
            body{
                background:url('../Images/BorrowBooks.jpg')
            }
        </style>
    </head>
    <body>
    <h1>Select the books to borrow</h1>
    
    <c:set var="books" value="${Books}" ></c:set>
            <c:forEach var="b" items='${books}'>
                
                <form action="/FinalProjectJavaEE/Member/DeleteTwo">
                        <input type="checkbox" name="bname" value="${b.getTitle()}"><p>${b.getTitle()}</p>
                        </c:forEach>

        <input type="submit"><br><br>
        
        </form>
    </body>
</html>
