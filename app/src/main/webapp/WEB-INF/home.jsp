<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - Meu Site de Jogos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f0f0f0;
        }
        .container {
            text-align: center;
        }
        .button {
            display: inline-block;
            padding: 15px 30px;
            margin: 20px;
            background-color: #4CAF50;
            color: white;
            font-size: 18px;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .button:hover {
            background-color: #45a049;
        }
        h1 {
            font-size: 36px;
            margin-bottom: 50px;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Bem-vindo ao nosso site de Jogos</h1>
    <a href="jogo/list" class="button">Jogos</a>
    <a href="plataforma/list" class="button">Plataformas</a>
    <a href="categoria/list" class="button">Categorias</a>
</div>

</body>
</html>
