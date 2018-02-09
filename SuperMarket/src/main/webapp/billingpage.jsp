<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Billing Page</title>
</head>
<body>
	<center>
		<h1>Billing Page</h1>
	</center>
	<br>
	<br>
	<br>
	
	<form action=billing>
		<table width=100%>
			<tr>
				<td><label>Item Code</label>
				<input type=text name=itemcode><br>
			
			
				<label>Quantity</label>
				<input type=text name=quantity><br>
		
			
			
		
		<input type=submit value=add></td>
		
	</form>
	<td>
	Purchased Items<br>
	<textarea rows=20 cols=40></textarea>
	
	</td>
	</tr>
	</table>
</body>
</html>