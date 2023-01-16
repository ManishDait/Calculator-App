package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private Button clear, one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, modulo, point, neg, bracket, result;
    private ImageView delect;
    private EditText input;
    private TextView output;
    private Boolean eval = false, isPoint= false, brackOpen = false;
    private int openCount = 0;
    private String expression = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                expression = "";
                output.setText("");
                eval = false;
                brackOpen = false;
                isPoint = false;
                openCount = 0;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("1","1");
                if(eval)
                    calculate();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("2","2");
                if(eval)
                    calculate();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("3","3");
                if(eval)
                    calculate();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("4","4");
                if(eval)
                    calculate();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("5","5");
                if(eval)
                    calculate();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("6","6");
                if(eval)
                    calculate();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("7","7");
                if(eval)
                    calculate();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("8","8");
                if(eval)
                    calculate();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("9","9");
                if(eval)
                    calculate();
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("0","0");
                if(eval)
                    calculate();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = input.getText().toString();
                if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                    return;

                }
                isPoint = false;
                onPressDisplay("+","+");
                eval = true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = input.getText().toString();
                if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                    return;

                }
                isPoint = false;
                onPressDisplay("-", "-");
                eval = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = input.getText().toString();
                if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                    return;

                }
                isPoint = false;
                onPressDisplay("×", "*");
                eval = true;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = input.getText().toString();
                if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                    return;

                }
                isPoint = false;
                onPressDisplay("÷", "/");
                eval = true;
            }
        });

        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid format used", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = input.getText().toString();
                if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                    return;

                }
                isPoint = false;
                onPressDisplay("%", "%");
                eval = true;
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPoint){
                    onPressDisplay(".", ".");
                    isPoint = true;
                }
                if(eval)
                    calculate();
            }
        });

        bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = input.getText().toString();
                if(!brackOpen && openCount == 0){
                    eval = true;
                    if(text.isEmpty()){
                        brackOpen = true;
                        openCount++;
                        input.setText(text+"(");
                        expression = expression+"(";
                        if(eval)
                            calculate();
                    }
                    else if(String.valueOf(text.charAt(text.length()-1)).matches("[0-9]")){
                        brackOpen = true;
                        openCount++;
                        input.setText(text+"×(");
                        expression = expression+"*(";
                        if(eval)
                            calculate();
                    }
                    else if(text.charAt(text.length()-1)=='.'){
                        return;
                    }

                    else if(text.charAt(text.length()-1)==')'){

                        brackOpen = true;
                        openCount++;
                        input.setText(text+"×(");
                        expression = expression+"*(";
                        if(eval)
                            calculate();
                    }
                    else{
                        brackOpen = true;
                        openCount++;
                        input.setText(text+"(");
                        expression = expression+"(";
                        if(eval)
                            calculate();
                    }
                    return;
                }

                if(brackOpen && openCount!=0){
                    if(String.valueOf(text.charAt(text.length()-1)).matches("[0-9]")){
                        brackOpen = true;
                        openCount++;
                        input.setText(text+"×(");
                        expression = expression+"*(";
                        if(eval)
                            calculate();
                    }
                    else if(text.charAt(text.length()-1)=='.'){
                        return;
                    }

                    else if(text.charAt(text.length()-1)==')'){

                        brackOpen = true;
                        openCount++;
                        input.setText(text+"×(");
                        expression = expression+"*(";
                        if(eval)
                            calculate();
                    }
                    else{
                        brackOpen = true;
                        openCount++;
                        input.setText(text+"(");
                        expression = expression+"(";
                        if(eval)
                            calculate();
                    }
                    return;
                }

                if(!brackOpen && openCount!=0){
                    if(String.valueOf(text.charAt(text.length()-1)).matches("[0-9]")){
                        openCount--;
                        input.setText(text+")");
                        expression = expression+")";
                        if(eval)
                            calculate();
                    }
                    else if(text.charAt(text.length()-1)=='.'){
                        return;
                    }
                    else{
                        openCount--;
                        input.setText(text+")");
                        expression = expression+")";
                        if(eval)
                            calculate();
                    }
                    return;
                }
            }
        });



        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = output.getText().toString();
                input.setText(res);
                output.setText("");
                expression = res;
                eval = false;
            }
        });


        delect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String curr = input.getText().toString();
                if(!curr.isEmpty()){
                    curr = curr.substring(0,curr.length()-1);
                    input.setText(curr);
                    expression = expression.substring(0,expression.length()-1);
                    if (eval) {
                        String text = input.getText().toString();

                        if(curr.isEmpty()){
                            output.setText("");
                            return;
                        }
                        if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷') {
                            output.setText("");
                            return;

                        }
                        calculate();
                    }
                }


            }
        });

        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brackOpen = false;
                onPressDisplay("00","00");
                if(eval)
                    calculate();
            }
        });


    }

    private void setUI(){
        clear = findViewById(R.id.clear);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);
        modulo = findViewById(R.id.percentage);
        point = findViewById(R.id.decimal);
        bracket = findViewById(R.id.brackets);
        neg = findViewById(R.id.dzero);
        result = findViewById(R.id.result);
        delect = findViewById(R.id.delect);
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
    }

    private void onPressDisplay(String value, String exp){
        String text = input.getText().toString();
        if(value.equals(".")){

            if(text.isEmpty()){
                input.setText(text+"0.");
                expression = expression+"0.";
            }
            else if (text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'|| text.charAt(text.length()-1) == '%'||text.charAt(text.length()-1) == '×'||text.charAt(text.length()-1) == '÷'){
                input.setText(text+"0.");
                expression = expression+"0.";
            }
            else{
                input.setText(text+".");
                expression = expression+exp;
            }
            return;
        }

        if(value.matches("[0-9]")){
            if(text.isEmpty()){
                input.setText(text+value);
                expression = exp;
            }
            else if(text.charAt(text.length()-1)==')'){
                input.setText(text+"×"+value);
                expression = expression+"*"+exp;
            }
            else{
                input.setText(text+value);
                expression = expression+exp;
            }
            return;
        }



        input.setText(text+value);
        expression = expression+exp;

    }



    public void calculate(){
        String exp = expression.toString();
        DoubleEvaluator eval = new DoubleEvaluator();
        try{
            double result = eval.evaluate(exp);

            output.setText(String.valueOf(result));
        }
        catch (Exception e){
            return;
        }
    }
}