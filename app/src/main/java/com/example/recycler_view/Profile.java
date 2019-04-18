package com.example.recycler_view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private TextView name, phone;
    private ImageView image;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.profile);

        name = findViewById(R.id.txtname);
        phone = findViewById(R.id.txtphone);
        image = findViewById(R.id.imageProfile);

        if(!(getIntent() == null)){
            name.setText(getIntent().getStringExtra(MainActivity.Profile_intention1));
            phone.setText(getIntent().getStringExtra(MainActivity.Profile_intention2));
            image.setImageResource(getIntent().getIntExtra(MainActivity.Profile_intention3,R.drawable.ic_launcher_background));
        }


    }
}
