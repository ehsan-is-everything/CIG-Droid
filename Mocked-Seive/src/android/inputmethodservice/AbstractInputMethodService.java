/*    */ package android.inputmethodservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.KeyEvent.Callback;
/*    */ import android.view.KeyEvent.DispatcherState;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.inputmethod.InputMethod;
/*    */ import android.view.inputmethod.InputMethod.SessionCallback;
/*    */ import android.view.inputmethod.InputMethodSession;
/*    */ import android.view.inputmethod.InputMethodSession.EventCallback;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ 
/*    */ public abstract class AbstractInputMethodService
/*    */   extends Service
/*    */   implements KeyEvent.Callback
/*    */ {
/*    */   public abstract class AbstractInputMethodImpl
/*    */     implements InputMethod
/*    */   {
/* 25 */     public AbstractInputMethodImpl() { throw new RuntimeException("Stub!"); }
/* 26 */     public void createSession(InputMethod.SessionCallback callback) { throw new RuntimeException("Stub!"); }
/* 27 */     public void setSessionEnabled(InputMethodSession session, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 28 */     public void revokeSession(InputMethodSession session) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public abstract class AbstractInputMethodSessionImpl
/*    */     implements InputMethodSession {
/* 33 */     public AbstractInputMethodSessionImpl() { throw new RuntimeException("Stub!"); }
/* 34 */     public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 35 */     public boolean isRevoked() { throw new RuntimeException("Stub!"); }
/* 36 */     public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 37 */     public void revokeSelf() { throw new RuntimeException("Stub!"); }
/* 38 */     public void dispatchKeyEvent(int seq, KeyEvent event, InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); }
/* 39 */     public void dispatchTrackballEvent(int seq, MotionEvent event, InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); }
/* 40 */     public void dispatchGenericMotionEvent(int seq, MotionEvent event, InputMethodSession.EventCallback callback) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   public AbstractInputMethodService() { throw new RuntimeException("Stub!"); }
/* 43 */   public KeyEvent.DispatcherState getKeyDispatcherState() { throw new RuntimeException("Stub!"); }
/*    */   public abstract AbstractInputMethodImpl onCreateInputMethodInterface();
/*    */   public abstract AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface();
/* 46 */   protected void dump(FileDescriptor fd, PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); }
/* 47 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\inputmethodservice\AbstractInputMethodService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */