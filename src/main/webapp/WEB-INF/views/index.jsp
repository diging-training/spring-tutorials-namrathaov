<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
<h2>Welcome to Mood Detector!</h2>
 
I am feeling: ${ mood.feeling }.<br/>
<% String url = request.getContextPath()+"/feels";%>
<br/>
<a href=<%=url%>>Click here to know why!</a>
</body>
</html>