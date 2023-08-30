<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 30-08-2023
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Movie Details</h2>
<table border="1">
    <tr>
        <th>User ID </th>
        <th>Movie Name</th>
        <th>Rating</th>
    </tr>

    <c:forEach var="movieRating" items="${movieRatingDetails}">
        <tr>
            <td>${movieRating.userId}</td>
            <td>${movieRating.movieName}</td>
            <td>${movieRating.rating}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
