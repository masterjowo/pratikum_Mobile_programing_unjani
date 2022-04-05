package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle Step";
    //membuat farimble penampung  findViewById(R.id........)
    Button bt_google, bt_youtube, bt_telpon, bt_kirim;
    String etNim, etNama;
    EditText EditTextNims, EditTextNamas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"Activity onCreate");
        //koneksi object .java dg .xml
        bt_google = (Button) findViewById(R.id.btn_Imp1);
        bt_youtube = (Button) findViewById(R.id.btn_imp2);
        bt_telpon = (Button) findViewById(R.id.btn_imp3);
        bt_kirim = (Button) findViewById(R.id.btn_kirim);
        EditTextNims = (EditText) findViewById(R.id.etNim);
        EditTextNamas = (EditText) findViewById(R.id.etNama);
        //buat event untuk masing2 button
        bt_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);


            }
        });
        bt_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);


            }
        });
        bt_telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomer = "08122121";
                Intent panggil = new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel",nomer,null));
                startActivity(panggil);
            }
        });


        bt_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ExplicitActivity.class);
                intent.putExtra("data1",EditTextNims.getText().toString());
                intent.putExtra("data2",EditTextNamas.getText().toString());
                startActivity(intent);
            }
        });
    }
    public void onStart(){
        super.onStart();
        Log.d(tag,"Activity onStart");
    }
    public void onPause(){
        super.onPause();
        Log.d(tag,"Activity onPause");
    }
    public void onResume(){
        super.onResume();
        Log.d(tag,"Activity onResume");
    }
    public void onStop() {
        super.onStop();
        Log.d(tag, "Activity onStop");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Activity onDestroy");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "Activity onRestart");
    }
}