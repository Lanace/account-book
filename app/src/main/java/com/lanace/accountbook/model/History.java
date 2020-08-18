package com.lanace.accountbook.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class History implements Parcelable {

  enum HistoryType {
    INCOME, EXPENSE
  }

  private int id;
  private String message;
  private Category category;
  private HistoryType historyType;
  private int price;
  private Date regTimestamp;

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.message);
    dest.writeParcelable(this.category, flags);
    dest.writeInt(this.historyType == null ? -1 : this.historyType.ordinal());
    dest.writeInt(this.price);
    dest.writeLong(this.regTimestamp != null ? this.regTimestamp.getTime() : -1);
  }

  public History() {
  }

  protected History(Parcel in) {
    this.id = in.readInt();
    this.message = in.readString();
    this.category = in.readParcelable(Category.class.getClassLoader());
    int tmpHistoryType = in.readInt();
    this.historyType = tmpHistoryType == -1 ? null : HistoryType.values()[tmpHistoryType];
    this.price = in.readInt();
    long tmpRegTimestamp = in.readLong();
    this.regTimestamp = tmpRegTimestamp == -1 ? null : new Date(tmpRegTimestamp);
  }

  public static final Parcelable.Creator<History> CREATOR = new Parcelable.Creator<History>() {
    @Override public History createFromParcel(Parcel source) {
      return new History(source);
    }

    @Override public History[] newArray(int size) {
      return new History[size];
    }
  };
}
