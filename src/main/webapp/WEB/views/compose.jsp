<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
		<div>
			${msg }
		</div>
		<form action="sendEmail" method="post">
			<pre>
				To      <input type="text" name="to" value="${email }"/>
				Subject <input type="text" name="subject"/>
				Message <textarea rows="4" cols="21" name="message"></textarea>
				   <input type="submit" value="send"/>
			</pre>
		</form>
</body>
</html>