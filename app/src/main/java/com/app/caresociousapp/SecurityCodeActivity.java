package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecurityCodeActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_securityCode;
    private Button btn_back, btn_emergency, btnHome, btnSelectService, btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_code);
        initView();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, HomeActivity.class));
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
        finish();
    }
    private void initView() {
        et_securityCode = (EditText) findViewById(R.id.et_securityCode);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnSelectService = (Button) findViewById(R.id.btnSelectService);
        btn_ok = (Button) findViewById(R.id.btn_ok);


        btn_back.setOnClickListener(this);
        btn_emergency.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnSelectService.setOnClickListener(this);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                startActivity(new Intent(SecurityCodeActivity.this, SmsPopupActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(SecurityCodeActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(SecurityCodeActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(SecurityCodeActivity.this, SelectServiceActivity.class));
                finish();
                break;

            case R.id.btn_ok:
                if (!et_securityCode.getText().toString().isEmpty()) {
                    startActivity(new Intent(SecurityCodeActivity.this, HomeActivity.class));
                    finish();
                } else {
                    Toast.makeText(SecurityCodeActivity.this, "enter the code please!", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
