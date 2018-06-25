package com.emmanuelmir.custom_notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.view.View;

public class PopUpNotification {

    public void customNotification(View view){

        Intent notificationIntent = new Intent(view.getContext().getApplicationContext(), MainActivity.class);
        notificationIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        //notificationIntent.putExtra("path", viewObject.getPath());
        //TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        //stackBuilder.addParentStack(MainActivity.class);
        //stackBuilder.addNextIntent(notificationIntent);
        //PendingIntent notificationPendingIntent = stackBuilder.getPendingIntent(Integer.parseInt(viewObject.getRefId()), PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(view.getContext(), MainActivity.WINDOW_SERVICE);
        builder.setSmallIcon(R.drawable.ic_menu_send)
                .setLargeIcon(BitmapFactory.decodeResource(view.getResources(), R.drawable.ic_menu_send))
                .setColor(view.getResources().getColor(R.color.colorPrimary))
                .setContentTitle(view.getResources().getString(R.string.nav_header_title))
                //.setContentIntent(notificationPendingIntent)
                //.setContentText(String.format(view.getResources().getString(R.string.notification), viewObject.getTitle()))
                .setDefaults(Notification.DEFAULT_ALL)
                .setPriority(NotificationManager.IMPORTANCE_MAX);
    }
}
