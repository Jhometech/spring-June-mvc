<html>
<body>
	<jsp:include page="/index.jsp" />

	<form action="add.htm" method="post">
		Name: <input type="text" name="name">
		 Phone: <input
			type="text" name="phone">
			
			 Course: <select name="course">
			<option>Core Java</option>
			<option>Java/J2EE</option>
			<option>Frameworks</option>
		</select>
		<input type="submit" value="Add Student">
	</form>
</body>
</html>
