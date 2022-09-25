package net.alberlet.minigame.gui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.minigame.R;

public class GameActivity extends AppCompatActivity {

    private static final GameController GAME_CONTROLLER = new GameController();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

    }

    public void newTurn() {
        // TextView players turn

    }

    public void onDiceClick(View view) {

    }

    public void onDiceDrag(View view) {

    }





}
