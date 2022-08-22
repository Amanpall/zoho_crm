<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
<style type="text/css">
label {background-color: PaleGoldenRod ;color: RoyalBlue ;font-family: cursive;font-size:20px }
input {background-color:HoneyDew ;color:Red ;font-family: cursive;font-size: 20px}
textarea {background-color: Gainsboro ;color:Brown ;font-size:20px;font-family: monospace;  }
h2 {background-color: Gainsboro ;color:Brown ;font-family: monospace; }}
</style>
</head>
<body>
<h2> Compose Email</h2>
<form action="SendEmail" method="post" >
<pre>
			 <label>To</label> <input type="text" name="to" value="${ email}">
			<label>Subject</label> <input type="text" name="subject">
			<textarea  name ="text" rows="8" cols="80"></textarea>
			                     <input type="Submit" value="Send Email">
			 

</pre>


</form>
</body>
</html>