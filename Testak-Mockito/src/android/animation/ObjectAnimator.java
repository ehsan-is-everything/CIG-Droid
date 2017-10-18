/*    */ package android.animation;
/*    */ 
/*    */ import android.graphics.Path;
/*    */ import android.graphics.PointF;
/*    */ import android.util.Property;
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
/*    */ public final class ObjectAnimator
/*    */   extends ValueAnimator
/*    */ {
/* 21 */   public ObjectAnimator() { throw new RuntimeException("Stub!"); }
/* 22 */   public void setPropertyName(String propertyName) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setProperty(Property property) { throw new RuntimeException("Stub!"); }
/* 24 */   public String getPropertyName() { throw new RuntimeException("Stub!"); }
/* 25 */   public static ObjectAnimator ofInt(Object target, String propertyName, int... values) { throw new RuntimeException("Stub!"); }
/* 26 */   public static ObjectAnimator ofInt(Object target, String xPropertyName, String yPropertyName, Path path) { throw new RuntimeException("Stub!"); }
/* 27 */   public static <T> ObjectAnimator ofInt(T target, Property<T, Integer> property, int... values) { throw new RuntimeException("Stub!"); }
/* 28 */   public static <T> ObjectAnimator ofInt(T target, Property<T, Integer> xProperty, Property<T, Integer> yProperty, Path path) { throw new RuntimeException("Stub!"); }
/* 29 */   public static ObjectAnimator ofMultiInt(Object target, String propertyName, int[][] values) { throw new RuntimeException("Stub!"); }
/* 30 */   public static ObjectAnimator ofMultiInt(Object target, String propertyName, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 32 */   public static <T> ObjectAnimator ofMultiInt(Object target, String propertyName, TypeConverter<T, int[]> converter, TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
/* 33 */   public static ObjectAnimator ofArgb(Object target, String propertyName, int... values) { throw new RuntimeException("Stub!"); }
/* 34 */   public static <T> ObjectAnimator ofArgb(T target, Property<T, Integer> property, int... values) { throw new RuntimeException("Stub!"); }
/* 35 */   public static ObjectAnimator ofFloat(Object target, String propertyName, float... values) { throw new RuntimeException("Stub!"); }
/* 36 */   public static ObjectAnimator ofFloat(Object target, String xPropertyName, String yPropertyName, Path path) { throw new RuntimeException("Stub!"); }
/* 37 */   public static <T> ObjectAnimator ofFloat(T target, Property<T, Float> property, float... values) { throw new RuntimeException("Stub!"); }
/* 38 */   public static <T> ObjectAnimator ofFloat(T target, Property<T, Float> xProperty, Property<T, Float> yProperty, Path path) { throw new RuntimeException("Stub!"); }
/* 39 */   public static ObjectAnimator ofMultiFloat(Object target, String propertyName, float[][] values) { throw new RuntimeException("Stub!"); }
/* 40 */   public static ObjectAnimator ofMultiFloat(Object target, String propertyName, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 42 */   public static <T> ObjectAnimator ofMultiFloat(Object target, String propertyName, TypeConverter<T, float[]> converter, TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
/* 43 */   public static ObjectAnimator ofObject(Object target, String propertyName, TypeEvaluator evaluator, Object... values) { throw new RuntimeException("Stub!"); }
/* 44 */   public static ObjectAnimator ofObject(Object target, String propertyName, TypeConverter<PointF, ?> converter, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 46 */   public static <T, V> ObjectAnimator ofObject(T target, Property<T, V> property, TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 48 */   public static <T, V, P> ObjectAnimator ofObject(T target, Property<T, P> property, TypeConverter<V, P> converter, TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
/* 49 */   public static <T, V> ObjectAnimator ofObject(T target, Property<T, V> property, TypeConverter<PointF, V> converter, Path path) { throw new RuntimeException("Stub!"); }
/* 50 */   public static ObjectAnimator ofPropertyValuesHolder(Object target, PropertyValuesHolder... values) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setIntValues(int... values) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setFloatValues(float... values) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setObjectValues(Object... values) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setAutoCancel(boolean cancel) { throw new RuntimeException("Stub!"); }
/* 55 */   public void start() { throw new RuntimeException("Stub!"); }
/* 56 */   public ObjectAnimator setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 57 */   public Object getTarget() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setTarget(Object target) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setupStartValues() { throw new RuntimeException("Stub!"); }
/* 60 */   public void setupEndValues() { throw new RuntimeException("Stub!"); }
/* 61 */   public ObjectAnimator clone() { throw new RuntimeException("Stub!"); }
/* 62 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\animation\ObjectAnimator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */