package iammert.com.dagger_android_injection.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import iammert.com.dagger_android_injection.ui.detail.DetailActivity;
import iammert.com.dagger_android_injection.ui.detail.DetailActivityComponent;
import iammert.com.dagger_android_injection.ui.main.MainActivity;
import iammert.com.dagger_android_injection.ui.main.MainActivityComponent;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);

}
