<%--
  Created by IntelliJ IDEA.
  User: dotranghoangpc
  Date: 25/09/2019
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form method="post" action="/caculate">
  <fieldset>
    <legend>Calculation</legend>
    <table>
      <tr>
        <td>First Operand:</td>
        <td><input type="text" name="firstOperand" value="${firstOperand}"></td>
      </tr>
      <tr>
        <td>Second Operand:</td>
        <td><input type="text" name="secondOperand" value="${secondOperand}"></td>
      </tr>
      <td></td>
      <td>
        <input type="submit" name="operator" value="Addition (+)">
        <input type="submit" name="operator" value="Subtraction (-)">
        <input type="submit" name="operator" value="Multiple (X)" >
        <input type="submit" name="operator" value="Division (/)" >
      </td>
      <tr>
        <td>Result: </td>
        <td>${result}</td>
      </tr>
    </table>
  </fieldset>
  </form>
  </body>
</html>
