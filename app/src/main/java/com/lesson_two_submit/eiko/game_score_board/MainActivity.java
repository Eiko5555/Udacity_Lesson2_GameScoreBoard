package com.lesson_two_submit.eiko.game_score_board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score49rs = 0;
    int scorePanthers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display49rs(score49rs);
        displayPanthers(scorePanthers);
    }
    public void display49rs(int score){
        TextView point49rs = (TextView)findViewById(R.id.ninersScore);
        point49rs.setText(String.valueOf(score));
    }
    public void displayPanthers(int score){
        TextView pointPanthers = (TextView)findViewById(R.id.pantherScore);
        pointPanthers.setText(String.valueOf(score));
    }
    public void touchDown49(View v){
        score49rs += 6;
        display49rs(score49rs);
    }
    public void fieldGoal49(View v){
        score49rs += 3;
        display49rs(score49rs);
    }
    public void conversion49(View v){
        score49rs += 2;
        display49rs(score49rs);
    }
    public void safety49(View v){
        score49rs += 2;
        display49rs(score49rs);
    }
    public void fieldKick49(View v){
        score49rs += 1;
        display49rs(score49rs);
    }
    public void touchDownPanther(View v){
        scorePanthers += 6;
        displayPanthers(scorePanthers);
    }
    public void fieldGoalPanther(View v){
        scorePanthers += 3;
        displayPanthers(scorePanthers);
    }
    public void conversionPanther(View v){
        scorePanthers += 2;
        displayPanthers(scorePanthers);
    }
    public void safetyPanther(View v){
        scorePanthers += 2;
        displayPanthers(scorePanthers);
    }
    public void fieldKickPanther(View v){
        scorePanthers += 1;
        displayPanthers(scorePanthers);
    }
    public void reset(View v){
        score49rs = 0;
        scorePanthers = 0;
        display49rs(score49rs);
        displayPanthers(scorePanthers);
    }
}
