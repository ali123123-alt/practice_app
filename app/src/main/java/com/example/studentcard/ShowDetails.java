package com.example.studentcard.records;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.studentcard.R;

public class ShowDetails extends AppCompatActivity {
    TextView text;
    String msg,history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        text = (TextView) findViewById(R.id.textView4);
        Intent intent=getIntent();
        msg=intent.getStringExtra("v1");
        history= String.valueOf(text.getText());
        text.setText(history+"\n"+msg);
    }
}