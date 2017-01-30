package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProfilePaymentMethodActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_drawer, btn_emergency, btnHome, btnSelectService, btn_profile, btn_profileGeneral, btn_profileSecurity, btn_profileContact, btn_profileMedicalInfo, btn_profilePaymentMethod, btn_crDbCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_payment_method);
        initView();
    }

    private void initView() {
        btn_drawer = (Button) findViewById(R.id.btn_drawer);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnSelectService = (Button) findViewById(R.id.btnSelectService);
        btn_profile = (Button) findViewById(R.id.btn_profile);
        btn_profileGeneral = (Button) findViewById(R.id.btn_profileGeneral);
        btn_profileSecurity = (Button) findViewById(R.id.btn_profileSecurity);
        btn_profileContact = (Button) findViewById(R.id.btn_profileContact);
        btn_profileMedicalInfo = (Button) findViewById(R.id.btn_profileMedicalInfo);
        btn_profilePaymentMethod = (Button) findViewById(R.id.btn_profilePaymentMethod);
        btn_crDbCard = (Button) findViewById(R.id.btn_crDbCard);

        btn_crDbCard.setOnClickListener(this);
        btn_profile.setOnClickListener(this);
        btn_profileGeneral.setOnClickListener(this);
        btn_profileSecurity.setOnClickListener(this);
        btn_profileContact.setOnClickListener(this);
        btn_profileMedicalInfo.setOnClickListener(this);
        btn_profilePaymentMethod.setOnClickListener(this);
        btnSelectService.setOnClickListener(this);
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
                startActivity(new Intent(ProfilePaymentMethodActivity.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, SelectServiceActivity.class));
                finish();
                break;
            case R.id.btn_profile:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, EditProfileDetailsActivity.class));
                finish();
                break;
            case R.id.btn_profileGeneral:
                                startActivity(new Intent(ProfilePaymentMethodActivity.this, ProfileActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
finish();
                break;
            case R.id.btn_profileSecurity:
                                startActivity(new Intent(ProfilePaymentMethodActivity.this, ProfileSecurityActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
finish();
                break;
            case R.id.btn_profileContact:
                         startActivity(new Intent(ProfilePaymentMethodActivity.this, ProfilePersonToContactActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
finish();
                break;
            case R.id.btn_profileMedicalInfo:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, ProfileMedicalInfo.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
finish();
                break;
            case R.id.btn_profilePaymentMethod:

                break;
            case R.id.btn_crDbCard:
                startActivity(new Intent(ProfilePaymentMethodActivity.this, CreditCardPopup.class));
                break;
        }


    }
}
