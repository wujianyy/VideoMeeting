package com.jb.vmeeting.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jb.vmeeting.app.constant.IntentConstant;
import com.jb.vmeeting.ui.utils.PageJumper;


/**
 * BaseActivity
 * Created by Jianbin on 2015/12/7.
 */
public class BaseActivity extends AppCompatActivity {

    private Bundle mBundle;

    @CallSuper
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (null != intent) {
            mBundle = intent.getBundleExtra(IntentConstant.INTENT_EXTRA_BUNDLE);
            onFetchIntent(intent, mBundle);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onFetchIntent(Intent intent, Bundle bundle) {

    }

    protected Bundle getBundle() {
        return mBundle;
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T findView(int id) {
        return (T) super.findViewById(id);
    }
}