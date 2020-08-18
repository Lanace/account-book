package com.lanace.accountbook.domain.home;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lanace.accountbook.R;
import com.lanace.accountbook.base.BaseActivity;

public class HomeActivity extends BaseActivity{
  private static final String TAG = HomeActivity.class.getSimpleName();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
  }
}
