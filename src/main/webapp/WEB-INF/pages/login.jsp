<%@page session="true"%>
<html>
<head>
	<script src="js/login.js"></script>
</head>
<body>
	<form name="login" method="post" action="j_spring_security_check">
		Username: <input type="text" name="username" id="username" /><br />
		Password: <input type="password" name="password" /><br />
		OTP Token: <input type="text" name="otptoken" />
			<input type="button" value="Send Token" onclick="generateOtp()" />
			<span id="statusField"></span><br />
		<input type="submit" value="Login" />
	</form>
</body>
</html>