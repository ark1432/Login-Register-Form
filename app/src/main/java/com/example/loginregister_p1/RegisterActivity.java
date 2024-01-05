package com.example.loginregister_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button registers , loginbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registers=findViewById(R.id.registerRBTS);
        loginbt=findViewById(R.id.loginRBT);

        registers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "registation completed", Toast.LENGTH_SHORT).show();
            }
        });

        loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}