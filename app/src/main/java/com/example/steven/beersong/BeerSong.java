package com.example.steven.beersong;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class BeerSong extends ActionBarActivity {
    int beerNum = 99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_song);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outPutSong();
            }
        });
    }

    public void outPutSong(){

        String word = "bottles";

        if (beerNum == 1){
            word = "bottle";
        }
        Toast.makeText(this,beerNum + " " + word + "of beer on the wall" ,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,beerNum + " " + word + "of beer." ,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Take one down." ,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Pass it around." ,Toast.LENGTH_SHORT).show();

        beerNum = beerNum - 1;

        if (beerNum > 0) {
            Toast.makeText(this,beerNum + " " + word + " of beer on the wall" ,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"No more bottles of beer on the wall" ,Toast.LENGTH_SHORT).show();


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_beer_song, menu);
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
