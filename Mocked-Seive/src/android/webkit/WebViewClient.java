/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.Message;
/*    */ import android.view.KeyEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WebViewClient
/*    */ {
/*    */   public static final int ERROR_AUTHENTICATION = -4;
/*    */   public static final int ERROR_BAD_URL = -12;
/*    */   public static final int ERROR_CONNECT = -6;
/*    */   public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
/*    */   public static final int ERROR_FILE = -13;
/*    */   public static final int ERROR_FILE_NOT_FOUND = -14;
/*    */   public static final int ERROR_HOST_LOOKUP = -2;
/*    */   public static final int ERROR_IO = -7;
/*    */   
/* 20 */   public WebViewClient() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 22 */   public boolean shouldOverrideUrlLoading(WebView view, String url) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onPageStarted(WebView view, String url, Bitmap favicon) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onPageFinished(WebView view, String url) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onLoadResource(WebView view, String url) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onPageCommitVisible(WebView view, String url) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 29 */   public WebResourceResponse shouldInterceptRequest(WebView view, String url) { throw new RuntimeException("Stub!"); }
/* 30 */   public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) { throw new RuntimeException("Stub!"); }
/* 36 */   public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) { throw new RuntimeException("Stub!"); }
/* 37 */   public void onFormResubmission(WebView view, Message dontResend, Message resend) { throw new RuntimeException("Stub!"); }
/* 38 */   public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onReceivedSslError(WebView view, SslErrorHandler handler, android.net.http.SslError error) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) { throw new RuntimeException("Stub!"); }
/* 41 */   public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onUnhandledKeyEvent(WebView view, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 44 */   public void onScaleChanged(WebView view, float oldScale, float newScale) { throw new RuntimeException("Stub!"); }
/* 45 */   public void onReceivedLoginRequest(WebView view, String realm, String account, String args) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int ERROR_PROXY_AUTHENTICATION = -5;
/*    */   public static final int ERROR_REDIRECT_LOOP = -9;
/*    */   public static final int ERROR_TIMEOUT = -8;
/*    */   public static final int ERROR_TOO_MANY_REQUESTS = -15;
/*    */   public static final int ERROR_UNKNOWN = -1;
/*    */   public static final int ERROR_UNSAFE_RESOURCE = -16;
/*    */   public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
/*    */   public static final int ERROR_UNSUPPORTED_SCHEME = -10;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebViewClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */