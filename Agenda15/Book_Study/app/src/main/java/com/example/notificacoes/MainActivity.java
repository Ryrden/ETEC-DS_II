package com.example.notificacoes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotificarProg = (Button) findViewById(R.id.btnNotificar);

        btnNotificarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                String mensagem = "50% de desconto.";
                String titulo = "Promoção!";
                notificarUsuario(mensagem, titulo);
            }

            //método notificarUsuario
            //Parâmetros do tipo texto: Mensagem e Título
            private void notificarUsuario(String mensagem, String titulo){
                //Objeto "notificacao" para receber os parâmetros e construir a estrutura da notificação
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                //Construindo o título da notificação
                notificacao.setContentTitle(titulo);
                //Construindo a mensagem da notificação
                notificacao.setContentText(mensagem);
                //Construindo a prioridade da notificação
                notificacao.setPriority(Notification.PRIORITY_HIGH);
                //Construindo o ícone da notificação
                notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                notificacao.setAutoCancel(true);
                //Construindo a intenção que chama a Activity promoção quando o usuário clicar na mensagem
                Intent it = new Intent(getBaseContext(), Promocao.class);
                //Utilizando o PendingIntent para que o Android consiga executar a Activity do seu projeto
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,
                                it, PendingIntent.FLAG_UPDATE_CURRENT);
                //Atribuindo na notificação a intenção que será executada, quando o usuário clicar na notificação
                notificacao.setContentIntent(pit);
                //Criando o objeto para gerenciar e gerar a notificação no Android
                NotificationManager notificar = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                //Executando a notificação com o id fixo: 9000
                notificar.notify(9000, notificacao.build());
            }
        });
    }
}