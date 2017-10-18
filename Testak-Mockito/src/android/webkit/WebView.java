/*     */ package android.webkit;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Message;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.widget.AbsoluteLayout;
/*     */ 
/*     */ public class WebView
/*     */   extends AbsoluteLayout
/*     */   implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.ViewGroup.OnHierarchyChangeListener
/*     */ {
/*     */   public static final int RENDERER_PRIORITY_BOUND = 1;
/*     */   public static final int RENDERER_PRIORITY_IMPORTANT = 2;
/*     */   public static final int RENDERER_PRIORITY_WAIVED = 0;
/*     */   public static final String SCHEME_GEO = "geo:0,0?q=";
/*     */   public static final String SCHEME_MAILTO = "mailto:";
/*     */   public static final String SCHEME_TEL = "tel:";
/*     */   
/*     */   public class WebViewTransport
/*     */   {
/*  24 */     public WebViewTransport() { throw new RuntimeException("Stub!"); }
/*  25 */     public synchronized void setWebView(WebView webview) { throw new RuntimeException("Stub!"); }
/*  26 */     public synchronized WebView getWebView() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract interface FindListener {
/*     */     public abstract void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   }
/*     */   
/*     */   public static abstract class VisualStateCallback {
/*  34 */     public VisualStateCallback() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public abstract void onComplete(long paramLong); }
/*     */   
/*     */   @Deprecated
/*     */   public static abstract interface PictureListener { @Deprecated
/*     */     public abstract void onNewPicture(WebView paramWebView, android.graphics.Picture paramPicture); }
/*     */   
/*     */   public static class HitTestResult { @Deprecated
/*     */     public static final int ANCHOR_TYPE = 1;
/*     */     
/*  45 */     HitTestResult() { throw new RuntimeException("Stub!"); }
/*  46 */     public int getType() { throw new RuntimeException("Stub!"); }
/*  47 */     public String getExtra() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int EDIT_TEXT_TYPE = 9;
/*     */     public static final int EMAIL_TYPE = 4;
/*     */     public static final int GEO_TYPE = 3;
/*     */     @Deprecated
/*     */     public static final int IMAGE_ANCHOR_TYPE = 6;
/*     */     public static final int IMAGE_TYPE = 5;
/*     */     public static final int PHONE_TYPE = 2;
/*     */     public static final int SRC_ANCHOR_TYPE = 7;
/*     */     public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
/*     */     public static final int UNKNOWN_TYPE = 0;
/*     */   }
/*     */   
/*  61 */   public WebView(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  62 */   public WebView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  63 */   public WebView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  64 */   public WebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  66 */   public WebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  68 */   public void setHorizontalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  70 */   public void setVerticalScrollbarOverlay(boolean overlay) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  72 */   public boolean overlayHorizontalScrollbar() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  74 */   public boolean overlayVerticalScrollbar() { throw new RuntimeException("Stub!"); }
/*  75 */   public android.net.http.SslCertificate getCertificate() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  77 */   public void setCertificate(android.net.http.SslCertificate certificate) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  79 */   public void savePassword(String host, String username, String password) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public void setHttpAuthUsernamePassword(String host, String realm, String username, String password) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  83 */   public String[] getHttpAuthUsernamePassword(String host, String realm) { throw new RuntimeException("Stub!"); }
/*  84 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*  85 */   public void setNetworkAvailable(boolean networkUp) { throw new RuntimeException("Stub!"); }
/*  86 */   public WebBackForwardList saveState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
/*  87 */   public WebBackForwardList restoreState(android.os.Bundle inState) { throw new RuntimeException("Stub!"); }
/*  88 */   public void loadUrl(String url, java.util.Map<String, String> additionalHttpHeaders) { throw new RuntimeException("Stub!"); }
/*  89 */   public void loadUrl(String url) { throw new RuntimeException("Stub!"); }
/*  90 */   public void postUrl(String url, byte[] postData) { throw new RuntimeException("Stub!"); }
/*  91 */   public void loadData(String data, String mimeType, String encoding) { throw new RuntimeException("Stub!"); }
/*  92 */   public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) { throw new RuntimeException("Stub!"); }
/*  93 */   public void evaluateJavascript(String script, ValueCallback<String> resultCallback) { throw new RuntimeException("Stub!"); }
/*  94 */   public void saveWebArchive(String filename) { throw new RuntimeException("Stub!"); }
/*  95 */   public void saveWebArchive(String basename, boolean autoname, ValueCallback<String> callback) { throw new RuntimeException("Stub!"); }
/*  96 */   public void stopLoading() { throw new RuntimeException("Stub!"); }
/*  97 */   public void reload() { throw new RuntimeException("Stub!"); }
/*  98 */   public boolean canGoBack() { throw new RuntimeException("Stub!"); }
/*  99 */   public void goBack() { throw new RuntimeException("Stub!"); }
/* 100 */   public boolean canGoForward() { throw new RuntimeException("Stub!"); }
/* 101 */   public void goForward() { throw new RuntimeException("Stub!"); }
/* 102 */   public boolean canGoBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
/* 103 */   public void goBackOrForward(int steps) { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean isPrivateBrowsingEnabled() { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean pageUp(boolean top) { throw new RuntimeException("Stub!"); }
/* 106 */   public boolean pageDown(boolean bottom) { throw new RuntimeException("Stub!"); }
/* 107 */   public void postVisualStateCallback(long requestId, VisualStateCallback callback) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 109 */   public void clearView() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 111 */   public android.graphics.Picture capturePicture() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 113 */   public android.print.PrintDocumentAdapter createPrintDocumentAdapter() { throw new RuntimeException("Stub!"); }
/* 114 */   public android.print.PrintDocumentAdapter createPrintDocumentAdapter(String documentName) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*     */   @android.view.ViewDebug.ExportedProperty(category="webview")
/* 117 */   public float getScale() { throw new RuntimeException("Stub!"); }
/* 118 */   public void setInitialScale(int scaleInPercent) { throw new RuntimeException("Stub!"); }
/* 119 */   public void invokeZoomPicker() { throw new RuntimeException("Stub!"); }
/* 120 */   public HitTestResult getHitTestResult() { throw new RuntimeException("Stub!"); }
/* 121 */   public void requestFocusNodeHref(Message hrefMsg) { throw new RuntimeException("Stub!"); }
/* 122 */   public void requestImageRef(Message msg) { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="webview")
/* 124 */   public String getUrl() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="webview")
/* 126 */   public String getOriginalUrl() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="webview")
/* 128 */   public String getTitle() { throw new RuntimeException("Stub!"); }
/* 129 */   public android.graphics.Bitmap getFavicon() { throw new RuntimeException("Stub!"); }
/* 130 */   public int getProgress() { throw new RuntimeException("Stub!"); }
/*     */   @android.view.ViewDebug.ExportedProperty(category="webview")
/* 132 */   public int getContentHeight() { throw new RuntimeException("Stub!"); }
/* 133 */   public void pauseTimers() { throw new RuntimeException("Stub!"); }
/* 134 */   public void resumeTimers() { throw new RuntimeException("Stub!"); }
/* 135 */   public void onPause() { throw new RuntimeException("Stub!"); }
/* 136 */   public void onResume() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 138 */   public void freeMemory() { throw new RuntimeException("Stub!"); }
/* 139 */   public void clearCache(boolean includeDiskFiles) { throw new RuntimeException("Stub!"); }
/* 140 */   public void clearFormData() { throw new RuntimeException("Stub!"); }
/* 141 */   public void clearHistory() { throw new RuntimeException("Stub!"); }
/* 142 */   public void clearSslPreferences() { throw new RuntimeException("Stub!"); }
/* 143 */   public static void clearClientCertPreferences(Runnable onCleared) { throw new RuntimeException("Stub!"); }
/* 144 */   public WebBackForwardList copyBackForwardList() { throw new RuntimeException("Stub!"); }
/* 145 */   public void setFindListener(FindListener listener) { throw new RuntimeException("Stub!"); }
/* 146 */   public void findNext(boolean forward) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 148 */   public int findAll(String find) { throw new RuntimeException("Stub!"); }
/* 149 */   public void findAllAsync(String find) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 151 */   public boolean showFindDialog(String text, boolean showIme) { throw new RuntimeException("Stub!"); }
/* 152 */   public static String findAddress(String addr) { throw new RuntimeException("Stub!"); }
/* 153 */   public static void enableSlowWholeDocumentDraw() { throw new RuntimeException("Stub!"); }
/* 154 */   public void clearMatches() { throw new RuntimeException("Stub!"); }
/* 155 */   public void documentHasImages(Message response) { throw new RuntimeException("Stub!"); }
/* 156 */   public void setWebViewClient(WebViewClient client) { throw new RuntimeException("Stub!"); }
/* 157 */   public WebViewClient getWebViewClient() { throw new RuntimeException("Stub!"); }
/* 158 */   public void setDownloadListener(DownloadListener listener) { throw new RuntimeException("Stub!"); }
/* 159 */   public void setWebChromeClient(WebChromeClient client) { throw new RuntimeException("Stub!"); }
/* 160 */   public WebChromeClient getWebChromeClient() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 162 */   public void setPictureListener(PictureListener listener) { throw new RuntimeException("Stub!"); }
/* 163 */   public void addJavascriptInterface(Object object, String name) { throw new RuntimeException("Stub!"); }
/* 164 */   public void removeJavascriptInterface(String name) { throw new RuntimeException("Stub!"); }
/* 165 */   public WebMessagePort[] createWebMessageChannel() { throw new RuntimeException("Stub!"); }
/* 166 */   public void postWebMessage(WebMessage message, android.net.Uri targetOrigin) { throw new RuntimeException("Stub!"); }
/* 167 */   public WebSettings getSettings() { throw new RuntimeException("Stub!"); }
/* 168 */   public static void setWebContentsDebuggingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 170 */   public void onChildViewAdded(View parent, View child) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 172 */   public void onChildViewRemoved(View p, View child) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 174 */   public void onGlobalFocusChanged(View oldFocus, View newFocus) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 176 */   public void setMapTrackballToArrowKeys(boolean setMap) { throw new RuntimeException("Stub!"); }
/* 177 */   public void flingScroll(int vx, int vy) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 179 */   public boolean canZoomIn() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 181 */   public boolean canZoomOut() { throw new RuntimeException("Stub!"); }
/* 182 */   public void zoomBy(float zoomFactor) { throw new RuntimeException("Stub!"); }
/* 183 */   public boolean zoomIn() { throw new RuntimeException("Stub!"); }
/* 184 */   public boolean zoomOut() { throw new RuntimeException("Stub!"); }
/* 185 */   public void setRendererPriorityPolicy(int rendererRequestedPriority, boolean waivedWhenNotVisible) { throw new RuntimeException("Stub!"); }
/* 186 */   public int getRendererRequestedPriority() { throw new RuntimeException("Stub!"); }
/* 187 */   public boolean getRendererPriorityWaivedWhenNotVisible() { throw new RuntimeException("Stub!"); }
/* 188 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 189 */   public void setLayoutParams(android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 190 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
/* 191 */   public void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
/* 192 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
/* 193 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 194 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 195 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 196 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 197 */   public void computeScroll() { throw new RuntimeException("Stub!"); }
/* 198 */   public boolean onHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 199 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 200 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 201 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 202 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 203 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 204 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 205 */   public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 207 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 208 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 209 */   public void onProvideVirtualStructure(android.view.ViewStructure structure) { throw new RuntimeException("Stub!"); }
/* 210 */   public void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 211 */   public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> values) { throw new RuntimeException("Stub!"); }
/* 212 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
/* 213 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/* 214 */   protected void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 215 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); }
/* 216 */   protected void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 217 */   public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
/* 218 */   public boolean onDragEvent(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
/* 219 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 220 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/* 221 */   protected void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 222 */   protected void onSizeChanged(int w, int h, int ow, int oh) { throw new RuntimeException("Stub!"); }
/* 223 */   protected void onScrollChanged(int l, int t, int oldl, int oldt) { throw new RuntimeException("Stub!"); }
/* 224 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 225 */   public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 226 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 227 */   public boolean requestChildRectangleOnScreen(View child, android.graphics.Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
/* 228 */   public void setBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
/* 229 */   public void setLayerType(int layerType, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
/* 230 */   protected void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 231 */   public void onStartTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 232 */   public void onFinishTemporaryDetach() { throw new RuntimeException("Stub!"); }
/* 233 */   public android.os.Handler getHandler() { throw new RuntimeException("Stub!"); }
/* 234 */   public View findFocus() { throw new RuntimeException("Stub!"); }
/* 235 */   public static android.content.pm.PackageInfo getCurrentWebViewPackage() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\webkit\WebView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */