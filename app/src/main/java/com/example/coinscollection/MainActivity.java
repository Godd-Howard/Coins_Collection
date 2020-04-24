package com.example.coinscollection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     private  String name;
     private  int quarter, dime, nickel, penny;

     private EditText nameInput;
     private EditText inQ;
     private EditText inD;
     private EditText inN;
     private EditText inP;

     private Button enterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.editText);
        inQ = findViewById(R.id.editText2);
        inD = findViewById(R.id.editText3);
        inN = findViewById(R.id.editText4);
        inP = findViewById(R.id.editText5);

        enterButton = findViewById(R.id.button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                name = nameInput.getText().toString();
                quarter = Integer.parseInt(inQ.getText().toString());
                dime = Integer.parseInt(inD.getText().toString());
                nickel = Integer.parseInt(inN.getText().toString());
                penny = Integer.parseInt(inP.getText().toString());

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("name", name);
                intent.putExtra("inQ", quarter);
                intent.putExtra("inD", dime);
                intent.putExtra("inN", nickel);
                intent.putExtra("inP", penny);

                startActivity(intent);

            }
        });

    }
}
