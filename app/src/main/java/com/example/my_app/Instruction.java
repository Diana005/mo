package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Instruction extends AppCompatActivity {
    private TextView instruction;
    private Button i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        instruction=findViewById(R.id.instruction);
        i=findViewById(R.id.i_button);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Instruction.this, MainActivity.class);
                startActivity(p);
            }



        });

    }
}