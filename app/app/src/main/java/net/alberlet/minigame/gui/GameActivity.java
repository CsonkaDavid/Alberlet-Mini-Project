package net.alberlet.minigame.gui;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.alberlet.minigame.R;
import net.alberlet.minigame.state.GameState;
import net.alberlet.minigame.state.Player;

import java.util.List;

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

    private GameState gameState;

    private final String PLAYER_ONE_TURN = "Player1's Turn";

    private final String PLAYER_TWO_TURN = "Player2's Turn";

    private boolean isDiceRollable;

    private boolean isDiceMovable;

    private boolean isDiceMoved;

    private boolean isTurnDisplayVisible;

    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        gameState = new GameState();

        rootView = findViewById(R.id.root_layout);
        turnDisplay = findViewById(R.id.turn_display);
        dice = findViewById(R.id.dice);
        player1Table = findViewById(R.id.player1_table);
        player2Table = findViewById(R.id.player2_table);
        player1OwnScore = findViewById(R.id.player1_own_score);
        player1OpponentScore = findViewById(R.id.player1_opponent_score);
        player2OwnScore = findViewById(R.id.player2_own_score);
        player2OpponentScore = findViewById(R.id.player2_opponent_score);

        isTurnDisplayVisible = true;
        setListeners();
    }

    private void setListeners() {

        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onScreenClick(view);
            }
        });

        for (int i = 0; i < 3; i++) {
            player1Table.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onColumnClick(view);
                }
            });
        }

        for (int i = 0; i < 3; i++) {
            player2Table.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onColumnClick(view);
                }
            });
        }
    }

    private void newTurn(){
        gameState.startTurn();
        setTurnDisplay();
    }

//    private void setRollableOnDiceClick() {
//        String dicePath = "@drawable/dice" + gameState.getDice();
//
//        int imgResource = getResources().getIdentifier(dicePath, null, getPackageName());
//        @SuppressLint("UseCompatLoadingForDrawables") Drawable diceImage = getResources().getDrawable(imgResource);
//
//
//        dice.setImageDrawable(diceImage);
//        dice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setOnClickListenersForColumns();
//                dice.setOnClickListener(null);
//            }
//        });
//
//    }

    public void onDiceClick(View view) {
        if (isDiceRollable) {
            rollDice();
            isDiceRollable = false;
            isDiceMovable = true;

        } else if (isDiceMovable){
            isDiceMovable = false;
            isDiceMoved = true;

        }
    }

    public void onColumnClick(View view) {
        if (isDiceMoved) {
            moveDiceToColumn((LinearLayout) view.getParent(), (LinearLayout) view);
            newTurn();
            isDiceMoved = false;
        }
    }

    public void onScreenClick(View view) {
        if (isTurnDisplayVisible) {
            turnDisplay.setVisibility(View.GONE);
            isTurnDisplayVisible = false;
            isDiceRollable = true;
        }
    }

    private void rollDice() {
        String dicePath = "@drawable/dice" + gameState.getDice();

        int imgResource = getResources().getIdentifier(dicePath, null, getPackageName());
        @SuppressLint("UseCompatLoadingForDrawables") Drawable diceImage = getResources().getDrawable(imgResource);
        dice.setImageDrawable(diceImage);
    }

    public void moveDiceToColumn(LinearLayout table, LinearLayout column) {
        int columnIndex = 0;
        for (int i = 0; i < 3; i++){
            if (table.getChildAt(i).equals(column)) {
                columnIndex = i;
            }
        }

        ImageView tableCellView = (ImageView) ((FrameLayout) column
                .getChildAt(gameState.getSizeOfColumnFromPlayer(gameState.getActivePlayerName(), columnIndex)))
                .getChildAt(0);
        tableCellView.setImageDrawable(dice.getDrawable());
        dice.setImageDrawable(null);
        gameState.addValueToPlayerTableOnColumn(gameState.getActivePlayerName(), columnIndex, gameState.getDice());
    }

    private void setTurnDisplay(){
        if (PLAYER_ONE_TURN.equals(turnDisplay.getText().toString())) {
            turnDisplay.setText(PLAYER_TWO_TURN);
            turnDisplay.setRotationX(-180);
            turnDisplay.setRotationY(-180);
        } else {
            turnDisplay.setText(PLAYER_ONE_TURN);
            turnDisplay.setRotationX(0);
            turnDisplay.setRotationY(0);
        }

        turnDisplay.setVisibility(View.VISIBLE);
        isTurnDisplayVisible = true;
    }

//    private void setOnClickListenersForColumns() {
//        Player activePlayer = gameState.getActivePlayer();
//        LinearLayout activeTableView;
//        TextView activePlayerOwnScore;
//        TextView activePlayerOpponentScore;
//        TextView inactivePlayerOwnScore;
//        TextView inactivePlayerOpponentScore;
//
//        if(activePlayer.getName().equals("player1")) {
//            activeTableView = player1Table;
//            activePlayerOwnScore = player1OwnScore;
//            activePlayerOpponentScore = player1OpponentScore;
//            inactivePlayerOwnScore = player2OwnScore;
//            inactivePlayerOpponentScore = player2OpponentScore;
//        } else {
//            activeTableView = player2Table;
//            activePlayerOwnScore = player2OwnScore;
//            activePlayerOpponentScore = player2OpponentScore;
//            inactivePlayerOwnScore = player1OwnScore;
//            inactivePlayerOpponentScore = player1OpponentScore;
//        }
//
//
//        for (int i = 0; i < 3; i++) {
//            int finalI = i;
//            activeTableView.getChildAt(i).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    int freeIndex = activePlayer.getTable().getFirstEmptyCellIndex(finalI);
//                    LinearLayout tableView = (LinearLayout) view;
//                    ImageView tableCellView = (ImageView) ((FrameLayout) tableView.getChildAt(freeIndex)).getChildAt(0);
//                    tableCellView.setImageDrawable(dice.getDrawable());
//                    gameState.addValueToPlayerTableOnColumn(activePlayer, finalI, gameState.getDice());
//                    gameState.refreshScores();
//                    activePlayerOwnScore.setText(String.valueOf(gameState.getActivePlayer().getScore()));
//                    activePlayerOpponentScore.setText(String.valueOf(gameState.getInactivePlayer().getScore()));
//                    inactivePlayerOwnScore.setText(String.valueOf(gameState.getInactivePlayer().getScore()));
//                    inactivePlayerOpponentScore.setText(String.valueOf(gameState.getActivePlayer().getScore()));
//
//                    dice.setImageDrawable(null);
//                    newTurn();
//
//                    LinearLayout table = (LinearLayout) view.getParent();
//                    for (int j = 0; j < 3; j++) {
//                        table.getChildAt(j).setOnClickListener(null);
//                    }
//
//                }
//
//            });
//        }
//    }
//
//    public void setOnClickListenerOnRoot() {
//        rootView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                turnDisplay.setVisibility(View.GONE);
//                gameState.startTurn();
//                dice.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        setRollableOnDiceClick();
//                    }
//                });
//            }
//        });
//    }


}
