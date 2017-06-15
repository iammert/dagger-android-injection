package iammert.com.dagger_android_injection.ui.detail;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Subcomponent(modules = {
        DetailActivityModule.class,
        DetailFragmentProvider.class})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
    }
}
