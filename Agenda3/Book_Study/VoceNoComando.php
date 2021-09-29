<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Você no Comando</title>

    <style type="text/css">
        
    </style>

</head>

<body>
    <div class="w3-container w3-pale-red">
        <h2>Calculo de Aumento</h2>
    </div>

    <form class="w3-container" action="VoceNoComandoAction.php" method="post">
        <label class="w3-text-pink"><b>Nome:</b></label>
        <input type="text" class="w3-input w3-border w3-light-grey" name="txtNome">

        <label class="w3-text-pink"><b>Salário:</b></label>
        <input type="number" class="w3-input w3-border w3-light-grey" name="intSalario">

        <label class="w3-text-pink"><b>Quantidade de Dependentes:</b></label>
        <input type="number" class="w3-input w3-border w3-light-grey" name="intDependentes">
        <br>
        <button class="w3-btn w3-pink">Enviar</button>
    </form>

</body>

</html>