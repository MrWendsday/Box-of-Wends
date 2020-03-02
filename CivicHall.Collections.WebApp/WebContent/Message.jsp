<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="civichall.collections.webapp.main.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message</title>
</head>

<%
	ProductServices ps = new ProductServices();
	int productID = 100;  // this 100 value is coming from the HTTPRequest --- URL

	String productName = ps.getProduct(productID);
	if (productName == null){
		System.out.println("ERROR: Product ID = " + productID + "NOT FOUND");
	} else {
		System.out.println("Product FOUND");
		System.out.println("Product ID = " + productID);
		System.out.println("Product Name = " + productName);
	}
%>

<body>
	<!-- HEADER -->
	<div>
		<h1>PRODUCT MAP CRUD OPERATIONS</h1>
		<hr>
		<h3>Menu</h3>
		<a href="AddProduct.jsp">Add</a> |
		<a href="EditProduct.jsp ">Edit</a> |
		<a href="RemoveProduct.jsp ">Remove</a> |
		<a href="ShowProduct.jsp ">Show</a> |
		<a href="ShowAllProducts.jsp ">Show all</a> |	
		<a href="Home.jsp ">HOME</a> |		
		<hr>		
		<br>
	</div>
	
	<!-- BODY -->
	<div>
		<h2>YOU HAVE ENTERED THE MESSAGE</h2>
		<!-- Get the product entered -->
		<label>Product ID: </label><%=productID%> <br><br>
		<label>Product Name: </label><%=productName%> <br><br>
		
		
	</div>
	
	<!-- FOOTER -->
	<div>
		<hr>
		<br>
		<h3>Footer of the div here.</h3>
	</div>

</body>
</html>