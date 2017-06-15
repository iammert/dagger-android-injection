package iammert.com.dagger_android_injection.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import iammert.com.dagger_android_injection.ui.detail.DetailActivityComponent;
import iammert.com.dagger_android_injection.ui.main.MainActivityComponent;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module(subcomponents = {
        MainActivityComponent.class,
        DetailActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}
