package com.haodong.criminalintent.frags;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.haodong.criminalintent.R;
import com.haodong.criminalintent.entity.Crime;

/**
 * @author linghailong
 * @date on 2018/11/4
 * @email 105354999@qq.com
 * @describe :
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedChexkBox;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime=new Crime();


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  v=inflater.inflate(R.layout.fragment_crime,container,false);
        initWidget(v);
        return v;
    }

    private void initWidget(View v) {
        mTitleField=v.findViewById(R.id.etv_crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mCrime.setmTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mDateButton=v.findViewById(R.id.btn_crime_frag_submit);
        mDateButton.setText(mCrime.getmDate().toString());
        mDateButton.setEnabled(false);
        mSolvedChexkBox=v.findViewById(R.id.crime_solved);
        mSolvedChexkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mCrime.setmSolved(b);
            }
        });
    }
}
