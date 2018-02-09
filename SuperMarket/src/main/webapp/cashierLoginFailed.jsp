<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cashier</title>
</head>
<body>

	<form action=login method=post>
		<center>
			<table>
				<input type=hidden name=login value=cashierlogin>
				<tr>
					<td><font color=red> Invalid Credentials</font></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" placeholder=username></td>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"
						placeholder=password></td>
				</tr>
				<tr>
					<td><input type="submit" value=login></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>