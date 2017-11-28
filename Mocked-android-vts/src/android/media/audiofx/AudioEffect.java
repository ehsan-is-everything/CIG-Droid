/*    */ package android.media.audiofx;
/*    */ 
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class AudioEffect { public static final int SUCCESS = 0;
/*    */   public static final String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
/*    */   public static final String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
/*    */   public static final String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
/*    */   public static final int ERROR_NO_MEMORY = -6;
/*    */   public static final int ERROR_NO_INIT = -3;
/*    */   public static final int ERROR_INVALID_OPERATION = -5;
/*    */   public static final int ERROR_DEAD_OBJECT = -7;
/*    */   public static final int ERROR_BAD_VALUE = -4;
/*    */   public static final int ERROR = -1;
/*    */   
/*    */   public static abstract interface OnControlStatusChangeListener { public abstract void onControlStatusChange(AudioEffect paramAudioEffect, boolean paramBoolean); }
/*    */   
/*    */   public static abstract interface OnEnableStatusChangeListener { public abstract void onEnableStatusChange(AudioEffect paramAudioEffect, boolean paramBoolean); }
/*    */   
/*    */   public static class Descriptor { public String connectMode;
/*    */     
/* 22 */     public Descriptor() { throw new RuntimeException("Stub!"); }
/* 23 */     public Descriptor(String type, String uuid, String connectMode, String name, String implementor) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */     public String implementor;
/*    */     
/*    */     public String name;
/*    */     
/*    */     public UUID type;
/*    */     
/*    */     public UUID uuid;
/*    */   }
/*    */   
/*    */ 
/*    */   AudioEffect()
/*    */   {
/* 38 */     throw new RuntimeException("Stub!"); }
/* 39 */   public void release() { throw new RuntimeException("Stub!"); }
/* 40 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 41 */   public Descriptor getDescriptor() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 42 */   public static Descriptor[] queryEffects() { throw new RuntimeException("Stub!"); }
/* 43 */   public int setEnabled(boolean enabled) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 44 */   public int getId() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean getEnabled() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean hasControl() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 47 */   public void setEnableStatusListener(OnEnableStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setControlStatusListener(OnControlStatusChangeListener listener) { throw new RuntimeException("Stub!"); }
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
/* 78 */   public static final UUID EFFECT_TYPE_VIRTUALIZER = null; public static final UUID EFFECT_TYPE_PRESET_REVERB = null; public static final UUID EFFECT_TYPE_NS = null; public static final UUID EFFECT_TYPE_LOUDNESS_ENHANCER = null; public static final UUID EFFECT_TYPE_EQUALIZER = null; public static final UUID EFFECT_TYPE_ENV_REVERB = null; public static final UUID EFFECT_TYPE_BASS_BOOST = null; public static final UUID EFFECT_TYPE_AGC = null; public static final UUID EFFECT_TYPE_AEC = null;
/*    */   public static final String EFFECT_INSERT = "Insert";
/*    */   public static final String EFFECT_AUXILIARY = "Auxiliary";
/*    */   public static final int CONTENT_TYPE_VOICE = 3;
/*    */   public static final int CONTENT_TYPE_MUSIC = 0;
/*    */   public static final int CONTENT_TYPE_MOVIE = 1;
/*    */   public static final int CONTENT_TYPE_GAME = 2;
/*    */   public static final int ALREADY_EXISTS = -2;
/*    */   public static final String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
/*    */   public static final String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
/*    */   public static final String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\audiofx\AudioEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */