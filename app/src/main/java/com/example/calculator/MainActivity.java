package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private double first,second;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_input);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                if(textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else if(isOperationClick) {
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                isOperationClick=false;
                break;
            case R.id.btn_two:
                if(textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else if(isOperationClick) {
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                isOperationClick=false;
                break;
            case R.id.btn_three:
                if(textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else if(isOperationClick) {
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                isOperationClick=false;
                break;
            case R.id.btn_four:
                if(textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else if(isOperationClick) {
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                isOperationClick=false;
                break;
            case R.id.btn_five:
                if(textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else if(isOperationClick) {
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
                isOperationClick=false;
                break;
            case R.id.btn_six:
                if(textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else if(isOperationClick) {
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                isOperationClick=false;
                break;
            case R.id.btn_seven:
                if(textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else if(isOperationClick) {
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                isOperationClick=false;
                break;
            case R.id.btn_eight:
                if(textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else if(isOperationClick) {
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                isOperationClick=false;
                break;
            case R.id.btn_nine:
                if(textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else if(isOperationClick) {
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                isOperationClick=false;
                break;
            case R.id.btn_zero:
                if(textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else if(isOperationClick) {
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                isOperationClick=false;
                break;
            case R.id.btn_ac:
                textView.setText("0");
                first=0;
                second=0;
                isOperationClick=false;
                break;
            case R.id.btn_point:
                if(!textView.getText().toString().contains(".")){
                    textView.append(".");
                    break;
                }
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_percent:
                first=Double.parseDouble(textView.getText().toString());
                Double result = Double.valueOf(0);
                isOperationClick=true;
                operation="/";
                switch (operation){
                    case "/":
                        result=first/100;
                        break;
                }
                textView.setText(new DecimalFormat("##.######").format(result));
                break;
            case R.id.btn_pos_neg:
                first=Double.parseDouble(textView.getText().toString());
                double resultW = Float.valueOf(0);
                isOperationClick=true;
                operation="+ -";
                resultW = first*(-1);

                textView.setText(new DecimalFormat("##.######").format(resultW));
                break;
            case R.id.btn_plus:
                firstVariable();
                isOperationClick=true;
                operation="+";
                break;
            case R.id.btn_minus:
                firstVariable();
                isOperationClick=true;
                operation="-";
                break;
            case R.id.btn_devide:
                firstVariable();
                isOperationClick=true;
                operation="/";
                break;
            case R.id.btn_times:
                firstVariable();
                isOperationClick=true;
                operation="*";
                break;
            case R.id.btn_equals:
                secondVariable();
                Double resultS =Double.valueOf(0);
                switch (operation){
                    case"+":
                        result=first+second;
                        textView.setText(result.toString());
                        break;
                    case"-":
                        result=first-second;
                        textView.setText(result.toString());
                        break;
                    case"*":
                        result=first*second;
                        textView.setText(result.toString());
                        break;
                    case"/":
                        result=first/second;
                        textView.setText(result.toString());
                        break;
                }break;

        }
    }

    /*public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_equals:
                Integer result=0;
                second=Integer.parseInt(textView.getText().toString());
                switch (operation){
                    case "+":
                        result = first+second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        result = first-second;
                        textView.setText(result.toString());
                        break;
                    case "*":
                        result = first*second;
                        textView.setText(result.toString());
                        break;
                    case "/":
                        result = first/second;
                        textView.setText(result.toString());
                        break;
                    case "%":
                        result = first/100;
                        textView.setText(result.toString());
                        break;
                    case ".":
                        result = first;
                        textView.setText(result.toString());
                        break;
                    case "+/-":
                        result = -first;
                        textView.setText(result.toString());
                        break;
                }
                isOperationClick=true;
                operation="=";
                break;
            case R.id.btn_plus:
                first=Integer.parseInt(textView.getText().toString());
                isOperationClick=true;
                operation="+";
                break;
            case R.id.btn_minus:
                first=Integer.parseInt(textView.getText().toString());
                textView.setText(first+" - "+second);
                isOperationClick=true;
                operation="-";
                break;
            case R.id.btn_devide:
                first=Integer.parseInt(textView.getText().toString());
                isOperationClick=true;
                operation="/";
                break;
            case R.id.btn_times:
                first=Integer.parseInt(textView.getText().toString());
                operation="*";
                isOperationClick=true;
                break;
            case R.id.btn_point:
                first=Integer.parseInt(textView.getText().toString());
                isOperationClick=true;
                operation=".";
                break;
            case R.id.btn_pos_neg:
                first=Integer.parseInt(textView.getText().toString());
                isOperationClick=true;
                operation="+/-";
                break;
            case R.id.btn_percent:
                first=Integer.parseInt(textView.getText().toString());
                isOperationClick=true;
                operation="%";
                break;
        }
    }*/
    public void firstVariable(){
        first=Double.parseDouble(textView.getText().toString());
    }
    public void secondVariable(){
        second=Double.parseDouble(textView.getText().toString());
    }
    public void seeNumber(String string){
        switch (string){
            case "1":
                if(textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else if(isOperationClick) {
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                isOperationClick=false;
            case "2":
                if(textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else if(isOperationClick) {
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
            case "3":
                if(textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else if(isOperationClick) {
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
            case "4":
                if(textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else if(isOperationClick) {
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
            case "5":
                if(textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else if(isOperationClick) {
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
            case "6":
                if(textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else if(isOperationClick) {
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
            case "7":
                if(textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else if(isOperationClick) {
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
            case "8":
                if(textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else if(isOperationClick) {
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
            case "9":
                if(textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else if(isOperationClick) {
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
            case "0":
                if(textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else if(isOperationClick) {
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
        }
    }
}
