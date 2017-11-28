/*     */ package android.content;
/*     */ 
/*     */ import android.net.Uri;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.os.PatternMatcher;
/*     */ import android.util.AndroidException;
/*     */ import android.util.Printer;
/*     */ import java.io.IOException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ import org.xmlpull.v1.XmlSerializer;
/*     */ 
/*     */ 
/*     */ public class IntentFilter
/*     */   implements Parcelable
/*     */ {
/*     */   public static class MalformedMimeTypeException
/*     */     extends AndroidException
/*     */   {
/*  24 */     public MalformedMimeTypeException() { throw new RuntimeException("Stub!"); }
/*  25 */     public MalformedMimeTypeException(String name) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class AuthorityEntry {
/*  29 */     public AuthorityEntry(String host, String port) { throw new RuntimeException("Stub!"); }
/*  30 */     public String getHost() { throw new RuntimeException("Stub!"); }
/*  31 */     public int getPort() { throw new RuntimeException("Stub!"); }
/*  32 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  33 */     public int match(Uri data) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  35 */   public IntentFilter() { throw new RuntimeException("Stub!"); }
/*  36 */   public IntentFilter(String action) { throw new RuntimeException("Stub!"); }
/*  37 */   public IntentFilter(String action, String dataType) throws IntentFilter.MalformedMimeTypeException { throw new RuntimeException("Stub!"); }
/*  38 */   public IntentFilter(IntentFilter o) { throw new RuntimeException("Stub!"); }
/*  39 */   public static IntentFilter create(String action, String dataType) { throw new RuntimeException("Stub!"); }
/*  40 */   public final void setPriority(int priority) { throw new RuntimeException("Stub!"); }
/*  41 */   public final int getPriority() { throw new RuntimeException("Stub!"); }
/*  42 */   public final void addAction(String action) { throw new RuntimeException("Stub!"); }
/*  43 */   public final int countActions() { throw new RuntimeException("Stub!"); }
/*  44 */   public final String getAction(int index) { throw new RuntimeException("Stub!"); }
/*  45 */   public final boolean hasAction(String action) { throw new RuntimeException("Stub!"); }
/*  46 */   public final boolean matchAction(String action) { throw new RuntimeException("Stub!"); }
/*  47 */   public final Iterator<String> actionsIterator() { throw new RuntimeException("Stub!"); }
/*  48 */   public final void addDataType(String type) throws IntentFilter.MalformedMimeTypeException { throw new RuntimeException("Stub!"); }
/*  49 */   public final boolean hasDataType(String type) { throw new RuntimeException("Stub!"); }
/*  50 */   public final int countDataTypes() { throw new RuntimeException("Stub!"); }
/*  51 */   public final String getDataType(int index) { throw new RuntimeException("Stub!"); }
/*  52 */   public final Iterator<String> typesIterator() { throw new RuntimeException("Stub!"); }
/*  53 */   public final void addDataScheme(String scheme) { throw new RuntimeException("Stub!"); }
/*  54 */   public final int countDataSchemes() { throw new RuntimeException("Stub!"); }
/*  55 */   public final String getDataScheme(int index) { throw new RuntimeException("Stub!"); }
/*  56 */   public final boolean hasDataScheme(String scheme) { throw new RuntimeException("Stub!"); }
/*  57 */   public final Iterator<String> schemesIterator() { throw new RuntimeException("Stub!"); }
/*  58 */   public final void addDataSchemeSpecificPart(String ssp, int type) { throw new RuntimeException("Stub!"); }
/*  59 */   public final int countDataSchemeSpecificParts() { throw new RuntimeException("Stub!"); }
/*  60 */   public final PatternMatcher getDataSchemeSpecificPart(int index) { throw new RuntimeException("Stub!"); }
/*  61 */   public final boolean hasDataSchemeSpecificPart(String data) { throw new RuntimeException("Stub!"); }
/*  62 */   public final Iterator<PatternMatcher> schemeSpecificPartsIterator() { throw new RuntimeException("Stub!"); }
/*  63 */   public final void addDataAuthority(String host, String port) { throw new RuntimeException("Stub!"); }
/*  64 */   public final int countDataAuthorities() { throw new RuntimeException("Stub!"); }
/*  65 */   public final AuthorityEntry getDataAuthority(int index) { throw new RuntimeException("Stub!"); }
/*  66 */   public final boolean hasDataAuthority(Uri data) { throw new RuntimeException("Stub!"); }
/*  67 */   public final Iterator<AuthorityEntry> authoritiesIterator() { throw new RuntimeException("Stub!"); }
/*  68 */   public final void addDataPath(String path, int type) { throw new RuntimeException("Stub!"); }
/*  69 */   public final int countDataPaths() { throw new RuntimeException("Stub!"); }
/*  70 */   public final PatternMatcher getDataPath(int index) { throw new RuntimeException("Stub!"); }
/*  71 */   public final boolean hasDataPath(String data) { throw new RuntimeException("Stub!"); }
/*  72 */   public final Iterator<PatternMatcher> pathsIterator() { throw new RuntimeException("Stub!"); }
/*  73 */   public final int matchDataAuthority(Uri data) { throw new RuntimeException("Stub!"); }
/*  74 */   public final int matchData(String type, String scheme, Uri data) { throw new RuntimeException("Stub!"); }
/*  75 */   public final void addCategory(String category) { throw new RuntimeException("Stub!"); }
/*  76 */   public final int countCategories() { throw new RuntimeException("Stub!"); }
/*  77 */   public final String getCategory(int index) { throw new RuntimeException("Stub!"); }
/*  78 */   public final boolean hasCategory(String category) { throw new RuntimeException("Stub!"); }
/*  79 */   public final Iterator<String> categoriesIterator() { throw new RuntimeException("Stub!"); }
/*  80 */   public final String matchCategories(Set<String> categories) { throw new RuntimeException("Stub!"); }
/*  81 */   public final int match(ContentResolver resolver, Intent intent, boolean resolve, String logTag) { throw new RuntimeException("Stub!"); }
/*  82 */   public final int match(String action, String type, String scheme, Uri data, Set<String> categories, String logTag) { throw new RuntimeException("Stub!"); }
/*  83 */   public void writeToXml(XmlSerializer serializer) throws IOException { throw new RuntimeException("Stub!"); }
/*  84 */   public void readFromXml(XmlPullParser parser) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/*  85 */   public void dump(Printer du, String prefix) { throw new RuntimeException("Stub!"); }
/*  86 */   public final int describeContents() { throw new RuntimeException("Stub!"); }
/*  87 */   public final void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */   public static final Parcelable.Creator<IntentFilter> CREATOR = null;
/*     */   public static final int MATCH_ADJUSTMENT_MASK = 65535;
/*     */   public static final int MATCH_ADJUSTMENT_NORMAL = 32768;
/*     */   public static final int MATCH_CATEGORY_EMPTY = 1048576;
/*     */   public static final int MATCH_CATEGORY_HOST = 3145728;
/*     */   public static final int MATCH_CATEGORY_MASK = 268369920;
/*     */   public static final int MATCH_CATEGORY_PATH = 5242880;
/*     */   public static final int MATCH_CATEGORY_PORT = 4194304;
/*     */   public static final int MATCH_CATEGORY_SCHEME = 2097152;
/*     */   public static final int MATCH_CATEGORY_SCHEME_SPECIFIC_PART = 5767168;
/*     */   public static final int MATCH_CATEGORY_TYPE = 6291456;
/*     */   public static final int NO_MATCH_ACTION = -3;
/*     */   public static final int NO_MATCH_CATEGORY = -4;
/*     */   public static final int NO_MATCH_DATA = -2;
/*     */   public static final int NO_MATCH_TYPE = -1;
/*     */   public static final int SYSTEM_HIGH_PRIORITY = 1000;
/*     */   public static final int SYSTEM_LOW_PRIORITY = -1000;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\IntentFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */