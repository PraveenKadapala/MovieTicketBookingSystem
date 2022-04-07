<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Signup Page</title>
<style>

input[type=text], input[type=password] {
	width: 20%;
	font-size: 20px;
	padding: 5px;
}

</style>
<body>
	<form action="addUser">
		<div class="formContainer">
			<h1>Registration Page</h1>
			<h1>${message}</h1>
			<hr>
			<label 
				for="name"><b>Name</b></label> <input type="text"
				placeholder="Enter Name" name="name" required>
				<br></br>
			<label
				for="phoneno"><b>PhoneNo</b></label> <input type="text"
				placeholder="Enter PhoneNo" name="phoneno" required>
				<br></br>
			<label
				for="username"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required>
				<br></br>
			 <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required> 

			<div>
				<button type="submit" class="signup">Sign Up</button>
			</div>
		</div>
	</form>
</body>
</html>