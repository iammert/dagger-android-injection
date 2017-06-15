package iammert.com.dagger_android_injection.ui.detail.fragment;

/**
 * Created by mertsimsek on 02/06/2017.
 */

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = DetailFragmentModule.class)
public interface DetailFragmentComponent extends AndroidInjector<DetailFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment> {
    }
}
