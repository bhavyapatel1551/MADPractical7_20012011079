package com.example.madpractical7_20012011079

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
       val str1=intent.getStringExtra("Service1")
        if(str1=="start" || str1=="Stop"){
            val intentService=Intent(context,AlarmService::class.java)
            intentService.putExtra("Service1",intent.getStringExtra("Service1"))
            if(str1=="start"){
                context.startService(intentService)
            }
            else if(str1=="Stop")
            {
                context.startService(intentService)
            }
        }
    }
}