package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String oper = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButonClick(View v) {
        EditText ob1 = (EditText)findViewById(R.id.num1);
        EditText ob2 = (EditText)findViewById(R.id.num2);
        TextView tvresult = (TextView)findViewById(R.id.Result);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnMult = (Button) findViewById(R.id.btnMult);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        int num1 = Integer.parseInt(ob1.getText().toString());
        int num2 = Integer.parseInt(ob2.getText().toString());
        int res_Sum = 0;
        int result = 0;
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        } tvresult.setText(num1 + " " + oper + " " + num2 + " = " + result);




    }
}
