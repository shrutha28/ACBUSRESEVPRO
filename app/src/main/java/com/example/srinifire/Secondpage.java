package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secondpage extends AppCompatActivity {
    private EditText Busno;
    private Button Proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        Busno=(EditText)findViewById(R.id.editText3);
        Proceed=(Button)findViewById(R.id.button2);
        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1(Busno.getText().toString());
            }
        });
    }
    private void val1(String no)
    {
        if(no.equals("2")||no.equals("14"))
        {
            Intent intent,intent1;
            intent=new Intent(Secondpage.this,thirdactivity.class);

            intent.putExtra("Routeno",no);
            startActivity(intent);

        }
        else if(no.equals("27")||no.equals("29"))
        {
            Intent intent,intent1;
            intent= new Intent(Secondpage.this,fourthpage.class);
            intent.putExtra("Routeno",no);
            startActivity(intent);


        }
        else
        {
            System.out.println("Enter valid no");
        }

    }
}

