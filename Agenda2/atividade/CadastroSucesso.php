<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Brincos e Companhia</title>
</head>

<body>
    
    <div class="w3-container  w3-teal w3-center">
    <h1>Cadastro Confirmado com Sucesso!</h1>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $nome = $_POST['txtNome'];
            echo "<b>Nome: </b>".$nome."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $sobrenome = $_POST['txtSobrenome'];
            echo "<b>Sobrenome: </b>".$sobrenome."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $email = $_POST['txtEmail'];
            echo "<b>Email: </b>".$email."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $formacao = $_POST['txtFormacao'];
            echo "<b>Formação: </b>".$formacao."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $descricao = $_POST['txtEmprego'];
            echo "<b>Descrição Último Emprego: </b>".$descricao."<br>";
        ?>
    </div>
    
</div>

</body>