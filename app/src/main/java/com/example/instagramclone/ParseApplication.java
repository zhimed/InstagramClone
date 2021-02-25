package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RaZsETQQ91bTxeFNDwt7Wvpua4Xm0lGKBtpr7QMn")
                .clientKey("7b7UGLRUQROhXg8ndWHlcgrY7iCQEZwscAb7OIgF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
