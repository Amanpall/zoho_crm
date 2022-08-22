<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
     <%@ include file="Menu3.jsp"  %>
   
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
<style type="text/css">
h1 {background-color: Khaki ;color: DarkGreen ;font-family: inherit;align-self: center;}

table {background-color: Cornsilk ; color :ForestGreen ;font-family:monospace;   font-size: 20px; 
}

</style>
</head>
<body>
<h1 >List of all Contacts</h1>
<table border="1" >
<tr>
<th>Id </th> 
 <th>First Name </th>
  <th>Last Name </th>
  <th>Email </th>
  <th>LeadSource </th>
   <th> Mobile</th>
     <th> Billing</th>
</tr>
<c:forEach items="${Contacts}" var="contact">
<tr> 
<td>${contact.id} </td> 
  <td><a href="GetContactById?id=${contact.id}">${contact.firstName} </a></td>  
<td>${contact.lastName} </td> 
<td>${contact.email} </td> 
<td>${contact.leadSource} </td> 
<td> ${contact.mobile}</td> 
<td><a  href="GetContactById?id=${contact.id}">Genrate Bill</a></td>  
</tr>

</c:forEach>
</table>

</body>
</html>