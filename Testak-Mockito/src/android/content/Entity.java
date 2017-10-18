/*    */ package android.content;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Entity
/*    */ {
/*    */   public static class NamedContentValues
/*    */   {
/*    */     public final Uri uri;
/*    */     public final ContentValues values;
/*    */     
/*    */     public NamedContentValues(Uri uri, ContentValues values)
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/* 26 */   public Entity(ContentValues values) { throw new RuntimeException("Stub!"); }
/* 27 */   public ContentValues getEntityValues() { throw new RuntimeException("Stub!"); }
/* 28 */   public ArrayList<NamedContentValues> getSubValues() { throw new RuntimeException("Stub!"); }
/* 29 */   public void addSubValue(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\Entity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */