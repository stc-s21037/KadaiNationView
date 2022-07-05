package jp.suntech.s21037.kadainationview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView LvMenu = findViewById(R.id.lvMenu);
        LvMenu.setOnItemClickListener(new ListItemClickListener());

    }
    

    private class ListItemClickListener implements AdapterView.OnItemClickListener {


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int positon, long id) {
            //タップされた定食名取得
            TextView output = findViewById(R.id.gName);
            //String item = (String)parent.getItemAtPosition(positon);
            TextView tvText=(TextView)view;
            String item=tvText.getText().toString();
            output.setText(item);


        }
    }
}