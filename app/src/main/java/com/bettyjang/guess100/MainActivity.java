package com.bettyjang.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText edNumber;
    private View edInfo;
    private View edSecret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edSecret = findViewById(R.id.secret);
        edInfo = findViewById(R.id.info);
        edNumber = (EditText) findViewById(R.id.number);
        Button send = (Button) findViewById(R.id.send);
    }
}
