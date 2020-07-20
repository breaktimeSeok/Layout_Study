package com.example.layout_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //레이아웃 소스코드

        //화면 레이아웃을 미리 만들 수 없는 경우 또는 필요할 때마다 바로바로 레이아웃을 만들어야 하는 경우
    }
}