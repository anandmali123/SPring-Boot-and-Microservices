<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>ANand Mali</title>
        </head>

        <body>
            <h3>Save form here</h3>
            <form:form action="Product" modelAttribute="product" method="POST">
                <table>
                    <tr>
                        <td>Product ID</td>
                        <td>
                            <form:input path="productName" />
                        </td>
                    </tr>
                    <tr>
                        <td>Product Price</td>
                        <td>
                            <form:input path="productPrice" />
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="submit" /> </td>
                    </tr>
                </table>
            </form:form>
        </body>

        </html>