package com.udacity.dareed.project0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

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
        this.showToast(getString(R.string.spotify_toast));
    }

    public void scoresEvent(View view) {
        this.showToast(getString(R.string.scores_toast));
    }

    public void libraryEvent(View view) {
        this.showToast(getString(R.string.library_toast));
    }

    public void biggerEvent(View view) {
        this.showToast(getString(R.string.bigger_toast));
    }

    public void xyzEvent(View view) {
        this.showToast(getString(R.string.xyz_toast));
    }

    public void capstoneEvent(View view) {
        this.showToast(getString(R.string.capstone_toast));
    }
}
