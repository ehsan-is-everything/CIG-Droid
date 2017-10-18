/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.graphics.Bitmap;
/*    */ import android.net.Uri;
/*    */ import android.os.Message;
/*    */ import android.view.View;
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
/*    */ public class WebChromeClient
/*    */ {
/*    */   public static abstract class FileChooserParams
/*    */   {
/*    */     public static final int MODE_OPEN = 0;
/*    */     public static final int MODE_OPEN_MULTIPLE = 1;
/*    */     public static final int MODE_SAVE = 3;
/*    */     
/* 26 */     public FileChooserParams() { throw new RuntimeException("Stub!"); }
/* 27 */     public static Uri[] parseResult(int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract int getMode();
/*    */     
/*    */     public abstract String[] getAcceptTypes();
/*    */     
/*    */     public abstract boolean isCaptureEnabled();
/*    */     
/*    */     public abstract CharSequence getTitle();
/*    */     public abstract String getFilenameHint();
/*    */     public abstract Intent createIntent(); }
/* 38 */   public WebChromeClient() { throw new RuntimeException("Stub!"); }
/* 39 */   public void onProgressChanged(WebView view, int newProgress) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onReceivedTitle(WebView view, String title) { throw new RuntimeException("Stub!"); }
/* 41 */   public void onReceivedIcon(WebView view, Bitmap icon) { throw new RuntimeException("Stub!"); }
/* 42 */   public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onShowCustomView(View view, CustomViewCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public void onShowCustomView(View view, int requestedOrientation, CustomViewCallback callback) { throw new RuntimeException("Stub!"); }
/* 46 */   public void onHideCustomView() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) { throw new RuntimeException("Stub!"); }
/* 48 */   public void onRequestFocus(WebView view) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onCloseWindow(WebView window) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean onJsAlert(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean onJsConfirm(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 55 */   public void onExceededDatabaseQuota(String url, String databaseIdentifier, long quota, long estimatedDatabaseSize, long totalQuota, WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public void onReachedMaxAppCacheSize(long requiredStorage, long quota, WebStorage.QuotaUpdater quotaUpdater) { throw new RuntimeException("Stub!"); }
/* 58 */   public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) { throw new RuntimeException("Stub!"); }
/* 59 */   public void onGeolocationPermissionsHidePrompt() { throw new RuntimeException("Stub!"); }
/* 60 */   public void onPermissionRequest(PermissionRequest request) { throw new RuntimeException("Stub!"); }
/* 61 */   public void onPermissionRequestCanceled(PermissionRequest request) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 63 */   public boolean onJsTimeout() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 65 */   public void onConsoleMessage(String message, int lineNumber, String sourceID) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean onConsoleMessage(ConsoleMessage consoleMessage) { throw new RuntimeException("Stub!"); }
/* 67 */   public Bitmap getDefaultVideoPoster() { throw new RuntimeException("Stub!"); }
/* 68 */   public View getVideoLoadingProgressView() { throw new RuntimeException("Stub!"); }
/* 69 */   public void getVisitedHistory(ValueCallback<String[]> callback) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface CustomViewCallback
/*    */   {
/*    */     public abstract void onCustomViewHidden();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\webkit\WebChromeClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */