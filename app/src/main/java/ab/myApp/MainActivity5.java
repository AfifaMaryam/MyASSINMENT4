package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity5 extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        progressBar = findViewById(R.id.progress);
        progressBar.setVisibility(View.VISIBLE);
    }
    public void Show(View v){
        progressBar.setVisibility(View.GONE);

    }
}