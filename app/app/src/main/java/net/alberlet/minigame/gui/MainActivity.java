package net.alberlet.minigame.gui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.alberlet.minigame.R;

public class MainActivity extends AppCompatActivity {

    private Button GameStartButton;

    private Button SettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GameStartButton = findViewById(R.id.game_start);
        SettingsButton = findViewById(R.id.settings);

    }

    public void onGameStartButtonClick(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void onSettingsButtonClick(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void onQuitButtonClick(View view) {


    }
}