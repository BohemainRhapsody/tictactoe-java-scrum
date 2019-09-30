package com.example.tictactoe_java_scrum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sets background of the app
        ImageView imgView = findViewById(R.id.background);
        imgView.setImageResource(R.drawable.tic_tac_toe);

        Button reset = findViewById(R.id.button_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // reset board
            }
        });

    }
}
