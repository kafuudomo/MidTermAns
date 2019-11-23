package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameDetailActivity extends AppCompatActivity {
    private TextView tvTitle, tvRating, tvPrice, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);
        findViews();
        initializeData();
    }

    private void findViews(){

        tvTitle=findViewById(R.id.tv_title);
        tvRating=findViewById(R.id.tv_rating);
        tvPrice=findViewById(R.id.tv_price);
        tvDescription=findViewById(R.id.tv_description);

    }

    private void initializeData(){
        Bundle bundle=getIntent().getExtras();

        tvTitle.setText(bundle.getString("title"));
        tvRating.setText(bundle.getString("rating"));
        tvPrice.setText(bundle.getString("price"));
        tvDescription.setText(bundle.getString("description"));


    }
}
