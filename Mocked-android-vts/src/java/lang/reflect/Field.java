/*    */ package java.lang.reflect;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
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
/*    */ public final class Field
/*    */   extends AccessibleObject
/*    */   implements Member
/*    */ {
/* 32 */   Field() { throw new RuntimeException("Stub!"); }
/* 33 */   public Class<?> getDeclaringClass() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getModifiers() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isEnumConstant() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); }
/* 38 */   public Class<?> getType() { throw new RuntimeException("Stub!"); }
/* 39 */   public Type getGenericType() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 41 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 43 */   public String toGenericString() { throw new RuntimeException("Stub!"); }
/*    */   public native Object get(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native boolean getBoolean(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native byte getByte(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native char getChar(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native short getShort(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native int getInt(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native long getLong(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native float getFloat(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native double getDouble(Object paramObject) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void set(Object paramObject1, Object paramObject2) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setBoolean(Object paramObject, boolean paramBoolean) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setByte(Object paramObject, byte paramByte) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setChar(Object paramObject, char paramChar) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setShort(Object paramObject, short paramShort) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setInt(Object paramObject, int paramInt) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setLong(Object paramObject, long paramLong) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setFloat(Object paramObject, float paramFloat) throws IllegalArgumentException, IllegalAccessException;
/*    */   public native void setDouble(Object paramObject, double paramDouble) throws IllegalArgumentException, IllegalAccessException;
/* 62 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 63 */   public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public native Annotation[] getDeclaredAnnotations();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\reflect\Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */