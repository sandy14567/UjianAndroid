package com.example.ujianandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lvNama = findViewById(R.id.lvNama);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("daftar_nama")) {
            ArrayList<String> daftar_nama = intent.getStringArrayListExtra("daftar_nama");

            if (daftar_nama != null && !daftar_nama.isEmpty()) {
                ArrayAdapter<String> ad_nama = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, daftar_nama);
                lvNama.setAdapter(ad_nama);
            } else {
                daftar_nama = new ArrayList<>();
                daftar_nama.add("Data masih kosong");
                ArrayAdapter<String> ad_nama = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, daftar_nama);
                lvNama.setAdapter(ad_nama);
            }
        } else {
            // ...
        }
    }
}