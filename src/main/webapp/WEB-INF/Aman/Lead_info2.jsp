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
h3 {background-color:HoneyDew ;color:Red ;font-family: cursive;	}
label {color:Orange;background-color: LightYellow ;font-family: cursive;font-size:20px }
input {color:LimeGreen ;background-color: LightGoldenRodYellow;font-family:cursive;}
</style>
</head>
<body>
<h1>All Lead Info Is Here </h1>
<p>
Id :${aman.id } <br>
First Name :${aman.firstName } <br>
LastName   :${aman.lastName } <br>
Email      :${aman.email } <br>
LeadSource  :${aman.leadSource } <br>
  Mobile    :${aman.mobile } <br>
  </p>
  
  <form action="vanshu" method="post">
  
   <pre>
         
			<label>Product</label> <input type="text" name="Product">
			<label>Model</label> <input type="text" name="Model" >
			<label>Discount</label><input type="text" name="Discount">
			<label>Prize</label> <input type ="Text" name="Prize">
			<label>Total Amount </label> <input type="text" name="totalamount"> 
			       <label>Name</label> <input type="text" name="name" value="${aman.firstName}" >
           <label>Mobile</label>        <input type="text" name="mobile" value="${aman.mobile}" >
                                                               <input type="Submit"  value="Save">
                                                    </pre>
  
  </form>
  <form action="EmailSend" method="post"><input type="hidden" name="Emailid" value="${aman.email}" > <input type="Submit" value="Email">  </form>
 
 
 <h3>${Msg3 }</h3>
</body>
</html>