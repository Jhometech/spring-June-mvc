<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>

<html>
<body>
	<jsp:include page="/index.jsp" />

  <html:form action="add.htm" method="POST" commandName="std">
     Name:<html:input path="name"/>
     Phone:<html:input path="phone"/>
     Course:<html:select path="course">
             <html:option value="Core Java">Core Java</html:option>
             <html:option value="Java/J2EE">Java/J2EE</html:option>
             <html:option value="Frameworks">Frameworks</html:option>
             </html:select>
             <input type="submit" value="Add Student">
  </html:form>
</body>
</html>
