package com.example.izmai.p22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text");

        Button myButton = (Button) findViewById(R.id.button);
        myButton.setText("my byton");
        myButton.setEnabled(false);

        CheckBox mycb = (CheckBox) findViewById(R.id.checkBox);
        mycb.setChecked(true);
    }
}
