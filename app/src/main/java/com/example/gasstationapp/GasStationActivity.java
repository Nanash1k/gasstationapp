package com.example.gasstationapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class GasStationActivity extends AppCompatActivity {
    private ArrayList<String> gasStations = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_station);

        ListView gasStationList = findViewById(R.id.gasStationList);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText addressInput = findViewById(R.id.addressInput);
        EditText phoneInput = findViewById(R.id.phoneInput);
        Button addButton = findViewById(R.id.addButton);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gasStations);
        gasStationList.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String address = addressInput.getText().toString();
            String phone = phoneInput.getText().toString();
            gasStations.add(name + " - " + address + " - " + phone);
            adapter.notifyDataSetChanged();
        });
    }
}
