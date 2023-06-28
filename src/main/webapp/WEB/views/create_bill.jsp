<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create billing</title>
</head>
<body>
	<h2>Bill | Create</h2>
	<hr>
	<form action="geneteateBill" method="post">
		<pre>
			First Name <input type="text" name="firstName" value="${contacts.firstName }"/>
			Last Name  <input type="text" name="lastName" value="${contacts.lastName  }"/>
			Email	   <input type="email" name="email" value="${contacts.email }"/>
			Mobile	   <input type="text" name="mobile" value="${contacts.mobile }"/>
			Product	   <input type="text" name="product"/>
			Amount	   <input type="text" name="amount"/>
				<input type="submit" value="genetate bill"/>
		</pre>
	</form>
</body>
</html>