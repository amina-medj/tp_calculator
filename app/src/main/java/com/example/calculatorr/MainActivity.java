package com.example.calculatorr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    TextView input, signBox;

    String sign, specialFunction;
    String value1, value2;
    Double num1, num2, result;
    boolean hasDot, isSpecialFunctionOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        signBox = (TextView) findViewById(R.id.sign);

        hasDot = false;
        isSpecialFunctionOn = false;
    }

    @SuppressLint("SetTextI18n")
    public void btn_0(View view) {
        input.setText(input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btn_1(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btn_2(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btn_3(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btn_4(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btn_5(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btn_6(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btn_7(View view) {
        input.setText(input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btn_8(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btn_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btn_point(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {
                input.setText("0.");
            } else {
                input.setText(input.getText() + ".");
            }
            hasDot = true;
        }
    }

    public void btn_dlt(View view) {

        if (input.getText().equals("")) {
            input.setText(null);

        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }

    }

    public void btn_clear(View view) {
        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value1 = null;
        hasDot = false;
    }

    public void btn_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("+");
    }

    public void btn_sub(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("-");
    }

    public void btn_mult(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("×");
    }

    public void btn_div(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("÷");
    }

    public void btn_sin(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "sin";
        input.setText(null);
        hasDot = false;
        signBox.setText("sin");
    }

    public void btn_cos(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "cos";
        input.setText(null);
        hasDot = false;
        signBox.setText("cos");
    }

    public void btn_tan(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "tan";
        input.setText(null);
        hasDot = false;
        signBox.setText("tan");
    }

    public void btn_racine(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "root";
        input.setText(null);
        hasDot = false;
        signBox.setText("√");
    }

    public void btn_log(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "log";
        input.setText(null);
        hasDot = false;
        signBox.setText("log");
    }

    public void btn_ln(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "ln";
        input.setText(null);
        hasDot = false;
        signBox.setText("ln");
    }

    public void btn_pow(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "power";
        value1 = input.getText().toString();
        input.setText(null);
        hasDot = false;
        signBox.setText("xⁿ");
    }

    public void btn_fact(View view) {
        isSpecialFunctionOn = true;
        specialFunction = "factorial";
        input.setText(null);
        hasDot = false;
        signBox.setText("!");
    }

    public void btn_equal(View view) {
        if ((specialFunction == null && sign == null) || (input.getText().equals(""))) {
            signBox.setText("Error");
        } else if (specialFunction != null) {

            switch (specialFunction) {
                default:
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    specialFunction = null;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.log10(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.log(num1) + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);

                    input.setText(Math.pow(num1, num2) + "");

                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1 ;

                    while(i>0){
                        num1 = num1*i;
                        i--;
                    }

                    input.setText(num1 + "");
                    specialFunction = null;
                    isSpecialFunctionOn = false;
                    signBox.setText(null);
                    break;
            }
        } else if (sign != null) {
            value2 = input.getText().toString();

            num1 = Double.parseDouble(value1);
            num2 = Double.parseDouble(value2);
            input.setText(null);

            switch (sign) {
                default:
                    break;
                case "+":
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "-":
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "*":
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "/":
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
            }
        } else signBox.setText("Error");
    }


}

