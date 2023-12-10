package com.example.project14;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class carwash extends AppCompatActivity {
    double ExteriorWASH;
    double ExteriorWashVacuum;
    int washes;
    double Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carwash);
        final EditText NumofWashes = findViewById(R.id.tvWash);
        final RadioButton rbExteriorwash = (RadioButton) findViewById(R.id.rbExteriorwash);
        final RadioButton rbExteriorvac = (RadioButton) findViewById(R.id.rbExteriorvac);
        final TextView result = (TextView) findViewById(R.id.tvResult);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                washes = Integer.parseInt(NumofWashes.getText().toString());
                DecimalFormat cost = new DecimalFormat("$###,###.00");
                if (rbExteriorwash.isChecked()) {
                    if (washes >= 12) {
                        ExteriorWASH = 8.99;
                        Total = washes * ExteriorWASH;
                        result.setText(cost.format(Total) + " for " + washes + " washes");
                    } else {
                        Toast.makeText(carwash.this, "Buy 12 or more washes to receive discount prices",
                                Toast.LENGTH_LONG).show();
                        ExteriorWashVacuum = 10.99;
                        Total = washes * ExteriorWASH;
                        result.setText(cost.format(Total) + " for " + washes + " washes");
                    }
                }
                if (rbExteriorvac.isChecked()) {
                    if (washes >= 12) {
                        ExteriorWashVacuum = 12.99;
                        Total = washes * ExteriorWashVacuum; // Corrected variable name here
                        result.setText(cost.format(Total) + " for " + washes + " washes");
                    } else {
                        Toast.makeText(carwash.this, "Buy 12 or more washes to receive discount prices",
                                Toast.LENGTH_LONG).show();
                        ExteriorWashVacuum = 15.99;
                        Total = washes * ExteriorWashVacuum; // Corrected variable name here
                        result.setText(cost.format(Total) + " for " + washes + " washes");
                    }
                }
            }
        });
    }
}
