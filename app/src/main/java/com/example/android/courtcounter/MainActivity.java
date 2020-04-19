package com.example.android.courtcounter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    /*
     * Метод onCreate выполняется во время запуска приложения
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /*
     * Метод устанавливает 1 очко на табло
     */
    public void setOnePoint(View view) {
        displayForTeamA(0);
    }

    /*
     * Метод устанавливает 2 очка на табло
     */
    public void setTwoPoint(View view) {
        displayForTeamA(2);
    }

    /*
     * Метод устанавливает 3 очка на табло
     */
    public void setThreePoint(View view) {
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    /*
     * Метод отображающий score в приложении в представлении с id = score_view
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_view);
        scoreView.setText(String.valueOf(score));
    }
}
