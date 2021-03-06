package com.android.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.android.customview.activity.LoveActivity;
import com.android.customview.activity.MessageBubbleActivity;
import com.android.customview.activity.YahooLoadingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.yahoo) {
            Intent intent = new Intent(this, YahooLoadingActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.love) {
            Intent intent = new Intent(this, LoveActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.messageBubble) {
            Intent intent = new Intent(this, MessageBubbleActivity.class);
            startActivity(intent);
        }
    }
}