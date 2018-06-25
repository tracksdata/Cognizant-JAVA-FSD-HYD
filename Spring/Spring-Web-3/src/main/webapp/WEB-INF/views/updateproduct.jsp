<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<jsp:include page="/menu.jsp" />
	
	<h2 align='center'>Product Update Form</h2>
	<hr /> 

<table align="center">


	<form:form action="productUpdate_v2" commandName="product">
	
	<tr>
		<td>Product Id</td>
		<td>  <form:input path="id" readonly="true"/> </td>
	</tr>
	
	<tr>
		<td>Product Name</td>
		<td>  <form:input path="name"/> </td>
	</tr>
	
	<tr>
		<td>Product Price</td>
		<td>  <form:input path="price"/> </td>
	</tr>	
	
	<tr>
		<th colspan="2">
			<input type="submit" value="Update"></th>
	</tr>
	</form:form>

</table>
	
	
	
	
	



</body>
</html>