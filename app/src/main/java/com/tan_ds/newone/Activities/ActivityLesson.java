package com.tan_ds.newone.Activities;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.tan_ds.newone.R;

/**
 * Created by Tan-DS on 6/27/2017.
 */

public class ActivityLesson extends AppCompatActivity {

    private static final String THEME = "theme";

    private Button mButton1, mButton2;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, ActivityLesson.class);
        return intent;
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        try {

            setTheme(getIntent().getExtras().getInt(THEME));
        } catch(RuntimeException e){
            Log.e("ERROR", "error");
        }


        setContentView(R.layout.activity_main);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_my);
        setSupportActionBar(toolbar);



        mButton1 = (Button) findViewById(R.id.butt_1);
        mButton2 = (Button) findViewById(R.id.butt_2);

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ActivityLesson.newIntent(getApplicationContext())
                .putExtra(THEME, R.style.AppThemeColored));
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ActivityLesson.newIntent(getApplicationContext())
                        .putExtra(THEME, R.style.AppThemeWhite));
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
