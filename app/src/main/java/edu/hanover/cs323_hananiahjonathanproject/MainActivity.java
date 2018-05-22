package edu.hanover.cs323_hananiahjonathanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, OrderConfirmation.class);
        intent.putExtra(OrderConfirmation.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }
}
