<%@page session="true"%>
<html>
<head>
	<title>Login</title>
</head>
<body>
	<%
		if (request.getParameter("error") != null) {
			out.println("<strong>Login failed.</strong>");
		} else if (request.getParameter("logout") != null) {
			out.println("<strong>Logged out.</strong>");
		}
	%>
	<form name="login" method="post" action="j_spring_security_check">
		Username: <input type="text" name="username" /><br />
		Password: <input type="password" name="password" /><br />
		<input type="submit" value="Login" />
	</form>
</body>
</html>