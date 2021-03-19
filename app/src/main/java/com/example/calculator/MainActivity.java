package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView input , result;
    ImageButton one,two,three,four,five,six,seven,eight,nine,zero;
    ImageButton clear,equal,add,minus,multiply,divide;
    Button clearall;
    String temp;
    int res;
    Boolean error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        input = (TextView) findViewById(R.id.input);

        one = (ImageButton) findViewById(R.id.btn1);
        two = (ImageButton) findViewById(R.id.btn2);
        three = (ImageButton) findViewById(R.id.btn3);
        four = (ImageButton) findViewById(R.id.btn4);
        five = (ImageButton) findViewById(R.id.btn5);
        six = (ImageButton) findViewById(R.id.btn6);
        seven = (ImageButton) findViewById(R.id.btn7);
        eight = (ImageButton) findViewById(R.id.btn8);
        nine = (ImageButton) findViewById(R.id.btn9);
        zero = (ImageButton) findViewById(R.id.btn0);
        clear = (ImageButton) findViewById(R.id.clearBtn);
        equal = (ImageButton) findViewById(R.id.equalBtn);
        add = (ImageButton) findViewById(R.id.addBtn);
        minus = (ImageButton) findViewById(R.id.minusBtn);
        multiply = (ImageButton) findViewById(R.id.multBtn);
        divide = (ImageButton) findViewById(R.id.divideBtn);
        clearall = (Button) findViewById(R.id.clearAll);
        error = false;



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()>=1) {
                    input.setText(input.getText().toString().substring(0, input.getText().toString().length() - 1));
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"0");
                result.setText(null);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"1");
                result.setText(null);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"2");
                result.setText(null);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"3");
                result.setText(null);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"4");
                result.setText(null);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"5");
                result.setText(null);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"6");
                result.setText(null);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"7");
                result.setText(null);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"8");
                result.setText(null);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"9");
                result.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    result.setText("Please input a number first");
                    input.setText(null);
                } else {
                    input.setText(input.getText().toString()+" + ");
                    result.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    result.setText("Please input a number first");
                    input.setText(null);
                } else {
                    input.setText(input.getText().toString()+" - ");
                    result.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    result.setText("Please input a number first");
                    input.setText(null);
                } else {
                    input.setText(input.getText().toString()+" * ");
                    result.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0) {
                    result.setText("Please input a number first");
                    input.setText(null);
                } else {
                    input.setText(input.getText().toString()+" / ");
                    result.setText(null);
                }
            }
        });

        clearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                input.setText(null);


            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sign;
                String finalInput = input.getText().toString();
                String[] split = finalInput.split(" ");
                List splitted = Arrays.asList(split);
                for (int i=0; i<(splitted.size())/2 ;i++) {
                    int val1 = Integer.parseInt(String.valueOf(splitted.get(0)));
                    int val2 = Integer.parseInt(String.valueOf(splitted.get(2)));
                    sign = String.valueOf(splitted.get(1));
                    Log.i("Sequence",String.valueOf(val2)+sign+String.valueOf(val2));
                    if(sign=="+") {
                        res = val1+val2;
                    }
                    else if (sign=="-") {
                        res = val1-val1;
                    }
                    else if (sign=="*") {
                        res = val1*val2;
                    }
                    else {
                        if (val2!=0) {
                            res = val1 / val2;
                        } else {
                            error = true;
                            break;
                        }
                    }
                    splitted.remove(0);
                    splitted.remove(1);
                    splitted.remove(2);
                    splitted.add(0,String.valueOf(res));
                }
                input.setText(null);
                if(error) {
                    result.setText("Math error");
                } else {
                    result.setText(String.valueOf(res));
                }



            }
        });
    }
}