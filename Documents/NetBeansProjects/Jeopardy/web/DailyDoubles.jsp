<%-- 
    Document   : DailyDoubles
    Created on : 20-Oct-2017, 21:34:28
    Author     : punjabi
--%>

<%@page import="ca.sheridancollege.beans.Questions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "ca.sheridancollege.beans.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
       function myFunction() {
       var x =  document.getElementById("myId");
       var y = x.innerHTML;
       var amount;
       do{
       amount = prompt("Please enter the amount you want to bid");
       }while(amount > y);   
}
</script>

        <style>
            h1{
                font-size:65px;
                color: #E61337;
                position:relative;
                left:440px;
            }
            h3{
                font-size:40px;
                color: #E61337;
                position:relative;
                left:450px;
                bottom:20px;
            }
            h4{
                font-size: 30px;
                color: #E61337;
                position:relative;
                left:450px;
                bottom:30px;
            }
            form{
                position:relative;
                left:450px;
                bottom:30px;
            }
          
            p{
            position:relative;
            bottom:80px;
            left:20px;
            color: #E61337;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch2{
            position:relative;
            bottom:120px; 
            }
            #P2{
            position:relative;
            bottom:200px;
            left:20px;
            color: #E61337;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch3{
            position:relative;
            bottom:240px;
            }
            #P3{
            position:relative;
            bottom:320px;
            left:20px;
            color: #E61337;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch4{
            position:relative;
            bottom:350px;
            }
            #P4{
            position:relative;
            bottom:430px;
            left:20px;
            color: #E61337;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch5{
            position:relative;
            bottom:450px;
            color:#E61337;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            body{
            background-image:url('Image5.jpg');
            }
        </style>
    </head>
    <body onload="myFunction()">
        <h1><b><i> Daily Doubles! </i></b></h1>
<% Questions Q = (Questions)session.getAttribute("Question"); %>
<% Player Pli = (Player)session.getAttribute("Player2"); %>
<% int s = Pli.getScore(); %>
<h2 id="myId" hidden><%= s %> </h2>
<% session.setAttribute("Player3",Pli); %>
    <h3><i>Category <%= Q.getCategory() %></i></h3>
    <h4><i><b><%= Q.getQuestion() %></b></i></h4>
<form action="dailydoubles">
    <input id="Ch1" type="radio" name="answer" value="<%= Q.getAnswer1() %>" ><p><%= Q.getAnswer1() %></p><br>
    <input id="Ch2" type="radio" name="answer" value="<%= Q.getAnswer2() %>" ><p id="P2"><%= Q.getAnswer2() %></p><br>
    <input id="Ch3" type="radio" name="answer" value="<%= Q.getAnswer3() %>" ><p id="P3"><%= Q.getAnswer3() %></p><br>
    <input id="Ch4" type="radio" name="answer" value="<%= Q.getAnswer4() %>" ><p id="P4"><%= Q.getAnswer4() %></p><br>
  <input id = "Ch5" type="submit" />
</form>
    </body>
    <%  session.setAttribute("Question", Q); %>
    
    <%  int t = Integer.parseInt(session.getAttribute("Times2").toString()); %>
    <%  t++;  %>
    <%  session.setAttribute("Times3",t);  %>
</html>
