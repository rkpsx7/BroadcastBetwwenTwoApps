package com.example.sendbroadcastrecieverbtntwoappsreceiver;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MyReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiveBroadcast();
    }

    private void receiveBroadcast() {
        broadcastReceiver = new MyReceiver();
        IntentFilter intentFilter = new IntentFilter("com.app1.send.br.msg");
        registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadcastReceiver);
    }
}