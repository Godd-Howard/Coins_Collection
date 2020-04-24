package com.example.coinscollection;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private TextView result1;
    private TextView result2;

    private int total, dollars, cents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result1 = findViewById(R.id.textView);
        result2 = findViewById(R.id.textView2);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int quarter = intent.getIntExtra("inQ", 0);
        int dime = intent.getIntExtra("inD", 0);
        int nickel = intent.getIntExtra("inN", 0);
        int penny = intent.getIntExtra("inP", 0);

        result1.setText("Hello, " + name);

        total = quarter*25 + dime*10 + nickel*5 + penny;
        dollars = total/100;
        cents = total % 100;

        if(dollars == 1 && cents == 1) {
            result2.setText("Your coins are worth " + dollars + " dollar and " + cents + " cent. Bye!");
        }
        else if(dollars == 1) {
            result2.setText("Your coins are worth " + dollars + " dollar and " + cents + " cents. Bye!");
        }
        else if(cents == 1){
            result2.setText("Your coins are worth " + dollars + " dollars and " + cents + " cent. Bye!");
        }
        else{
            result2.setText("Your coins are worth " + dollars + " dollars and " + cents + " cents. Bye!");
        }
    }
}
