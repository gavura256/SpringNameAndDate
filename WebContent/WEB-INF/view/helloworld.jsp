<!DOCTYPE html>
<html>

<body>

<h2>Spring MVC Name and Date</h2>
<hr>
<br><br>
Your name: ${param.studentName} 
<br><br>
Today's date: <%= (new java.util.Date()).toLocaleString()%>
</body>
</html>