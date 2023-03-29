package com.example.studentcard.records;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.studentcard.Login_screen;import com.example.studentcard.MainActivity;
import com.example.studentcard.MainActivity2;
import com.example.studentcard.R;

public class Static_record extends AppCompatActivity {

    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_record);
        next = findViewById(R.id.imageButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_screen.Static_record.this, Login_screen.NewActivity.class);
                startActivity(intent);
            }
        });
    }
}