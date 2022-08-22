<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
<style type="text/css">

label {color:Orange;background-color: LightYellow ;font-family: cursive;font-size:20px }
input {color:LimeGreen ;background-color: LightGoldenRodYellow;font-family:cursive;}
h2 {color:green;font-family: monospace;	} 
option {color:LimeGreen ;background-color: LightGoldenRodYellow;font-family:cursive;}
h3 {color:green;font-family: monospace;background-color: LightGoldenRodYellow;
}
</style>
</head>
<body>
<h2> Lead | Create </h2>
<form action="Save" method="post">
<pre>
			<label>First Name </label> <input type="text" name="FirstName">
			<label>Last Name</label> <input type="text" name="LastName" >
			<label>Email</label><input type="email" name="Email">
			<label>LeadSource</label>:<select name="LeadSource">
			<option value="Tv Commercial">TV </option>
			<option value="Online Research"> Online </option>
			<option value="Newspaper">NewsPaper </option>
			<option Value="Radio">Radio </option>
			</select>
			<label>Mobile</label > <input type="text" name="Mobile"> <br>
                                                        <input type="Submit" value="Save">
                                                    
</pre>
<h3>${msg}</h3>

</form>
</body>
</html>