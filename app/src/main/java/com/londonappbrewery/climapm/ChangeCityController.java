package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the layout
        setContentView(R.layout.change_city_layout);
        //Attach the UI to the proper object
        final EditText editTextField = findViewById(R.id.queryET);
         ImageButton backButton = findViewById(R.id.backButton);
        //Go back to the main layout
         backButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 finish();
             }
         });
         editTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
             @Override
             public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                 String newCity = editTextField.getText().toString();
                 Intent newCityIntent = new Intent(ChangeCityController.this,WeatherController.class);
                 newCityIntent.putExtra("City",newCity);
                 startActivity(newCityIntent);
                 return false;
             }
         });
    }
}
