package net.alberlet.minigame.gui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.minigame.R;

public class GameActivity extends AppCompatActivity {

    TextView turnDisplay;

    ImageView dice;

    View player1Table;

    View player2Table;

    TextView player1OwnScore;

    TextView player1OpponentScore;

    TextView player2OwnScore;

    TextView player2OpponentScore;

    private static final GameController GAME_CONTROLLER = new GameController();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        turnDisplay = findViewById(R.id.turn_display);
        dice = findViewById(R.id.dice);
        player1Table = findViewById(R.id.player1_table);
        player2Table = findViewById(R.id.player2_table);
        player1OwnScore = findViewById(R.id.player1_own_score);
        player1OpponentScore = findViewById(R.id.player1_opponent_score);
        player2OwnScore = findViewById(R.id.player2_own_score);
        player2OpponentScore = findViewById(R.id.player2_opponent_score);



    }

    public void newTurn() {
        // TextView players turn

    }

    public void onDiceClick(View view) {

    }

    public void onDiceDrag(View view) {

    }





}
