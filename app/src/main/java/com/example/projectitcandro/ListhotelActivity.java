package com.example.projectitcandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListhotelActivity extends AppCompatActivity {

    ImageButton ibHotel1, ibHotel2, ibHotel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listhotel);

        ibHotel1 = findViewById(R.id.ib_btn_hotel_1);
        ibHotel2 = findViewById(R.id.ib_btn_hotel_2);
        ibHotel3 = findViewById(R.id.ib_btn_hotel_3);

        ibHotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mandarinoriental.com/jakarta/jalan-mh-thamrin/luxury-hotel"));

                startActivity(hotel1);
            }
        });

        ibHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kempinski.com/id/jakarta/hotel-indonesia/"));

                startActivity(hotel2);
            }
        });

        ibHotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://novotel.accor.com/"));

                startActivity(hotel3);
            }
        });

    }
}