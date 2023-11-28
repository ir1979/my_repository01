package com.example.test03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {


    public ProductAdapter(@NonNull Context context, List<Product> products) {
        super(context, 0, products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product p = getItem(position);

        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_product, parent, false);
        }

        TextView txtName = convertView.findViewById(R.id.txtPName);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        txtName.setText(p.getName().toString());
        imageView.setImageResource(p.getImageId());

        return convertView;

    }
}
