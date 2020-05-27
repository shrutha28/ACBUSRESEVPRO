package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class thirdactivity extends AppCompatActivity {
    private TextView Info1,Route;
    private Button one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve;
    private Button Submit;
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        Info1 = (TextView) findViewById(R.id.textView9);
        Route=(TextView)findViewById(R.id.rno);
        Route.setText("Route :"+getIntent().getIntExtra("Routeno",2));
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        ten=(Button)findViewById(R.id.btn10);
        eleven=(Button)findViewById(R.id.btn11);
        twelve=(Button)findViewById(R.id.btn12);
        Back=(Button)findViewById(R.id.backbtn);
        Info1.setText("Pls select your seat");
        Submit=(Button)findViewById(R.id.button3);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val3();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val4();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val5();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val7();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val8();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val9();
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val10();
            }
        });
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val11();
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val12();
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val6();
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();
            }
        });


    }
    private void valid()
    {
        Intent intent = new Intent(thirdactivity.this, sixthpage.class);
        Intent intent1 = intent.putExtra("Routeno",2);
        Intent intent2=intent.putExtra("date",28/11/2019);
        startActivity(intent);
    }
    private void val() {
        one.setEnabled(false);
        Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });


    }
    private void val1()
    {

        two.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val2() {
        three.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });


    }
    private void val3() {
        four.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });


    }
    private void val4(){

        five.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val5(){
        six.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val7(){
        seven.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val8(){
        eight.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val9(){
        nine.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val10(){
        ten.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val11(){
        eleven.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val12(){
        twelve.setEnabled(false);  Info1.setText("You have selected a seat");
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valid();

            }
        });

    }
    private void val6()
    {
        Intent intent=new Intent(thirdactivity.this,Secondpage.class);
        startActivity(intent);
    }


}
