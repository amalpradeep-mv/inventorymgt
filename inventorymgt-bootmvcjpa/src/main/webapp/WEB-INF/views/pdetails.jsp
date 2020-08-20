<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Details</title>
</head>
<body>

<h1>Phone Details </h1>

name is <c:out value="${phone.name}"  />
<br>

id is <c:out value="${phone.id}"  />
<br>
storage size is <c:out value="${phone.storageSize}"  />
<br>


</body>
</html>