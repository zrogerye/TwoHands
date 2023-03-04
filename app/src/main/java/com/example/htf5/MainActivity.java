package com.example.htf5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);


    }

    private void setSingleEvent(GridLayout mainGrid){
        for(int i = 0; i < mainGrid.getChildCount(); i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener((view) ->{
                if(finalI == 0){
                    Intent intent = new Intent(MainActivity.this, Item1Details.class);
                    startActivity(intent);
                }
                if(finalI == 1){
                    Intent intent = new Intent(MainActivity.this, Item2Details.class);
                    startActivity(intent);
                }
                if(finalI == 2){
                    Intent intent = new Intent(MainActivity.this, Item3Details.class);
                    startActivity(intent);
                }
                if(finalI == 3){
                    Intent intent = new Intent(MainActivity.this, Item4Details.class);
                    startActivity(intent);
                }
                if(finalI == 4){
                    Intent intent = new Intent(MainActivity.this, Item5Details.class);
                    startActivity(intent);
                }
                if(finalI == 5){
                    Intent intent = new Intent(MainActivity.this, Item6Details.class);
                    startActivity(intent);
                }
                if(finalI == 6){
                    Intent intent = new Intent(MainActivity.this, Item7Details.class);
                    startActivity(intent);
                }
                if(finalI == 7){
                    Intent intent = new Intent(MainActivity.this, Item8Details.class);
                    startActivity(intent);
                }
                if(finalI == 8){
                    Intent intent = new Intent(MainActivity.this, Item9Details.class);
                    startActivity(intent);
                }
                if(finalI == 9){
                    Intent intent = new Intent(MainActivity.this, Item10Details.class);
                    startActivity(intent);
                }
                if(finalI > 9){
                    Toast.makeText(MainActivity.this, "No Item To Be Shown", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}