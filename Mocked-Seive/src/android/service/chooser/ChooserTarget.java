/*    */ package android.service.chooser;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.graphics.drawable.Icon;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ public final class ChooserTarget
/*    */   implements Parcelable
/*    */ {
/* 22 */   public ChooserTarget(CharSequence title, Icon icon, float score, ComponentName componentName, Bundle intentExtras) { throw new RuntimeException("Stub!"); }
/* 23 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/* 24 */   public Icon getIcon() { throw new RuntimeException("Stub!"); }
/* 25 */   public float getScore() { throw new RuntimeException("Stub!"); }
/* 26 */   public ComponentName getComponentName() { throw new RuntimeException("Stub!"); }
/* 27 */   public Bundle getIntentExtras() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 32 */   public static final Parcelable.Creator<ChooserTarget> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\chooser\ChooserTarget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */