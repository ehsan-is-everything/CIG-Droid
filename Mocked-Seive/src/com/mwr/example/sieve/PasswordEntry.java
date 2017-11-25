package com.mwr.example.sieve;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PasswordEntry
  implements Parcelable
{
  public static final Parcelable.Creator<PasswordEntry> CREATOR = new Parcelable.Creator()
  {
    public PasswordEntry createFromParcel(Parcel paramAnonymousParcel)
    {
      return new PasswordEntry(paramAnonymousParcel);
    }
    
    public PasswordEntry[] newArray(int paramAnonymousInt)
    {
      return new PasswordEntry[paramAnonymousInt];
    }
  };
  public String email;
  public String password;
  public String service;
  public String username;
  
  public PasswordEntry(Parcel paramParcel)
  {
    String[] arrayOfString = new String[4];
    paramParcel.readStringArray(arrayOfString);
    this.service = arrayOfString[0];
    this.username = arrayOfString[1];
    this.email = arrayOfString[2];
    this.password = arrayOfString[3];
  }
  
  public PasswordEntry(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.service = paramString1;
    this.username = paramString2;
    this.password = paramString4;
    this.email = paramString3;
  }
  
  public static Map<String, String> MapList(List<PasswordEntry> paramList)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    for (;;)
    {
      if (i >= paramList.size()) {
        return localHashMap;
      }
      localHashMap.put(((PasswordEntry)paramList.get(i)).service, ((PasswordEntry)paramList.get(i)).username);
      i += 1;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.service + "\n" + this.username;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringArray(new String[] { this.service, this.username, this.email, this.password });
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\PasswordEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */