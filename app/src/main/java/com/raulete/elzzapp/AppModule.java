package com.raulete.elzzapp;


import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                App.class
        }
)
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    public Application provideApplication() {
        return app;
    }
}
