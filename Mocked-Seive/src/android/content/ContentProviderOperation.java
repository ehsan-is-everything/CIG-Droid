/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
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
/*    */ public class ContentProviderOperation
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 23 */     Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public ContentProviderOperation build() { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder withValueBackReferences(ContentValues backReferences) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder withValueBackReference(String key, int previousResult) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder withSelectionBackReference(int selectionArgIndex, int previousResult) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder withValues(ContentValues values) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder withValue(String key, Object value) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder withSelection(String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder withExpectedCount(int count) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder withYieldAllowed(boolean yieldAllowed) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   ContentProviderOperation() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 36 */   public static Builder newInsert(Uri uri) { throw new RuntimeException("Stub!"); }
/* 37 */   public static Builder newUpdate(Uri uri) { throw new RuntimeException("Stub!"); }
/* 38 */   public static Builder newDelete(Uri uri) { throw new RuntimeException("Stub!"); }
/* 39 */   public static Builder newAssertQuery(Uri uri) { throw new RuntimeException("Stub!"); }
/* 40 */   public Uri getUri() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isYieldAllowed() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isInsert() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isDelete() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isUpdate() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isAssertQuery() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isWriteOperation() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isReadOperation() { throw new RuntimeException("Stub!"); }
/* 48 */   public ContentProviderResult apply(ContentProvider provider, ContentProviderResult[] backRefs, int numBackRefs) throws OperationApplicationException { throw new RuntimeException("Stub!"); }
/* 49 */   public ContentValues resolveValueBackReferences(ContentProviderResult[] backRefs, int numBackRefs) { throw new RuntimeException("Stub!"); }
/* 50 */   public String[] resolveSelectionArgsBackReferences(ContentProviderResult[] backRefs, int numBackRefs) { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 52 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 54 */   public static final Parcelable.Creator<ContentProviderOperation> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ContentProviderOperation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */