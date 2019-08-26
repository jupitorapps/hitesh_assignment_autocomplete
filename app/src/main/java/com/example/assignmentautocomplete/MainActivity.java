package com.example.assignmentautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView mAutoCompleteTextView;

    String[] video_games = new String[]{
            "Spore",
            "Minecraft",
            "Grand Theft Auto V",
            "Tetris",
            "Fortnite",
            "Mario Bros"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAutoCompleteTextView = findViewById(R.id.video_game_view);
        ArrayAdapter<String> vg_adaptar = new ArrayAdapter<>(this, R.layout.video_games, video_games);
        mAutoCompleteTextView.setAdapter(vg_adaptar);

    }
}
