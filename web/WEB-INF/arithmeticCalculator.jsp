<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 21, 2020, 12:05:58 PM
    Author     : 760483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
 <div style="text-align: left; margin-top: 2in; margin-left: 40%">
        <h1> Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>
                First: <input type="text" name="firstNumber" value="${firstNumberValue}">
            </label><br/>
            <label>
                Second: <input type="text" name="secondNumber" value="${secondNumberValue}"
            </label><br/>
            <input type="submit" value="+" name="addition"><input type="submit" value="-" name="subtraction">
            <input type="submit" value="*" name="multiplication"><input type="submit" value="%" name="modulus">
            <br/>
            <div>${response}</div>
            <a href="./age">Age Calculator</a>
            
        </form>
        </div>    </body>
</html>
