# Bitácora de desarrollo

## 2026-10-24: Recepción básica de FCM

**Objetivo:** que la app reciba una notificación de prueba.

**Qué hice**
- Creé el proyecto con paquete `com.antoni`.
- Agregué `google-services.json` y el plugin de Google Services.
- Creé `MiServicioDeMensajeria` extendiendo `FirebaseMessagingService`.

**Por qué**
- FCM necesita un servicio registrado en el manifiesto para despertar la app.

**Problemas y soluciones**
- *Problema:* la notificación llegaba pero no se ejecutaba mi código.
  *Causa:* la consola envía tipo "notification", no "data".
  *Solución:* ...

**Aprendí**
- ...

**Siguiente paso**
- Crear el canal de alta prioridad.