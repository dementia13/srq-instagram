package net.dementia13.srq_instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        final Parse.Configuration  configuration = new Parse.Configuration.Builder(this)
                .applicationId("srq-instagram")
                .clientKey("srq-instagram")
                .server("http://srq-instagram.herokuapp.com/parse/")
                .build();

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("srq-instagram")
            .clientKey("srq-instagram")
            .server("https://srq-instagram.herokuapp.com/parse/").build());
    }
}
