package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Car1", 123L, R.drawable.car));
        products.add(new Product("Ball1", 123L, R.drawable.ball));
        products.add(new Product("Bicycle1", 123L, R.drawable.bicycle));
        products.add(new Product("Computer1", 123L, R.drawable.computer));


        ListView lstProducts = findViewById(R.id.lstProducts);

        ProductAdapter pa = new ProductAdapter(this, products);
        lstProducts.setAdapter(pa);

        pa.notifyDataSetChanged();



    }
}