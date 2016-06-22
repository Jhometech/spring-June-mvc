<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>

<html>
<head>
  <style type="text/css">
    .errors{
      color: red;
      font-weight: bold;
    }
  
  </style>

</head>
<body>
	<jsp:include page="/index.jsp" />
	<h3>Student Personal Details</h3>
  <html:form action="add.htm" method="POST" commandName="std">
 
 
  <br>
     <span style="color: red">*</span>Name:<html:input path="name"/> <html:errors path="name" cssClass="errors"/>
     Phone:<html:input path="phone"/> <html:errors path="phone" cssClass="errors"/>
     Course:<html:select path="course">
             <html:option value="Core Java">Core Java</html:option>
             <html:option value="Java/J2EE">Java/J2EE</html:option>
             <html:option value="Frameworks">Frameworks</html:option>
             </html:select>
             <h3>Passport Details</h3>
      Passport No: <html:input path="passport.passportNo"/>
      Place Of Issue:<html:input path="passport.placeOfIssue"/>       
             <input type="submit" value="Add Student">
  </html:form>
</body>
</html>
