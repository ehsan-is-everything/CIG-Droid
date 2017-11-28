/*     */ package android.hardware.camera2;
/*     */ 
/*     */ import android.graphics.Point;
/*     */ import android.graphics.Rect;
/*     */ import android.hardware.camera2.params.ColorSpaceTransform;
/*     */ import android.hardware.camera2.params.Face;
/*     */ import android.hardware.camera2.params.LensShadingMap;
/*     */ import android.hardware.camera2.params.MeteringRectangle;
/*     */ import android.hardware.camera2.params.RggbChannelVector;
/*     */ import android.hardware.camera2.params.TonemapCurve;
/*     */ import android.location.Location;
/*     */ import android.util.Pair;
/*     */ import android.util.Range;
/*     */ import android.util.Rational;
/*     */ import android.util.Size;
/*     */ 
/*     */ 
/*     */ public class CaptureResult
/*     */   extends CameraMetadata<Key<?>>
/*     */ {
/*     */   public static final class Key<T>
/*     */   {
/*  23 */     Key() { throw new RuntimeException("Stub!"); }
/*  24 */     public String getName() { throw new RuntimeException("Stub!"); }
/*  25 */     public final int hashCode() { throw new RuntimeException("Stub!"); }
/*     */     
/*  27 */     public final boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  28 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  30 */   CaptureResult() { throw new RuntimeException("Stub!"); }
/*  31 */   public <T> T get(Key<T> key) { throw new RuntimeException("Stub!"); }
/*  32 */   public java.util.List<Key<?>> getKeys() { throw new RuntimeException("Stub!"); }
/*  33 */   public CaptureRequest getRequest() { throw new RuntimeException("Stub!"); }
/*  34 */   public long getFrameNumber() { throw new RuntimeException("Stub!"); }
/*  35 */   public int getSequenceId() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */   public static final Key<Integer> TONEMAP_PRESET_CURVE = null; public static final Key<Integer> TONEMAP_MODE = null; public static final Key<Float> TONEMAP_GAMMA = null; public static final Key<TonemapCurve> TONEMAP_CURVE = null; public static final Key<Integer> STATISTICS_SCENE_FLICKER = null; public static final Key<Integer> STATISTICS_LENS_SHADING_MAP_MODE = null; public static final Key<LensShadingMap> STATISTICS_LENS_SHADING_CORRECTION_MAP = null; public static final Key<Boolean> STATISTICS_HOT_PIXEL_MAP_MODE = null; public static final Key<Point[]> STATISTICS_HOT_PIXEL_MAP = null; public static final Key<Integer> STATISTICS_FACE_DETECT_MODE = null; public static final Key<Face[]> STATISTICS_FACES = null; public static final Key<Integer> SHADING_MODE = null; public static final Key<Long> SENSOR_TIMESTAMP = null; public static final Key<Integer> SENSOR_TEST_PATTERN_MODE = null; public static final Key<int[]> SENSOR_TEST_PATTERN_DATA = null; public static final Key<Integer> SENSOR_SENSITIVITY = null; public static final Key<Long> SENSOR_ROLLING_SHUTTER_SKEW = null; public static final Key<Pair<Double, Double>[]> SENSOR_NOISE_PROFILE = null; public static final Key<Rational[]> SENSOR_NEUTRAL_COLOR_POINT = null; public static final Key<Float> SENSOR_GREEN_SPLIT = null; public static final Key<Long> SENSOR_FRAME_DURATION = null; public static final Key<Long> SENSOR_EXPOSURE_TIME = null; public static final Key<Integer> SENSOR_DYNAMIC_WHITE_LEVEL = null; public static final Key<float[]> SENSOR_DYNAMIC_BLACK_LEVEL = null; public static final Key<Rect> SCALER_CROP_REGION = null; public static final Key<Byte> REQUEST_PIPELINE_DEPTH = null; public static final Key<Float> REPROCESS_EFFECTIVE_EXPOSURE_FACTOR = null; public static final Key<Integer> NOISE_REDUCTION_MODE = null; public static final Key<Integer> LENS_STATE = null; public static final Key<float[]> LENS_RADIAL_DISTORTION = null; public static final Key<float[]> LENS_POSE_TRANSLATION = null; public static final Key<float[]> LENS_POSE_ROTATION = null; public static final Key<Integer> LENS_OPTICAL_STABILIZATION_MODE = null; public static final Key<float[]> LENS_INTRINSIC_CALIBRATION = null; public static final Key<Pair<Float, Float>> LENS_FOCUS_RANGE = null; public static final Key<Float> LENS_FOCUS_DISTANCE = null; public static final Key<Float> LENS_FOCAL_LENGTH = null; public static final Key<Float> LENS_FILTER_DENSITY = null; public static final Key<Float> LENS_APERTURE = null; public static final Key<Size> JPEG_THUMBNAIL_SIZE = null; public static final Key<Byte> JPEG_THUMBNAIL_QUALITY = null; public static final Key<Byte> JPEG_QUALITY = null; public static final Key<Integer> JPEG_ORIENTATION = null; public static final Key<Location> JPEG_GPS_LOCATION = null; public static final Key<Integer> HOT_PIXEL_MODE = null; public static final Key<Integer> FLASH_STATE = null; public static final Key<Integer> FLASH_MODE = null; public static final Key<Integer> EDGE_MODE = null; public static final Key<Integer> CONTROL_VIDEO_STABILIZATION_MODE = null; public static final Key<Integer> CONTROL_SCENE_MODE = null; public static final Key<Integer> CONTROL_POST_RAW_SENSITIVITY_BOOST = null; public static final Key<Integer> CONTROL_MODE = null; public static final Key<Boolean> CONTROL_ENABLE_ZSL = null; public static final Key<Integer> CONTROL_EFFECT_MODE = null; public static final Key<Integer> CONTROL_CAPTURE_INTENT = null; public static final Key<Integer> CONTROL_AWB_STATE = null; public static final Key<MeteringRectangle[]> CONTROL_AWB_REGIONS = null; public static final Key<Integer> CONTROL_AWB_MODE = null; public static final Key<Boolean> CONTROL_AWB_LOCK = null; public static final Key<Integer> CONTROL_AF_TRIGGER = null; public static final Key<Integer> CONTROL_AF_STATE = null; public static final Key<MeteringRectangle[]> CONTROL_AF_REGIONS = null; public static final Key<Integer> CONTROL_AF_MODE = null; public static final Key<Range<Integer>> CONTROL_AE_TARGET_FPS_RANGE = null; public static final Key<Integer> CONTROL_AE_STATE = null; public static final Key<MeteringRectangle[]> CONTROL_AE_REGIONS = null; public static final Key<Integer> CONTROL_AE_PRECAPTURE_TRIGGER = null; public static final Key<Integer> CONTROL_AE_MODE = null; public static final Key<Boolean> CONTROL_AE_LOCK = null; public static final Key<Integer> CONTROL_AE_EXPOSURE_COMPENSATION = null; public static final Key<Integer> CONTROL_AE_ANTIBANDING_MODE = null; public static final Key<ColorSpaceTransform> COLOR_CORRECTION_TRANSFORM = null; public static final Key<Integer> COLOR_CORRECTION_MODE = null; public static final Key<RggbChannelVector> COLOR_CORRECTION_GAINS = null; public static final Key<Integer> COLOR_CORRECTION_ABERRATION_MODE = null; public static final Key<Boolean> BLACK_LEVEL_LOCK = null;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\camera2\CaptureResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */