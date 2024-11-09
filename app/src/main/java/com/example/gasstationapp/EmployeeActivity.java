package com.example.gasstationapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class EmployeeActivity extends AppCompatActivity {
    private ArrayList<String> employees = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        ListView employeeList = findViewById(R.id.employeeList);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText positionInput = findViewById(R.id.positionInput);
        Button addButton = findViewById(R.id.addButton);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, employees);
        employeeList.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String position = positionInput.getText().toString();
            employees.add(name + " - " + position);
            adapter.notifyDataSetChanged();
        });
    }
}
