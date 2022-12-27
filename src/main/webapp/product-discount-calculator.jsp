<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 27/12/2022
  Time: 08:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/display-discount">
    <h1>Product Discount Calculator</h1>
    <p>Product Description</p><br>
    <label>
        <input type="text" name="productDescription">
    </label>
    <p>List Price</p><br>
    <label>
        <input type="text" name="listPrice">
    </label>
    <p>Discount Percent</p><br>
    <label>
        <input type="text" name="discountPercent">
    </label>
    <br>
    <br>
    <input type="submit" name="submit" value="Calculate Discount">
</form>

</body>
</html>
