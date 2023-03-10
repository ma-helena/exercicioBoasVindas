<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Boas vindas</title>
</head>
<body>
<h1>Página de boas vindas </h1>
<br/>
<form name="subscriptionForm" action="boasVindas" method="POST">
    <table>
        <tr>
            <td><label for="name">Seu nome:</label></td>
            <td><input type="text" name="nomeUsuario" id="name"/></td>
        </tr>
        <tr>
            <td><label for="email">Seu email :</label></td>
            <td><input type="text" name="emailUsuario" id="email"/></td>
        </tr>
        <tr>
            <th><input type="reset" value="Limpar" name="reset"/></th>
            <th><input type="submit" value="Enviar" name="submit"/></th>
        </tr>
    </table>
</form>
</body>
</html>