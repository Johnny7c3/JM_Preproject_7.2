<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var="msg" items="${messages}">
    <h1>${msg}</h1>
</c:forEach>
</body>
</html>