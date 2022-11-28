package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int count=0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b01 = findViewById(R.id.button);
        //b01.setOnClickListener(this);
    }

    //@Override
    public void onClick(View view){
        /*EditText x = (EditText) findViewById(R.id.log_user);
        EditText y = (EditText) findViewById(R.id.log_pw);
        String usrStr = x.getText().toString();
        String pwStr = y.getText().toString();

        switch(view.getId())
        {
            case R.id.button:
                Toast t= Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT);
                t.show();
                break;
        }*/
    }
}