package muz.coffeemix.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       // Widget

        TextView tvTextView = findViewById(R.id.tvHello);
        tvTextView.setText("Yeah!!!");


    }
}
