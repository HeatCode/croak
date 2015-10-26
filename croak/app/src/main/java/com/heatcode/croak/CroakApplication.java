package com.heatcode.croak;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by HeatherGuin on 10/25/2015.
 */
public class CroakApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
// Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "W02sSJLKjOYpfwGvhnoQnCcEBWE9YaUpyiDo9NDk", "mZ4MosRswpsWuxQ2MWu0EOQthayTkyNixAlNS9zr");
    }
}
