package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText user;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btnCall);
        user = (EditText) findViewById(R.id.username);
        output = (TextView) findViewById(R.id.output);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String teks;
                teks = "Welcome "+user.getText().toString()+"!";
                output.setText(teks);
            }
        });
    }
}