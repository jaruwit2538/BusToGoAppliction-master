package com.example.user.bustogoappliction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Road extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road);
    }
    public void button4 (View view) {
        Intent intent = new Intent(Road.this,Mainmenu.class);
        startActivity(intent);
    }
    public void imageView4 (View view) {
        Intent intent = new Intent(Road.this,GiantSwing.class);
        startActivity(intent);
    }

}
