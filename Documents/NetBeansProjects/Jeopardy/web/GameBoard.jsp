

<%@page import="ca.sheridancollege.beans.Questions"%>
<%@page import="ca.sheridancollege.beans.Player"%>
<!DOCTYPE html>
<html>
    <head>
<title>Game board</title>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
left:525px;
font-family:comic sans ms;
color:#648798;
bottom:-30px;
}
h2{
position:relative;
left:325px;
bottom:-35px;
font-family:comic sans ms;
font-size:70px;
color:#648798 ;
font-style:italic;
font-weight:bold;
}
h3{
position:relative;
bottom:35px;
font-family:comic sans ms;
font-size:40px;
color:#648798 ;
left:525px;
}
h4{
position:relative;
bottom:105px;
font-family:comic sans ms;
font-size:40px;
color:#648798;
left:680px;
}
h5{
position:relative;
bottom:175px;
font-family:comic sans ms;
font-size:40px;
color:#648798;
left:890px;
}
table{
position:relative;
bottom:120px;
width:300px;
left:200px;
}
th{
height:50px;
color:#ffffcc;
font-size:30px;
font-family:comic sans ms;
color:white;
background:#648798;
}
input[type=submit]{
height:50px;
width:150px;
background:white;
font-size:30px;
font-family:comic sans ms;
color:black;
}
#alert{
    visibility: hidden;
}
body{
background-image:url('Image3.jpg');
}
</style>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
<body>
    <h1 style="font-size: 50px"><b><i>Game Board</i></b></h1>
    <h2 style="font-size: 40px"><i><b> Welcome</b></i></h2>
    
    <% int tim = Integer.parseInt(session.getAttribute("T").toString()); %>
    
     <% if(tim == 0){
         tim++;
         session.setAttribute("Times1", tim);}
     else{
         tim = Integer.parseInt(session.getAttribute("Times3").toString()); 
         session.setAttribute("Times1", tim);}
    %>
<% Player P =(Player)session.getAttribute("Player1"); %>
<% session.setAttribute("Player2",P); %>

<h3 style="font-size: 40px"><i><b> <%= P.getName() %><i><b> </h3>
<h4 style="font-size: 40px"><i><b> Winnings:</b></i></h4>
<h5><i style="font-size: 40px" ><b><%= P.getScore() %></b></i></h5>
<table style="width:70%">
<colgroup>
    <col span="4" style="width:215px;">
  </colgroup>
  <tr>
    <th><i>Java</i></th>
    <th><i>Football</i></th> 
    <th><i>Harry Potter Series</i></th>
	<th><i>Science</i></th>
	<th><i>Space</i></th>
  </tr>
  
  <tr>
      <td><center><form action = "selectedquestion" onclick="Myfunction()" >
        <input type="hidden"  name="type" value="R1Q1" >
        <input type="submit" class="w3-button w3-blue-grey" value="$200" style=" font-weight:bold; font-style:italic; text-align:center" <%= session.getAttribute("Q1") %> />
        </form></center>
    </td>
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R1Q2">
	<input type="submit" class="w3-button w3-blue-grey" value="$200" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q6") %> />
        </form></center>
    </td>
    <td><center><form action = "selectedquestion" onclick="Myfunction()" >
	<input type="hidden" name="type"  value="R1Q3">
	<input type="submit" class="w3-button w3-blue-grey" value="$200" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q11") %> />
        </form></center>
    </td>
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R1Q4">
	<input type="submit" class="w3-button w3-blue-grey" value="$200" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q16") %> />
        </form></center>   
    </td>
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R1Q5">
	<input type="submit" class="w3-button w3-blue-grey" value="$200" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q21") %>/>
        </form></center>
        </td>
  </tr>
  <tr>
      <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R2Q1" >
	<input type="submit" class="w3-button w3-blue-grey" value="$400" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q2") %> />
      </form></center>
</td>
<td><center><form action = "selectedquestion" onclick="Myfunction()" >
	<input type="hidden" name="type"  value="R2Q2" >
	<input type="submit" class="w3-button w3-blue-grey" value="$400" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q7") %>/>
    </form></center>
</td>
<td><center><form action = "selectedquestion" >
	<input type="hidden" name="type"  value="R2Q3" onclick="Myfunction()">
	<input type="submit" class="w3-button w3-blue-grey" value="$400" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q12") %>/>
    </form></center></td>
        
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R2Q4">
	<input type="submit" class="w3-button w3-blue-grey" value="$400" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q17") %>/>
        </form></center></td>
        
        <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R2Q5">
	<input type="submit" class="w3-button w3-blue-grey" value="$400" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q22") %>/>
            </form></center></td>
  </tr>
  <tr>
      <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R3Q1">
	<input type="submit" class="w3-button w3-blue-grey" value="$600" style="font-weight:bold;font-style:italic;text-align:center"  <%= session.getAttribute("Q3") %>/>
          </form></center></td>
        
      <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R3Q2">
	<input type="submit" class="w3-button w3-blue-grey" value="$600" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q8") %>/>
          </form></center></td>
        
       <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R3Q3">
	<input type="submit" class="w3-button w3-blue-grey" value="$600" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q13") %>/>
           </form></center>
       </td>
        
       <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R3Q4">
	<input type="submit" class="w3-button w3-blue-grey" value="$600" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q18") %>/>
           </form></center></td>
        
        <td><center><form action = "selectedquestion" onclick="Myfunction()"> 
	<input type="hidden" name="type"  value="R3Q5">
	<input type="submit" class="w3-button w3-blue-grey" value="$600" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q23") %>/>
            </form></center></td>
        
  </tr>
   <tr>
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R4Q1">
	<input type="submit" value="$800" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q4") %>/>
       </form></center></td>
        
       <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R4Q2">
	<input type="submit" value="$800" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q9") %>/>
           </form></center></td>
        
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R4Q3">
	<input type="submit" value="$800" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q14") %>/>
        </form></center></td>
        
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R4Q4">
	<input type="submit" class="w3-button w3-blue-grey" value="$800" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q19") %>/>
            </form><center></td>
        
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R4Q5">
	<input type="submit" value="$800" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q24") %>/>
            </form><center></td>
  </tr>
   <tr>
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R5Q1">
	<input type="submit" value="$1000" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q5") %>/>
        </form><center></td>
        
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R5Q2">
	<input type="submit" value="$1000" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q10") %>/>
        </form><center></td>
        
    <td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R5Q3">
	<input type="submit" value="$1000" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q15") %>/>
        </form><center></td>
        
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R5Q4">
	<input type="submit" value="$1000" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q20") %>/>
            </form></center></td>
        
	<td><center><form action = "selectedquestion" onclick="Myfunction()">
	<input type="hidden" name="type"  value="R5Q5">
	<input type="submit" value="$1000" class="w3-button w3-blue-grey" style="font-weight:bold;font-style:italic;text-align:center" <%= session.getAttribute("Q25") %>/>
            </form><center></td>
  </tr>
 </table>
       
  <audio id="audio" src="ClickSound.mp3" ></audio>
  
  

</body>
</html>
