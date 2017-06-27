package com.tan_ds.newone.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tan_ds.newone.R;

/**
 * Created by Tan-DS on 6/27/2017.
 */

public class TempActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, TempActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_temp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_my);
        setSupportActionBar(toolbar);
    }
}
