package com.example.khyati_n01421204_android1_calcui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
Created By Khyati Dhiver
 */
public class MainActivity extends AppCompatActivity {

    MyCalculator myCalculator = new MyCalculator();

    private TextView cal;
    private TextView result;
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_dot;
    private Button btn_EQUAL;
    private Button btn_MULT;
    private Button btn_MINUS;
    private Button btn_PLUS;
    private Button btn_MOD;
    private Button btn_DIV;
    private Button btn_C;
    private Button btn_CE;
    private Button btn_MPlus;
    private Button btn_Mminus;
    private Button btn_MR;
    private Button btn_MC;
    private Button btn_EXP;
    private Button btn_PI;
    boolean operator = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = (TextView) findViewById(R.id.cal);
        result = (TextView) findViewById(R.id.result);
        Button btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("0");
                operator = true;
                myCalculator.update("0",operator);
            }
        });
        Button btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("1");
                operator = true;
                myCalculator.update("1",operator);
            }
        });
        Button btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("2");
                operator = true;
                myCalculator.update("2",operator);
            }
        });
        Button btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("3");
                operator = true;
                myCalculator.update("3",operator);
            }
        });
        Button btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("4");
                operator = true;
                myCalculator.update("4",operator);
            }
        });
        Button btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("5");
                operator = true;
                myCalculator.update("5",operator);
            }
        });
        Button btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("6");
                operator = true;
                myCalculator.update("6",operator);
            }
        });
        Button btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("7");
                operator = true;
                myCalculator.update("7",operator);
            }
        });
        Button btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("8");
                operator = true;
                myCalculator.update("8",operator);
            }
        });
        Button btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("9");
                operator = true;
                myCalculator.update("9",operator);
            }
        });
        Button btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append(".");
                operator = true;
                myCalculator.update(".",operator);
            }
        });
        Button btn_DIV = (Button) findViewById(R.id.btn_DIV);
        btn_DIV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("/");
                operator = false;
                myCalculator.update("/",operator);
            }
        });
        Button btn_MULT = (Button) findViewById(R.id.btn_MULT);
        btn_MULT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("*");
                operator = false;
                myCalculator.update("*",operator);
            }
        });
        Button btn_MOD = (Button) findViewById(R.id.btn_MOD);
        btn_MOD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("%");
                operator = false;
                myCalculator.update("%",operator);
            }
        });
        Button btn_PLUS = (Button) findViewById(R.id.btn_PLUS);
        btn_PLUS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("+");
                operator = false;
                myCalculator.update("+",operator);
            }
        });
        Button btn_MINUS = (Button) findViewById(R.id.btn_MINUS);
        btn_MINUS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("-");
                operator = false;
                myCalculator.update("-",operator);
            }
        });
        Button btn_MPlus = (Button) findViewById(R.id.btn_Mplus);
        btn_MPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myCalculator.memoryAdd(cal.getText().toString());
                cal.setText("");
                result.setText("");

            }
        });
        Button btn_Mminus = (Button) findViewById(R.id.btn_Mminus);
        btn_Mminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myCalculator.memorySub(cal.getText().toString());
                cal.setText("");
                result.setText("");

            }
        });
        Button btn_MR = (Button) findViewById(R.id.btn_MR);
        btn_MR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setText("");
                result.setText(myCalculator.memoryRecall()+"");
            }
        });
        Button btn_MC = (Button) findViewById(R.id.btn_MC);
        btn_MC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setText("");
                result.setText("");
                myCalculator.memoryClear();
            }
        });
        Button btn_C = (Button) findViewById(R.id.btn_C);
        btn_C.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setText("");
                result.setText("");
                myCalculator.reset();
            }
        });
        Button btn_CE = (Button) findViewById(R.id.btn_CE);
        btn_CE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setText("");
                result.setText("");
                myCalculator.reset();
            }
        });
        Button btn_EQUAL = (Button) findViewById(R.id.btn_EQUAL);
        btn_EQUAL.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 float Result = myCalculator.calculate();
                 result.setText("=" + Result);

             }
         });
        Button btn_PI = (Button) findViewById(R.id.btn_PI);
        btn_PI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("pi");
                operator = false;
                myCalculator.update("pi",operator);
            }
        });
        Button btn_EXP = (Button) findViewById(R.id.btn_EXP);
        btn_EXP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.append("exp");
                operator = false;
                myCalculator.update("exp",operator);
            }
        });
    }
}