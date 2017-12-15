package iammert.com.dagger_android_injection.di;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import iammert.com.dagger_android_injection.AndroidSampleApp;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<AndroidSampleApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<AndroidSampleApp> {
    }
}
