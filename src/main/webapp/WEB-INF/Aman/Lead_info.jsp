<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
<style type="text/css">
h1 {background-color: PaleGoldenRod ;color: RoyalBlue ;font-family: cursive;}
p {background-color:HoneyDew ;color:black ;font-family: cursive;}
input {background-color:HoneyDew ;color:Red ;font-family: cursive;	}
h3 {background-color:HoneyDew ;color:Red ;font-family: cursive;	
	
}
</style>
</head>
<body>
<h1>All Lead Info Is Here </h1>
<p>
Id :${LeadContainer.id } <br>
First Name :${LeadContainer.firstName } <br>
LastName   :${LeadContainer.lastName } <br>
Email      :${LeadContainer.email } <br>
LeadSource  :${LeadContainer.leadSource } <br>
  Mobile    :${LeadContainer.mobile } <br>
  </p>
  <form action="EmailSend" method="post"><input type="hidden" name="Emailid" value="${LeadContainer.email}" > <input type="Submit" value="Email">  </form>
   <form action="Convertintocontact" method="post">
				  <pre>
				  <input type="hidden" name="id" value="${LeadContainer.id}">
				  <input type="Submit" Value="Convet"></pre>
				  </form>
 
 <h3>${msg2}</h3>
</body>
</html>