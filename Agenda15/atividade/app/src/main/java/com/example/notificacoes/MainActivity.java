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

        Button btnNotificarProg1 = (Button) findViewById(R.id.btnNotificar1);
        Button btnNotificarProg2 = (Button) findViewById(R.id.btnNotificar2);

        btnNotificarProg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                String message = "50% de desconto.";
                String tittle = "Promoção!";
                Intent it = new Intent(getBaseContext(), Sales1.class);
                notify(it, message, tittle, 25);
            }

            private void notify(Intent it, String message, String title, int id){

                NotificationCompat.Builder notification = new NotificationCompat.Builder(getBaseContext());
                notification.setContentTitle(title).setContentText(message);
                notification.setPriority(Notification.PRIORITY_HIGH);
                notification.setSmallIcon(R.drawable.ic_launcher_foreground);

                notification.setAutoCancel(true);

                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,
                        it, PendingIntent.FLAG_UPDATE_CURRENT);

                notification.setContentIntent(pit);

                NotificationManager notificator = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                notificator.notify(id, notification.build());
            }
        });

        btnNotificarProg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                String message = "50% de desconto.";
                String tittle = "Promoção!";
                Intent it = new Intent(getBaseContext(), Sales2.class);
                notify(it, message, tittle, 25);
            }

            void notify(Intent it, String message, String title, int id){

                NotificationCompat.Builder notification = new NotificationCompat.Builder(getBaseContext());
                notification.setContentTitle(title).setContentText(message);
                notification.setPriority(Notification.PRIORITY_HIGH);
                notification.setSmallIcon(R.drawable.ic_launcher_foreground);

                notification.setAutoCancel(true);

                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,
                        it, PendingIntent.FLAG_UPDATE_CURRENT);

                notification.setContentIntent(pit);

                NotificationManager notificator = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                notificator.notify(id, notification.build());
            }
        });
    }


}