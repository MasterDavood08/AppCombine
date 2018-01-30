package com.example.master.appcombine;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.master.appcombine.TabFragment.Fragment1;
import com.example.master.appcombine.TabFragment.Fragment3;
import com.example.master.appcombine.TabFragment.Fragment2;
import com.example.master.appcombine.TabFragment.Fragment4;
import com.example.master.appcombine.TabFragment.Fragment5;
import com.example.master.appcombine.TabFragment.Fragment6;
import com.example.master.appcombine.TabFragment.Fragment7;

public class CalActivity extends BaseActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        setToolbar();

        setupViewPager();

        setUpTabLayout();

//        CustomTextView textView = (CustomTextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        textView.setText("one");
//        textView.setGravity(Gravity.CENTER);
//        textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_close_black_24dp, 0, 0);
//        tabLayout.getTabAt(0).setCustomView(textView);
    }


    private void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbarTab);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
    }

    private void setupViewPager() {
        viewPager = (ViewPager) findViewById(R.id.tabviewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "ابزار مورد نیاز اندازه گیری");
        adapter.addFragment(new Fragment2(), "اندازه گیری تلفات پيش از برداشت");
        adapter.addFragment(new Fragment3(), "اندازه گیری تلفات سكوی برش");
        adapter.addFragment(new Fragment4(), "اندازه گیری تلفات واحد كوبنده (خرمنكوب)");
        adapter.addFragment(new Fragment5(), "محاسبه عملكرد محصول");
        adapter.addFragment(new Fragment6(), "تأثير سرعت پيشروی");
        adapter.addFragment(new Fragment7(), "کمباین های مجهز به نمایشگر تلفات دانه");
        viewPager.setAdapter(adapter);
    }

    private void setUpTabLayout() {
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        changeTabsFont();

//        tabLayout.setSelectedTabIndicatorHeight(8);
    }

    private void changeTabsFont() {

        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    Typeface type = Typeface.createFromAsset(getAssets(),"iranS.ttf");
                    ((TextView) tabViewChild).setTypeface(type);
                }
            }
        }
    }
}
