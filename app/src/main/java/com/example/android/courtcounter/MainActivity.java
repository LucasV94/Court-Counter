package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //There has to be a better way to do this
    public void threePointToA(View view) {
        displayForTeamA(3);
    }

    public void twoPointToA(View view) {
        displayForTeamA(2);
    }

    public void freeThrowToA(View view) {
        displayForTeamA(1);
    }


}

