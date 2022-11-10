package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private int counter=0;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("АААА", "OnCreate");
        btn=findViewById(R.id.button);
        tv = findViewById(R.id.textView2);
        btn.setOnClickListener(view -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter=savedInstanceState.getInt("value");
        tv.setText(Integer.toString(counter));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("АААА", "OnStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("АААА", "OnStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("АААА", "OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("АААА", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("АААА", "OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("АААА", "OnRestart");
    }
}