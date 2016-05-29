package com.led.led;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Custom extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        Button on1 = (Button)findViewById(R.id.button8);
        Button measurement = (Button)findViewById(R.id.button9);
        Button on2 = (Button)findViewById(R.id.button10);
        Button vibration = (Button)findViewById(R.id.button11);

        on1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ledControl.Start1();
            }
        });

        on2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ledControl.Start2();
            }
        });

        measurement.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ledControl.getDistance();
            }
        });

        vibration.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ledControl.getVibration();
            }
        });

    }

    private  void disconnect(){

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
