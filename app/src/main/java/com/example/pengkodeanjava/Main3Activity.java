package com.example.pengkodeanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private EditText suhu;
    private Button konversi,pindah;
    private TextView fahrenheit,reamur,kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        suhu = (EditText) findViewById(R.id.et_suhu);
        konversi = (Button) findViewById(R.id.konversi);
        fahrenheit = (TextView) findViewById(R.id.fahrenheit);
        reamur = (TextView) findViewById(R.id.reamur);
        kelvin = (TextView) findViewById(R.id.kelvin);
        pindah = (Button) findViewById(R.id.pindah2);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Main3Activity.this,Main2Activity.class);
            }
        });

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String suhu_string = suhu.getText().toString().trim();
                double suhu_akhir  = Double.parseDouble(suhu_string);
                double hitung_k = ( suhu_akhir + 273.15);
                double hitung_f = ( suhu_akhir * (1.8 + 32));
                double hitung_r = ( suhu_akhir * 4/5);
                fahrenheit.setText( hitung_f+" F");
                kelvin.setText( hitung_k+" K");
                reamur.setText (hitung_r+" R");
            }
        });
    }
}
