<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library games</title>
</head>
<body>

	<div id="mother">

		<p>We've here a mother that he have fathers and childs that will
			be windows.</p>
		<div id="container">

			<p>We've here a container that will be change when you click
				another button.</p>
			<!--<jsp:include page="/jsp/.jsp"></jsp:include> -->
			<h2>Please fill the form below:</h2>
			<form action="${pageContext.request.contextPath}/userServlet"
				method="post">
				<label for="name">
					<strong>Name:</strong>
				</label>
				<input type="text" name="name" id="name">
				<label for="email">
					<strong>Email:</strong>
				</label>
				<input type="text" name="email" id="email">
				<input type="submit" value="Send">
			</form>
		</div>

	</div>

</body>
</html>