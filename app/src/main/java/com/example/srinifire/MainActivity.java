
        package com.example.srinifire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




        public class MainActivity extends AppCompatActivity {

            private EditText StudentName;
            private EditText Password;
            private TextView Info;
            private TextView Inf;
            private Button Login;
            private int counter = 5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StudentName = (EditText) findViewById(R.id.EditText);
        Password = (EditText) findViewById(R.id.etpassword);
        Info = (TextView) findViewById(R.id.tvinfo);
        Inf = (TextView) findViewById(R.id.textView11);
        Login = (Button) findViewById(R.id.btnlogin);
        Info.setText("No of attempts remaining = 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(StudentName.getText().toString(), Password.getText().toString());
            }

        });
    }




    private void validate (String StudentName, String Password){

        if (((StudentName.equals("Surajram")) && (Password.equals("1234"))) || ((StudentName.equals("Swatika")) && (Password.equals("1000"))) || (StudentName.equals("Shruthakeerthy") && Password.equals("2345"))) {
            Intent intent = new Intent(MainActivity.this, seventhpage.class);
            startActivity(intent);
        } else {
            counter--;
            Inf.setText("Inavlid Userid/Password, Pls Verify!!!");
            Info.setText("No of attempts remaining =" + String.valueOf(counter));
            if (counter == 0) {
                Info.setText("Sorry!!Pls try again later");
                Login.setEnabled(false);

            }
        }

    }
}


