package com.tan_ds.newone.Activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.tan_ds.newone.Adapters.AdapterForCards;
import com.tan_ds.newone.R;

import java.util.ArrayList;

/**
 * Created by Tan-DS on 6/22/2017.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecView;
    private AdapterForCards mAdapter;
    private RecyclerView.LayoutManager mManager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        Button button = (Button) findViewById(R.id.button_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final TextView tv = (TextView) findViewById(R.id.view_for_animation);

                int a = (tv.getLeft() + tv.getRight()) / 2;
                int b = (tv.getTop() + tv.getBottom()) / 2;

                int radius = (int) Math.hypot(a, b);

                Animator anim;
                if (tv.getVisibility() == View.INVISIBLE) {
                    tv.setVisibility(View.VISIBLE);
                    anim = ViewAnimationUtils.createCircularReveal(tv, a, b, 0, radius);
                }
                else{
                    anim = ViewAnimationUtils.createCircularReveal(tv, a, b, radius, 0);
                    anim.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                           tv.setVisibility(View.INVISIBLE);
                        }
                    });

                }
                anim.start();
            }
        });

        ArrayList<String> data = new ArrayList<>();
        data.add("aaa");
        data.add("bbb");

        mRecView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mManager = new LinearLayoutManager(this);
        mAdapter = new AdapterForCards(data);

        mRecView.setLayoutManager(mManager);
        mRecView.setAdapter(mAdapter);

        /* TextInputLayout layout = (TextInputLayout) findViewById(R.id.inputText);
        layout.setError("ERROR");

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Titile")
                .setMessage("Message")
                .setPositiveButton("OK", null)
                .setNegativeButton("Nope", null)
                .setNeutralButton("HZ", null)
                .create();

        dialog.show();*/

    }
}
