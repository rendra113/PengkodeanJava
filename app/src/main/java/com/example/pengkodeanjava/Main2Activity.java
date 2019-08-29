package com.example.pengkodeanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    private Button angka1,angka2,angka3,angka4,angka5,angka6,angka7,angka8,angka9,angka0,btnHitung,btnKali,btnKurang,btnBagi,btnTambah,btnClear,btnPindah;
    private TextView hasil;
    boolean plus,min,div,times;
    float var1,var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnPindah = (Button) findViewById(R.id.pindah1);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(pindah);
            }
        });

        angka1 = (Button) findViewById(R.id.no_1);
            angka1.setOnClickListener(this);
        angka2 = (Button) findViewById(R.id.no_2);
            angka2.setOnClickListener(this);
        angka3 = (Button) findViewById(R.id.no_3);
            angka3.setOnClickListener(this);
        angka4 = (Button) findViewById(R.id.no_4);
            angka4.setOnClickListener(this);
        angka5 = (Button) findViewById(R.id.no_5);
            angka5.setOnClickListener(this);
        angka6 = (Button) findViewById(R.id.no_6);
            angka6.setOnClickListener(this);
        angka7 = (Button) findViewById(R.id.no_7);
            angka7.setOnClickListener(this);
        angka8 = (Button) findViewById(R.id.no_8);
            angka8.setOnClickListener(this);
        angka9 = (Button) findViewById(R.id.no_9);
            angka9.setOnClickListener(this);
        angka0 = (Button) findViewById(R.id.nol);
            angka0.setOnClickListener(this);

        btnHitung = (Button) findViewById(R.id.sama_dengan);
            btnHitung.setOnClickListener(this);
        btnKali = (Button) findViewById(R.id.kali);
            btnKali.setOnClickListener(this);
        btnBagi = (Button) findViewById(R.id.bagi);
            btnBagi.setOnClickListener(this);
        btnKurang = (Button) findViewById(R.id.kurang);
            btnKurang.setOnClickListener(this);
        btnTambah = (Button) findViewById(R.id.tambah);
            btnTambah.setOnClickListener(this);
        btnClear = (Button ) findViewById(R.id.clear);
            btnClear.setOnClickListener(this);

        hasil =(TextView) findViewById(R.id.tv_hasil);
    }


    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case R.id.nol:
                    hasil.setText(hasil.getText().toString().trim()+"0");
                    break;
                case R.id.no_1:
                    hasil.setText(hasil.getText().toString().trim()+"1");
                    break;
                case R.id.no_2:
                    hasil.setText(hasil.getText().toString().trim()+"2");
                    break;
                case R.id.no_3:
                    hasil.setText(hasil.getText().toString().trim()+"3");
                    break;
                case R.id.no_4:
                    hasil.setText(hasil.getText().toString().trim()+"4");
                    break;
                case R.id.no_5:
                    hasil.setText(hasil.getText().toString().trim()+"5");
                    break;
                case R.id.no_6:
                    hasil.setText(hasil.getText().toString().trim()+"6");
                    break;
                case R.id.no_7:
                    hasil.setText(hasil.getText().toString().trim()+"7");
                    break;
                case R.id.no_8:
                    hasil.setText(hasil.getText().toString().trim()+"8");
                    break;
                case R.id.no_9:
                    hasil.setText(hasil.getText().toString().trim()+"9");
                    break;
                case R.id.titik:
                    hasil.setText(hasil.getText().toString().trim()+".");
                    break;
                case R.id.tambah:
                    var1 = Float.parseFloat(hasil.getText().toString());
                    plus = true;
                    hasil.setText(null);
                    break;
                case R.id.kurang:
                    var1 = Float.parseFloat(hasil.getText().toString());
                    min = true;
                    hasil.setText(null);
                    break;
                case R.id.kali:
                    var1 = Float.parseFloat(hasil.getText().toString());
                    times = true;
                    hasil.setText(null);
                    break;
                case R.id.bagi:
                    var1 = Float.parseFloat(hasil.getText().toString());
                    div = true;
                    hasil.setText(null);
                    break;
                case R.id.sama_dengan :
                    var2 = Float.parseFloat(hasil.getText().toString().trim());
                    if  (plus == true){
                        hasil.setText(var1+var2+"");
                        plus = false;
                    }else if (min == true) {
                        hasil.setText(var1 - var2 + "");
                        min = false;
                    }else if (times == true) {
                        hasil.setText(var1 * var2 + "");
                        times = false;
                    }else if (div == true) {
                        hasil.setText(var1 / var2 + "");
                        div = false;
                    }
                    break;

                case R.id.clear:
                    hasil.setText("");
                    var1 = 0;
                    var2=0;
                    break;
            }
    }
}
