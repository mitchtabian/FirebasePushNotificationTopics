package com.tabian.firebasepushnotifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("NEWYORK_WEATHER");
        //FirebaseMessaging.getInstance().unsubscribeFromTopic("NEWYORK_WEATHER");
    }
}
