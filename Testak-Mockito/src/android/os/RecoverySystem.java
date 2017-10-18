/*    */ package android.os;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.security.GeneralSecurityException;
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
/*    */ public class RecoverySystem
/*    */ {
/* 24 */   RecoverySystem() { throw new RuntimeException("Stub!"); }
/* 25 */   public static void verifyPackage(File packageFile, ProgressListener listener, File deviceCertsZipFile) throws IOException, GeneralSecurityException { throw new RuntimeException("Stub!"); }
/* 26 */   public static void installPackage(Context context, File packageFile) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public static void rebootWipeUserData(Context context) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public static void rebootWipeCache(Context context) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ProgressListener
/*    */   {
/*    */     public abstract void onProgress(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\RecoverySystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */