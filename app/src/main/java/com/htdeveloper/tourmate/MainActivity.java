package com.htdeveloper.tourmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ImageView tripsIv;
    private TextView tripsTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, new TripsFragment());
        ft.commit();



        init();

    }

    private void init() {
        tripsIv = findViewById(R.id.tripsIv);
        tripsTv = findViewById(R.id.tripsTv);

        tripsIv.setColorFilter(0xFF4b0082);
        tripsTv.setTextColor(0xFF4b0082);
    }


    public void tripsClicked(View view) {
        tripsIv.setColorFilter(0xFF4b0082);
        tripsTv.setTextColor(0xFF4b0082);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, new TripsFragment());
        ft.commit();
    }
}
