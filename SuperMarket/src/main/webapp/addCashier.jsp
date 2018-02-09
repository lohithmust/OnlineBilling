<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Cashier</title>
</head>
<body>
	<center>
		<h1>Add Cashier</h1>
	</center>
	<center>
		<form action=addcashier method=post>
			<table>
				<input type=hidden name=cashier value=addcashier>
				<tr>
					<td><label>Cashier Name :</label></td>
					<td><input type=text name=cashierName placeholder=Cashiername></td>
				</tr>
				<tr>
					<td><label>Contact Number</label>
					<td><input type=number name=cashierContactNumber
						placeholder=Mobile-Number></td>
				</tr>
				<tr>
					<td><label>Cashier Level</label>
					<td><input type=number name=cashierLevel placeholder="1 to 5">
					</td>
				</tr>
				<tr>
					<td><label>cashierSalary</label>
					<td><input type=number name=cashierSalary placeholder=salary>
					</td>
				</tr>
				<tr>
				     <td><label>Mail-Id</label></td>
				     <td><input type=text name=mailid placeholder=mailid> </td>
				<tr>
				<td><label>Cashier Username :</label></td>
				<td><input type=text name=cUsername placeholder=Username></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type=password name=cPassword placeholder=Password></td>
				</tr>
				<tr>
					<td><label>Confirm-Password</label></td>
					<td><input type=password name=confirm-password
						placeholder="confirm password"></td>
				</tr>
				<tr>
					<td>
					<td>
				</tr>

			</table>
			<br>
			<input type=submit value=add>
		</form>
	</center>
</body>
</html>