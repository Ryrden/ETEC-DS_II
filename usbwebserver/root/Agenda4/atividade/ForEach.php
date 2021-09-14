<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Tabuada</title>
</head>

<body>
    <?php

    $valor = $_POST["txtValor"];
    echo '<div class="w3-quarter w3-display-middle w3-responsive w3-teal">';
    echo '<table class="w3-table-all w3-hoverable w3-text-black">';
    echo '<tr class="w3-teal ">';
    echo '<th class="w3-center"> Tabuada do ' . $valor . '</th>';
    echo '</tr>';
    $nums = array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    foreach ($nums as $num) {
        echo '<tr>';
        echo "<td class='w3-center'>" . $valor . " X " . $num . " = " . ($valor * $num) . "</td>";
        echo '</tr>';
    }
    echo '</table>';
    echo '</div>';

    ?>
</body>

</html>