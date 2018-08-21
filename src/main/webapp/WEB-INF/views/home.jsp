<h2>Welcome to Mood detector!</h2>
 
I am feeling: ${ mood.feeling }. 
<% String url = request.getContextPath()+"/feels";%>
<br/>
See <a href=<%=url%>>here</a> to find out why.