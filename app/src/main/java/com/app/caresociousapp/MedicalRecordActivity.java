package com.app.caresociousapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MedicalRecordActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_drawer, btn_emergency, btnHome, btnSelectService, btn_gallery, btn_camera, btn_folder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_record);
        initView();
    }

    private void initView() {
        btn_drawer = (Button) findViewById(R.id.btn_drawer);
        btn_emergency = (Button) findViewById(R.id.btn_emergency);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnSelectService = (Button) findViewById(R.id.btnSelectService);
        btn_gallery = (Button) findViewById(R.id.btn_gallery);
        btn_camera = (Button) findViewById(R.id.btn_folder);
        btn_folder = (Button) findViewById(R.id.btnSelectService);

        btn_gallery.setOnClickListener(this);
        btn_camera.setOnClickListener(this);
        btn_folder.setOnClickListener(this);
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
                startActivity(new Intent(MedicalRecordActivity.this, NavigationEventActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                finish();
                break;
            case R.id.btn_emergency:
                startActivity(new Intent(MedicalRecordActivity.this, EmergencyActivity.class));
                finish();
                break;
            case R.id.btnHome:
                startActivity(new Intent(MedicalRecordActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.btnSelectService:
                startActivity(new Intent(MedicalRecordActivity.this, SelectServiceActivity.class));
                finish();
                break;
            case R.id.btn_gallery:
                Intent photoPickerIntent1 = new Intent(Intent.ACTION_PICK);
                photoPickerIntent1.setType("image/*");
                startActivityForResult(photoPickerIntent1, 1);
                break;
            case R.id.btn_camera:
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File f = new File(android.os.Environment
                        .getExternalStorageDirectory(), "temp.jpg");
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
                startActivityForResult(intent, 1);
                break;
            case R.id.btn_folder:
                Intent photoPickerIntent2 = new Intent(Intent.ACTION_PICK);
                photoPickerIntent2.setType("image/*");
                startActivityForResult(photoPickerIntent2, 1);
                break;
        }


    }
}
