package com.samuel.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtHobi;
    TextView txtUmur;
    TextView txtGolonganDarah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Nama : Samuel Gunawan");

        txtHobi = (TextView) findViewById(R.id.txtHobi);
        txtHobi.setText("Hobi : Badminton");

        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("Umur : 20 Tahun");

        txtGolonganDarah = (TextView) findViewById(R.id.txtGolonganDarah);
        txtGolonganDarah.setText("Golongan Darah : O");
    }
}