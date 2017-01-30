package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditProfileDetailsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_drawer, btn_emergency, btnHome, btnSelectService, btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_details);
        initView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ProfileActivity.class));
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
        finish();
    }

    private void initView() {
        btn_drawer = (Button) findViewById(R.id.btn_drawer);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnSelectService = (Button) findViewById(R.id.btnSelectService);
        btnSave = (Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
        btnSelectService.setOnClickListener(this);
        btn_drawer.setOnClickListener(this);
        btn_emergency.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawer:
                startActivity(new Intent(EditProfileDetailsActivity.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(EditProfileDetailsActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(EditProfileDetailsActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(EditProfileDetailsActivity.this, SelectServiceActivity.class));
                finish();
                break;
            case R.id.btnSave:
                finish();
                startActivity(new Intent(EditProfileDetailsActivity.this, ProfileActivity.class));
                break;
        }


    }
}
