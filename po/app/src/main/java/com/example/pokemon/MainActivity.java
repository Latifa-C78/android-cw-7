package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     ArrayList<pokemon> pokeball = new ArrayList<>();
        pokemon v = new pokemon("pikachu",R.drawable.pikachu,55,40,320);
        pokemon b = new pokemon("pidgey",R.drawable.pidgey,30,60,666);
        pokemon o = new pokemon ("ivysaur",R.drawable.ivysaur,60,80,322);
        pokemon p = new pokemon ("venusaur",R.drawable.venusaur,90,100,333);
        pokemon l = new pokemon ("charmander",R.drawable.charmander,77,199,400);
       pokeball.add(v);
        pokeball.add(b);
        pokeball.add(o);
        pokeball.add(p);
        pokeball.add(l);
        RecyclerView k = findViewById(R.id.recyclerView);



    }
}