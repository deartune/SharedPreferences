package com.jmk.edu.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        TextView textView1=(TextView)findViewById(R.id.textView1);
        TextView textView2=(TextView)findViewById(R.id.textView2);
        TextView textView3=(TextView)findViewById(R.id.textView3);
        SharedPreferences sharedPreferences=getSharedPreferences("inputfile", Context.MODE_PRIVATE);
        String nameKey=sharedPreferences.getString("nameKey",null);
        String emailKey=sharedPreferences.getString("emailKey",null);
        String countryKey=sharedPreferences.getString("countryKey",null);
        textView1.setText(nameKey);
        textView2.setText(emailKey);
        textView3.setText(countryKey);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            Intent intent = null;
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
