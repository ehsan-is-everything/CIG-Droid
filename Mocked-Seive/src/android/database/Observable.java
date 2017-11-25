/*    */ package android.database;
/*    */ 
/*    */ import java.util.ArrayList;
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
/*    */ public abstract class Observable<T>
/*    */ {
/*    */   protected final ArrayList<T> mObservers;
/*    */   
/* 20 */   public Observable() { throw new RuntimeException("Stub!"); }
/* 21 */   public void registerObserver(T observer) { throw new RuntimeException("Stub!"); }
/* 22 */   public void unregisterObserver(T observer) { throw new RuntimeException("Stub!"); }
/* 23 */   public void unregisterAll() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\Observable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */