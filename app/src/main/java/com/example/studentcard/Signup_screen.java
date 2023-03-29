package com.example.studentcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup_screen extends AppCompatActivity implements View.OnClickListener {
    EditText Username,Password,Name,Email,Conf_password;
    Button Login,Signup;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        Name=(EditText) findViewById(R.id.name);
        Username=(EditText) findViewById(R.id.username);
        Email=(EditText) findViewById(R.id.email);
        Password=(EditText) findViewById(R.id.password);
        Conf_password=(EditText) findViewById(R.id.conf_password);
        Login=(Button) findViewById(R.id.Login);
        Signup=(Button) findViewById(R.id.Signup);
        Result=(TextView) findViewById(R.id.Result);

        Login.setOnClickListener(this);
        Signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Signup:
                if (TextUtils.isEmpty(Name.getText().toString())||TextUtils.isEmpty(Username.getText().toString())|| TextUtils.isEmpty(Email.getText().toString()) || TextUtils.isEmpty(Password.getText().toString())|| TextUtils.isEmpty(Conf_password.getText().toString())){
                    Result.setText("Please Fill All Feild");
                }
                else if(!Password.getText().toString().equals(Conf_password.getText().toString())){
                    Result.setText("Password and Confirm Password must be same");
                } else{
                    Intent intent = new Intent(Signup_screen.this, Login_screen.class);
                    startActivity(intent);
                }
                break;

            case R.id.Login:
                Intent intent = new Intent(Signup_screen.this, Login_screen.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}