<%-- 
    Document   : CounterJsp
    Created on : 14 oct. 2020, 11:32:23
    Author     : Massi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compteur</title>
    </head>
    <body>
        <h1>Nous sommes dans compteur</h1>
        
        <h1>Valeur du compteur :
            ${valeur}
            
        </h1>
            <form method="post" action="CounterServlet">
                <input type="submit" value="incr" name="operation"/>
                <input type="submit" value="decr" name="operation"/>
                <input type="submit" value="raz" name="operation"/>
            </form>
    </body>
</html>
