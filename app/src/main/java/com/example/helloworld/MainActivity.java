package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    int var1, var2, var3;
    String str1, str2, str3;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var1 = 0;
        var2 = 0;
        var3 = 0;
        str1 = "";
        btn_0 = (Button) findViewById(R.id.button0);
        btn_1 = (Button) findViewById(R.id.button1);
        btn_2 = (Button) findViewById(R.id.button2);
        btn_3 = (Button) findViewById(R.id.button3);
        btn_4 = (Button) findViewById(R.id.button4);
        btn_5 = (Button) findViewById(R.id.button5);
        btn_6 = (Button) findViewById(R.id.button6);
        btn_7 = (Button) findViewById(R.id.button7);
        btn_8 = (Button) findViewById(R.id.button8);
        btn_9 = (Button) findViewById(R.id.button9);
        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.hello_world);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 1;
                txt1.setText(str1);}});
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 2;
                txt1.setText(str1);}});
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 3;
                txt1.setText(str1);}});
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 4;
                txt1.setText(str1);}});
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 5;
                txt1.setText(str1);}});
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 6;
                txt1.setText(str1);}});
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 7;
                txt1.setText(str1);}});
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 8;
                txt1.setText(str1);}});
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = str1 + 9;
                txt1.setText(str1);}});
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str1 != "") {str1 = str1 + 0;
                    txt1.setText(str1);}}});
    }

}
