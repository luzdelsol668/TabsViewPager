package coding.dev.studio.tabsViewerpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    Toolbar mToolbar;
    TabLayout mAppBarLayout;

    MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mAppBarLayout = findViewById(R.id.mainTabs);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Whatsapp");

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.pager);
        mViewPager.setAdapter(myPagerAdapter);
        mAppBarLayout.setupWithViewPager(mViewPager);


    }
}
