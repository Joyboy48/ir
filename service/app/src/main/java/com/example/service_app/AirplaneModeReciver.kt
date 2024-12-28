package com.example.service_app

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReciver:BroadcastReceiver() {

    //BroadCast Reciver: allow the registration and handling of
    //system wide broadcast message
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action != null && intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            var isAirplaneModeOn: Boolean = intent.getBooleanExtra("state",false)
             if (isAirplaneModeOn){
                 Toast.makeText(context,"Airplane mode is ON",Toast.LENGTH_SHORT).show()
             }else{
                 Toast.makeText(context,"Airplane mode is OFF",Toast.LENGTH_SHORT).show()

             }
        }
    }
}