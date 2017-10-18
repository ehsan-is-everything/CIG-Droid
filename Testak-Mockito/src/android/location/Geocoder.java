/*    */ package android.location;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
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
/*    */ public final class Geocoder
/*    */ {
/* 20 */   public Geocoder(Context context, Locale locale) { throw new RuntimeException("Stub!"); }
/* 21 */   public Geocoder(Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public static boolean isPresent() { throw new RuntimeException("Stub!"); }
/* 23 */   public List<Address> getFromLocation(double latitude, double longitude, int maxResults) throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public List<Address> getFromLocationName(String locationName, int maxResults) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public List<Address> getFromLocationName(String locationName, int maxResults, double lowerLeftLatitude, double lowerLeftLongitude, double upperRightLatitude, double upperRightLongitude) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\Geocoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */