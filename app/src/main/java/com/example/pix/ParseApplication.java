package com.example.pix;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hYBPqYZusDX9NbptNNBOHPRacKZdA2UMuICPdCIy")
                .clientKey("OnFO0FffQsQF40WR2xgT2FCRCX85DgSEBrNDrDLn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
