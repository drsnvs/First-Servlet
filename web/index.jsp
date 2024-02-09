<%-- 
    Document   : index
    Created on : 3 Feb, 2024, 8:49:27 PM
    Author     : Darshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
        
    </head>
    <body>
        
        <h1 align="center">Calculator</h1>
        <form action="ServletFile"  method="POST">
            <table border="1" align="center">
                <tr>
                    <td>Enter No 1</td>
                    <td>
                        <input type="text" name="no1">
                    </td>
                </tr>
                <tr>
                    <td>Operator</td>
                    <td>
                        <select name="op">
                            <option>+</option>
                            <option>-</option>
                            <option>*</option>
                            <option>/</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Enter No 2</td>
                    <td>
                        <input type="text" name="no2">
                    </td>
                </tr>
                <tr><td colspan="2" align="center"><input type="submit" value="Submit"></td></tr>
            </table>
        </form>
    </body>
</html>