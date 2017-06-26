package com.tan_ds.newone.ViewHolders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tan_ds.newone.R;

/**
 * Created by Tan-DS on 6/25/2017.
 */

public class HolderForCards extends RecyclerView.ViewHolder {

    private TextView mTextView;

    public HolderForCards(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.card_view_text);


    }

    public void onBind(String text){
        mTextView.setText(text);
    }

}
