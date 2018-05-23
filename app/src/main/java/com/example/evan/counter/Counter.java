package com.example.evan.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {
    private int counter = 0;
    Button btn, resetBtn;
    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        btn = (Button) findViewById(R.id.count_button);
        number = (TextView) findViewById(R.id.numberCount);

        btn.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View view){
                counter++;
                number.setText(Integer.toString(counter));
            }
        });

    }
}
