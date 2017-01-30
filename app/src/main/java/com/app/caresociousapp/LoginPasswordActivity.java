package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPasswordActivity extends AppCompatActivity implements OnClickListener {

    private EditText et_loginPassword;
    private Button btn_back, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_password);
        initView();
    }

    private void initView() {
        et_loginPassword = (EditText) findViewById(R.id.et_loginPassword);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_back = (Button) findViewById(R.id.btn_back);

        btn_login.setOnClickListener(this);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                if (et_loginPassword.getText().toString().equals("123")) {
                    startActivity(new Intent(LoginPasswordActivity.this, HomeActivity.class));
                    finish();
                } else {
                    Toast.makeText(this, "Invalid Number!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_back:
                super.onBackPressed();
                finish();
                break;
        }
    }


}
