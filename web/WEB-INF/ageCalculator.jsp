<%-- 
    Document   : ageCalculator
    Created on : Sep 21, 2020, 11:13:23 AM
    Author     : 760483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <div style="text-align: left; margin-top: 2in; margin-left: 40%">
        <h1> Age Calculator</h1>
        <form method="post" action="age">
            <label>
                Enter your age: <input type="text" name="inputAge" value="${inputAge}">
            </label><br/>
            <input type="submit" value="Age next birthday"><br/>
            <div>${response}</div>
            <a href="/arithmeticCalculator.jsp" target="_self">Arithmetic Calculator</a>
        </form>
        </div>
    </body>
</html>
