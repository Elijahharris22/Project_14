package com.example.project14;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] carservice = new String[]{"Car Wash", "Gas for your Car", "Charging Station for Electric Vehicle"};
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, carservice);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            switch (position) {
                case 0:
                    startActivity(new Intent(MainActivity.this, carwash.class));
                    break;
                case 1:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                    break;
                case 2:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                    break;

            }
        });
    }
}