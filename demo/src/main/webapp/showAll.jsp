<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表页面</title>

</head>
<body>
<c:forEach items="${requestScope.users}" var="user">
    id:${user.id} name:${user.name} age:${user.age} salary:${user.salary}
</c:forEach>
</body>

</html>