package com.example.projectitcandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListdestinationActivity extends AppCompatActivity {

    ImageButton ibDest1, ibDest2, ibDest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listhotel);

        ibDest1 = findViewById(R.id.ib_btn_hotel_1);
        ibDest2 = findViewById(R.id.ib_btn_hotel_2);
        ibDest3 = findViewById(R.id.ib_btn_hotel_3);

        ibDest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indonesia.travel/id/id/destinasi/bali-nusa-tenggara/bali"));

                startActivity(hotel1);
            }
        });

        ibDest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indonesia.travel/id/id/destinasi/java/yogyakarta"));

                startActivity(hotel2);
            }
        });

        ibDest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotel3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indonesia.travel/id/id/destinasi/java/dki-jakarta"));

                startActivity(hotel3);
            }
        });

    }
}