package org.redsoft.navaigtionbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView myNavigation;

    FrameLayout myFrameLayout;

    BlankFragment blankfragementt;
    setting seetingFramgent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myNavigation =  (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        myFrameLayout =  (FrameLayout) findViewById(R.id.theFrameLayoutid);
        blankfragementt = new BlankFragment();
        seetingFramgent = new setting();



        myNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId())
                {

                    case R.id.homeId:
                        instalizFragment(blankfragementt);
                        return true;
                    case R.id.Favourit:
                        instalizFragment(seetingFramgent);
                        return true;

                }
                return false;
            }
        });






    }


    private void instalizFragment(Fragment framnets)
    {
        FragmentTransaction fragmentTransaction =  getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.theFrameLayoutid,framnets);
        fragmentTransaction.commit();
    }
}
