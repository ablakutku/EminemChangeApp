package com.utkuablak.eminemchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.utkuablak.eminemchange.R.id.imageView5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void changeImage (View view) {
        ImageView imageView = (ImageView) findViewById(imageView5);
        Button button = findViewById(R.id.button20);

        imageView.setImageResource(R.drawable.eminem1);

        //SlimShady is Rap GOD !

    }

}
