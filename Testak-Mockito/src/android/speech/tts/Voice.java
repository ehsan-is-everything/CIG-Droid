/*    */ package android.speech.tts;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
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
/*    */ public class Voice
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Voice(String name, Locale locale, int quality, int latency, boolean requiresNetworkConnection, Set<String> features) { throw new RuntimeException("Stub!"); }
/* 22 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getQuality() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getLatency() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isNetworkConnectionRequired() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 29 */   public Set<String> getFeatures() { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 31 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
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
/* 44 */   public static final Parcelable.Creator<Voice> CREATOR = null;
/*    */   public static final int LATENCY_HIGH = 400;
/*    */   public static final int LATENCY_LOW = 200;
/*    */   public static final int LATENCY_NORMAL = 300;
/*    */   public static final int LATENCY_VERY_HIGH = 500;
/*    */   public static final int LATENCY_VERY_LOW = 100;
/*    */   public static final int QUALITY_HIGH = 400;
/*    */   public static final int QUALITY_LOW = 200;
/*    */   public static final int QUALITY_NORMAL = 300;
/*    */   public static final int QUALITY_VERY_HIGH = 500;
/*    */   public static final int QUALITY_VERY_LOW = 100;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\speech\tts\Voice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */