<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Person</title>
</head>
<body>

<h2>Thank you for your personal information.</h2>
<h3>Here is the file we have on you.</h3>

<p>Your name: ${personView.getName()} </p>
<p>Age: ${personView.getAge()} </p>
<p>Your hobby: ${personView.getHobby()} </p>
<p>Where you live: ${personView.getCity()} </p>
<p>Your ID: ${personView.getID()} </p>

<h4>You have been found to be an aberrant and will be removed.</h4>

</body>
</html>