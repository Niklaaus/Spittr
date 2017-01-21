<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<html>
<head>
<title>Spittr</title>
<%-- <link rel="stylesheet" type="text/css"
	href="<sf:url value="/resources/style.css" />"> --%>
</head>
<body>
	<h1>Register</h1>
	<sf:form method="POST" commandName="spitter">
		First Name: <sf:input path="firstName" />
				<br /><sf:errors path="firstName" /><br/>
		Last Name: <sf:input path="lastName" />
				<br /><sf:errors path="lastName" /><br/>
		Email: <sf:input path="email" />
				<br /><sf:errors path="email" /><br/>
		Username: <sf:input path="username" />
				<br /><sf:errors path="username" /><br/>
		Password: <sf:password path="password" />
				<br /><sf:errors path="password" /><br/>
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>