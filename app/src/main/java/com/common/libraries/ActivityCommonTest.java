package com.common.libraries;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ActivityCommonTest extends ActivityBase {

    private RelativeLayout mSearchHint;
    private LinearLayout mSearchBox;
    private TextView mCancelText;

    @Override
    int getContentView() {
        return R.layout.activity_common_test;
    }

    @Override
    public void initViews() {

        mSearchHint = findViewById(R.id.relative_layout_search_hint_box);
        mSearchBox = findViewById(R.id.linear_layout_search_box);
        mCancelText = findViewById(R.id.text_view_search_cancel);

        mSearchHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSearchHint.setVisibility(View.GONE);
                mSearchBox.setVisibility(View.VISIBLE);
            }
        });

        mCancelText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSearchHint.setVisibility(View.VISIBLE);
                mSearchBox.setVisibility(View.GONE);
            }
        });
    }
}
