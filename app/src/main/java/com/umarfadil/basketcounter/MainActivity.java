package com.umarfadil.basketcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    int totalScoreA = 0, totalScoreB = 0;
    TextView tvScoreA, tvScoreB;
    Button btn2PointsB, btn3PointsB, btnFreeThrowB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = (TextView) findViewById(R.id.teamATotalScore);
        tvScoreB = (TextView) findViewById(R.id.teamBTotalScore);

        btn2PointsB = (Button) findViewById(R.id.teamB2points);
        btn3PointsB = (Button) findViewById(R.id.teamB3points);
        btnFreeThrowB = (Button) findViewById(R.id.teamBFreeThrow);

        btn2PointsB.setOnClickListener(this);
        btn3PointsB.setOnClickListener(this);
        btnFreeThrowB.setOnClickListener(this);
    }

    public void add2PointTeamA(View view) {
        updateScoreA(2);
    }

    private void updateScoreA(int score) {
        totalScoreA += score;
        tvScoreA.setText(String.valueOf(totalScoreA));
    }

    public void add3PointTeamA(View view) {
        updateScoreA(3);
    }

    public void addFreeThrowTeamA(View view) {
        updateScoreA(1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.teamB2points :
                updateScoreB(2);
                break;
            case R.id.teamB3points :
                updateScoreB(3);
                break;
            case R.id.teamBFreeThrow :
                updateScoreB(1);
                break;
        }
    }

    private void updateScoreB(int score) {
        totalScoreB += score;
        tvScoreB.setText(String.valueOf(totalScoreB));
    }

    public void resetScore(View view) {
        totalScoreA = totalScoreB = 0;
        tvScoreA.setText(String.valueOf(totalScoreA));
        tvScoreB.setText(String.valueOf(totalScoreB));
    }

    public void endGame(View view) {
        Intent i =  new Intent(MainActivity.this, ResultActivity.class);

        i.putExtra("score_a", totalScoreA);
        i.putExtra("score_b", totalScoreB);

        startActivity(i);
    }
}
