/*    */ package android.widget;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.drawable.Icon;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.LayoutInflater.Filter;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.annotation.Retention;
/*    */ import java.lang.annotation.RetentionPolicy;
/*    */ import java.lang.annotation.Target;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RemoteViews
/*    */   implements Parcelable, LayoutInflater.Filter
/*    */ {
/*    */   public static class ActionException
/*    */     extends RuntimeException
/*    */   {
/* 29 */     public ActionException(Exception ex) { throw new RuntimeException("Stub!"); }
/* 30 */     public ActionException(String message) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   public RemoteViews(String packageName, int layoutId) { throw new RuntimeException("Stub!"); }
/* 33 */   public RemoteViews(RemoteViews landscape, RemoteViews portrait) { throw new RuntimeException("Stub!"); }
/* 34 */   public RemoteViews(Parcel parcel) { throw new RuntimeException("Stub!"); }
/* 35 */   public RemoteViews clone() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getPackage() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getLayoutId() { throw new RuntimeException("Stub!"); }
/* 38 */   public void addView(int viewId, RemoteViews nestedView) { throw new RuntimeException("Stub!"); }
/* 39 */   public void removeAllViews(int viewId) { throw new RuntimeException("Stub!"); }
/* 40 */   public void showNext(int viewId) { throw new RuntimeException("Stub!"); }
/* 41 */   public void showPrevious(int viewId) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setDisplayedChild(int viewId, int childIndex) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setViewVisibility(int viewId, int visibility) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setTextViewText(int viewId, CharSequence text) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setTextViewTextSize(int viewId, int units, float size) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setTextViewCompoundDrawables(int viewId, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setTextViewCompoundDrawablesRelative(int viewId, int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setImageViewResource(int viewId, int srcId) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setImageViewUri(int viewId, Uri uri) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setImageViewBitmap(int viewId, Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setImageViewIcon(int viewId, Icon icon) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setEmptyView(int viewId, int emptyViewId) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setChronometer(int viewId, long base, String format, boolean started) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setChronometerCountDown(int viewId, boolean isCountDown) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setProgressBar(int viewId, int max, int progress, boolean indeterminate) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setOnClickPendingIntent(int viewId, PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
/* 57 */   public void setPendingIntentTemplate(int viewId, PendingIntent pendingIntentTemplate) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setOnClickFillInIntent(int viewId, Intent fillInIntent) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setTextColor(int viewId, int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public void setRemoteAdapter(int appWidgetId, int viewId, Intent intent) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setRemoteAdapter(int viewId, Intent intent) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setScrollPosition(int viewId, int position) { throw new RuntimeException("Stub!"); }
/* 64 */   public void setRelativeScrollPosition(int viewId, int offset) { throw new RuntimeException("Stub!"); }
/* 65 */   public void setViewPadding(int viewId, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 66 */   public void setBoolean(int viewId, String methodName, boolean value) { throw new RuntimeException("Stub!"); }
/* 67 */   public void setByte(int viewId, String methodName, byte value) { throw new RuntimeException("Stub!"); }
/* 68 */   public void setShort(int viewId, String methodName, short value) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setInt(int viewId, String methodName, int value) { throw new RuntimeException("Stub!"); }
/* 70 */   public void setLong(int viewId, String methodName, long value) { throw new RuntimeException("Stub!"); }
/* 71 */   public void setFloat(int viewId, String methodName, float value) { throw new RuntimeException("Stub!"); }
/* 72 */   public void setDouble(int viewId, String methodName, double value) { throw new RuntimeException("Stub!"); }
/* 73 */   public void setChar(int viewId, String methodName, char value) { throw new RuntimeException("Stub!"); }
/* 74 */   public void setString(int viewId, String methodName, String value) { throw new RuntimeException("Stub!"); }
/* 75 */   public void setCharSequence(int viewId, String methodName, CharSequence value) { throw new RuntimeException("Stub!"); }
/* 76 */   public void setUri(int viewId, String methodName, Uri value) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setBitmap(int viewId, String methodName, Bitmap value) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setBundle(int viewId, String methodName, Bundle value) { throw new RuntimeException("Stub!"); }
/* 79 */   public void setIntent(int viewId, String methodName, Intent value) { throw new RuntimeException("Stub!"); }
/* 80 */   public void setIcon(int viewId, String methodName, Icon value) { throw new RuntimeException("Stub!"); }
/* 81 */   public void setContentDescription(int viewId, CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
/* 82 */   public void setAccessibilityTraversalBefore(int viewId, int nextId) { throw new RuntimeException("Stub!"); }
/* 83 */   public void setAccessibilityTraversalAfter(int viewId, int nextId) { throw new RuntimeException("Stub!"); }
/* 84 */   public void setLabelFor(int viewId, int labeledId) { throw new RuntimeException("Stub!"); }
/* 85 */   public View apply(Context context, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 86 */   public void reapply(Context context, View v) { throw new RuntimeException("Stub!"); }
/* 87 */   public boolean onLoadClass(Class clazz) { throw new RuntimeException("Stub!"); }
/* 88 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 89 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 91 */   public static final Parcelable.Creator<RemoteViews> CREATOR = null;
/*    */   
/*    */   @Target({java.lang.annotation.ElementType.TYPE})
/*    */   @Retention(RetentionPolicy.RUNTIME)
/*    */   public static @interface RemoteView {}
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\RemoteViews.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */