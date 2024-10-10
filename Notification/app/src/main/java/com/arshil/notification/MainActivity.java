package com.arshil.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.NotificationManager;
import android.app.PendingIntent;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    int notificationID=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        displayNotification();
    }
    protected void displayNotification(){
        Intent i = new Intent(this, Notification.class);
        i.putExtra("notificationID",notificationID);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,i,0);
        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder notifBuilder;
        notifBuilder=new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Meeting Remainder").setContentText("Remainder:Metting starts in 5 minutes.");
        nm.notify(notificationID,notifBuilder.build());
    }
}