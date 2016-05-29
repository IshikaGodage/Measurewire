package com.led.led;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Cloth extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth);

        Button button1 = (Button)findViewById(R.id.button14);
        Button button2 = (Button)findViewById(R.id.button12);
        Button button3 = (Button)findViewById(R.id.button15);
        Button button4 = (Button)findViewById(R.id.button16);
        Button button5 = (Button)findViewById(R.id.button17);
        Button button6 = (Button)findViewById(R.id.button18);
        Button button7 = (Button)findViewById(R.id.button19);
        Button button8 = (Button)findViewById(R.id.button20);



        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.neck);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.chest);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.waist);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.shoulder);
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.wrist);
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.sleeve);
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.bicep);
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageButton btn1=(ImageButton)findViewById(R.id.imageButton);
                btn1.setImageResource(R.drawable.shirtl);
            }
        });


    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cloth, menu);
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
