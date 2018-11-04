package com.haodong.criminalintent;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author linghailong
 * @date on 2018/11/3
 * @email 105354999@qq.com
 * @describe :
 */
public class BaseFragment extends Fragment {
    private final String TAG=this.getClass().getSimpleName();
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_crime,container,false);
        return view;
    }
}
