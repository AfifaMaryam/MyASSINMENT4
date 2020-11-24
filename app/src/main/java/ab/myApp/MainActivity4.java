package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity4 extends AppCompatActivity {
    NumberPicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        picker = findViewById(R.id.number);
        picker.setMaxValue(0);
        picker.setMaxValue(100);
        picker.setWrapSelectorWheel(true);

        int value = picker.getValue();

    }
}