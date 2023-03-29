package com.example.studentcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class Login_screen extends AppCompatActivity implements View.OnClickListener {

    EditText Username,Password;
    Button Login,Signup;
    TextView Result;
    String username="admin",password="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Username=(EditText) findViewById(R.id.username);
        Password=(EditText) findViewById(R.id.password);
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
            case R.id.Login:
                if (TextUtils.isEmpty(Username.getText().toString()) || TextUtils.isEmpty(Password.getText().toString())){
                    Result.setText("Please Enter Username and password");
                }
                else if(!Username.getText().toString().equals(username)){
                    Result.setText("Please Enter Correct Username");
                }else if(!Password.getText().toString().equals(password)){
                    Result.setText("Please Enter Correct Password");
                }else{
                    Intent intent = new Intent(Login_screen.this, MainActivity.class);
                    startActivity(intent);
                }
                break;

            case R.id.Signup:
                Intent intent = new Intent(Login_screen.this, Signup_screen.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}