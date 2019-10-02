package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Can you see me?",Toast.LENGTH_SHORT).show();

        Log.i("info", "Done creating the app");
    }
    public void helloWorld(View v){
        Toast.makeText(this, "Hello World!",
                Toast.LENGTH_SHORT).show();
        Log.i("info","Hello");
    }
    public void welcomeFPT(View v){
        Toast.makeText(this, "Welcome to FPT education system!",
                Toast.LENGTH_SHORT).show();
        Log.i("info","Welcome :D");
    }
}
