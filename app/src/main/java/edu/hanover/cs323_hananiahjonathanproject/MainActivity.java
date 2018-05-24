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

public class MainActivity extends Activity{

    //called when the main page is initiated
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ActionBar actionBar = getActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        //A listview with two options(foods & drinks)...gives you a option to choose both
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this,
                                    FoodActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Intent intent = new Intent(MainActivity.this,
                                    DrinkActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

    }

    //when the orderConfirmation button is clicked it calles on this message, when then queues the toast
    public void onClick(View view) {
        Intent intent = new Intent(this, OrderConfirmation.class);
        intent.putExtra(OrderConfirmation.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    private void setActionBarTitle(int position) {
//        String title;
//        if (position == 0) {
//            title = getResources().getString(R.string.app_name);
//        } else {
//            title = getResources().getString(R.string.app_name);
//        }
//        getActionBar().setTitle(title);
//    }
}
