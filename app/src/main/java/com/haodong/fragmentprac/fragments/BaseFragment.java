package com.haodong.fragmentprac.fragments;

import android.support.v4.app.Fragment;

import butterknife.Unbinder;

/**
 * @author linghailong
 * @date on 2018/11/4
 * @email 105354999@qq.com
 * @describe :
 */
public class BaseFragment extends Fragment {
    protected boolean isViewCreated=false;
    private final String TAG=this.getClass().getSimpleName();
    private Unbinder unbinder;

}
