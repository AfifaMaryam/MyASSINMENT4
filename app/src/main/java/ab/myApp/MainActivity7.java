package ab.myApp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
   public void ShowAlert(View v){
       AlertDialog.Builder dialog = new AlertDialog.Builder(this);
       dialog.setTitle("My Progress");
       dialog.setMessage("are you sure?");
       dialog.setIcon(R.drawable.logo);
       dialog.setCancelable(false);
       LayoutInflater inflate =(this).getLayoutInflater();
       View dialogView =inflate.inflate(R.layout.date_dialog,null);
       dialog.setView(dialogView);

       dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(MainActivity7.this,"Clicked", Toast.LENGTH_SHORT ).show();

           }
       });
       dialog.show();
   }
}