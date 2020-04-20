package com.example.android.courtcounter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Layout;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    /*
     * Метод onCreate выполняется во время запуска приложения
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /*
     * Метод устанавливает 1 очко на табло
     */
    public void addOnePoint(View view) {
        if (view.getId() == R.id.add_one_score_teamA) {
            scoreTeamA += 1;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /*
     * Метод устанавливает 2 очка на табло
     */
    public void addTwoPoint(View view) {
        if (view.getId() == R.id.add_two_score_teamA) {
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /*
     * Метод устанавливает 3 очка на табло
     */
    public void addThreePoint(View view) {
        if (view.getId() == R.id.add_three_score_teamA) {
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        } else {
            scoreTeamB += 3;
            displayForTeamB(scoreTeamB);
        }
    }

    /*
     * Метод отображающий score в приложении в представлении с id = score_view
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_viewA);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Метод отображающий score в приложении в представлении с id = score_view
     */
    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_viewB);
        scoreView.setText(String.valueOf(score));
    }

    public void resetCounter(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
