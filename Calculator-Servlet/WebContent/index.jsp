<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" >

<%@ page isELIgnored ="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8" />
	<title>Calculator</title>
	<link rel="stylesheet" type="text/css" href="styles/calculadora.css" />
</head>
<body>
<div class="content">
	<h2>Calculator</h2>
	<form method="post" action="calcular">
		<div id="formularioCalculadora">
		<table>
			<tr>
				<td>Enter a number</td>
				<td><input type="text" name="arg1" value="${param.arg1}"/></td>
			</tr>
			<tr>
				<td>Another number</td>
				<td><input type="text" name="arg2" value="${param.arg2}"/></td>
			</tr>
			<tr class="botones">
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>
		</table>
		</div>
		<% if (request.getAttribute("resultado") != null) { // abro%>
			<div id="resultado">
				<p>The result is:<br/>
					<span class="resultadoCuenta">${resultado}</span>
				</p>
			</div>
		<% } // cierro %>
	</form>
</div>
</body>
 </html>