package com.ismailhakkiaydin.togglebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public void clickStartStop(View view){

        ToggleButton toggleButton = (ToggleButton) view;
        LinearLayout pnl = (LinearLayout) toggleButton.getParent();

        if(toggleButton.isChecked()){
            pnl.setBackgroundColor(Color.CYAN);
        }else
            pnl.setBackgroundColor(Color.MAGENTA);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
