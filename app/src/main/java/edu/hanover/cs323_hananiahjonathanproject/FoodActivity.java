package edu.hanover.cs323_hananiahjonathanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;
import android.view.Menu;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.app.ActionBar;

//code for food page
public class FoodActivity extends Activity {

    //called when the food page is initiated
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
//        ActionBar actionBar = getActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    //when the button on this page is clicked it calls the on this method
    public void onClick(View view) {
        Intent intent = new Intent(this, AddFood.class);
        intent.putExtra(AddFood.EXTRA_MESSAGE,
                getResources().getString(R.string.add));
        startService(intent);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

}
