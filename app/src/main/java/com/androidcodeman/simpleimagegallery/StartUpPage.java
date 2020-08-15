package com.androidcodeman.simpleimagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartUpPage extends AppCompatActivity {

    private Button task1,task2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_up_page);

        task1 = findViewById(R.id.task1_id);
        task2 = findViewById(R.id.task2_id);

        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartUpPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartUpPage.this,SwitchTask.class);
                startActivity(intent);
            }
        });

    }
}