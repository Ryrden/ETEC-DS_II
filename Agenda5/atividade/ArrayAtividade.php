<!DOCTYPE html>

<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Atividade Online</title>

</head>

<body>

    <div class="w3-display-middle">
        <div class="w3-panel w3-blue">
            <h2 class="w3-center">8º ANO A</h2>
        </div>
        <table class="w3-table-all">
            <tr class=" w3-blue">
                <th class="w3-center">Nome</th>
                <th class="w3-center">Primeiro Semestre</th>
                <th class="w3-center">Segundo Semestre</th>
            </tr>
            <?php
            $alunos = array(
                array("nome" => "Aline", "primeiroSemestre" => 10, "segundoSemestre" => 9.5),
                array("nome" => "Alfredo", "primeiroSemestre" => 8, "segundoSemestre" => 5),
                array("nome" => "Carla", "primeiroSemestre" => 5, "segundoSemestre" => 6.5),
                array("nome" => "César", "primeiroSemestre" => 9, "segundoSemestre" => 9),
                array("nome" => "Daniel", "primeiroSemestre" => 10, "segundoSemestre" => 7),
                array("nome" => "Esnar", "primeiroSemestre" => 8, "segundoSemestre" => 6),
                array("nome" => "Henzo", "primeiroSemestre" => 6, "segundoSemestre" => 8),
                array("nome" => "Pablo", "primeiroSemestre" => 7, "segundoSemestre" => 5),
                array("nome" => "Wallace", "primeiroSemestre" => 8, "segundoSemestre" => 7),
                array("nome" => "Zulmira", "primeiroSemestre" => 10, "segundoSemestre" => 6)
            );

            for ($i = 0; $i < 10; $i++) {
                echo '<tr>';
                echo '<td class="w3-center">' . $alunos[$i]['nome'] . "</td>";
                echo '<td class="w3-center">' . $alunos[$i]['primeiroSemestre'] . "</td>";
                echo '<td class="w3-center">' . $alunos[$i]['segundoSemestre'] . "</td>";
                echo '</tr>';
            }
            ?>
        </table>
    </div>
</body>