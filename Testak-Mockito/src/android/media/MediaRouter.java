/*     */ package android.media;
/*     */ 
/*     */ import android.graphics.drawable.Drawable;
/*     */ 
/*     */ public class MediaRouter {
/*     */   public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
/*     */   public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
/*     */   public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
/*     */   public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
/*     */   public static final int ROUTE_TYPE_USER = 8388608;
/*     */   
/*     */   public static class RouteInfo {
/*     */     public static final int DEVICE_TYPE_BLUETOOTH = 3;
/*     */     public static final int DEVICE_TYPE_SPEAKER = 2;
/*     */     public static final int DEVICE_TYPE_TV = 1;
/*     */     public static final int DEVICE_TYPE_UNKNOWN = 0;
/*     */     public static final int PLAYBACK_TYPE_LOCAL = 0;
/*     */     public static final int PLAYBACK_TYPE_REMOTE = 1;
/*     */     public static final int PLAYBACK_VOLUME_FIXED = 0;
/*     */     public static final int PLAYBACK_VOLUME_VARIABLE = 1;
/*     */     
/*  22 */     RouteInfo() { throw new RuntimeException("Stub!"); }
/*  23 */     public CharSequence getName() { throw new RuntimeException("Stub!"); }
/*  24 */     public CharSequence getName(android.content.Context context) { throw new RuntimeException("Stub!"); }
/*  25 */     public CharSequence getDescription() { throw new RuntimeException("Stub!"); }
/*  26 */     public CharSequence getStatus() { throw new RuntimeException("Stub!"); }
/*  27 */     public int getSupportedTypes() { throw new RuntimeException("Stub!"); }
/*  28 */     public int getDeviceType() { throw new RuntimeException("Stub!"); }
/*  29 */     public MediaRouter.RouteGroup getGroup() { throw new RuntimeException("Stub!"); }
/*  30 */     public MediaRouter.RouteCategory getCategory() { throw new RuntimeException("Stub!"); }
/*  31 */     public Drawable getIconDrawable() { throw new RuntimeException("Stub!"); }
/*  32 */     public void setTag(Object tag) { throw new RuntimeException("Stub!"); }
/*  33 */     public Object getTag() { throw new RuntimeException("Stub!"); }
/*  34 */     public int getPlaybackType() { throw new RuntimeException("Stub!"); }
/*  35 */     public int getPlaybackStream() { throw new RuntimeException("Stub!"); }
/*  36 */     public int getVolume() { throw new RuntimeException("Stub!"); }
/*  37 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); }
/*  38 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); }
/*  39 */     public int getVolumeMax() { throw new RuntimeException("Stub!"); }
/*  40 */     public int getVolumeHandling() { throw new RuntimeException("Stub!"); }
/*  41 */     public android.view.Display getPresentationDisplay() { throw new RuntimeException("Stub!"); }
/*  42 */     public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/*  43 */     public boolean isConnecting() { throw new RuntimeException("Stub!"); }
/*  44 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static class UserRouteInfo
/*     */     extends MediaRouter.RouteInfo
/*     */   {
/*  57 */     UserRouteInfo() { throw new RuntimeException("Stub!"); }
/*  58 */     public void setName(CharSequence name) { throw new RuntimeException("Stub!"); }
/*  59 */     public void setName(int resId) { throw new RuntimeException("Stub!"); }
/*  60 */     public void setDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/*  61 */     public void setStatus(CharSequence status) { throw new RuntimeException("Stub!"); }
/*  62 */     public void setRemoteControlClient(RemoteControlClient rcc) { throw new RuntimeException("Stub!"); }
/*  63 */     public RemoteControlClient getRemoteControlClient() { throw new RuntimeException("Stub!"); }
/*  64 */     public void setIconDrawable(Drawable icon) { throw new RuntimeException("Stub!"); }
/*  65 */     public void setIconResource(int resId) { throw new RuntimeException("Stub!"); }
/*  66 */     public void setVolumeCallback(MediaRouter.VolumeCallback vcb) { throw new RuntimeException("Stub!"); }
/*  67 */     public void setPlaybackType(int type) { throw new RuntimeException("Stub!"); }
/*  68 */     public void setVolumeHandling(int volumeHandling) { throw new RuntimeException("Stub!"); }
/*  69 */     public void setVolume(int volume) { throw new RuntimeException("Stub!"); }
/*  70 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); }
/*  71 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); }
/*  72 */     public void setVolumeMax(int volumeMax) { throw new RuntimeException("Stub!"); }
/*  73 */     public void setPlaybackStream(int stream) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class RouteGroup
/*     */     extends MediaRouter.RouteInfo {
/*  78 */     RouteGroup() { throw new RuntimeException("Stub!"); }
/*  79 */     public void addRoute(MediaRouter.RouteInfo route) { throw new RuntimeException("Stub!"); }
/*  80 */     public void addRoute(MediaRouter.RouteInfo route, int insertAt) { throw new RuntimeException("Stub!"); }
/*  81 */     public void removeRoute(MediaRouter.RouteInfo route) { throw new RuntimeException("Stub!"); }
/*  82 */     public void removeRoute(int index) { throw new RuntimeException("Stub!"); }
/*  83 */     public int getRouteCount() { throw new RuntimeException("Stub!"); }
/*  84 */     public MediaRouter.RouteInfo getRouteAt(int index) { throw new RuntimeException("Stub!"); }
/*  85 */     public void setIconDrawable(Drawable icon) { throw new RuntimeException("Stub!"); }
/*  86 */     public void setIconResource(int resId) { throw new RuntimeException("Stub!"); }
/*  87 */     public void requestSetVolume(int volume) { throw new RuntimeException("Stub!"); }
/*  88 */     public void requestUpdateVolume(int direction) { throw new RuntimeException("Stub!"); }
/*  89 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class RouteCategory {
/*  93 */     RouteCategory() { throw new RuntimeException("Stub!"); }
/*  94 */     public CharSequence getName() { throw new RuntimeException("Stub!"); }
/*  95 */     public CharSequence getName(android.content.Context context) { throw new RuntimeException("Stub!"); }
/*  96 */     public java.util.List<MediaRouter.RouteInfo> getRoutes(java.util.List<MediaRouter.RouteInfo> out) { throw new RuntimeException("Stub!"); }
/*  97 */     public int getSupportedTypes() { throw new RuntimeException("Stub!"); }
/*  98 */     public boolean isGroupable() { throw new RuntimeException("Stub!"); }
/*  99 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract class Callback {
/* 103 */     public Callback() { throw new RuntimeException("Stub!"); }
/*     */     public abstract void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo);
/*     */     public abstract void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo);
/*     */     public abstract void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */     public abstract void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */     public abstract void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/*     */     public abstract void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt);
/*     */     public abstract void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup);
/*     */     public abstract void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo);
/* 112 */     public void onRoutePresentationDisplayChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class SimpleCallback
/*     */     extends MediaRouter.Callback {
/* 117 */     public SimpleCallback() { throw new RuntimeException("Stub!"); }
/* 118 */     public void onRouteSelected(MediaRouter router, int type, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/* 119 */     public void onRouteUnselected(MediaRouter router, int type, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/* 120 */     public void onRouteAdded(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/* 121 */     public void onRouteRemoved(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/* 122 */     public void onRouteChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/* 123 */     public void onRouteGrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group, int index) { throw new RuntimeException("Stub!"); }
/* 124 */     public void onRouteUngrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group) { throw new RuntimeException("Stub!"); }
/* 125 */     public void onRouteVolumeChanged(MediaRouter router, MediaRouter.RouteInfo info) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract class VolumeCallback {
/* 129 */     public VolumeCallback() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public abstract void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt);
/*     */     public abstract void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt); }
/* 133 */   MediaRouter() { throw new RuntimeException("Stub!"); }
/* 134 */   public RouteInfo getDefaultRoute() { throw new RuntimeException("Stub!"); }
/* 135 */   public RouteInfo getSelectedRoute(int type) { throw new RuntimeException("Stub!"); }
/* 136 */   public void addCallback(int types, Callback cb) { throw new RuntimeException("Stub!"); }
/* 137 */   public void addCallback(int types, Callback cb, int flags) { throw new RuntimeException("Stub!"); }
/* 138 */   public void removeCallback(Callback cb) { throw new RuntimeException("Stub!"); }
/* 139 */   public void selectRoute(int types, RouteInfo route) { throw new RuntimeException("Stub!"); }
/* 140 */   public void addUserRoute(UserRouteInfo info) { throw new RuntimeException("Stub!"); }
/* 141 */   public void removeUserRoute(UserRouteInfo info) { throw new RuntimeException("Stub!"); }
/* 142 */   public void clearUserRoutes() { throw new RuntimeException("Stub!"); }
/* 143 */   public int getCategoryCount() { throw new RuntimeException("Stub!"); }
/* 144 */   public RouteCategory getCategoryAt(int index) { throw new RuntimeException("Stub!"); }
/* 145 */   public int getRouteCount() { throw new RuntimeException("Stub!"); }
/* 146 */   public RouteInfo getRouteAt(int index) { throw new RuntimeException("Stub!"); }
/* 147 */   public UserRouteInfo createUserRoute(RouteCategory category) { throw new RuntimeException("Stub!"); }
/* 148 */   public RouteCategory createRouteCategory(CharSequence name, boolean isGroupable) { throw new RuntimeException("Stub!"); }
/* 149 */   public RouteCategory createRouteCategory(int nameResId, boolean isGroupable) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaRouter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */