/*     */ package android.webkit;
/*     */ 
/*     */ import android.content.Context;
/*     */ 
/*     */ public abstract class WebSettings
/*     */ {
/*     */   public static final int LOAD_CACHE_ELSE_NETWORK = 1;
/*     */   public static final int LOAD_CACHE_ONLY = 3;
/*     */   public static final int LOAD_DEFAULT = -1;
/*     */   @Deprecated
/*     */   public static final int LOAD_NORMAL = 0;
/*     */   public static final int LOAD_NO_CACHE = 2;
/*     */   public static final int MENU_ITEM_NONE = 0;
/*     */   public static final int MENU_ITEM_PROCESS_TEXT = 4;
/*     */   public static final int MENU_ITEM_SHARE = 1;
/*     */   public static final int MENU_ITEM_WEB_SEARCH = 2;
/*     */   public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
/*     */   public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
/*     */   public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
/*     */   
/*     */   public static enum LayoutAlgorithm {
/*  22 */     NARROW_COLUMNS, 
/*  23 */     NORMAL, 
/*  24 */     SINGLE_COLUMN, 
/*  25 */     TEXT_AUTOSIZING;
/*     */     
/*     */     private LayoutAlgorithm() {} }
/*     */   
/*     */   @Deprecated
/*  30 */   public static enum TextSize { LARGER, 
/*  31 */     LARGEST, 
/*  32 */     NORMAL, 
/*  33 */     SMALLER, 
/*  34 */     SMALLEST;
/*     */     
/*     */     private TextSize() {} }
/*     */   
/*  38 */   public static enum ZoomDensity { CLOSE, 
/*  39 */     FAR, 
/*  40 */     MEDIUM;
/*     */     
/*     */     private ZoomDensity() {} }
/*     */   
/*  44 */   public static enum RenderPriority { HIGH, 
/*  45 */     LOW, 
/*  46 */     NORMAL;
/*     */     
/*     */     private RenderPriority() {} }
/*     */   
/*  50 */   public static enum PluginState { OFF, 
/*  51 */     ON, 
/*  52 */     ON_DEMAND;
/*     */     private PluginState() {} }
/*  54 */   public WebSettings() { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setSupportZoom(boolean paramBoolean);
/*     */   public abstract boolean supportZoom();
/*     */   public abstract void setMediaPlaybackRequiresUserGesture(boolean paramBoolean);
/*     */   public abstract boolean getMediaPlaybackRequiresUserGesture();
/*     */   public abstract void setBuiltInZoomControls(boolean paramBoolean);
/*     */   public abstract boolean getBuiltInZoomControls();
/*     */   public abstract void setDisplayZoomControls(boolean paramBoolean);
/*     */   public abstract boolean getDisplayZoomControls();
/*     */   public abstract void setAllowFileAccess(boolean paramBoolean);
/*     */   public abstract boolean getAllowFileAccess();
/*     */   public abstract void setAllowContentAccess(boolean paramBoolean);
/*     */   public abstract boolean getAllowContentAccess();
/*     */   public abstract void setLoadWithOverviewMode(boolean paramBoolean);
/*     */   public abstract boolean getLoadWithOverviewMode();
/*     */   @Deprecated
/*     */   public abstract void setEnableSmoothTransition(boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract boolean enableSmoothTransition();
/*     */   @Deprecated
/*     */   public abstract void setSaveFormData(boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract boolean getSaveFormData();
/*     */   @Deprecated
/*     */   public abstract void setSavePassword(boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract boolean getSavePassword();
/*     */   public abstract void setTextZoom(int paramInt);
/*     */   public abstract int getTextZoom();
/*     */   @Deprecated
/*  84 */   public synchronized void setTextSize(TextSize t) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  86 */   public synchronized TextSize getTextSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*     */   public abstract void setDefaultZoom(ZoomDensity paramZoomDensity);
/*     */   @Deprecated
/*     */   public abstract ZoomDensity getDefaultZoom();
/*     */   @Deprecated
/*     */   public abstract void setLightTouchEnabled(boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract boolean getLightTouchEnabled();
/*     */   public abstract void setUseWideViewPort(boolean paramBoolean);
/*     */   public abstract boolean getUseWideViewPort();
/*     */   public abstract void setSupportMultipleWindows(boolean paramBoolean);
/*     */   public abstract boolean supportMultipleWindows();
/*     */   public abstract void setLayoutAlgorithm(LayoutAlgorithm paramLayoutAlgorithm);
/*     */   public abstract LayoutAlgorithm getLayoutAlgorithm();
/*     */   public abstract void setStandardFontFamily(String paramString);
/*     */   public abstract String getStandardFontFamily();
/*     */   public abstract void setFixedFontFamily(String paramString);
/*     */   public abstract String getFixedFontFamily();
/*     */   public abstract void setSansSerifFontFamily(String paramString);
/*     */   public abstract String getSansSerifFontFamily();
/*     */   public abstract void setSerifFontFamily(String paramString);
/*     */   public abstract String getSerifFontFamily();
/*     */   public abstract void setCursiveFontFamily(String paramString);
/*     */   public abstract String getCursiveFontFamily();
/*     */   public abstract void setFantasyFontFamily(String paramString);
/*     */   public abstract String getFantasyFontFamily();
/*     */   public abstract void setMinimumFontSize(int paramInt);
/*     */   public abstract int getMinimumFontSize();
/*     */   public abstract void setMinimumLogicalFontSize(int paramInt);
/*     */   public abstract int getMinimumLogicalFontSize();
/*     */   public abstract void setDefaultFontSize(int paramInt);
/*     */   public abstract int getDefaultFontSize();
/*     */   public abstract void setDefaultFixedFontSize(int paramInt);
/*     */   public abstract int getDefaultFixedFontSize();
/*     */   public abstract void setLoadsImagesAutomatically(boolean paramBoolean);
/*     */   public abstract boolean getLoadsImagesAutomatically();
/*     */   public abstract void setBlockNetworkImage(boolean paramBoolean);
/*     */   public abstract boolean getBlockNetworkImage();
/*     */   public abstract void setBlockNetworkLoads(boolean paramBoolean);
/*     */   public abstract boolean getBlockNetworkLoads();
/*     */   public abstract void setJavaScriptEnabled(boolean paramBoolean);
/*     */   public abstract void setAllowUniversalAccessFromFileURLs(boolean paramBoolean);
/*     */   public abstract void setAllowFileAccessFromFileURLs(boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract void setPluginState(PluginState paramPluginState);
/*     */   @Deprecated
/*     */   public abstract void setDatabasePath(String paramString);
/*     */   @Deprecated
/*     */   public abstract void setGeolocationDatabasePath(String paramString);
/*     */   public abstract void setAppCacheEnabled(boolean paramBoolean);
/*     */   public abstract void setAppCachePath(String paramString);
/*     */   @Deprecated
/*     */   public abstract void setAppCacheMaxSize(long paramLong);
/*     */   public abstract void setDatabaseEnabled(boolean paramBoolean);
/*     */   public abstract void setDomStorageEnabled(boolean paramBoolean);
/*     */   public abstract boolean getDomStorageEnabled();
/*     */   @Deprecated
/*     */   public abstract String getDatabasePath();
/*     */   public abstract boolean getDatabaseEnabled();
/*     */   public abstract void setGeolocationEnabled(boolean paramBoolean);
/*     */   public abstract boolean getJavaScriptEnabled();
/*     */   public abstract boolean getAllowUniversalAccessFromFileURLs();
/*     */   public abstract boolean getAllowFileAccessFromFileURLs();
/*     */   @Deprecated
/*     */   public abstract PluginState getPluginState();
/*     */   public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean paramBoolean);
/*     */   public abstract boolean getJavaScriptCanOpenWindowsAutomatically();
/*     */   public abstract void setDefaultTextEncodingName(String paramString);
/*     */   public abstract String getDefaultTextEncodingName();
/*     */   public abstract void setUserAgentString(String paramString);
/*     */   public abstract String getUserAgentString();
/* 158 */   public static String getDefaultUserAgent(Context context) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public abstract void setNeedInitialFocus(boolean paramBoolean);
/*     */   
/*     */   @Deprecated
/*     */   public abstract void setRenderPriority(RenderPriority paramRenderPriority);
/*     */   
/*     */   public abstract void setCacheMode(int paramInt);
/*     */   
/*     */   public abstract int getCacheMode();
/*     */   
/*     */   public abstract void setMixedContentMode(int paramInt);
/*     */   
/*     */   public abstract int getMixedContentMode();
/*     */   
/*     */   public abstract void setOffscreenPreRaster(boolean paramBoolean);
/*     */   
/*     */   public abstract boolean getOffscreenPreRaster();
/*     */   
/*     */   public abstract void setSafeBrowsingEnabled(boolean paramBoolean);
/*     */   
/*     */   public abstract boolean getSafeBrowsingEnabled();
/*     */   
/*     */   public abstract void setDisabledActionModeMenuItems(int paramInt);
/*     */   
/*     */   public abstract int getDisabledActionModeMenuItems();
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */