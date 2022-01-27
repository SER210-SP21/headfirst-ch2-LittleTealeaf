package edu.quinnipiac.ser210.ser_210_demo_chapter_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner beerColor = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(beerColor.getSelectedItem());
        brands.setText(beerType);
    }
}