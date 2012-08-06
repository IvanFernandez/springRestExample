<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car info</title>
</head>
<body>
	<h1>Car info in a JSP page</h1>
	Car brand : ${model.brand} <br />
	Car model : ${model.model} <br />
	Car prize : ${model.prize} <br />
	Car year  : ${model.year}
</body>
</html>