package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginNumberActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_loginNumber;
    private Button btn_countryCode, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_number);
        initView();
    }

    private void initView() {
        et_loginNumber = (EditText) findViewById(R.id.et_loginNumber);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_countryCode = (Button) findViewById(R.id.btn_countryCode);

        btn_login.setOnClickListener(this);
        btn_countryCode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                if (et_loginNumber.getText().toString().equals("123")) {
                    startActivity(new Intent(this, RequestPermissionActivity.class));
                    finish();
                } else {
                    Toast.makeText(this, "Invalid Number!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_countryCode:
                startActivity(new Intent(this, CountryCodeActivity.class));
                break;
        }

    }
}
