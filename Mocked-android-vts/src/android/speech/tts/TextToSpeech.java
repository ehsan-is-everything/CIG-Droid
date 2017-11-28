/*     */ package android.speech.tts;
/*     */ 
/*     */ import java.util.Locale;
/*     */ 
/*     */ public class TextToSpeech { public static final String ACTION_TTS_QUEUE_PROCESSING_COMPLETED = "android.speech.tts.TTS_QUEUE_PROCESSING_COMPLETED";
/*     */   public static final int ERROR = -1;
/*     */   public static final int ERROR_INVALID_REQUEST = -8;
/*     */   public static final int ERROR_NETWORK = -6;
/*     */   public static final int ERROR_NETWORK_TIMEOUT = -7;
/*     */   public static final int ERROR_NOT_INSTALLED_YET = -9;
/*     */   public static final int ERROR_OUTPUT = -5;
/*     */   public static final int ERROR_SERVICE = -4;
/*     */   public static final int ERROR_SYNTHESIS = -3;
/*     */   public static final int LANG_AVAILABLE = 0;
/*     */   public static final int LANG_COUNTRY_AVAILABLE = 1;
/*     */   public static final int LANG_COUNTRY_VAR_AVAILABLE = 2;
/*     */   public static final int LANG_MISSING_DATA = -1;
/*     */   public static final int LANG_NOT_SUPPORTED = -2;
/*     */   public static final int QUEUE_ADD = 1;
/*     */   public static final int QUEUE_FLUSH = 0; public static final int STOPPED = -2; public static final int SUCCESS = 0;
/*     */   public static abstract interface OnInitListener { public abstract void onInit(int paramInt); }
/*     */   @Deprecated
/*     */   public static abstract interface OnUtteranceCompletedListener { public abstract void onUtteranceCompleted(String paramString); }
/*     */   public class Engine { public static final String ACTION_CHECK_TTS_DATA = "android.speech.tts.engine.CHECK_TTS_DATA"; public static final String ACTION_GET_SAMPLE_TEXT = "android.speech.tts.engine.GET_SAMPLE_TEXT"; public static final String ACTION_INSTALL_TTS_DATA = "android.speech.tts.engine.INSTALL_TTS_DATA"; public static final String ACTION_TTS_DATA_INSTALLED = "android.speech.tts.engine.TTS_DATA_INSTALLED"; @Deprecated
/*     */     public static final int CHECK_VOICE_DATA_BAD_DATA = -1; public static final int CHECK_VOICE_DATA_FAIL = 0; @Deprecated
/*     */     public static final int CHECK_VOICE_DATA_MISSING_DATA = -2; @Deprecated
/*     */     public static final int CHECK_VOICE_DATA_MISSING_VOLUME = -3; public static final int CHECK_VOICE_DATA_PASS = 1; public static final int DEFAULT_STREAM = 3; public static final String EXTRA_AVAILABLE_VOICES = "availableVoices"; @Deprecated
/*     */     public static final String EXTRA_CHECK_VOICE_DATA_FOR = "checkVoiceDataFor"; public static final String EXTRA_SAMPLE_TEXT = "sampleText"; @Deprecated
/*     */     public static final String EXTRA_TTS_DATA_INSTALLED = "dataInstalled"; public static final String EXTRA_UNAVAILABLE_VOICES = "unavailableVoices";
/*  30 */     public Engine() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */     @Deprecated
/*     */     public static final String EXTRA_VOICE_DATA_FILES = "dataFiles";
/*     */     
/*     */ 
/*     */     @Deprecated
/*     */     public static final String EXTRA_VOICE_DATA_FILES_INFO = "dataFilesInfo";
/*     */     
/*     */     @Deprecated
/*     */     public static final String EXTRA_VOICE_DATA_ROOT_DIRECTORY = "dataRoot";
/*     */     
/*     */     public static final String INTENT_ACTION_TTS_SERVICE = "android.intent.action.TTS_SERVICE";
/*     */     
/*     */     @Deprecated
/*     */     public static final String KEY_FEATURE_EMBEDDED_SYNTHESIS = "embeddedTts";
/*     */     
/*     */     public static final String KEY_FEATURE_NETWORK_RETRIES_COUNT = "networkRetriesCount";
/*     */     
/*     */     @Deprecated
/*     */     public static final String KEY_FEATURE_NETWORK_SYNTHESIS = "networkTts";
/*     */     
/*     */     public static final String KEY_FEATURE_NETWORK_TIMEOUT_MS = "networkTimeoutMs";
/*     */     
/*     */     public static final String KEY_FEATURE_NOT_INSTALLED = "notInstalled";
/*     */     
/*     */     public static final String KEY_PARAM_PAN = "pan";
/*     */     
/*     */     public static final String KEY_PARAM_SESSION_ID = "sessionId";
/*     */     
/*     */     public static final String KEY_PARAM_STREAM = "streamType";
/*     */     
/*     */     public static final String KEY_PARAM_UTTERANCE_ID = "utteranceId";
/*     */     public static final String KEY_PARAM_VOLUME = "volume";
/*     */     public static final String SERVICE_META_DATA = "android.speech.tts";
/*     */   }
/*     */   
/*     */   public static class EngineInfo
/*     */   {
/*     */     public int icon;
/*     */     public String label;
/*     */     
/*  74 */     public EngineInfo() { throw new RuntimeException("Stub!"); }
/*  75 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public String name;
/*     */   }
/*     */   
/*  80 */   public TextToSpeech(android.content.Context context, OnInitListener listener) { throw new RuntimeException("Stub!"); }
/*  81 */   public TextToSpeech(android.content.Context context, OnInitListener listener, String engine) { throw new RuntimeException("Stub!"); }
/*  82 */   public void shutdown() { throw new RuntimeException("Stub!"); }
/*  83 */   public int addSpeech(String text, String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
/*  84 */   public int addSpeech(CharSequence text, String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
/*  85 */   public int addSpeech(String text, String filename) { throw new RuntimeException("Stub!"); }
/*  86 */   public int addSpeech(CharSequence text, java.io.File file) { throw new RuntimeException("Stub!"); }
/*  87 */   public int addEarcon(String earcon, String packagename, int resourceId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  89 */   public int addEarcon(String earcon, String filename) { throw new RuntimeException("Stub!"); }
/*  90 */   public int addEarcon(String earcon, java.io.File file) { throw new RuntimeException("Stub!"); }
/*  91 */   public int speak(CharSequence text, int queueMode, android.os.Bundle params, String utteranceId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  93 */   public int speak(String text, int queueMode, java.util.HashMap<String, String> params) { throw new RuntimeException("Stub!"); }
/*  94 */   public int playEarcon(String earcon, int queueMode, android.os.Bundle params, String utteranceId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  96 */   public int playEarcon(String earcon, int queueMode, java.util.HashMap<String, String> params) { throw new RuntimeException("Stub!"); }
/*  97 */   public int playSilentUtterance(long durationInMs, int queueMode, String utteranceId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  99 */   public int playSilence(long durationInMs, int queueMode, java.util.HashMap<String, String> params) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 101 */   public java.util.Set<String> getFeatures(Locale locale) { throw new RuntimeException("Stub!"); }
/* 102 */   public boolean isSpeaking() { throw new RuntimeException("Stub!"); }
/* 103 */   public int stop() { throw new RuntimeException("Stub!"); }
/* 104 */   public int setSpeechRate(float speechRate) { throw new RuntimeException("Stub!"); }
/* 105 */   public int setPitch(float pitch) { throw new RuntimeException("Stub!"); }
/* 106 */   public int setAudioAttributes(android.media.AudioAttributes audioAttributes) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 108 */   public Locale getDefaultLanguage() { throw new RuntimeException("Stub!"); }
/* 109 */   public int setLanguage(Locale loc) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 111 */   public Locale getLanguage() { throw new RuntimeException("Stub!"); }
/* 112 */   public java.util.Set<Locale> getAvailableLanguages() { throw new RuntimeException("Stub!"); }
/* 113 */   public java.util.Set<Voice> getVoices() { throw new RuntimeException("Stub!"); }
/* 114 */   public int setVoice(Voice voice) { throw new RuntimeException("Stub!"); }
/* 115 */   public Voice getVoice() { throw new RuntimeException("Stub!"); }
/* 116 */   public Voice getDefaultVoice() { throw new RuntimeException("Stub!"); }
/* 117 */   public int isLanguageAvailable(Locale loc) { throw new RuntimeException("Stub!"); }
/* 118 */   public int synthesizeToFile(CharSequence text, android.os.Bundle params, java.io.File file, String utteranceId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 120 */   public int synthesizeToFile(String text, java.util.HashMap<String, String> params, String filename) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 122 */   public int setOnUtteranceCompletedListener(OnUtteranceCompletedListener listener) { throw new RuntimeException("Stub!"); }
/* 123 */   public int setOnUtteranceProgressListener(UtteranceProgressListener listener) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 125 */   public int setEngineByPackageName(String enginePackageName) { throw new RuntimeException("Stub!"); }
/* 126 */   public String getDefaultEngine() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 128 */   public boolean areDefaultsEnforced() { throw new RuntimeException("Stub!"); }
/* 129 */   public java.util.List<EngineInfo> getEngines() { throw new RuntimeException("Stub!"); }
/* 130 */   public static int getMaxSpeechInputLength() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\speech\tts\TextToSpeech.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */