/*    */ package android.companion;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.IntentSender;
/*    */ import android.os.Handler;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class CompanionDeviceManager
/*    */ {
/*    */   public static final String EXTRA_DEVICE = "android.companion.extra.DEVICE";
/*    */   
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onDeviceFound(IntentSender paramIntentSender);
/*    */     public abstract void onFailure(CharSequence paramCharSequence); }
/* 26 */   CompanionDeviceManager() { throw new RuntimeException("Stub!"); }
/* 27 */   public void associate(AssociationRequest request, Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 28 */   public List<String> getAssociations() { throw new RuntimeException("Stub!"); }
/* 29 */   public void disassociate(String deviceMacAddress) { throw new RuntimeException("Stub!"); }
/* 30 */   public void requestNotificationAccess(ComponentName component) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean hasNotificationAccess(ComponentName component) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\companion\CompanionDeviceManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */