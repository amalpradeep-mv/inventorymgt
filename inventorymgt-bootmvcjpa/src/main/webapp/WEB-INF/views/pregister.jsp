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

<form method="get" action="/phoneprocessregister">

<div>

<label>Name</label>
<input type="text"  name="name">

</div>

<div>
<label>Storage Size</label>
<input type="number"  name="storageSize">

</div>


<input type="submit" value="Create Phone">

</form>


</body>
</html>