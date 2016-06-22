<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>

<html>
<body>
	<jsp:include page="/index.jsp" />

  <html:form action="course.htm" method="POST" commandName="course">
     Name:<html:input path="name"/>
     Cost:<html:input path="cost"/>
     Duration:<html:input path="duration"/>
		<input type="submit" value="Add Course">
  </html:form>
</body>
</html>
