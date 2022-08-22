<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
   
        
   
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads </title>
<style type="text/css">
h1 {background-color: Khaki ;color: DarkGreen ;font-family: inherit;align-self: center;}

table {background-color: Cornsilk ;border:"2"; color :ForestGreen ;font-family: cursive; align-self: center;  font-size: 20px
}

</style>
</head>
<body>
<h1>List of all Bill</h1>
<table border="1">
<tr>
<th>Id </th> 
 <th>Product</th>
  <th>Model </th>
  <th>Discount </th>
  <th>Prize</th>
   <th>Total Amount</th>
   <th> Name </th>
   <th> Mobile </th>
   
</tr>
<c:forEach items="${bill}" var="Bills">
<tr> 
<td>${Bills.id} </td> 
<td>${Bills.product}</td>
<td>${Bills.model} </td> 
<td>${Bills.discount} </td> 
<td>${Bills.prize} </td> 
<td> ${Bills.totalamount}</td> 

<td> ${Bills.name} </td>
 <td> ${Bills.mobile} </td>
</tr>

</c:forEach>
</table>


</body>
</html>