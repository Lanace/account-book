package com.lanace.accountbook.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Category implements Parcelable {
  private static final String TAG = Category.class.getSimpleName();

  private int id;
  private String name;
  private int priority;
  private Date regTimestamp;

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.name);
    dest.writeInt(this.priority);
    dest.writeLong(this.regTimestamp != null ? this.regTimestamp.getTime() : -1);
  }

  public Category() {
  }

  protected Category(Parcel in) {
    this.id = in.readInt();
    this.name = in.readString();
    this.priority = in.readInt();
    long tmpRegTimestamp = in.readLong();
    this.regTimestamp = tmpRegTimestamp == -1 ? null : new Date(tmpRegTimestamp);
  }

  public static final Parcelable.Creator<Category> CREATOR = new Parcelable.Creator<Category>() {
    @Override public Category createFromParcel(Parcel source) {
      return new Category(source);
    }

    @Override public Category[] newArray(int size) {
      return new Category[size];
    }
  };
}
