# Alertas Equipo 📱🔔

App Android nativa (Kotlin) que simula alertas de alta prioridad para que los
equipos de desarrollo no pierdan reuniones ni eventos críticos entre el ruido
de chats y correos.

> ⚠️ **Estado: beta temprana.** Recibe notificaciones push vía FCM.
> Aún no incluye alertas tipo alarma ni backend propio.

## Estado actual

| Función | Estado |
|---|---|
| Registro en Firebase y obtención de token FCM | ✅ |
| Permiso `POST_NOTIFICATIONS` (Android 13+) | ✅ |
| Servicio `FirebaseMessagingService` para recibir mensajes | ✅ |
| Canal de notificación de alta prioridad / pantalla completa | 🚧 Pendiente |
| Backend en Python (calendario, webhooks) | 📋 Planeado |
| Priorización con IA | 📋 Planeado |

## Stack

- Kotlin + Android Studio
- Firebase Cloud Messaging (FCM)
- Android 13+ (API 33), el mínimo se fijó por el permiso de notificaciones
- Pruebas en dispositivo físico Xiaomi (Depuración USB)

## Cómo probarlo

1. Abre el proyecto en Android Studio y sincroniza Gradle.
2. Agrega tu propio `google-services.json` en `app/` (se obtiene desde la
   consola de Firebase; **no está en el repo**).
3. Conecta el teléfono con Depuración USB y ejecuta la app.
4. Copia el token FCM que aparece en Logcat (filtra por `FCM`).
5. Envía un mensaje de prueba desde Firebase Console → Cloud Messaging.

## Limitaciones conocidas

- En Xiaomi (MIUI/HyperOS) hay que activar **Autoinicio** y desactivar el
  ahorro de batería para la app, o el sistema puede retrasar/matar el servicio.
- Los mensajes enviados como *notification* desde la consola no pasan por
  `onMessageReceived` con la app en segundo plano. Para alertas críticas se
  usarán mensajes *data* con prioridad alta.
- El modo No Molestar puede silenciar las alertas.

## Roadmap

- [ ] Canal `IMPORTANCE_HIGH` con sonido persistente
- [ ] Full-screen intent (`USE_FULL_SCREEN_INTENT`, con restricciones en Android 14+)
- [ ] Microservicio en Python que dispare alertas desde calendario/webhooks
- [ ] Capa de IA para decidir qué alertas son realmente críticas

## Más información

Bitácora de desarrollo y decisiones: [DEVLOG.md](DEVLOG.md)
