package net.alberlet.minigame.gui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.minigame.R;
import net.alberlet.minigame.state.GameState;
import net.alberlet.minigame.state.Player;

public class GameActivity extends AppCompatActivity {

    private RelativeLayout rootView;

    private TextView turnDisplay;

    private ImageView dice;

    private LinearLayout player1Table;

    private LinearLayout player2Table;

    private TextView player1OwnScore;

    private TextView player1OpponentScore;

    private TextView player2OwnScore;

    private TextView player2OpponentScore;

    private static final GameState GAME_STATE = new GameState();

    private final String PLAYER_ONE_TURN = "Player1's Turn";

    private final String PLAYER_TWO_TURN = "Player2's Turn";

    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        rootView = findViewById(R.id.root_layout);
        turnDisplay = findViewById(R.id.turn_display);
        dice = findViewById(R.id.dice);
        player1Table = findViewById(R.id.player1_table);
        player2Table = findViewById(R.id.player2_table);
        player1OwnScore = findViewById(R.id.player1_own_score);
        player1OpponentScore = findViewById(R.id.player1_opponent_score);
        player2OwnScore = findViewById(R.id.player2_own_score);
        player2OpponentScore = findViewById(R.id.player2_opponent_score);

        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnDisplay.setVisibility(View.GONE);
                GAME_STATE.startTurn();
                dice.setVisibility(View.VISIBLE);
                dice.setOnClickListener(new View.OnClickListener() {
                   @Override
                    public void onClick(View view) {
                       onDiceClick();
                       dice.setOnClickListener(null);
                   }
                });
            }
        });

    }

    private void newTurn() throws InterruptedException {
        GAME_STATE.startTurn();
        setTurnDisplay();
    }

    private void onDiceClick() {
        String dicePath = "@drawable/dice" + GAME_STATE.getDice();

        int imgResource = getResources().getIdentifier(dicePath, null, getPackageName());
        @SuppressLint("UseCompatLoadingForDrawables") Drawable diceImage = getResources().getDrawable(imgResource);

        dice.setImageDrawable(diceImage);

    }

    private void setTurnDisplay() throws InterruptedException {


        if (PLAYER_ONE_TURN.equals(turnDisplay.getText().toString())) {
            turnDisplay.setText(PLAYER_TWO_TURN);
        } else {
            turnDisplay.setText(PLAYER_ONE_TURN);
        }

        turnDisplay.setVisibility(View.VISIBLE);
        Thread.sleep(1000);
        turnDisplay.setVisibility(View.GONE);
    }

    private void setOnClickListenersForColumns() {
        Player activePlayer = GAME_STATE.getActivePlayer();

        if(activePlayer.getName().equals("player1")) {
            for(int i = 0; i < 3; i++) {
                int finalI = i;
                player1Table.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LinearLayout layout = (LinearLayout) player1Table.getChildAt(finalI);

                        if (activePlayer.getTable().getColumn(finalI).isEmpty()) {
                        }


                        dice.getDrawable();
                    }
                });
            }
        } else {

        }
    }
}
