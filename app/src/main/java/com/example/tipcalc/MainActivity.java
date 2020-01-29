package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText bill;
    private EditText member;
    private RadioButton fifteen;
    private RadioButton eighteen;
    private EditText tip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bill = findViewById(R.id.bill);
        member = findViewById(R.id.member);
        fifteen = findViewById(R.id.fifteen);
        eighteen = findViewById(R.id.eighteen);
        tip = findViewById(R.id.tip);
    }

    public void convert (View v) {
        if (fifteen.isChecked()) {
            String input = bill.getText().toString();
            if(input.length()>0) {
                String inputTwo = member.getText().toString();
                if(inputTwo.length()>0) {
                    double billNum = Double.parseDouble(input);
                    double memNum = Double.parseDouble(inputTwo);
                    double tipNum = (((billNum * 0.15) + billNum) / memNum);
                    tip.setText(String.format("%.2f", tipNum));
                }
            } else{
                Toast.makeText(this, "No Bill Entered", Toast.LENGTH_SHORT).show();
            }

;        }
        else if (eighteen.isChecked()) {
            String input = bill.getText().toString();
            if (input.length()>0) {
                String inputTwo = member.getText().toString();
                if(inputTwo.length()>0) {
                    double billNum = Double.parseDouble(input);
                    double memNum = Double.parseDouble(inputTwo);
                    double tipNum = (((billNum * 0.18) + billNum) / memNum);
                    tip.setText(String.format("%.2f", tipNum));
                }
            } else{
                Toast.makeText(this, "No Bill Entered", Toast.LENGTH_SHORT).show();
            }
        }

        else {
            String input = bill.getText().toString();
            if (input.length()>0) {
                String inputTwo = member.getText().toString();
                if(inputTwo.length()>0) {
                    double billNum = Double.parseDouble(input);
                    double memNum = Double.parseDouble(inputTwo);
                    double tipNum = (((billNum * 0.20) + billNum) / memNum);
                    tip.setText(String.format("%.2f", tipNum));
                }
            }else{
                Toast.makeText(this, "No Bill Entered", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
