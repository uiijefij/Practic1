package com.example.izmai.p23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvout;
    Button ok,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvout= (TextView) findViewById(R.id.out);
        ok = (Button) findViewById(R.id.ok);
        cancel = (Button) findViewById(R.id.can);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvout.setText("OK");
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvout.setText("cancel");
            }
        });

    }
}
