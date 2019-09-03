<%--
  Created by IntelliJ IDEA.
  User: sk
  Date: 03/09/2019
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      form{
        width: 450px;
        height: 500px;
        margin: 0 auto;
        padding: 0px 20px 20px;
        background: white;
        border: 2px solid navy;
      }
      label{
        width: 10em;
        padding-right: 1em;
        float: left;
      }
      h1{
        text-align: center;
        color: navy;
      }
    </style>
  </head>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/calculator">
    <h1>Product Discount Calculator</h1>
    <label>Product Description: </label><input type="text" name="productDescription"><br>
    <label>List Price: </label><input type="text" name="listPrice"><br>
    <label>Discount Percent: </label><input type="text" name="discountPercent">(%)<br>
    <input type="submit" value="Calculator Discount">
  </form>
  </body>
</html>
