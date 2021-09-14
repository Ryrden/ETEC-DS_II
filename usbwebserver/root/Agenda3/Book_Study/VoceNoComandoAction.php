<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Resultado</title>
</head>

<body>
    <div class="w3-container w3-pale-red">
        <h1>
            <?php
            $nome = $_POST['txtNome'];
            $salario = $_POST['intSalario'];
            $dependentes = $_POST['intDependentes'];
            $res;

            if ($dependentes <= 5) {
                if ($salario <= 500) {
                    $res = 15;
                } elseif ($salario > 2000) {
                    $res = 8;
                } else {
                    $res = 10;
                }
            } else {
                if ($salario <= 500) {
                    $res = 15;
                } elseif ($salario > 500 && $salario <= 1000) {
                    $res = 15;
                } elseif ($salario > 1000 && $salario <= 2000) {
                    $res = 12;
                } else {
                    $res = 10;
                }
            }
            echo "" . $nome . "! <br>";
            echo "Você terá " . $res . "% de aumento, resultara no valor de R$ " . ($res * $salario / 100) . " <br>";

            ?>
        </h1>
    </div>
</body>