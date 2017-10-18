/*     */ package android.media;
/*     */ 
/*     */ import android.view.Surface;
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class MediaCodec
/*     */ {
/*     */   public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
/*     */   public static final int BUFFER_FLAG_END_OF_STREAM = 4;
/*     */   public static final int BUFFER_FLAG_KEY_FRAME = 1;
/*     */   public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
/*     */   @Deprecated
/*     */   public static final int BUFFER_FLAG_SYNC_FRAME = 1;
/*     */   public static final int CONFIGURE_FLAG_ENCODE = 1;
/*     */   public static final int CRYPTO_MODE_AES_CBC = 2;
/*     */   public static final int CRYPTO_MODE_AES_CTR = 1;
/*     */   
/*     */   public static final class BufferInfo
/*     */   {
/*  22 */     public BufferInfo() { throw new RuntimeException("Stub!"); }
/*  23 */     public void set(int newOffset, int newSize, long newTimeUs, int newFlags) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public int flags;
/*     */     public int offset;
/*     */     public long presentationTimeUs;
/*     */     public int size; }
/*     */   
/*     */   public static final class CodecException extends IllegalStateException { public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
/*     */     
/*  32 */     CodecException() { throw new RuntimeException("Stub!"); }
/*  33 */     public boolean isTransient() { throw new RuntimeException("Stub!"); }
/*  34 */     public boolean isRecoverable() { throw new RuntimeException("Stub!"); }
/*  35 */     public int getErrorCode() { throw new RuntimeException("Stub!"); }
/*  36 */     public String getDiagnosticInfo() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int ERROR_RECLAIMED = 1101;
/*     */   }
/*     */   
/*     */   public static final class CryptoException extends RuntimeException { public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
/*     */     
/*  43 */     public CryptoException(int errorCode, String detailMessage) { throw new RuntimeException("Stub!"); }
/*  44 */     public int getErrorCode() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int ERROR_KEY_EXPIRED = 2;
/*     */     public static final int ERROR_NO_KEY = 1;
/*     */     public static final int ERROR_RESOURCE_BUSY = 3;
/*     */     public static final int ERROR_SESSION_NOT_OPENED = 5;
/*     */     public static final int ERROR_UNSUPPORTED_OPERATION = 6; }
/*     */   
/*     */   public static final int CRYPTO_MODE_UNENCRYPTED = 0;
/*     */   @Deprecated
/*     */   public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
/*     */   
/*  56 */   public static final class CryptoInfo { public static final class Pattern { public Pattern(int blocksToEncrypt, int blocksToSkip) { throw new RuntimeException("Stub!"); }
/*  57 */       public void set(int blocksToEncrypt, int blocksToSkip) { throw new RuntimeException("Stub!"); }
/*  58 */       public int getSkipBlocks() { throw new RuntimeException("Stub!"); }
/*  59 */       public int getEncryptBlocks() { throw new RuntimeException("Stub!"); } }
/*     */     
/*  61 */     public CryptoInfo() { throw new RuntimeException("Stub!"); }
/*  62 */     public void set(int newNumSubSamples, int[] newNumBytesOfClearData, int[] newNumBytesOfEncryptedData, byte[] newKey, byte[] newIV, int newMode) { throw new RuntimeException("Stub!"); }
/*  63 */     public void setPattern(Pattern newPattern) { throw new RuntimeException("Stub!"); }
/*  64 */     public String toString() { throw new RuntimeException("Stub!"); }
/*  65 */     public byte[] iv = null;
/*  66 */     public byte[] key = null;
/*     */     public int mode;
/*  68 */     public int[] numBytesOfClearData = null;
/*  69 */     public int[] numBytesOfEncryptedData = null;
/*     */     public int numSubSamples; }
/*     */   
/*     */   public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
/*     */   public static final int INFO_TRY_AGAIN_LATER = -1;
/*     */   public static final String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
/*     */   
/*     */   public static abstract interface OnFrameRenderedListener { public abstract void onFrameRendered(MediaCodec paramMediaCodec, long paramLong1, long paramLong2); }
/*     */   
/*  78 */   public static abstract class Callback { public Callback() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public abstract void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt);
/*     */     
/*     */     public abstract void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo);
/*     */     
/*     */     public abstract void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException);
/*     */     public abstract void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat); }
/*  86 */   public static final class MetricsConstants { MetricsConstants() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final String CODEC = "android.media.mediacodec.codec";
/*     */     public static final String ENCODER = "android.media.mediacodec.encoder";
/*     */     public static final String HEIGHT = "android.media.mediacodec.height";
/*     */     public static final String MIME_TYPE = "android.media.mediacodec.mime";
/*     */     public static final String MODE = "android.media.mediacodec.mode";
/*     */     public static final String MODE_AUDIO = "audio";
/*     */     public static final String MODE_VIDEO = "video";
/*     */     public static final String ROTATION = "android.media.mediacodec.rotation";
/*     */     public static final String SECURE = "android.media.mediacodec.secure";
/*     */     public static final String WIDTH = "android.media.mediacodec.width"; }
/*  98 */   MediaCodec() { throw new RuntimeException("Stub!"); }
/*  99 */   public static MediaCodec createDecoderByType(String type) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 100 */   public static MediaCodec createEncoderByType(String type) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 101 */   public static MediaCodec createByCodecName(String name) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 102 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 103 */   public final void reset() { throw new RuntimeException("Stub!"); }
/* 104 */   public final void release() { throw new RuntimeException("Stub!"); }
/* 105 */   public void configure(MediaFormat format, Surface surface, MediaCrypto crypto, int flags) { throw new RuntimeException("Stub!"); }
/* 106 */   public void configure(MediaFormat format, Surface surface, int flags, MediaDescrambler descrambler) { throw new RuntimeException("Stub!"); }
/* 107 */   public void setOutputSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 108 */   public static Surface createPersistentInputSurface() { throw new RuntimeException("Stub!"); }
/* 109 */   public void setInputSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/*     */   public final native Surface createInputSurface();
/* 111 */   public final void start() { throw new RuntimeException("Stub!"); }
/* 112 */   public final void stop() { throw new RuntimeException("Stub!"); }
/* 113 */   public final void flush() { throw new RuntimeException("Stub!"); }
/* 114 */   public final void queueInputBuffer(int index, int offset, int size, long presentationTimeUs, int flags) throws MediaCodec.CryptoException { throw new RuntimeException("Stub!"); }
/* 115 */   public final void queueSecureInputBuffer(int index, int offset, CryptoInfo info, long presentationTimeUs, int flags) throws MediaCodec.CryptoException { throw new RuntimeException("Stub!"); }
/* 116 */   public final int dequeueInputBuffer(long timeoutUs) { throw new RuntimeException("Stub!"); }
/* 117 */   public final int dequeueOutputBuffer(BufferInfo info, long timeoutUs) { throw new RuntimeException("Stub!"); }
/* 118 */   public final void releaseOutputBuffer(int index, boolean render) { throw new RuntimeException("Stub!"); }
/* 119 */   public final void releaseOutputBuffer(int index, long renderTimestampNs) { throw new RuntimeException("Stub!"); }
/*     */   public final native void signalEndOfInputStream();
/* 121 */   public final MediaFormat getOutputFormat() { throw new RuntimeException("Stub!"); }
/* 122 */   public final MediaFormat getInputFormat() { throw new RuntimeException("Stub!"); }
/* 123 */   public final MediaFormat getOutputFormat(int index) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 125 */   public ByteBuffer[] getInputBuffers() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 127 */   public ByteBuffer[] getOutputBuffers() { throw new RuntimeException("Stub!"); }
/* 128 */   public ByteBuffer getInputBuffer(int index) { throw new RuntimeException("Stub!"); }
/* 129 */   public Image getInputImage(int index) { throw new RuntimeException("Stub!"); }
/* 130 */   public ByteBuffer getOutputBuffer(int index) { throw new RuntimeException("Stub!"); }
/* 131 */   public Image getOutputImage(int index) { throw new RuntimeException("Stub!"); }
/*     */   public final native void setVideoScalingMode(int paramInt);
/*     */   public final native String getName();
/* 134 */   public android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
/* 135 */   public final void setParameters(android.os.Bundle params) { throw new RuntimeException("Stub!"); }
/* 136 */   public void setCallback(Callback cb, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 137 */   public void setCallback(Callback cb) { throw new RuntimeException("Stub!"); }
/* 138 */   public void setOnFrameRenderedListener(OnFrameRenderedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 139 */   public MediaCodecInfo getCodecInfo() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final String PARAMETER_KEY_SUSPEND = "drop-input-frames";
/*     */   public static final String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */