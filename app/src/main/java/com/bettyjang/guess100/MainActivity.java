package com.bettyjang.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private EditText edNumber;
    private View edInfo;
    private View edSecret;

    int ran = new  Random().nextInt(100)+1;
    int max = 100;
    int min = 1;

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
        TextView rand = (TextView) findViewById(R.id.secret);
        rand.setText(Integer.toString(ran));
    }
    public void Guess100 (View view){
       /* int ran = new Random().nextInt(100)+1;
        int max = 100;
        int min = 1;*/

        EditText edNumber = (EditText) findViewById(R.id.number);
        int number = Integer.parseInt(edNumber.getText().toString());
        if (number < ran){
            new AlertDialog.Builder(this).setMessage(number+"to"+max).show();
        }else if (number > ran){
            new AlertDialog.Builder(this).setMessage(min+"to"+number).show();
        }else {
            new AlertDialog.Builder(this).setMessage("恭喜答對").show();

        }
    }
}
