package iammert.com.dagger_android_injection.ui.detail.fragment;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


/**
 * Created by mertsimsek on 02/06/2017.
 */

public class DetailFragment extends DaggerFragment implements DetailFragmentView {

    @Inject
    DetailFragmentPresenter detailFragmentPresenter;

    public static DetailFragment newInstance() {
        Bundle args = new Bundle();
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onDetailFragmentLoaded() {
        Log.v("TEST", "OnDetailFragmentLoaded.");
    }
}
