<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<center><h1>Welcome to Registeration Page</h1></center>

<div>
<center>
<form action="RegisterCompany" method =post>
<table cellspacing="5">


<tr>
<td> <label>Company Name</label></td>
<td> <input type="text" name="companyName" placeholder="CompanyName">
</td>
</tr>
<tr>
<td><label>Company Owner</label></td>
<td> <input type="text" name="companyOwner" placeholder="CompanyOwner"></td>
</tr>
<tr>
<td><label>Mail-Id</label></td>
<td> <input type="text" name="mail" placeholder="MailId"></td>
</tr>
<tr>
<td><label>Contact Number</label></td>
<td> <input type="number" name="contactNumber" placeholder="ContactNumber"></td>
</tr>
<tr>
<td><label>User Name</label></td>
<td> <input type="text" name="username" placeholder="username"></td>
</tr>
<tr>
<td><label>Password</label></td>
<td> <input type="Password" name="password" placeholder="Password"></td>
</tr>
<tr>
<td><label>Confirm-Password</label></td>
<td> <input type="password" name="confirmpassword" placeholder="re-enter password"></td>
</tr>


</table>
 <input type="submit" value="Register" >
 </form>
</center>
</div>

</body>
</html>