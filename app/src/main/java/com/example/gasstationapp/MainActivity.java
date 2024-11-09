package com.example.gasstationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gasStationButton = findViewById(R.id.gasStationButton);
        Button employeeButton = findViewById(R.id.employeeButton);
        Button productButton = findViewById(R.id.productButton);

        gasStationButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, GasStationActivity.class)));
        employeeButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, EmployeeActivity.class)));
        productButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProductActivity.class)));
    }
}
