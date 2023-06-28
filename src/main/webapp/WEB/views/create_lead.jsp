<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
*{
 font-family: sans-serif;
 box-sizing:border-box;
 padding: 0;
 margin: 0;
}

body{
background: orange;
color: blue;
}

.container{
border:1px;
background: #05255e;
color: white;
margin: 100px 530px;
border-radius:8px;
padding: 20px 0px; 
height: 400px;
width: 300px;
}
.h2{
text-align: center;
margin: 10px 0;
}
.section{
margin: 10px -58px;

}
input{
    padding: 10px;
    border-radius: 8px;
    margin: 8px;
    background: white;
    border-style: none;
    background: white;
 	color: white;
 	padding: 10px 56px;
   	margin: 8px -38px;
}
input[type='email']{
margin: 4px 15px;
}

input[type='submit']{
background: #031028;
}


select{
	color: lightslategrey;
    padding: 8px 25px;
    border-radius: 8px;
    margin: 5px 9px;
    background: white;
    padding: 10px 67px;
    margin: 8px -38px;
    border: none;
}
</style>
<body>
	<h1>Welcome | Market Application</h1>
	<hr>
	<div class="container">
	<h1 class="h2"> Create Lead</h1>
	<div class="section">
	<form action="save" method="post">
		<pre>
			 <input class="input" type="text" name="firstName" placeholder="First Name" required="required"/>
			 <input class="input" type="text" name="lastName" placeholder="Last Name" required="required"/>
             <input class="input" type="email" name="email" placeholder="Email" required="required"/>
			 <input class="input" type="number" name="mobile" placeholder="10 Digit Mobile Number" minlength="10" maxlength="10" required="required"/>
			 <select name="source" required="required">
							<option >Select Lead Source</option>
							<option value="Google Ads">Google Ads</option>
							<option value="Facebook">Facebook</option>
							<option value="Twitter">Twitter</option>
							<option value="News Paper">News Paper</option>
							<option value="trade show">trade show</option>
							<option value="website">Website</option>
						</select>
				<input type="submit" value="Create Lead"/>
		</pre>
		
	</form>
	</div>
	</div>
</body>
</html>