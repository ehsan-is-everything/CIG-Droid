/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Icon;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PersistableBundle;
/*    */ import android.os.UserHandle;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ShortcutInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 22 */     public Builder(Context context, String id) { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder setActivity(ComponentName activity) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setShortLabel(CharSequence shortLabel) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setLongLabel(CharSequence longLabel) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setDisabledMessage(CharSequence disabledMessage) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setCategories(Set<String> categories) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setIntents(Intent[] intents) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setRank(int rank) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setExtras(PersistableBundle extras) { throw new RuntimeException("Stub!"); }
/* 33 */     public ShortcutInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   ShortcutInfo() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 37 */   public String getPackage() { throw new RuntimeException("Stub!"); }
/* 38 */   public ComponentName getActivity() { throw new RuntimeException("Stub!"); }
/* 39 */   public CharSequence getShortLabel() { throw new RuntimeException("Stub!"); }
/* 40 */   public CharSequence getLongLabel() { throw new RuntimeException("Stub!"); }
/* 41 */   public CharSequence getDisabledMessage() { throw new RuntimeException("Stub!"); }
/* 42 */   public Set<String> getCategories() { throw new RuntimeException("Stub!"); }
/* 43 */   public Intent getIntent() { throw new RuntimeException("Stub!"); }
/* 44 */   public Intent[] getIntents() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getRank() { throw new RuntimeException("Stub!"); }
/* 46 */   public PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
/* 47 */   public UserHandle getUserHandle() { throw new RuntimeException("Stub!"); }
/* 48 */   public long getLastChangedTimestamp() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isDynamic() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isPinned() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isDeclaredInManifest() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isImmutable() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean hasKeyFieldsOnly() { throw new RuntimeException("Stub!"); }
/* 55 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 56 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 60 */   public static final Parcelable.Creator<ShortcutInfo> CREATOR = null;
/*    */   public static final String SHORTCUT_CATEGORY_CONVERSATION = "android.shortcut.conversation";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\ShortcutInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */