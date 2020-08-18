package com.lanace.accountbook.utile;

import java.text.DecimalFormat;

public class StringUtile {
  private static final String TAG = StringUtile.class.getSimpleName();

  public static String getPriceFormat(int price) {
    return new DecimalFormat("#,###").format(price);
  }
}
