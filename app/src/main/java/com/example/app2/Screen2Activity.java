package com.example.app2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String address = getIntent().getStringExtra("address");
        String city = getIntent().getStringExtra("city");

        String text =
                "Nom : " + name + "\n" +
                        "Email : " + email + "\n" +
                        "Phone : " + phone + "\n" +
                        "Adresse : " + address + "\n" +
                        "Ville : " + city;

        tvResult.setText(text);
    }
}