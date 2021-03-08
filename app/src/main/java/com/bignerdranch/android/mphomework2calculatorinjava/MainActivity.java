package com.bignerdranch.android.mphomework2calculatorinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button decimal;
    private Button clear;
    private Button square;
    private Button cube;
    private Button root;
    private Button enter;
    private Button divide;
    private Button multiply;
    private Button add;
    private Button subtract;
    private TextView control;
    private TextView result;

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = '=';
    private final char SQUARE = '2';
    private final char CUBE = '3';
    private final char ROOT = '√';

    private double val1 = Double.NaN;
    private double val2 = Double.NaN;

    private char ACTION;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                control.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                control.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                control.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                control.setText(null);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUAL;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                control.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(control.getText().length() > 0)
                {
                    CharSequence name = control.getText().toString();
                    control.setText(name.subSequence(0, name.length()-1));
                }
                else
                {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    control.setText(null);
                    result.setText(null);
                }
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + ".");
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SQUARE;
                result.setText(String.valueOf(val1) + " squared");
                control.setText(null);
            }
        });
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = CUBE;
                result.setText(String.valueOf(val1) + " cubed");
                control.setText(null);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ROOT;
                result.setText(String.valueOf(val1) + "√");
                control.setText(null);
            }
        });



    }

    private void setupUI()
    {
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        decimal = (Button)findViewById(R.id.btnDec);
        clear = (Button)findViewById(R.id.btnClr);
        square = (Button)findViewById(R.id.btnSquare);
        cube = (Button)findViewById(R.id.btnCube);
        root = (Button)findViewById(R.id.btnRoot);
        enter = (Button)findViewById(R.id.btnEnter);
        divide = (Button)findViewById(R.id.btnDiv);
        multiply = (Button)findViewById(R.id.btnMul);
        add = (Button)findViewById(R.id.btnAdd);
        subtract= (Button)findViewById(R.id.btnSub);
        control = (TextView)findViewById(R.id.textControl);
        result = (TextView)findViewById(R.id.textResult);
        enter = (Button)findViewById(R.id.btnEnter);
        clear = (Button)findViewById(R.id.btnClr);
        decimal = (Button)findViewById(R.id.btnDec);
        square = (Button)findViewById(R.id.btnSquare);
        cube = (Button)findViewById(R.id.btnCube);
        root = (Button)findViewById(R.id.btnRoot);

    }
    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(control.getText().toString());
            switch(ACTION)
            {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1/val2;
                    break;

                case EQUAL:
                    break;
            }

        }
        else
        {
            val1 = Double.parseDouble(control.getText().toString());
            if(ACTION == SQUARE || ACTION == ROOT || ACTION == CUBE||ACTION == EQUAL)
            {
                switch (ACTION)
                {
                    case SQUARE:
                        val1 = val1 * val1;
                        break;
                    case CUBE:
                        val1 = val1 * val1 * val1;
                        break;
                    case ROOT:
                        val1 = Math.sqrt(val1);
                        break;
                    case EQUAL:
                        break;
                }
                }
            }
        }
    }