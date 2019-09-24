package com.first.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdd, btnSub, btnCtof;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnCtof=findViewById(R.id.btnctof);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnCtof.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== (R.id.btnAdd)){

            Intent intent =new Intent(DashBoardActivity.this,MainActivity.class);
            startActivity(intent);

            if(v.getId()==(R.id.btnSub)){

                Intent ints =new Intent(DashBoardActivity.this,MainActivity.class);
                startActivity(ints);

                if(v.getId()==(R.id.btnctof)){

                    Intent intis =new Intent(DashBoardActivity.this,MainActivity.class);
                    startActivity(intis);

                }

            }
        }
    }
}
