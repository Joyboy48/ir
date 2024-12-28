package com.example.service_app

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

//A Service  in andriod is a component that run in backgroung and dosnn't have a user interface


class MyService:Service() {

    lateinit var mediaPlayer:MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
         //return value: return an integer that represent a service's behaviour regarding restart
        mediaPlayer = MediaPlayer.create(
            this,Settings.System.DEFAULT_RINGTONE_URI
        )
        //play it on loop
        mediaPlayer.isLooping
        mediaPlayer.start()

        //START_STICKY:the service should be restarted by the system if
        //it gets terminated, and it should try to re-delivery the last
        //intent that was used to start the service
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        mediaPlayer.stop()
    }
}