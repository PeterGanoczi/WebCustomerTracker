<%--
  Created by IntelliJ IDEA.
  User: Peto
  Date: 6. 12. 2020
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customers list</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>


    <div id="wrapper">
        <div id="header">
            <h2>
                CRM- Customer relationship manager
            </h2>

        </div>
    </div>

    <div id="container">
        <div id="content">

            <table>
                <tr>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>E-mail</th>
                </tr>

                <c:forEach var="tempCustomer" items="${customers}">

                    <tr>
                        <td>${tempCustomer.firstName}</td>
                        <td>${tempCustomer.lastName}</td>
                        <td>${tempCustomer.email}</td>
                    </tr>
                </c:forEach>

            </table>
        </div>

    </div>

</body>
</html>
