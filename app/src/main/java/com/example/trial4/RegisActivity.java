package com.example.trial4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisActivity extends AppCompatActivity {

    EditText email, password, password_confirm;
    Button regisbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        password_confirm = (EditText) findViewById(R.id.pass_confirm);

        regisbtn = (Button) findViewById(R.id.regisbtn);

    }
}