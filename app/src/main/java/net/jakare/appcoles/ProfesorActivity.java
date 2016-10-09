package net.jakare.appcoles;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import net.jakare.appcoles.view.fragment.ProfesorMiasFragment;
import net.jakare.appcoles.view.fragment.ProfesorTodasFragment;

public class ProfesorActivity extends AppCompatActivity {

    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor);



        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.news);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.news:


//                       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//                       setSupportActionBar(toolbar);
//                       getSupportActionBar().setTitle("Noticias");

                        setContentView(R.layout.activity_profesor);
                        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
                        mTabHost.setup(getBaseContext(), getSupportFragmentManager(), android.R.id.tabcontent);

                        mTabHost.addTab(
                                mTabHost.newTabSpec("tab1").setIndicator("Todas", null),
                                ProfesorTodasFragment.class, null);
                        mTabHost.addTab(
                                mTabHost.newTabSpec("tab2").setIndicator("Mias", null),
                                ProfesorMiasFragment.class, null);

                        break;

                }
            }
        });


    }



    }





