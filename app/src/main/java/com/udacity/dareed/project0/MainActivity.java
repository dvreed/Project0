package com.udacity.dareed.project0;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void spotifyEvent(View view) {
        this.showToast("This button will launch my Spotify Streamer app!");
    }

    public void scoresEvent(View view) {
        this.showToast("This button will launch my Scores app!");
    }

    public void libraryEvent(View view) {
        this.showToast("This button will launch my Library app!");
    }

    public void biggerEvent(View view) {
        this.showToast("This button will launch my Build it Bigger app!");
    }

    public void xyzEvent(View view) {
        this.showToast("This button will launch my XYZ reader app!");
    }

    public void capstoneEvent(View view) {
        this.showToast("This button will launch my Capstone project!");
    }
}
