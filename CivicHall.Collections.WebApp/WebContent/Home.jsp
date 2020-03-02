<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="civichall.collections.webapp.main.ProductServices" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>

<!-- JSP Script-let here
		Keep the Script-let before the body for user validation -->
		
		<%		 
 		ProductServices ps = new ProductServices();
 		int result = ps.createProductService(100, "Haggis");
 		if (result == 1) {
 			System.out.println("Product Saved");
		} else System.out.println("ERROR: Product not Saved");
		
 		ps.showAll();
		%>

<body>
	<!-- HEADER -->
	<div>
		<h1>PRODUCT MAP CRUD OPERATIONS</h1>
		<hr>
		<!-- Instead of adusting each menu, make a menu file and reference it in. -->
		<%@ include file = "Menu.jsp" %>		
		<hr>
		
		<%
			for (Entry e : ps.productHashMap())
		%>
		
		<br>
	</div>
	
	<!-- BODY -->
	<div>
		<h2>ADD A NEW PRODUCT</h2>
		
		<form action="Message.jsp" method="get">
			<label>ID: </label><input type="number" name="idProduct" value="" placeholder="Enter a product number."><br><br>
			<label>PRODUCT NAME: </label><input type="text" name="nameProduct" value="" placeholder="Enter a product name"><br><br>
			<input type="submit" value="save">
			<input type="reset" value="clear">
		</form>		
	</div>
	
	<!-- FOOTER -->
	<div>
		<hr>
		<br>
		<h3>Footer of the div here.</h3>
	</div>

</body>
</html>