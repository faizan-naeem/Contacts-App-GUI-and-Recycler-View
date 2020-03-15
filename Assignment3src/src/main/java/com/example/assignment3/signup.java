package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity implements View.OnClickListener{


    Button signup,back;
    TextView signin;
    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        back=findViewById(R.id.back);
        signup=findViewById(R.id.signup);
        signin=findViewById(R.id.signin);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        back.setOnClickListener(this);
        signup.setOnClickListener(this);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==signin.getId())
        {
            finish();
        }
        else if(v.getId()==back.getId())
        {
            finish();
        }
    }
}
