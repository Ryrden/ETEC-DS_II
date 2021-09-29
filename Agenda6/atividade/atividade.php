<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Alunos Concluintes</title>
</head>

<body class="w3-white">
    <div class="w3-padding w3-content w3-half w3-display-topmiddle w3-margin">
        <h1 class="w3-center w3-red w3-round-large w3-margin">Alunos Concluintes</h1>
        <table class="w3-table-all w3-centered w3-text-black">
            <thead>
                <tr class="w3-center w3-red ">
                    <th>Código</th>
                    <th>Nome</th>
                    <th>Nota 1</th>
                    <th>Nota 2</th>
                    <th>Nota 3</th>
                    <th>Nota 4</th>
                    <th>Media</th>
                </tr>
            </thead>
            <tbody class="w3-center w3-red">
                <?php
                $servername = "localhost";
                $username = "root";
                $password = "usbw";
                $dbname = "pwii";
                $conexao = new mysqli($servername, $username, $password, $dbname);
                if ($conexao->connect_error) {
                    die("Connection failed: " . $conexao->connect_error);
                }
                $sql = "SELECT * FROM alunoconcluinte";
                $resultado = $conexao->query($sql);
                if ($resultado != null)
                    foreach ($resultado as $linha) {
                        echo '<tr>';
                        echo '<td class="w3-text-black" >' . $linha['idalunoconcluinte'] . '</td>';
                        echo '<td class="w3-text-black">' . $linha['nome'] . '</td>';
                        echo '<td class="w3-text-black">' . $linha['nota1'] . '</td>';
                        echo '<td class="w3-text-black">' . $linha['nota2'] . '</td>';
                        echo '<td class="w3-text-black">' . $linha['nota3'] . '</td>';
                        echo '<td class="w3-text-black">' . $linha['nota4'] . '</td>';
                        $media = 0;
                        for($i = 1; $i <= 4; $i++)
                            $media += $linha['nota'.$i];
                        echo '<td class="w3-text-black">' . $media/4 . '</td>';
                        echo '</tr>';
                    }
                $conexao->close();
                ?>
            </tbody>
        </table>
    </div>
</body>

</html>