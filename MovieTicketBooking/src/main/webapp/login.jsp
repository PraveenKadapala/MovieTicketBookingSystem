<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
<style>

input[type=text], input[type=password] {
	width: 30%;
	margin: 4px 0;
	padding: 8px 5px;

}

</style>
</head>
<body>
		<h1>Login Page</h1>
	<h1>${message}</h1>
	<form action="checkLogin">
		<div class="container">
			<label>Username : </label> <input type="text" placeholder="Enter Username"
				name="username" required><br></br> <label>Password : </label> <input
				type="password" placeholder="Enter Password" name="password"
				required><br></br>
				
			<button type="submit">Login</button>
		</div>
	</form>
	<form action="signup">
		<div class="container">
		<h4>New User <button type="submit">Sign up</button></h4>

		</div>
	</form>
</body>
</html>