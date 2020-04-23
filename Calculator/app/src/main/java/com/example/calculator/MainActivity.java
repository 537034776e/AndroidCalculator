package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btZero, btOne, btTwo, btThree, btFour, btFive, btSix,
            btSeven, btEight, btNine, btAdd, btSub, btDivide,
            btReset, btCancel, btEqual, btMultiply, btPoint;
    EditText etExpression;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btZero = (Button) findViewById(R.id.btZero);
        btOne = (Button) findViewById(R.id.btOne);
        btTwo = (Button) findViewById(R.id.btTwo);
        btThree = (Button) findViewById(R.id.btThree);
        btFour = (Button) findViewById(R.id.btFour);
        btFive = (Button) findViewById(R.id.btFive);
        btSix = (Button) findViewById(R.id.btSix);
        btSeven = (Button) findViewById(R.id.btSeven);
        btEight = (Button) findViewById(R.id.btEight);
        btNine = (Button) findViewById(R.id.btNine);
        btAdd = (Button) findViewById(R.id.btAdd);
        btSub = (Button) findViewById(R.id.btSub);
        btDivide = (Button) findViewById(R.id.btDivide);
        btReset = (Button) findViewById(R.id.btReset);
        btCancel = (Button) findViewById(R.id.btCancel);
        btEqual = (Button) findViewById(R.id.btEqual);
        btMultiply = (Button) findViewById(R.id.btMultiply);
        btPoint = (Button) findViewById(R.id.btPoint);
        etExpression = (EditText) findViewById(R.id.etExpression);


        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "1");
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "2");
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "5");
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "6");
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "7");
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "8");
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "9");
            }
        });

        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + "0");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etExpression == null) {
                    etExpression.setText("");
                } else {
                    mValueOne = Float.parseFloat(etExpression.getText() + "");
                    mAddition = true;
                    etExpression.setText(etExpression.getText() + "+");
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(etExpression.getText() + "");
                mSubtract = true;
                etExpression.setText(etExpression.getText() + "-");
            }
        });

        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(etExpression.getText() + "");
                mMultiplication = true;
                etExpression.setText(etExpression.getText() + "*");
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(etExpression.getText() + "");
                mDivision = true;
                etExpression.setText(etExpression.getText() + "/");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(etExpression.getText() + "");

                if (mAddition == true) {
                    etExpression.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    etExpression.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    etExpression.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    etExpression.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText("");
            }
        });

        btPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etExpression.setText(etExpression.getText() + ".");
            }
        });


        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=etExpression.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    etExpression.setText(str);
                }
                else if (str.length() <=1 ) {
                    etExpression.setText("0");
                }
            }
        });
    }
}
