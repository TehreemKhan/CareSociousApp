package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddFamilyMemberMobileNumberActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_mobileNumber;
    private Button btn_back, btn_emergency, btnHome, btnSelectService, btn_countryCode, btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_family_member_mobile_number);
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
        et_mobileNumber = (EditText) findViewById(R.id.et_mobileNumber);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnSelectService = (Button) findViewById(R.id.btnSelectService);
        btn_countryCode = (Button) findViewById(R.id.btn_countryCode);
        btn_ok = (Button) findViewById(R.id.btn_ok);


        btn_back.setOnClickListener(this);
        btn_emergency.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnSelectService.setOnClickListener(this);
        btn_countryCode.setOnClickListener(this);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, FamilyMemberActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, SelectServiceActivity.class));
                finish();
                break;
            case R.id.btn_countryCode:
                startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, CountryCodeActivity.class));
                finish();
                break;
            case R.id.btn_ok:
                if (!et_mobileNumber.getText().toString().isEmpty()) {
                    startActivity(new Intent(AddFamilyMemberMobileNumberActivity.this, SmsPopupActivity.class));
                    finish();
                } else {
                    Toast.makeText(AddFamilyMemberMobileNumberActivity.this, "enter the number please!", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}

