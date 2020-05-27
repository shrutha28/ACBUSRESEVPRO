package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class seventhpage extends AppCompatActivity {
    private Button Proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhpage);
        Proceed=(Button)findViewById(R.id.pro);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value();
            }
        });
    }
    private void value()
    {
        Intent intent=new Intent(seventhpage.this,Secondpage.class);
        startActivity(intent);
    }

}

