<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>
<%@ include file="header.jsp"%>
<html>
<head>
<title>Productsview</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<c:if test="${!empty productList}">

								<table class="tg">

									<tr>

										<th width="80">Product ID</th>

										<th width="120">Product Name</th>

										<th width="200">Product Description</th>

										<th width="80">Price</th>

										<th width="80">Product Category</th>

										<th width="80">Product Supplier</th>
										
										<th width="80">Product Image</th>

										
									</tr>

									<c:forEach items="${productList}" var="product">

										<tr>

											<td>${product.id}</td>

											<td>${product.name}</td>

											<td>${product.description}</td>

											<td>${product.price}</td>


											<td>${product.category.name}</td>

											<td>${product.supplier.name}</td>
											
											<td><img src="<c:url value="D:/images/${product.name}.jpg"/>"/></td>

</tr>
</c:forEach>
</table>
</c:if>
</body>
</html>
