package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {

    TextView colorName;
    TextView description;
    ImageView  image;
    Button     btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);


        colorName = findViewById(R.id.tvColName);
        description = findViewById(R.id.tvDescri);
        image = findViewById(R.id.tvImager);
        btn = findViewById(R.id.tvBtn);

        Intent intent = getIntent();
        colorName.setText(intent.getStringExtra("colorName"));
        description.setText(intent.getStringExtra("description"));
        image.setImageResource(intent.getIntExtra("image",0));
        btn.setText(intent.getStringExtra("urlBrowser"));
    }
}