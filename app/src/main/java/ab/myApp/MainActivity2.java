package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        datePicker = findViewById(R.id.datePick);
    }

    public void ShowDate(View v){
        int day = datePicker.getDayOfMonth();
        int Month = datePicker.getMonth()+1;
        int year = datePicker.getYear();
        Toast.makeText(this, day+"-"+Month+"-"+year, Toast.LENGTH_SHORT).show();
    }
}