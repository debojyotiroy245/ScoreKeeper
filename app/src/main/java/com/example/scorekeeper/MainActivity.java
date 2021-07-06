package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScoreTeamA(View view){
        if(view.getId()==R.id.addThreeA){
            scoreA+=3;
        }
        else if(view.getId()==R.id.addTwoA){
            scoreA+=2;
        }
        else if(view.getId()==R.id.addOneA){
            scoreA+=1;
        }
        updateA(scoreA);
    }

    public void addScoreTeamB(View view){
        if(view.getId()==R.id.addThreeB){
            scoreB+=3;
        }
        if(view.getId()==R.id.addTwoB){
            scoreB+=2;
        }
        if(view.getId()==R.id.addOneB){
            scoreB+=1;
        }
        updateB(scoreB);
    }
    public void reset(View view){
        updateA(scoreA = 0);
        updateB(scoreB = 0);
    }
    public void updateA(int scoreA){
        TextView updateA = (TextView) findViewById(R.id.teamA_text_view);
        updateA.setText(""+scoreA);
    }
    public void updateB(int scoreB){
        TextView updateB = (TextView) findViewById(R.id.teamB_text_view);
        updateB.setText(""+scoreB);
    }
}