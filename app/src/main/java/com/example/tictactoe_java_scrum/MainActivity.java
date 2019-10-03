package com.example.tictactoe_java_scrum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int turns;
    private ImageButton temp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sets background of the app
        ImageView imgView = findViewById(R.id.background);
        imgView.setImageResource(R.drawable.tic_tac_toe);

        Button reset = findViewById(R.id.button_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The board has been reset!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        ImageButton[] ls = new ImageButton[9];
        ImageButton iB = findViewById(R.id.input1);
        ImageButton iB2 = findViewById(R.id.input2);
        ImageButton iB3 = findViewById(R.id.input3);
        ImageButton iB4 = findViewById(R.id.input4);
        ImageButton iB5 = findViewById(R.id.input5);
        ImageButton iB6 = findViewById(R.id.input6);
        ImageButton iB7 = findViewById(R.id.input7);
        ImageButton iB8 = findViewById(R.id.input8);
        ImageButton iB9 = findViewById(R.id.input9);

        turns = 0;
        ls[0] = iB;
        ls[1] = iB2;
        ls[2] = iB3;
        ls[3] = iB4;
        ls[4] = iB5;
        ls[5] = iB6;
        ls[6] = iB7;
        ls[7] = iB8;
        ls[8] = iB9;


        for(final ImageButton i : ls){
//            temp = i;
            i.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if(turns%2==0)
                        i.setImageResource(R.drawable.tic_tac_toe_x);
                    else
                        i.setImageResource(R.drawable.tic_tac_toe_o);
                    turns++;
                }
            });
        }
        /*iB.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB = findViewById(R.id.input1);
                iB.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB2 = findViewById(R.id.input2);
                iB2.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB3 = findViewById(R.id.input3);
                iB3.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB4 = findViewById(R.id.input4);
                iB4.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB5 = findViewById(R.id.input5);
                iB5.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB6 = findViewById(R.id.input6);
                iB6.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB7 = findViewById(R.id.input7);
                iB7.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB8 = findViewById(R.id.input8);
                iB8.setImageResource(R.drawable.tic_tac_toe_x);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        iB9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ImageButton iB9 = findViewById(R.id.input9);
                iB9.setImageResource(R.drawable.tic_tac_toe_o);
                turns++;
                Toast toast = Toast.makeText(getApplicationContext(), "" + turns, Toast.LENGTH_SHORT);
                toast.show();
            }
        });*/

    }
}