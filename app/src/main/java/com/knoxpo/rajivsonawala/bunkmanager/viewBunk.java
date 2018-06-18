package com.knoxpo.rajivsonawala.bunkmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SearchView;
import android.widget.TextView;

public class viewBunk extends Fragment{


    setBunk bunk;
    private TextView mYourDay;
    private TextView mYourDate;
    private CheckBox mCheckBox;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_bunk_first,container,false);

        mYourDate=(TextView)v.findViewById(R.id.your_Date);

        mYourDay=(TextView)v.findViewById(R.id.your_Day);

        mCheckBox=(CheckBox)v.findViewById(R.id.bunk_choice);

        mYourDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mYourDate.setText(bunk.getCal().toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mYourDay.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mYourDate.setText(bunk.getCal().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                bunk.setCheck(isChecked);

            }
        });



        return v;
    }



}
