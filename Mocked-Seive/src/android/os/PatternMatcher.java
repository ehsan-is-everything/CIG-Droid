/*    */ package android.os;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PatternMatcher
/*    */   implements Parcelable
/*    */ {
/* 21 */   public PatternMatcher(String pattern, int type) { throw new RuntimeException("Stub!"); }
/* 22 */   public PatternMatcher(Parcel src) { throw new RuntimeException("Stub!"); }
/* 23 */   public final String getPath() { throw new RuntimeException("Stub!"); }
/* 24 */   public final int getType() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean match(String str) { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 34 */   public static final Parcelable.Creator<PatternMatcher> CREATOR = null;
/*    */   public static final int PATTERN_ADVANCED_GLOB = 3;
/*    */   public static final int PATTERN_LITERAL = 0;
/*    */   public static final int PATTERN_PREFIX = 1;
/*    */   public static final int PATTERN_SIMPLE_GLOB = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\PatternMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */