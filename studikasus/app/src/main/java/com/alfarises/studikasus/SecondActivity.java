package com.alfarises.studikasus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tampilData1();
    }

    public void tampilData1(){
        String strjns = getIntent().getStringExtra("jenis");
        String strtgl = getIntent().getStringExtra("tanggal");
        String strwkt = getIntent().getStringExtra("waktu");


        TextView jns = findViewById(R.id.tvJenis);
        TextView tgl = findViewById(R.id.tvTanggal);
        TextView wkt = findViewById(R.id.tvWaktu);

        jns.setText(strjns);
        tgl.setText(strtgl);
        wkt.setText(strwkt);
    }

}
