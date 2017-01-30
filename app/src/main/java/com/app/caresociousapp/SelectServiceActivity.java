package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectServiceActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_drawer, btn_emergency, btnHome, btn_inviteFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);
        initView();
    }

    private void initView() {
        btn_drawer = (Button) findViewById(R.id.btn_drawer);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btn_inviteFriend = (Button) findViewById(R.id.btn_inviteFriend);

        btn_inviteFriend.setOnClickListener(this);
        btn_drawer.setOnClickListener(this);
        btn_emergency.setOnClickListener(this);
        btnHome.setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, HomeActivity.class));
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
        finish();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawer:
                startActivity(new Intent(SelectServiceActivity.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(SelectServiceActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(SelectServiceActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btn_inviteFriend:
                startActivity(new Intent(SelectServiceActivity.this, InviteFriendActivity.class));
                break;
        }


    }
}
