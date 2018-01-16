
<%-- 
    Document   : showbeer.jsp
    Created on : 27-Sep-2017, 18:08:36
    Author     : punjabi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "ca.sheridancollege.beans.*" %>
<!DOCTYPE html>
<html>
<head>
    <script>
  function Myfunction()
  {
      var audio = document.getElementById("audio");
      audio.play();
  }
        </script>
        
<style>
h1{
position:relative;
left:250px;
bottom:35px;
font-size:50px;
font-family:comic sans ms;
color:#9C0751;
}

h3{
font-family:comic sans ms;
position:relative;
bottom:55px;
left:250px;
color:#9C0751;
font-size:40px;
}

h4{
font-family:comic sans ms;
position:relative;
bottom:75px;
left:250px;
color:#9C0751;
font-size:40px;
}
            form{
            position:relative;
            left:250px;
            bottom:80px;
            }

            p{
            position:relative;
            bottom:80px;
            left:20px;
            color: #9C0751 ;
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
            color: #9C0751;
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
            color:#9C0751;
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
            color:#9C0751;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch5{
            position:relative;
            bottom:470px;
            background-color:#9C0751;
            color:white;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
            #Ch6{
            position:relative;
            bottom:450px;
            background-color:#9C0751;
            color:white;
            font-weight: bold;
            font-style:italic;
            font-size: 40px;
            }
body{
background-image:url("QuesJsp.jpg");
}
</style>
</head>
<body>
<h1><b><i> Welcome</i></b></h1>

<% Questions Q = (Questions)session.getAttribute("Question"); %>
<% Player Pli = (Player)session.getAttribute("Player2"); %>
<% session.setAttribute("Player3",Pli); %>
<h3>Category <%= Q.getCategory() %></h3>
<h4><%= Q.getQuestion() %> </h4>
<form action="RightAnswer" onclick="Myfunction()">
  <input id ="Ch1" type="radio" name="answer" value="<%= Q.getAnswer1() %>"><p><%= Q.getAnswer1() %></p><br>
  <input id ="Ch2" type="radio" name="answer" value="<%= Q.getAnswer2() %>"><p id="P2"><%= Q.getAnswer2() %></p><br>
  <input id ="Ch3" type="radio" name="answer" value="<%= Q.getAnswer3() %>"><p id="P3"><%= Q.getAnswer3() %></p><br>
  <input id ="Ch4" type="radio" name="answer" value="<%= Q.getAnswer4() %>"><p id="P4"><%= Q.getAnswer4() %></p><br>
  <input id ="Ch5" type="submit" />
</form>
   
</div>

     <form action = "RightAnswer" onclick="Myfunction()">
	<input type="hidden" name="choice"  value="skip">
	<input id ="Ch6" type="submit" value="Skip" style="font-weight:bold;font-style:italic;text-align:center"/>
     </form>
  
<%  session.setAttribute("Question", Q); %>

<audio id="audio" src="ClickSound.mp3" ></audio>

</body>
</html>
