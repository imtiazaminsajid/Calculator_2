package com.example.imtiazaminsajid.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button back;
    Button clear;
    Button plus;
    Button minus;
    Button b7;
    Button b8;
    Button b9;
    Button multi;
    Button b4;
    Button b5;
    Button b6;
    Button div;
    Button b1;
    Button b2;
    Button b3;
    Button equal;
    Button dot;
    Button b0;
    Button plus_equal;
    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        multi = findViewById(R.id.multi);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        div = findViewById(R.id.div);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        b0 = findViewById(R.id.b0);
        plus_equal = findViewById(R.id.plus_equal);
        close = findViewById(R.id.close);
    }
}
