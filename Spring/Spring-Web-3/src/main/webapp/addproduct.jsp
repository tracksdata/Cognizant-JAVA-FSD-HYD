<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/menu.jsp"/>
<h2 align='center'> Product Save Form</h2><hr/>

<form action="saveProduct">


<table align="center">

<tr>
	<td>Product Id</td>
	<td><input type="text" name="id"></td>
</tr>



<tr>
	<td>Product Name</td>
	<td><input type="text" name="name"></td>
</tr>



<tr>
	<td>Product Price</td>
	<td><input type="text" name="price"></td>
</tr>

<tr>
	<th colspan='2'>
	<input type="submit" value="Save Product">
</tr>












</table>


</form>


</body>
</html>