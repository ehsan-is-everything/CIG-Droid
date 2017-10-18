/*    */ package java.lang.invoke;
/*    */ 
/*    */ import java.lang.reflect.Member;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface MethodHandleInfo
/*    */ {
/*    */   public static final int REF_getField = 1;
/*    */   public static final int REF_getStatic = 2;
/*    */   public static final int REF_invokeInterface = 9;
/*    */   public static final int REF_invokeSpecial = 7;
/*    */   public static final int REF_invokeStatic = 6;
/*    */   public static final int REF_invokeVirtual = 5;
/*    */   public static final int REF_newInvokeSpecial = 8;
/*    */   public static final int REF_putField = 3;
/*    */   public static final int REF_putStatic = 4;
/*    */   
/*    */   public abstract int getReferenceKind();
/*    */   
/*    */   public abstract Class<?> getDeclaringClass();
/*    */   
/*    */   public abstract String getName();
/*    */   
/*    */   public abstract MethodType getMethodType();
/*    */   
/*    */   public abstract <T extends Member> T reflectAs(Class<T> paramClass, MethodHandles.Lookup paramLookup);
/*    */   
/*    */   public abstract int getModifiers();
/*    */   
/* 35 */   public boolean isVarArgs() { throw new RuntimeException("Stub!"); }
/* 36 */   public static String referenceKindToString(int referenceKind) { throw new RuntimeException("Stub!"); }
/* 37 */   public static String toString(int kind, Class<?> defc, String name, MethodType type) { throw new RuntimeException("Stub!"); }
/* 38 */   public static boolean refKindIsValid(int refKind) { throw new RuntimeException("Stub!"); }
/* 39 */   public static boolean refKindIsField(int refKind) { throw new RuntimeException("Stub!"); }
/* 40 */   public static String refKindName(int refKind) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\invoke\MethodHandleInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */