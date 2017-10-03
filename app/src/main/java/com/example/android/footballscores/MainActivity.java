package com.example.android.footballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    private int cards_by_A = 0;
    private int cards_by_B = 0;
    private int fouls_by_A = 0;
    private int fouls_by_B = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the goal scored by Team A.
     */
    public void displaygoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_a);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displays the goal scored by Team B.
     */
    public void displaygoalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_b);
        scoreView.setText(String.valueOf(scoreB));
    }
    /**
     * Displays the fouls done by Team A.
     */
    public void displayfoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_a);
        scoreView.setText(String.valueOf(fouls_by_A));
    }
    /**
     * Displays the fouls done by Team B.
     */
    public void displayfoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_b);
        scoreView.setText(String.valueOf(fouls_by_B));
    }
    /**
     * Displays the cards got either red or yellow by Team A.
     */
    public void displaycardsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cards_a);
        scoreView.setText(String.valueOf(cards_by_A));
    }
    /**
     * Displays the cards got either red or yellow by Team B.
     */
    public void displaycardsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cards_b);
        scoreView.setText(String.valueOf(cards_by_B));
    }
    // method to reset the goals, fouls and cards of two teams to 0..
    public void reset(View view) {
        TextView scoreViewA = (TextView) findViewById(R.id.goals_a);
        TextView scoreViewB = (TextView) findViewById(R.id.goals_b);
        TextView foulsViewA = (TextView) findViewById(R.id.fouls_a);
        TextView foulsViewB = (TextView) findViewById(R.id.fouls_b);
        TextView cardsViewA = (TextView) findViewById(R.id.cards_a);
        TextView cardsViewB = (TextView) findViewById(R.id.cards_b);
        scoreA = 0;
        scoreB = 0;
        cards_by_A = 0;
        cards_by_B = 0;
        fouls_by_A = 0;
        fouls_by_B = 0;
        scoreViewA.setText(String.valueOf(scoreA));
        foulsViewB.setText(String.valueOf(scoreB));
        foulsViewA.setText(String.valueOf(cards_by_A));
        scoreViewB.setText(String.valueOf(cards_by_B));
        cardsViewA.setText(String.valueOf(fouls_by_A));
        cardsViewB.setText(String.valueOf(fouls_by_B));
    }
    //Method to add +1 point per one goal to the score for team A..
    public void goalsA(View view)
    {
        scoreA = scoreA + 1;
        displaygoalA(scoreA);
    }
    //Method to show how many fouls done by team A..
    public void foulsA(View view)
    {
        fouls_by_A = fouls_by_A + 1;
        displayfoulsA(fouls_by_A);
    }
    //Method to show total red and yellow cards got team A..
    public void cardsA(View view)
    {
        cards_by_A = cards_by_A + 1;
        displaycardsA(cards_by_A);
    }
    //Method to add +1 point per one goal to the score for team B..
    public void goalsB(View view)
    {
        scoreB = scoreB + 1;
        displaygoalB(scoreB);
    }
    //Method to show how many fouls done by team B..
    public void foulsB(View view)
    {
        fouls_by_B = fouls_by_B + 1;
        displayfoulsB(fouls_by_B);
    }
    //Method to show total red and yellow cards got team B..
    public void cardsB(View view)
    {
        cards_by_B = cards_by_B + 1;
        displaycardsB(cards_by_B);
    }
}
