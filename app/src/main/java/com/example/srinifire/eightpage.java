package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class eightpage extends AppCompatActivity {
    private Button end;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightpage);
        end=(Button)findViewById(R.id.end1);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                close();
            }
        });
    }
    private void close()
    {
        finish();
        //moveTaskToBack(true);
    }

}
