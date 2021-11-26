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

public class LoginActivity extends AppCompatActivity {

    private EditText etemail, etpassword;
    private Button loginbtn;
    private TextView tvsignin, tvforgetpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etemail = (EditText) findViewById(R.id.email);
        etpassword = (EditText) findViewById(R.id.pass);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        tvsignin = (TextView) findViewById(R.id.signin);
        tvforgetpassword = (TextView) findViewById(R.id.forgetpass);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        tvforgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LoginActivity.this, RegisActivity.class);
                startActivity(pindah);
            }
        });



        //admin and admin
        //loginbtn.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View view) {
                //if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                   // Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
             //   }else
                    //incorrect
             //       Toast.makeText(LoginActivity.this, "LOGIN FAILED", Toast.LENGTH_LONG).show();
         //   }
        //});
    }
}