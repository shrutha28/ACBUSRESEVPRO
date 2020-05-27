package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sixthpage extends AppCompatActivity {
    private EditText Name;
    private EditText RegistrationNumber;
    private TextView inform;
    private EditText Routeno,Btime;
    private Button move;
    private EditText datee;
    private EditText seat;
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference myRef=db.getReference("booking details");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthpage);
        Name=(EditText)findViewById(R.id.et1);
        RegistrationNumber=(EditText)findViewById(R.id.et2);
        inform=(TextView)findViewById(R.id.inform);
        Routeno=(EditText)findViewById(R.id.et3);
        Btime=(EditText)findViewById(R.id.btime1);
        move=(Button)findViewById(R.id.mov);
        datee=(EditText)findViewById(R.id.editText);
        seat=(EditText)findViewById(R.id.editText5);
        Routeno.setText("No:" +getIntent().getIntExtra("Routeno",2));
        //datee.setText("date:"+getIntent().getIntExtra( "date" ,28/11/2019));
        //Name.setText("Surajram");
        //RegistrationNumber.setText("180501154");
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                moving();
                stud();
            }
        });
        inform.setText("To have a copy of your ticket pls take a screenshot");



    }
    private void moving()
    {
        String name=Name.getText().toString();
        String route=Routeno.getText().toString();
        String date=datee.getText().toString();
        String reg=RegistrationNumber.getText().toString();
        String see=seat.getText().toString();
        String id=myRef.push().getKey();
        if(!TextUtils.isEmpty(name)&& !TextUtils.isEmpty(route)&&!TextUtils.isEmpty(date)&&!TextUtils.isEmpty(reg))
        {

            SSS student=new SSS(id,name,reg,route,date,see);

            myRef.child(id).setValue(student);
            // Name.setText( "");
            //Password.setText("");
            Toast.makeText(sixthpage.this,"Firebase content successful",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(sixthpage.this,"Please  go back and add the details",Toast.LENGTH_LONG).show();
        }

        //Intent intent=new Intent(sixthpage.this,eightpage.class);
       //startActivity(intent);
    }
    void stud()
    {
        Intent intent=new Intent(sixthpage.this,eightpage.class);
         startActivity(intent);
    }


}


