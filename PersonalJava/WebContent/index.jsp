<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Information Input</title>
</head>

<body>

<h1>We need to know everything.</h1>
<form method=post action="SubmitInfo">
	<br>
	<label for="id">ID: 
	</label><input type="text" id="id" name="id"><br><br>
	
	<label for="name">Name: 
	</label><input type="text" id="name" name="name"><br><br>
	
	<label for="age">Age: 
	</label><input type="text" id="age" name="age"><br><br>
	
	<label for="hobby">Hobby: 
	</label><input type="text" id="hobby" name="hobby"><br><br>
	
	<label for="city">City: 
	</label><input type="text" id="city" name="city"><br><br>
	
	<input type="submit" value="Submit">
</form>

</body>
</html>