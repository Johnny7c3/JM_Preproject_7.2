<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
<table>
    <h1><c:out value="${locale}" /></h1>
    <tr>
        <th>Id</th>
        <th>Model</th>
        <th>Series</th>
    </tr>
    <c:forEach var="car" items="${carsList}">
        <tr>
            <td>${car.id}</td>
            <td>${car.model}</td>
            <td>${car.series}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
