package ab.myApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void ShowPopup(View v){
        PopupMenu popup = new PopupMenu(MainActivity8.this,v);
        popup.getMenuInflater().inflate(R.menu.my_menu,popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity8.this,item.getTitle(), Toast.LENGTH_SHORT ).show();
                return true;
            }
        });

        popup.show();
    }
}