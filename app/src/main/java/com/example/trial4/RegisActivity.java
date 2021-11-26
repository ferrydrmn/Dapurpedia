package com.example.trial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisActivity extends AppCompatActivity {

    EditText etusername, etemail, etpassword, etpassword_confirm, etprofile_picture;
    TextView tvhaveacc;
    Button regisbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        etusername =(EditText) findViewById(R.id.username);
        etemail = (EditText) findViewById(R.id.email);
        etpassword = (EditText) findViewById(R.id.pass);
        etpassword_confirm = (EditText) findViewById(R.id.pass_confirm);
        etprofile_picture = (EditText) findViewById(R.id.profile_picture);
        tvhaveacc = (TextView) findViewById(R.id.haveaccount);
        regisbtn = (Button) findViewById(R.id.regisbtn);

        regisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
        tvhaveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });

    }
}