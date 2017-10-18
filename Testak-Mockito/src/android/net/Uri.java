/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.File;
/*    */ import java.util.List;
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
/*    */ public abstract class Uri
/*    */   implements Parcelable, Comparable<Uri>
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder scheme(String scheme) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder opaquePart(String opaquePart) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder encodedOpaquePart(String opaquePart) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder authority(String authority) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder encodedAuthority(String authority) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder path(String path) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder encodedPath(String path) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder appendPath(String newSegment) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder appendEncodedPath(String newSegment) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder query(String query) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder encodedQuery(String query) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder fragment(String fragment) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder encodedFragment(String fragment) { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder appendQueryParameter(String key, String value) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder clearQuery() { throw new RuntimeException("Stub!"); }
/* 39 */     public Uri build() { throw new RuntimeException("Stub!"); }
/* 40 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   Uri() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isHierarchical();
/* 44 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isRelative();
/* 46 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getScheme();
/*    */   public abstract String getSchemeSpecificPart();
/*    */   public abstract String getEncodedSchemeSpecificPart();
/*    */   public abstract String getAuthority();
/*    */   public abstract String getEncodedAuthority();
/*    */   public abstract String getUserInfo();
/*    */   public abstract String getEncodedUserInfo();
/*    */   public abstract String getHost();
/*    */   public abstract int getPort();
/*    */   public abstract String getPath();
/*    */   public abstract String getEncodedPath();
/*    */   public abstract String getQuery();
/*    */   public abstract String getEncodedQuery();
/*    */   public abstract String getFragment();
/*    */   public abstract String getEncodedFragment();
/*    */   public abstract List<String> getPathSegments();
/*    */   public abstract String getLastPathSegment();
/* 64 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 65 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 66 */   public int compareTo(Uri other) { throw new RuntimeException("Stub!"); }
/*    */   public abstract String toString();
/*    */   public abstract Builder buildUpon();
/* 69 */   public static Uri parse(String uriString) { throw new RuntimeException("Stub!"); }
/* 70 */   public static Uri fromFile(File file) { throw new RuntimeException("Stub!"); }
/* 71 */   public static Uri fromParts(String scheme, String ssp, String fragment) { throw new RuntimeException("Stub!"); }
/* 72 */   public Set<String> getQueryParameterNames() { throw new RuntimeException("Stub!"); }
/* 73 */   public List<String> getQueryParameters(String key) { throw new RuntimeException("Stub!"); }
/* 74 */   public String getQueryParameter(String key) { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean getBooleanQueryParameter(String key, boolean defaultValue) { throw new RuntimeException("Stub!"); }
/* 76 */   public Uri normalizeScheme() { throw new RuntimeException("Stub!"); }
/* 77 */   public static void writeToParcel(Parcel out, Uri uri) { throw new RuntimeException("Stub!"); }
/* 78 */   public static String encode(String s) { throw new RuntimeException("Stub!"); }
/* 79 */   public static String encode(String s, String allow) { throw new RuntimeException("Stub!"); }
/* 80 */   public static String decode(String s) { throw new RuntimeException("Stub!"); }
/* 81 */   public static Uri withAppendedPath(Uri baseUri, String pathSegment) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 84 */   public static final Uri EMPTY = null; public static final Parcelable.Creator<Uri> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\Uri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */