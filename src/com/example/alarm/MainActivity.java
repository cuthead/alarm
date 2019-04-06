package com.example.alarm;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.AlarmManager;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
		Intent intent2 = new Intent(this, RefreshBroadcastReceiver.class);
		PendingIntent pi = PendingIntent.getBroadcast(this, 0, intent2, 0);
		manager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, 1000, 1000, pi);
    }
}
