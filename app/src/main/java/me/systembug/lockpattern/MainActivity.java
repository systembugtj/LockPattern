package me.systembug.lockpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import haibison.android.lockpattern.LockPatternActivity;

import static haibison.android.lockpattern.LockPatternActivity.ACTION_CREATE_PATTERN;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, LockPatternActivity.class);
        i.setAction(ACTION_CREATE_PATTERN);
        startActivity(i);
    }
}
