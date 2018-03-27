<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<table width=100%>
		<form action="addItemBilling" method="post">

			<tr>
				<td><label>Item Code</label> <input type=text name=itemcode><br>


					<label>Quantity</label> <input type=text name=quantity><br>




					<input type=submit value=add></td>

			</tr>

		</form>

<tr>
		<td>Purchased Items<br> <textarea disabled rows=20 cols=40>
	           <c:forEach items="${itemList}" var="item">
	           
	           ${item.itemName}  ${item.itemPrice}
	           
	           </c:forEach> 
	          
		   Total Price  = ${total}
	
	</textarea>

		</td>
		</tr>
		

	</table>
</body>
</html>