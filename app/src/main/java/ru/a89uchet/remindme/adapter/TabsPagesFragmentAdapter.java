package ru.a89uchet.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.a89uchet.remindme.fragment.ExampleFragment;

/**
 * Created by aleks on 20.05.17.
 */

public class TabsPagesFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;

    public TabsPagesFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
