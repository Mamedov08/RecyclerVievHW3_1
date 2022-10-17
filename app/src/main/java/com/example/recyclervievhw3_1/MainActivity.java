package com.example.recyclervievhw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
  private ArrayList<String> mountainsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        mountainsList.add("Tien Shan");
        mountainsList.add("Ala-Too Ranges");
        mountainsList.add("The Pamirs");
        mountainsList.add("Peak Lenin");
        mountainsList.add("Djaman Suu");
        mountainsList.add("Kara Kuldja");
        mountainsList.add("Uoyrme");
        mountainsList.add("Chok Tal");
        mountainsList.add("Baibichye");
        mountainsList.add("Manas");
        mountainsList.add("Min Teke;");
        mountainsList.add("Sabla");
        mountainsList.add("Karakol");
        mountainsList.add("Tandikul");
        mountainsList.add("Khan-Tengri");
        mountainsList.add("Pobeda Peak");
        mountainsList.add("Pobeda Peak");



        MountainsAdapter adapter =new MountainsAdapter(mountainsList);

        recyclerView.setAdapter(adapter);
    }
}