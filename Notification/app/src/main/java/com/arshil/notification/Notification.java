package com.arshil.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Notification extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }
}
