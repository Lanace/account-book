package com.lanace.accountbook.domain.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lanace.accountbook.R;
import com.lanace.accountbook.base.BaseActivity;
import com.lanace.accountbook.model.History;

public class RegistrationActivity extends BaseActivity {
  private static final String TAG = RegistrationActivity.class.getSimpleName();

  private static final String PARAM_HISTORY = "PARAM_HISTORY";
  private static final String PARAM_IS_EDITMODE = "PARAM_IS_EDITMODE";

  private History history;
  private boolean isEditMode;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration);

    this.history = getIntent().getParcelableExtra(PARAM_HISTORY);
    this.isEditMode = getIntent().getBooleanExtra(PARAM_IS_EDITMODE, false);
  }

  public static Intent intent(Context context, History history, boolean isEditMode) {
    Intent intent = new Intent(context, RegistrationActivity.class);
    intent.putExtra(PARAM_HISTORY, history);
    intent.putExtra(PARAM_IS_EDITMODE, isEditMode);

    return intent;
  }
}
