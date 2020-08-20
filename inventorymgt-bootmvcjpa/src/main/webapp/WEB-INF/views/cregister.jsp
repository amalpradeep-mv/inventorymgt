<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
</head>
<body>

	<h1>Computer Registration</h1>

<form method="get" action="/computerprocessregister">

<div>

<label>Name</label>
<input type="text"  name="name">

</div>

<div>
<label>Disk Size</label>
<input type="number"  name="diskSize">

</div>


<input type="submit" value="Create Computer">

</form>


</body>
</html>