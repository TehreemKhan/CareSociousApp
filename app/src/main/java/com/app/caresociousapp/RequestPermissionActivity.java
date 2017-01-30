package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RequestPermissionActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_allow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_permission);
        initView();
    }

    private void initView() {
        btn_allow = (Button) findViewById(R.id.btn_allow);

        btn_allow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(RequestPermissionActivity.this, HomeActivity.class));
        this.finish();
    }
}
