/*    */ package android.media;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CamcorderProfile
/*    */ {
/*    */   public static final int QUALITY_1080P = 6;
/*    */   
/*    */ 
/*    */   public static final int QUALITY_2160P = 8;
/*    */   
/*    */   public static final int QUALITY_480P = 4;
/*    */   public static final int QUALITY_720P = 5;
/*    */   public static final int QUALITY_CIF = 3;
/*    */   public static final int QUALITY_HIGH = 1;
/*    */   public static final int QUALITY_HIGH_SPEED_1080P = 2004;
/*    */   public static final int QUALITY_HIGH_SPEED_2160P = 2005;
/*    */   public static final int QUALITY_HIGH_SPEED_480P = 2002;
/*    */   
/* 20 */   CamcorderProfile() { throw new RuntimeException("Stub!"); }
/* 21 */   public static CamcorderProfile get(int quality) { throw new RuntimeException("Stub!"); }
/* 22 */   public static CamcorderProfile get(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
/* 23 */   public static boolean hasProfile(int quality) { throw new RuntimeException("Stub!"); }
/* 24 */   public static boolean hasProfile(int cameraId, int quality) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int QUALITY_HIGH_SPEED_720P = 2003;
/*    */   public static final int QUALITY_HIGH_SPEED_HIGH = 2001;
/*    */   public static final int QUALITY_HIGH_SPEED_LOW = 2000;
/*    */   public static final int QUALITY_LOW = 0;
/*    */   public static final int QUALITY_QCIF = 2;
/*    */   public static final int QUALITY_QVGA = 7;
/*    */   public static final int QUALITY_TIME_LAPSE_1080P = 1006;
/*    */   public static final int QUALITY_TIME_LAPSE_2160P = 1008;
/*    */   public static final int QUALITY_TIME_LAPSE_480P = 1004;
/*    */   public static final int QUALITY_TIME_LAPSE_720P = 1005;
/*    */   public static final int QUALITY_TIME_LAPSE_CIF = 1003;
/*    */   public static final int QUALITY_TIME_LAPSE_HIGH = 1001;
/*    */   public static final int QUALITY_TIME_LAPSE_LOW = 1000;
/*    */   public static final int QUALITY_TIME_LAPSE_QCIF = 1002;
/*    */   public static final int QUALITY_TIME_LAPSE_QVGA = 1007;
/*    */   public int audioBitRate;
/*    */   public int audioChannels;
/*    */   public int audioCodec;
/*    */   public int audioSampleRate;
/*    */   public int duration;
/*    */   public int fileFormat;
/*    */   public int quality;
/*    */   public int videoBitRate;
/*    */   public int videoCodec;
/*    */   public int videoFrameHeight;
/*    */   public int videoFrameRate;
/*    */   public int videoFrameWidth;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\CamcorderProfile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */