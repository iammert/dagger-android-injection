package iammert.com.dagger_android_injection.ui.detail;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragment;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragmentComponent;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public abstract class DetailFragmentProvider {

    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideDetailFragmentFactory(DetailFragmentComponent.Builder builder);
}
