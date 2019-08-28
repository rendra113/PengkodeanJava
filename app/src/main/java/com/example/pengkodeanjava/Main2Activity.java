package com.example.pengkodeanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button angka1,angka2,angka3,angka4,angka5,angka6,angka7,angka8,angka9,btnHitung,btnKali,btnKurang,btnBagi,btnTambah;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        angka1 = (Button) findViewById(R.id.no_1);
        angka2 = (Button) findViewById(R.id.no_2);
        angka3 = (Button) findViewById(R.id.no_3);
        angka4 = (Button) findViewById(R.id.no_4);
        angka5 = (Button) findViewById(R.id.no_5);
        angka6 = (Button) findViewById(R.id.no_6);
        angka7 = (Button) findViewById(R.id.no_7);
        angka8 = (Button) findViewById(R.id.no_8);
        angka9 = (Button) findViewById(R.id.no_9);
        btnHitung = (Button) findViewById(R.id.sama_dengan);
        btnKali = (Button) findViewById(R.id.kali);
        btnBagi = (Button) findViewById(R.id.bagi);
        btnKurang = (Button) findViewById(R.id.kurang);
        btnTambah = (Button) findViewById(R.id.tambah);
        hasil =(TextView) findViewById(R.id.tv_hasil);

    }
}
