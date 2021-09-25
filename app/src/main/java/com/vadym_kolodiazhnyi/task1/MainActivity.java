package com.vadym_kolodiazhnyi.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);

        String text = "";

        if (checkBox.isChecked()) {
            text = "with checked";
        } else {
            text = "";
        }
        Toast.makeText(this, "The button has been clicked!" + text, Toast.LENGTH_SHORT).show();
    }
}