package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity3 extends AppCompatActivity {
    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        chronometer = findViewById(R.id.meter);
    }

    public void Operations(View v) {
        if (v == findViewById(R.id.b1)) {
            chronometer.start();

        }
        if (v == findViewById(R.id.b2)) {
            chronometer.stop();

        }
        if (v == findViewById(R.id.b3)) {
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();

        }
        if (v == findViewById(R.id.b4)) {
            chronometer.setFormat("StopWatch (%s)");

        }

    }
}