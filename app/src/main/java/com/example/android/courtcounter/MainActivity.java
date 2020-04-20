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
    //boolean timerIsStarted = false; //для таймера
    //int time = 600; // для таймера

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
     * Метод устанавливает 1 очко на табло, при условии, что таймер запущен
     */
    public void addOnePoint(View view) {
        if (view.getId() == R.id.add_one_score_teamA/* && timerIsStarted*/) {
            scoreTeamA += 1;
            displayForTeamA(scoreTeamA);
        } else if (view.getId() == R.id.add_one_score_teamB/* && timerIsStarted*/) {
            scoreTeamB += 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /*
     * Метод устанавливает 2 очка на табло, при условии, что таймер запущен
     */
    public void addTwoPoint(View view) {
        if (view.getId() == R.id.add_two_score_teamA/* && timerIsStarted*/) {
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        } else if (view.getId() == R.id.add_two_score_teamB/* && timerIsStarted*/) {
            scoreTeamB += 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /*
     * Метод устанавливает 3 очка на табло, при условии, что таймер запущен
     */
    public void addThreePoint(View view) {
        if (view.getId() == R.id.add_three_score_teamA/* && timerIsStarted */) {
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        } else if (view.getId() == R.id.add_three_score_teamB/* && timerIsStarted*/) {
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
    /*
    * Метод сбрасывает счет игры и время
     */
    public void resetCounter(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        //time = 600; // для таймера
        //timerIsStarted = false; // для таймера
    }

    /*
    * Метод устанавливает таймер
     */
//    public void timer(View view) {
//
//        try {
//            while (time != 0) {
//                //Thread.sleep(1000);
//                time--;
//                displayTimer(time);
//                timerIsStarted = true;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    private void displayTimer(int time) {
//        TextView timer = (TextView) findViewById(R.id.timer);
//        timer.setText(String.valueOf(time));
//    }
}
