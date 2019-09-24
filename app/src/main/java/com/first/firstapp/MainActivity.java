package com.first.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText FirstNo, SecondNo;
    private Button btnAdd, btnSub;
    private TextView textview;
    int result, Fno, Sno,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstNo = findViewById(R.id.firsttxt);
        SecondNo = findViewById(R.id.secondtxt);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        textview  = findViewById(R.id.tview);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fno = Integer.parseInt(FirstNo.getText().toString());
                Sno = Integer.parseInt(SecondNo.getText().toString());
                result = Fno + Sno;

                Toast.makeText(MainActivity.this, "Sum is " + result, Toast.LENGTH_SHORT).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fno = Integer.parseInt(FirstNo.getText().toString());
                Sno = Integer.parseInt(SecondNo.getText().toString());
                r = Integer.parseInt(textview.getText().toString());

                r=Fno-Sno;
                textview.setText(String.valueOf(r));


            }
        });


    }
}
