package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        dialog = new ProgressDialog(this);
    }

    public void SHOW(View v){
        dialog.setTitle("My Progress");
        dialog.setMessage("Please wait....");
        dialog.setIcon(R.drawable.logo);
        dialog.setCancelable(false);
        dialog.show();
      //  dialog.dismiss();
    }
}