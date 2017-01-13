package com.dpcompany.animate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean flag = true;

    public void fade(View view) {

        ImageView bart = (ImageView)findViewById(R.id.bart);
        ImageView mickey = (ImageView)findViewById(R.id.mickey);
        if(flag) {
            bart.animate().alpha(0f).setDuration(2000);
            mickey.animate().alpha(1f).setDuration(2000);
            flag = false;
        }
        else{
            mickey.animate().alpha(0f).setDuration(2000);
            bart.animate().alpha(1f).setDuration(2000);
            flag = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
