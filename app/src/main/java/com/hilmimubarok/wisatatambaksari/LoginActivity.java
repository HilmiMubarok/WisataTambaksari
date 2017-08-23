package com.hilmimubarok.wisatatambaksari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtuser, edtpass;
    String txtuser, txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void LoginMasuk(View view) {
        edtuser = (EditText)findViewById(R.id.edt_username);
        edtpass = (EditText)findViewById(R.id.edt_password);
        txtuser = edtuser.getText().toString();
        txtpass = edtpass.getText().toString();

        if ( (txtuser.contains("hilmi")) && ((txtpass.contains("hilmi"))) ){
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_LONG).show();

            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
            finish();

        } else if ( (txtuser.matches("")|| txtpass.matches("") ) ) {
            Toast.makeText(this, "Username dan Password Harus Di isi", Toast.LENGTH_SHORT).show();
        }  else {
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }



    }



}

