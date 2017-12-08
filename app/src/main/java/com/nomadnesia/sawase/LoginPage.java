package com.nomadnesia.sawase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void ToastDaftar(View view) {
        showToast();
    }

    private void showToast() {
        Toast.makeText(this, "Daftar", Toast.LENGTH_SHORT).show();
    }

    public void LoginMasuk (View view){
        Intent newInt = new Intent(this, MainActivity.class);
        startActivity(newInt);
    }

}
