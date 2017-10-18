/*    */ package android.media;
/*    */ 
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
/*    */ 
/*    */ public final class Rating
/*    */   implements Parcelable
/*    */ {
/* 21 */   Rating() { throw new RuntimeException("Stub!"); }
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public static Rating newUnratedRating(int ratingStyle) { throw new RuntimeException("Stub!"); }
/* 26 */   public static Rating newHeartRating(boolean hasHeart) { throw new RuntimeException("Stub!"); }
/* 27 */   public static Rating newThumbRating(boolean thumbIsUp) { throw new RuntimeException("Stub!"); }
/* 28 */   public static Rating newStarRating(int starRatingStyle, float starRating) { throw new RuntimeException("Stub!"); }
/* 29 */   public static Rating newPercentageRating(float percent) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isRated() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getRatingStyle() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean hasHeart() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isThumbUp() { throw new RuntimeException("Stub!"); }
/* 34 */   public float getStarRating() { throw new RuntimeException("Stub!"); }
/* 35 */   public float getPercentRating() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 44 */   public static final Parcelable.Creator<Rating> CREATOR = null;
/*    */   public static final int RATING_3_STARS = 3;
/*    */   public static final int RATING_4_STARS = 4;
/*    */   public static final int RATING_5_STARS = 5;
/*    */   public static final int RATING_HEART = 1;
/*    */   public static final int RATING_NONE = 0;
/*    */   public static final int RATING_PERCENTAGE = 6;
/*    */   public static final int RATING_THUMB_UP_DOWN = 2;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\Rating.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */