package com.yeild.mqtt.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MqttService extends Service {
    public MqttService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
