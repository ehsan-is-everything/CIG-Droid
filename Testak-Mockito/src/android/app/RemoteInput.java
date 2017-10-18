/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RemoteInput
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(String resultKey) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setLabel(CharSequence label) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setChoices(CharSequence[] choices) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setAllowDataType(String mimeType, boolean doAllow) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setAllowFreeFormInput(boolean allowFreeFormTextInput) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder addExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 29 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 30 */     public RemoteInput build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   RemoteInput() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getResultKey() { throw new RuntimeException("Stub!"); }
/* 34 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 35 */   public CharSequence[] getChoices() { throw new RuntimeException("Stub!"); }
/* 36 */   public Set<String> getAllowedDataTypes() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isDataOnly() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean getAllowFreeFormInput() { throw new RuntimeException("Stub!"); }
/* 39 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 40 */   public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String remoteInputResultKey) { throw new RuntimeException("Stub!"); }
/* 41 */   public static Bundle getResultsFromIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 42 */   public static void addResultsToIntent(RemoteInput[] remoteInputs, Intent intent, Bundle results) { throw new RuntimeException("Stub!"); }
/* 43 */   public static void addDataResultToIntent(RemoteInput remoteInput, Intent intent, Map<String, Uri> results) { throw new RuntimeException("Stub!"); }
/* 44 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 45 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 49 */   public static final Parcelable.Creator<RemoteInput> CREATOR = null;
/*    */   public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
/*    */   public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\RemoteInput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */