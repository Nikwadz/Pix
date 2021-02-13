package com.example.pix;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hYBPqYZusDX9NbptNNBOHPRacKZdA2UMuICPdCIy")
                .clientKey("OnFO0FffQsQF40WR2xgT2FCRCX85DgSEBrNDrDLn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
