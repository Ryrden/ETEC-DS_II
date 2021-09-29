<!DOCTYPE html>

<html lang="pt-BR">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <title>Madeira e Cia Ltda.</title>

</head>

<body>
    <div class="w3-container w3-teal">
        <h2>PROMOÇÃO DE MÊS DE ANIVERSÁRIO</h2>
        <h3>
            <?php
            $nome = $_POST['txtNome'];
            $val_compra = $_POST['txtValorCompra'];
            $pagamento = $_POST['cmbPag'];
            $desconto;
            if ($pagamento == 'deposito'){
                $desconto = 10;
            }
            elseif ($pagamento == 'boleto'){
                $desconto = 8;
            }
            else{
                $desconto = 0;
            }
            $desconto_calc = ($desconto * $val_compra / 100);
            
            echo $nome.' ! <br>';
            echo 'Valor da Compra Sem Desconto: R$ '.$val_compra.'<br>';
            echo 'Forma de Pagamento escolhida: '.$pagamento.'<br>';
            echo 'Desconto de: '.$desconto.'% <br>';
            echo 'Você economizou: R$ '.$desconto_calc.' <br>';
            echo 'Valor a pagar: R$ '.($val_compra - $desconto_calc).' <br>';
            
            ?>
        </h3>
    </div>
</body>