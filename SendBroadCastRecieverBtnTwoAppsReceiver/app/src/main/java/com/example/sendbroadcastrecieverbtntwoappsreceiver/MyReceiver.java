package com.example.sendbroadcastrecieverbtntwoappsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent open2ndActivity = new Intent(context, MainActivity2.class);
        open2ndActivity.putExtra("msg", intent.getStringExtra("msg"));
        context.startActivity(open2ndActivity);
    }
}