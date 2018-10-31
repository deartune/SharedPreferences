package com.jmk.edu.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editTextName=(EditText)findViewById(R.id.editTextName);
        String name=editTextName.getText().toString();
        EditText editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        String email=editTextEmail.getText().toString();
        EditText editTextCountry=(EditText)findViewById(R.id.editTextCountry);
        String country=editTextCountry.getText().toString();
        if(v.getId()==R.id.button){
            /*Bundle bundle=new Bundle();
            bundle.putString("message",message);
            Intent intent=new Intent(this, MainActivity.class);
            intent.putExtras(bundle);
            startActivityForResult(intent,Activity.RESULT_FIRST_USER);*/

                SharedPreferences.Editor editor=getSharedPreferences("inputfile", Context.MODE_PRIVATE).edit();
                editor.putString("nameKey",name);
                editor.putString("emailKey",email);
                editor.putString("countryKey",country);
                editor.commit();
            Intent intent = null;
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
    }

