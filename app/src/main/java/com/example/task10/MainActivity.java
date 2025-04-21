package com.example.task10;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    ConstraintLayout screen;
    Switch swDN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton)findViewById(R.id.tb);
        swDN = (Switch)findViewById(R.id.swDN);
        screen = (ConstraintLayout)findViewById(R.id.main);

    }

    public void check_image(View view)
    {
        if (!swDN.isChecked() && !tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image1);
        }
        else if (!swDN.isChecked() && tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image2);
        }
        else if (swDN.isChecked() && !tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image3);
        }
        else
        {
            screen.setBackgroundResource(R.drawable.image4);

        }

    }
}