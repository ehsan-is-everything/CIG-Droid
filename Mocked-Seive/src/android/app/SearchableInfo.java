/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
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
/*    */ 
/*    */ public final class SearchableInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   SearchableInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getSuggestAuthority() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getSuggestPackage() { throw new RuntimeException("Stub!"); }
/* 24 */   public ComponentName getSearchActivity() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean shouldRewriteQueryFromData() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean shouldRewriteQueryFromText() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getSettingsDescriptionId() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getSuggestPath() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getSuggestSelection() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getSuggestIntentAction() { throw new RuntimeException("Stub!"); }
/* 31 */   public String getSuggestIntentData() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getSuggestThreshold() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getHintId() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean getVoiceSearchEnabled() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean getVoiceSearchLaunchWebSearch() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean getVoiceSearchLaunchRecognizer() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getVoiceLanguageModeId() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getVoicePromptTextId() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getVoiceLanguageId() { throw new RuntimeException("Stub!"); }
/* 40 */   public int getVoiceMaxResults() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getInputType() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getImeOptions() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean shouldIncludeInGlobalSearch() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean queryAfterZeroResults() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean autoUrlDetect() { throw new RuntimeException("Stub!"); }
/* 46 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 47 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 49 */   public static final Parcelable.Creator<SearchableInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\SearchableInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */