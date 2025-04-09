package com.example.notification

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class App : Application() {

    public val CHANNEL_ID1 = "CHANNEL_ID1"
    public val CHANNEL_ID2 = "CHANNEL_ID2"

    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel1 = NotificationChannel(
                CHANNEL_ID1,
                "Channel 1",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "This is my high importance channel for notifications"
            }

            val channel2 = NotificationChannel(
                CHANNEL_ID2,
                "Channel 2",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "This is my default importance channel for notifications"
            }

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)
        }
    }
}
