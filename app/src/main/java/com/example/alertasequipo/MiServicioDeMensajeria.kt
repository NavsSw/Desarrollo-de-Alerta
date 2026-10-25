package com.antoni

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MiServicioDeMensajeria : FirebaseMessagingService(){
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        // Si el mensaje contiene una notificación
        remoteMessage.notification?.let {
            val titulo = it.title
            val cuerpo = it.body
            // Aquí procesaremos la alerta
        }
    }

}