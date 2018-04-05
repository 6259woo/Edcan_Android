package com.example.a6259woo.firstproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.test1);
        editText = (EditText) findViewById(R.id.test2);
        button = (Button) findViewById(R.id.button);
    }
    public void Click (View v){
        String text = editText.getText().toString();
        textView.setText(text);
    }
}
