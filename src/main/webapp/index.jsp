<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		Username: <b><sec:authentication property="principal.username"/></b><br/>
		<br/>
		<a href="admin">Click to enter admin area.</a>
		<br>
		<br/>
		<form id="form-1" action="Logout" method="post">
			<input type="submit" value="Logout"/>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }"/>
		</form>
	</body>
</html>
