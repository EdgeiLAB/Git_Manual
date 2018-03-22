package com.edgeilab.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "Hello World!!!!!");
        Log.d("test", "Git Manual");
        Log.d("test", "It's Master Branch");
        Log.d("test", "It's Hotfix Branch");
        Log.d("test", "Hello Local repository!!!!");
    }
}

