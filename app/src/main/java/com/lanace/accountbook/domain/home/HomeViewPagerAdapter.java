package com.lanace.accountbook.domain.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class HomeViewPagerAdapter extends FragmentStatePagerAdapter {

  public HomeViewPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override public Fragment getItem(int position) {
    return null;
  }

  @Override public int getCount() {
    return 0;
  }
}
