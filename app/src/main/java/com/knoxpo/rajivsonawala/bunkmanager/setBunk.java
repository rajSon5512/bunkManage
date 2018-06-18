package com.knoxpo.rajivsonawala.bunkmanager;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class setBunk {


    private UUID mId;
    private Calendar mCal;
    private Boolean mCheck;


    setBunk() {

        mId = UUID.randomUUID();

        Date d = new Date();


        int lastDate = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDate = 0;

        for (int i = firstDate; i < lastDate; i++) {
            mCal= Calendar.getInstance();
            mCal.set(Calendar.DATE, 1);
            mCal.add(Calendar.DATE, i);
            d = mCal.getTime();
        }
    }



    public UUID getId() {
        return mId;
    }

    public Calendar getCal() {
        return mCal;
    }

    public void setCal(Calendar cal) {
        mCal = cal;
    }

    public Boolean getCheck() {
        return mCheck;
    }

    public void setCheck(Boolean check) {
        mCheck = check;
    }


}
