package com.app.caresociousapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class CountryCodeActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_code);
        initView();
    }

    private void initView() {
        mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        mainLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
