package com.yeild.mqtttest.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AppService extends Service {
    public AppService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
