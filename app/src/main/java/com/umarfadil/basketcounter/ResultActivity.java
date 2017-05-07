package com.umarfadil.basketcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    int totalScoreA, totalScoreB;
    TextView tvWinner, tvDifferentScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Mengambil data yang dikirim dari activity sebelumnya
        totalScoreA = getIntent().getIntExtra("score_a", 0);
        totalScoreB = getIntent().getIntExtra("score_b", 0);

        tvWinner = (TextView) findViewById(R.id.winning_team);
        tvWinner.setText(getWinningTeam());

        tvDifferentScore = (TextView) findViewById(R.id.score_different);
        if (totalScoreA == totalScoreB) {
            tvDifferentScore.setVisibility(View.GONE);
        } else {
            tvDifferentScore.setText(getDifferentScore() + "");
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private String getWinningTeam() {

        String winningTeam = (totalScoreA > totalScoreB) ? "Team A Menang" : "Team B Menang";
        if (totalScoreA == totalScoreB) winningTeam = "Draw";
        return winningTeam;
    }

    public int getDifferentScore() {
        return Math.abs(totalScoreA - totalScoreB);
    }
}
