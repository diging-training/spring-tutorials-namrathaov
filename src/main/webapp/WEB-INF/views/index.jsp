<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
 
<html>
<body>
<h2>Hello World!</h2>
 
I am feeling: ${ mood.feeling }.
<% String url = request.getContextPath()+"/feels";%>
<br/>
<a href=<%=url%>>Click here to know why!</a>
</body>
</html>