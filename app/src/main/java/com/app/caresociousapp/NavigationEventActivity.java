package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NavigationEventActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnProfileOne, btnHome, btnMedicalRecord, btnFamilyMember, btnServiceRequest, btnMedicament, btnTreatment, btnDirective, btnLibrary, btnProfileTwo, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_navigation_event);
        setContentView(R.layout.activity_navigation_drawer_list);
        initView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    private void initView() {
        btnProfileOne = (Button) findViewById(R.id.btnProfileOne);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnMedicalRecord = (Button) findViewById(R.id.btnMedicalRecord);
        btnFamilyMember = (Button) findViewById(R.id.btnFamilyMember);
        btnServiceRequest = (Button) findViewById(R.id.btnServiceRequest);
        btnMedicament = (Button) findViewById(R.id.btnMedicament);
        btnTreatment = (Button) findViewById(R.id.btnTreatment);
        btnDirective = (Button) findViewById(R.id.btnDirective);
        btnProfileTwo = (Button) findViewById(R.id.btnProfileTwo);
        btn_back = (Button) findViewById(R.id.btnProfileTwo);
        btnLibrary = (Button) findViewById(R.id.btnLibrary);

        btnLibrary.setOnClickListener(this);
        btnProfileOne.setOnClickListener(this);
        btnHome.setOnClickListener(this);
        btnMedicalRecord.setOnClickListener(this);
        btnFamilyMember.setOnClickListener(this);
        btnServiceRequest.setOnClickListener(this);
        btnMedicament.setOnClickListener(this);
        btnTreatment.setOnClickListener(this);
        btnDirective.setOnClickListener(this);
        btnProfileTwo.setOnClickListener(this);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnProfileOne:
                startActivity(new Intent(NavigationEventActivity.this, ProfileActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(NavigationEventActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnMedicalRecord:
                startActivity(new Intent(NavigationEventActivity.this, MedicalRecordActivity.class));
                finish();
                break;
            case R.id.btnFamilyMember:
                startActivity(new Intent(NavigationEventActivity.this, FamilyMemberActivity.class));
                finish();
                break;
            case R.id.btnServiceRequest:
                startActivity(new Intent(NavigationEventActivity.this, ServiceRequestActivity.class));
                finish();
                break;
            case R.id.btnMedicament:
                startActivity(new Intent(NavigationEventActivity.this, MedicamentActivity.class));
                finish();
                break;
            case R.id.btnTreatment:
                startActivity(new Intent(NavigationEventActivity.this, TreatmentActivity.class));
                finish();
                break;
            case R.id.btnDirective:
                startActivity(new Intent(NavigationEventActivity.this, DirectiveActivity.class));
                finish();
                break;
            case R.id.btnLibrary:
                startActivity(new Intent(NavigationEventActivity.this, LibraryActivity.class));
                finish();
                break;
            case R.id.btnProfileTwo:
                startActivity(new Intent(NavigationEventActivity.this, ProfileActivity.class));
                finish();
                break;
            case R.id.btn_back:
                startActivity(new Intent(NavigationEventActivity.this, HomeActivity.class));
                finish();
                break;
        }

    }
}
