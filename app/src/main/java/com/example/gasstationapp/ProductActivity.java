package com.example.gasstationapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    private ArrayList<String> products = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        ListView productList = findViewById(R.id.productList);
        EditText nameInput = findViewById(R.id.nameInput);
        EditText quantityInput = findViewById(R.id.quantityInput);
        EditText priceInput = findViewById(R.id.priceInput);
        Button addButton = findViewById(R.id.addButton);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, products);
        productList.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String quantity = quantityInput.getText().toString();
            String price = priceInput.getText().toString();
            products.add(name + " - " + quantity + " - " + price);
            adapter.notifyDataSetChanged();
        });
    }
}
