package com.example.redgreenblue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView_large = (ImageView) findViewById(R.id.imageView_large);
        SeekBar tuner = (SeekBar) findViewById(R.id.seekBar_tuner);

        // load the image file in the ImageView
        // alternate solution: see activity_mail.xml:  android:src="@drawable/drawing"
        imageView_large.setImageResource(R.drawable.ic_launcher_foreground);

        // attach a listener to the seekBar to tract the value selected by the user
        tuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            // last known position of the cursor
            int lastProgress;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // update last known position of the cursor
                lastProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // the user released the cursor, apply a new colored filter to the image
                imageView_large.setColorFilter(Color.argb(255, 0, lastProgress, 255 - lastProgress));
            }

        });
    }
}
