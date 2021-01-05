package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox, sugarCheckBox, waterCheckBox, saltCheckBox, riceCheckBox, teaCheckBox,fruitsCheckBox, oilCheckBox;
    private Button showButton;
    private TextView resultTextView, bottomTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = (CheckBox) findViewById(R.id.milkCheckBoxId);
        sugarCheckBox = (CheckBox) findViewById(R.id.sugarCheckBoxId);
        waterCheckBox = (CheckBox) findViewById(R.id.waterCheckBoxId);
        saltCheckBox = (CheckBox) findViewById(R.id.saltCheckBoxId);
        riceCheckBox = (CheckBox) findViewById(R.id.riceCheckBoxId);
        teaCheckBox = (CheckBox) findViewById(R.id.teaCheckBoxId);
        fruitsCheckBox = (CheckBox) findViewById(R.id.fruitsCheckBoxId);
        oilCheckBox = (CheckBox) findViewById(R.id.oilCheckBoxId);

        showButton = (Button) findViewById(R.id.showButtonId);

        resultTextView = (TextView) findViewById(R.id.resultTextViewId);
        bottomTextView =(TextView) findViewById(R.id.bottomTextViewId); 

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();


                if (milkCheckBox.isChecked()){
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (sugarCheckBox.isChecked()){
                    String value = sugarCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }


                if (waterCheckBox.isChecked()){
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (saltCheckBox.isChecked()){
                    String value = saltCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (riceCheckBox.isChecked()){
                    String value = riceCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (teaCheckBox.isChecked()){
                    String value = teaCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (fruitsCheckBox.isChecked()){
                    String value = fruitsCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                if (oilCheckBox.isChecked()){
                    String value = oilCheckBox.getText().toString();
                    stringBuilder.append(value +" is ordered" + "\n");
                }

                resultTextView.setText(stringBuilder);
                bottomTextView.setText("Please Collect Your order" +"\n & Thanks for Comming");
            }
        });

    }
}