package com.knoxpo.rajivsonawala.bunkmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class bunkManager extends AppCompatActivity {

    private static final String TAG = bunkManager.class.getSimpleName();

    private List<Bunk> mBunks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunk_manager);

        init();

    }

    private void init() {
        Calendar c = Calendar.getInstance();
        int maxDays = c.getActualMaximum(Calendar.DATE);

        for (int i = 0; i < maxDays; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, 1);
            calendar.add(Calendar.DATE, i);
            Date date = calendar.getTime();
            Bunk bunk = new Bunk(date);
            mBunks.add(bunk);
        }


    }
}
