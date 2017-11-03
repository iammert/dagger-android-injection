package iammert.com.dagger_android_injection.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);

}
