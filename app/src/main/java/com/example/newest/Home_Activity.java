package com.example.newest;
//6B33D0FF
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home_Activity extends AppCompatActivity {

    ImageView swim_log, run_log, cycle_log, skipping_rope_log,
            calories_goal_log, steps_goal_log, water_goal_log,sleepover_log;
    Button my_plan_for_today, my_statistics, record_day;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home_activity), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            //record workout logging
            swim_log = findViewById(R.id.swim_log);
            run_log = findViewById(R.id.run_log);
            cycle_log = findViewById(R.id.cycle_log);
            skipping_rope_log = findViewById(R.id.skipping_rope_log);


            //record goal logging
            calories_goal_log = findViewById(R.id.calories_goal_log);
            steps_goal_log = findViewById(R.id.steps_goal_log);
            water_goal_log = findViewById(R.id.water_goal_log);
            sleepover_log = findViewById(R.id.sleep_goal_log);


            //effective buttons
            my_plan_for_today = findViewById(R.id.my_plan);
            my_statistics = findViewById(R.id.stats);
            record_day = findViewById(R.id.record_day);

            //workout logging

            //swimming
            swim_log.setOnClickListener(v1 -> {

            });

            //running
            run_log.setOnClickListener(v1 -> {

            });

            //cycling
            cycle_log.setOnClickListener(v1 -> {

            });

            //skipping rope
            skipping_rope_log.setOnClickListener(v1 -> {

            });



            //goal logging

            //calories
            calories_goal_log.setOnClickListener(v1 -> {

            });

            //steps
            steps_goal_log.setOnClickListener(v1 -> {

            });

            //water
            water_goal_log.setOnClickListener(v1 -> {

            });

            //sleeping
            sleepover_log.setOnClickListener(v1 -> {


            });



            //switching to plan
            my_plan_for_today.setOnClickListener(v1 -> {
                Intent intent = new Intent(Home_Activity.this, daily_plan_activity.class);
                startActivity(intent);

            });
            //switching to statistics
            my_statistics.setOnClickListener(v1 -> {

            });

            //recording day
            record_day.setOnClickListener(v1 -> {

            });


            return insets;
        });
    }
}
