package com.ejeppinger.parkpgh;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class BeginParking extends AppCompatActivity {

    Button button1;
    static final int DIALOG_ID = 0;
    int hour_x;
    int min_x;
    public int location_number = 58326;
    public int minutes_until_time_up;
    protected TimePickerDialog.OnTimeSetListener TimePickerListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hour_x = hourOfDay;
            min_x = minute;
            Toast.makeText(BeginParking.this, hour_x + " : " + min_x, Toast.LENGTH_LONG).show();
            minutes_until_time_up = (hourOfDay - hour_x) * 60 + (minute - min_x);
            setContentView(R.layout.activity_parking_number);

        }
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_parking);

        showTimePickerDialog();

        //final TimePicker = (TimePicker) findViewById(R.id.timePicker);

        //final Button firstButton = (Button) findViewById(R.id.beginParking);
        //final Button secondButton = (Button) findViewById(R.id.parkFor);


    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id == DIALOG_ID)
            return new TimePickerDialog(BeginParking.this, TimePickerListener, hour_x, min_x, false);
        return null;
    }


    public void showTimePickerDialog(){
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showDialog(DIALOG_ID);
                    }
                }
        );
    }

}
