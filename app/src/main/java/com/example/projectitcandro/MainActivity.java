package com.example.projectitcandro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String EXTRA_USERNAME = "extra_username";

    TextView tvGetUsername, textName, textPromo;
    Typeface  typeface;
    ImageButton btnHotelList, btnDestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGetUsername = findViewById(R.id.tv_getUsername);
        btnHotelList = findViewById(R.id.ib_btn_hotel_list);
        btnDestList = findViewById(R.id.ib_btn_dest_list);

        String username = getIntent().getStringExtra(EXTRA_USERNAME);
        tvGetUsername.setText("User : " + username);

        textName = findViewById(R.id.tv_getUsername);
        textPromo = findViewById(R.id.tv_text_promo);

        btnHotelList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotellist = new Intent(MainActivity.this, ListhotelActivity.class);

                startActivity(hotellist);
            }
        });

        btnDestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destlist = new Intent(MainActivity.this, ListdestinationActivity.class);

                startActivity(destlist);
            }
        });

        typeface = ResourcesCompat.getFont(
                this,
                R.font.font_bold);
        textName.setTypeface(typeface);
        textPromo.setTypeface(typeface);
    }

    @Override
    public void onBackPressed() {

    }
}