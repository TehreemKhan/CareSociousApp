package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_drawer, btn_emergency, btn_selectService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        btn_drawer = (Button) findViewById(R.id.btn_drawer);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btn_selectService = (Button) findViewById(R.id.btnSelectService);

        btn_drawer.setOnClickListener(this);
        btn_emergency.setOnClickListener(this);
        btn_selectService.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawer:
                startActivity(new Intent(HomeActivity.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(HomeActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(HomeActivity.this, SelectServiceActivity.class));
                finish();
                break;

        }

    }
}
