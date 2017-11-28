/*    */ package android.content.pm;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LabeledIntent
/*    */   extends Intent
/*    */ {
/* 21 */   public LabeledIntent(Intent origIntent, String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
/* 22 */   public LabeledIntent(Intent origIntent, String sourcePackage, CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
/* 23 */   public LabeledIntent(String sourcePackage, int labelRes, int icon) { throw new RuntimeException("Stub!"); }
/* 24 */   public LabeledIntent(String sourcePackage, CharSequence nonLocalizedLabel, int icon) { throw new RuntimeException("Stub!"); }
/* 25 */   public String getSourcePackage() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getLabelResource() { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence getNonLocalizedLabel() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getIconResource() { throw new RuntimeException("Stub!"); }
/* 29 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 30 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 32 */   public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/* 34 */   public static final Parcelable.Creator<LabeledIntent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\LabeledIntent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */