<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Items</title>
</head>
<body>
<center><h1>Add Items</h1></center>
<form action=additem>
<center>

<table>
<font color=red>
<tr>

${successfull}

</tr>
</font>
<tr>
<td> <label>Item name</label></td>
<td> <input type=text name=itemName></td>
<tr>
<tr>
<td> <label>Item Price</label></td>
<td> <input type=text name=itemPrice></td>
<tr>
<tr>
<td> <label>Item code</label></td>
<td> <input type=text name=itemCode></td>
<tr>
</table>
<input type=submit value=add>
</center>
</form>

</body>
</html>