<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Billing</title>
</head>
<body>
	<center>
		<h1>Welcome To Online Billing</h1>
	</center>
	<div>
		<center>
		  <form action="login" method=post>
			<table cellspacing="5">
			  <input type=hidden name=loginas value=companylogin>
				<tr>
					<td><label>Company User</label></td>
					<td><input type="text" name="username" placeholder="username">
						<br></td>
				</tr>
                      
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" name="password"
						placeholder="password"></td>
				</tr>
				<tr>
					<td><a href="Register.jsp">Register</a>
					<td><input type=submit value=login></td>
			</table>
			</form>
		</center>
	</div>
</body>
</html>