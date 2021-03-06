package com.haodong.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haodong.criminalintent.frags.CrimeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // 父类容器
        Fragment fragment = fm.findFragmentById(R.id.container_main);
        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction()
            .add(R.id.frag_container, fragment)
            .commit();
        }

    }
}
