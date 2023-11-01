package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class ExerciseDetailActivity extends AppCompatActivity {

    private TextView exerciseNameTV,caloriesTV,timeTV,descTV;
    private LottieAnimationView exerciseLAV;
    private String exerciseName,desc;
    private int calories,time,id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        exerciseNameTV = findViewById(R.id.idTVExerciseName);
        caloriesTV = findViewById(R.id.idTVCalories);
        timeTV = findViewById(R.id.idTVTime);
        descTV = findViewById(R.id.idTVDescription);
        exerciseLAV = findViewById(R.id.idExerciseLAV);

        exerciseName = getIntent().getStringExtra("exerciseName");
        desc = getIntent().getStringExtra("desc");
        id = getIntent().getIntExtra("Exerciseid",0);
        calories = getIntent().getIntExtra("calories",0);
        time = getIntent().getIntExtra("time",0);

        exerciseNameTV.setText(exerciseName);
        caloriesTV.setText("Calories : "+calories);
        timeTV.setText("Time : "+time+" Min");
        descTV.setText(desc);
        exerciseLAV.setAnimation(id);
        exerciseLAV.loop(true);
        exerciseLAV.playAnimation();


    }
}