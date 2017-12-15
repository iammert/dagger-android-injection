package iammert.com.dagger_android_injection;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import iammert.com.dagger_android_injection.di.DaggerAppComponent;


/**
 * Created by mertsimsek on 25/05/2017.
 */

public class AndroidSampleApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends AndroidSampleApp> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
