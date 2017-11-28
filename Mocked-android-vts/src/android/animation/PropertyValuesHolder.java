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
/*    */ public class PropertyValuesHolder
/*    */   implements Cloneable
/*    */ {
/* 21 */   PropertyValuesHolder() { throw new RuntimeException("Stub!"); }
/* 22 */   public static PropertyValuesHolder ofInt(String propertyName, int... values) { throw new RuntimeException("Stub!"); }
/* 23 */   public static PropertyValuesHolder ofInt(Property<?, Integer> property, int... values) { throw new RuntimeException("Stub!"); }
/* 24 */   public static PropertyValuesHolder ofMultiInt(String propertyName, int[][] values) { throw new RuntimeException("Stub!"); }
/* 25 */   public static PropertyValuesHolder ofMultiInt(String propertyName, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 27 */   public static <V> PropertyValuesHolder ofMultiInt(String propertyName, TypeConverter<V, int[]> converter, TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
/* 28 */   public static <T> PropertyValuesHolder ofMultiInt(String propertyName, TypeConverter<T, int[]> converter, TypeEvaluator<T> evaluator, Keyframe... values) { throw new RuntimeException("Stub!"); }
/* 29 */   public static PropertyValuesHolder ofFloat(String propertyName, float... values) { throw new RuntimeException("Stub!"); }
/* 30 */   public static PropertyValuesHolder ofFloat(Property<?, Float> property, float... values) { throw new RuntimeException("Stub!"); }
/* 31 */   public static PropertyValuesHolder ofMultiFloat(String propertyName, float[][] values) { throw new RuntimeException("Stub!"); }
/* 32 */   public static PropertyValuesHolder ofMultiFloat(String propertyName, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 34 */   public static <V> PropertyValuesHolder ofMultiFloat(String propertyName, TypeConverter<V, float[]> converter, TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
/* 35 */   public static <T> PropertyValuesHolder ofMultiFloat(String propertyName, TypeConverter<T, float[]> converter, TypeEvaluator<T> evaluator, Keyframe... values) { throw new RuntimeException("Stub!"); }
/* 36 */   public static PropertyValuesHolder ofObject(String propertyName, TypeEvaluator evaluator, Object... values) { throw new RuntimeException("Stub!"); }
/* 37 */   public static PropertyValuesHolder ofObject(String propertyName, TypeConverter<PointF, ?> converter, Path path) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 39 */   public static <V> PropertyValuesHolder ofObject(Property property, TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 41 */   public static <T, V> PropertyValuesHolder ofObject(Property<?, V> property, TypeConverter<T, V> converter, TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
/* 42 */   public static <V> PropertyValuesHolder ofObject(Property<?, V> property, TypeConverter<PointF, V> converter, Path path) { throw new RuntimeException("Stub!"); }
/* 43 */   public static PropertyValuesHolder ofKeyframe(String propertyName, Keyframe... values) { throw new RuntimeException("Stub!"); }
/* 44 */   public static PropertyValuesHolder ofKeyframe(Property property, Keyframe... values) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setIntValues(int... values) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setFloatValues(float... values) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setKeyframes(Keyframe... values) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setObjectValues(Object... values) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setConverter(TypeConverter converter) { throw new RuntimeException("Stub!"); }
/* 50 */   public PropertyValuesHolder clone() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setEvaluator(TypeEvaluator evaluator) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setPropertyName(String propertyName) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setProperty(Property property) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getPropertyName() { throw new RuntimeException("Stub!"); }
/* 55 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\PropertyValuesHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */