/*    */ package android.app;
/*    */ 
/*    */ import android.content.Loader;
/*    */ import android.os.Bundle;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
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
/*    */ 
/*    */ public abstract class LoaderManager
/*    */ {
/* 26 */   public LoaderManager() { throw new RuntimeException("Stub!"); }
/*    */   public abstract <D> Loader<D> initLoader(int paramInt, Bundle paramBundle, LoaderCallbacks<D> paramLoaderCallbacks);
/*    */   public abstract <D> Loader<D> restartLoader(int paramInt, Bundle paramBundle, LoaderCallbacks<D> paramLoaderCallbacks);
/*    */   public abstract void destroyLoader(int paramInt);
/*    */   public abstract <D> Loader<D> getLoader(int paramInt);
/*    */   public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
/* 32 */   public static void enableDebugLogging(boolean enabled) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface LoaderCallbacks<D>
/*    */   {
/*    */     public abstract Loader<D> onCreateLoader(int paramInt, Bundle paramBundle);
/*    */     
/*    */     public abstract void onLoadFinished(Loader<D> paramLoader, D paramD);
/*    */     
/*    */     public abstract void onLoaderReset(Loader<D> paramLoader);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\LoaderManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */