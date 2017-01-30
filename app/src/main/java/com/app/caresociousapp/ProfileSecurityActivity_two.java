package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProfileSecurityActivity_two extends AppCompatActivity implements View.OnClickListener {

    Button btn_profile_security_general, btn_profile_security_security, btn_profile_security_password, btn_profile_security_loggedin, btn_profile_security_trusted_contacts, btn_profile_security_legacy_contacts;
    private Button btn_drawer, btn_emergency, btnHome, btnSelectService, btn_profile, btn_profileGeneral, btn_profileSecurity, btn_profileContact, btn_profileMedicalInfo, btn_profilePaymentMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_security_activity_two);
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
        btn_profile_security_general = (Button) findViewById(R.id.btn_profile_security_general);
        btn_profile_security_security = (Button) findViewById(R.id.btn_profile_security_security);
        btn_profile_security_password = (Button) findViewById(R.id.btn_profile_security_password);
        btn_profile_security_loggedin = (Button) findViewById(R.id.btn_profile_security_loggedin);
        btn_profile_security_trusted_contacts = (Button) findViewById(R.id.btn_profile_security_trusted_contacts);
        btn_profile_security_legacy_contacts = (Button) findViewById(R.id.btn_profile_security_legacy_contacts);

        btn_profile_security_legacy_contacts.setOnClickListener(this);
        btn_profile_security_general.setOnClickListener(this);
        btn_profile_security_security.setOnClickListener(this);
        btn_profile_security_password.setOnClickListener(this);
        btn_profile_security_loggedin.setOnClickListener(this);
        btn_profile_security_trusted_contacts.setOnClickListener(this);
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
                startActivity(new Intent(ProfileSecurityActivity_two.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(ProfileSecurityActivity_two.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(ProfileSecurityActivity_two.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(ProfileSecurityActivity_two.this, SelectServiceActivity.class));
                finish();
                break;
            case R.id.btn_profile:
                startActivity(new Intent(ProfileSecurityActivity_two.this, EditProfileDetailsActivity.class));
                finish();
                break;
            case R.id.btn_profileGeneral:
                startActivity(new Intent(ProfileSecurityActivity_two.this, ProfileActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_profileSecurity:
                startActivity(new Intent(ProfileSecurityActivity_two.this, ProfileSecurityActivity_two.class));
                finish();
                break;
            case R.id.btn_profileContact:
                startActivity(new Intent(ProfileSecurityActivity_two.this, ProfilePersonToContactActivity.class));
                finish();
                break;
            case R.id.btn_profileMedicalInfo:
                startActivity(new Intent(ProfileSecurityActivity_two.this, ProfileMedicalInfo.class));
                finish();
                break;
            case R.id.btn_profilePaymentMethod:
                startActivity(new Intent(ProfileSecurityActivity_two.this, ProfilePaymentMethodActivity.class));
                finish();
                break;
        }


    }
}
