package com.knoxpo.rajivsonawala.bunkmanager;

import java.util.Date;

public class Bunk {

    private Date mDate;
    private boolean mIsChecked;

    public Bunk(Date date, boolean isChecked){
        mDate = date;
        mIsChecked = isChecked;
    }

    Bunk(Date date){
        this(date, false);
    }


}
