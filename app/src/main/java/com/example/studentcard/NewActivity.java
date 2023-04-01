package com.example.studentcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {
    Button next;
    EditText text;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        next = findViewById(R.id.button4);
        text=(EditText) findViewById(R.id.editTextTextMultiLine2) ;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg=text.getText().toString();
                Intent intent = new Intent(NewActivity.this, ShowDetails.class);
                intent.putExtra("v1",msg);
                startActivity(intent);
            }
        });
    }
}