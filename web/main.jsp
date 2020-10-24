<%@ page import="JavaEE.Calculator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Main</title>
</head>
<body>
<h1>Test JSP</h1>
<div>
    <p>2 + 2 = <%= 2 + 2%></p>
    <p>5 > 2 = <%= 5 > 2%></p>
    <p><%=new String("Hello").toUpperCase()%></p>
    <p>Today <%= new java.util.Date() %></p>
</div>

<div>
    <%
        for (int i = 0; i < 5; i++) {
            System.out.println("<br>Hello" + i);
        }
    %>
</div>

<h3>Square of 3 = <%= new Calculator().square(3)%></h3>
<p>Name: <%= request.getParameter("name")%></p>
<p>Name: <%= request.getParameter("age")%></p>
</body>
</html>
