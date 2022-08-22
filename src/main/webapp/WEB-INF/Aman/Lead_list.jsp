<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ include file="Menu2.jsp"  %>
        
   
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads </title>
<style type="text/css">
h1 {background-color: Khaki ;color: DarkGreen ;font-family: inherit;align-self: center;}

table {background-color: Cornsilk ; color :ForestGreen ;font-family: cursive; border:"2"; font-size: 20px
}

</style>
</head>
<body>
<h1 align="center">List of all Leads</h1>
<table border="1">
<tr>
<th>Id </th> 
 <th>First Name </th>
  <th>Last Name </th>
  <th>Email </th>
  <th>LeadSource </th>
   <th> Mobile</th>
</tr>
<c:forEach items="${listall}" var="all">
<tr> 
<td>${all.id} </td> 
<td><a  href="getleadById?id=${all.id}">${all.firstName}</a></td>
<td>${all.lastName} </td> 
<td>${all.email} </td> 
<td>${all.leadSource} </td> 
<td> ${all.mobile}</td> 
</tr>

</c:forEach>
</table>


</body>
</html>