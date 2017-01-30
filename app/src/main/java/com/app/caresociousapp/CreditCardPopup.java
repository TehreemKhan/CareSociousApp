package com.app.caresociousapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CreditCardPopup extends AppCompatActivity implements View.OnClickListener {

    private Button btn_canel, btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_popup);
        initView();
    }

    private void initView() {
        btn_canel = (Button) findViewById(R.id.btn_canel);
        btn_ok = (Button) findViewById(R.id.btn_ok);


        btn_canel.setOnClickListener(this);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_canel:
                finish();
                break;
            case R.id.btn_ok:
                finish();
                break;

        }

    }
}
