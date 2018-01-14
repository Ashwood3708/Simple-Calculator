package com.example.abdul.simplecalculator;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt1;
    EditText txt2;
    EditText txtSum;
    Button btnADD2;
    Button btnSub;
    Button btnMultiply;
    Button btnDivide;

    double num1, num2, sum;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.txt1) ;
        txt2 = (EditText)findViewById(R.id.txt2) ;
        btnADD2 = (Button)findViewById(R.id.btnADD2);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        txtSum = (EditText)findViewById(R.id.txtSum);



        btnADD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(txt1.getText().toString());
                num2 = Double.parseDouble(txt2.getText().toString());
                sum = num1 + num2;
                txtSum.setText(Double.toString(sum));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(txt1.getText().toString());
                num2 = Double.parseDouble(txt2.getText().toString());
                sum = num1 - num2;
                txtSum.setText(Double.toString(sum));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(txt1.getText().toString());
                num2 = Double.parseDouble(txt2.getText().toString());
                sum = num1 * num2;
                txtSum.setText(Double.toString(sum));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(txt1.getText().toString());
                num2 = Double.parseDouble(txt2.getText().toString());
                sum = num1 / num2;
                txtSum.setText(Double.toString(sum));
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
