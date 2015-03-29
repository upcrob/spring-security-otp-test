<%@page session="true"%>
<html>
<head>
	<title>Validate Token</title>
</head>
<body>
	<p>You should receive an OTP shortly.  Please enter it here to finish authenticating.</p>
	<form name="login" method="post" action="validate">
		OTP Token: <input type="text" name="otptoken" /><br />
		<input type="submit" value="Validate Token" />
	</form>
</body>
</html>