package com.jmk.edu.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonInput=(Button)findViewById(R.id.buttonInput);
        buttonInput.setOnClickListener(this);
        Button getButton=(Button)findViewById(R.id.getButton);
        getButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonInput){
            Intent intent = null;
            intent = new Intent(this, InputActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.getButton){
            Intent intent = null;
            intent = new Intent(this, GetActivity.class);
            startActivity(intent);
        }
    }

}
