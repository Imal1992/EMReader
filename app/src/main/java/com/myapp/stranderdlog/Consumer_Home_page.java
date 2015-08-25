package com.myapp.stranderdlog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Consumer_Home_page extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer__home_page);
    }

    @Override
    public void onBackPressed() {

        final Intent intent = new Intent(this, Consumer_Home_page.class);
        startActivity(intent);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user__home_page, menu);
        return true;
    }
    public void go_profile(View view) {
        Intent intent = new Intent(this, UserProfile.class);
        startActivity(intent);
        finish();
    }
    public void go_camera(View view) {
        Intent intent2 = new Intent(this, ConsumerCameraActivity.class);
        this.startActivity(intent2);
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_signout) {
            Intent intent3 = new Intent(this, LoginActivity.class);
            this.startActivity(intent3);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
