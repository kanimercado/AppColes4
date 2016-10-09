package net.jakare.appcoles;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import net.jakare.appcoles.view.fragment.PadreNoticiasFragment;

public class PadreActivity extends AppCompatActivity {

    private FragmentTabHost mTabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padre);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.news);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.news:

                        PadreNoticiasFragment padreNoticiasFragment = new PadreNoticiasFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, padreNoticiasFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                        break;

                }
            }
        });


    }
}
