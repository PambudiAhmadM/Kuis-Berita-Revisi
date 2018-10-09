package com.example.asus.projectberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Berita.class);
        startActivity(intent);
    }

    public void sendMessage1(View view) {
        Intent intent = new Intent(this, Berita1.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(this, Berita2.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, Berita3.class);
        startActivity(intent);
    }
}
