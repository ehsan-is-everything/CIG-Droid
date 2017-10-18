/*    */ package android.text.style;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
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
/*    */ public class TextAppearanceSpan
/*    */   extends MetricAffectingSpan
/*    */   implements ParcelableSpan
/*    */ {
/* 22 */   public TextAppearanceSpan(Context context, int appearance) { throw new RuntimeException("Stub!"); }
/* 23 */   public TextAppearanceSpan(Context context, int appearance, int colorList) { throw new RuntimeException("Stub!"); }
/* 24 */   public TextAppearanceSpan(String family, int style, int size, ColorStateList color, ColorStateList linkColor) { throw new RuntimeException("Stub!"); }
/* 25 */   public TextAppearanceSpan(Parcel src) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getFamily() { throw new RuntimeException("Stub!"); }
/* 30 */   public ColorStateList getTextColor() { throw new RuntimeException("Stub!"); }
/* 31 */   public ColorStateList getLinkTextColor() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getTextSize() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getTextStyle() { throw new RuntimeException("Stub!"); }
/* 34 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/* 35 */   public void updateMeasureState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\style\TextAppearanceSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */