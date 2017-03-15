package com.project.senior.jack.lightpack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connect(View view){
        Intent intent = new Intent(this, ConnectActivity.class);
        startActivity(intent);
    }

    public void destination(View view){
        Intent intent = new Intent(this, DestinationActivity.class);
        startActivity(intent);
    }
}
