package edu.hanover.cs323_hananiahjonathanproject;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

//Class so we can add the chosen food to the customer's order
public class AddFood extends IntentService {
    public static final String EXTRA_MESSAGE = "message";
    private Handler handler;

    public AddFood() {
        super("AddFood");
    }

    //called everytime a client starts a service
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler = new Handler();
        return super.onStartCommand(intent, flags, startId);
    }

    //Method that makes the toast functional
    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this) {
            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        showText(text);
    }

    //Displays the text after the button is clicked
    private void showText(final String text) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
