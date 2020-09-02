package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.tv);
        if (savedInstanceState!=null&&savedInstanceState.containsKey("key"))
        {
            count=savedInstanceState.getInt("key");
            text.setText(String.valueOf(count));
        }
    }

    public void toast(View view) {
        Toast.makeText(this, "Welcome to Toast App", Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {
        count++;
        text.setText(String.valueOf(count));
        Toast.makeText(this, "count is "+String.valueOf(count), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("key",count);
    }
}


