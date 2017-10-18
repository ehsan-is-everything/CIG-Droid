/*    */ package android.view;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ 
/*    */ public class ViewDebug {
/*    */   @Deprecated
/*    */   public static final boolean TRACE_HIERARCHY = false;
/*    */   @Deprecated
/*    */   public static final boolean TRACE_RECYCLER = false;
/*    */   
/*    */   @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/*    */   public static @interface ExportedProperty {
/*    */     boolean resolveId() default false;
/*    */     
/*    */     ViewDebug.IntToString[] mapping() default {};
/*    */     
/*    */     ViewDebug.IntToString[] indexMapping() default {};
/*    */     
/*    */     ViewDebug.FlagToString[] flagMapping() default {};
/*    */     
/*    */     boolean deepExport() default false;
/*    */     
/*    */     String prefix() default "";
/*    */     
/*    */     String category() default "";
/*    */     
/*    */     boolean formatToHexString() default false;
/*    */     
/*    */     boolean hasAdjacentMapping() default false;
/*    */   }
/*    */   
/*    */   @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
/*    */   @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/*    */   public static @interface IntToString {
/*    */     int from();
/*    */     
/*    */     String to();
/*    */   }
/*    */   
/*    */   @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
/*    */   @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/*    */   public static @interface FlagToString {
/*    */     int mask();
/*    */     
/*    */     int equals();
/*    */     
/*    */     String name();
/*    */     
/*    */     boolean outputIf() default true;
/*    */   }
/*    */   
/*    */   @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
/*    */   @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/*    */   public static @interface CapturedViewProperty { boolean retrieveReturn() default false;
/*    */   }
/*    */   
/*    */   @Deprecated
/* 59 */   public static enum HierarchyTraceType { BUILD_CACHE, 
/* 60 */     DRAW, 
/* 61 */     INVALIDATE, 
/* 62 */     INVALIDATE_CHILD, 
/* 63 */     INVALIDATE_CHILD_IN_PARENT, 
/* 64 */     ON_LAYOUT, 
/* 65 */     ON_MEASURE, 
/* 66 */     REQUEST_LAYOUT;
/*    */     
/*    */     private HierarchyTraceType() {} }
/*    */   
/*    */   @Deprecated
/* 71 */   public static enum RecyclerTraceType { BIND_VIEW, 
/* 72 */     MOVE_FROM_ACTIVE_TO_SCRAP_HEAP, 
/* 73 */     MOVE_TO_SCRAP_HEAP, 
/* 74 */     NEW_VIEW, 
/* 75 */     RECYCLE_FROM_ACTIVE_HEAP, 
/* 76 */     RECYCLE_FROM_SCRAP_HEAP;
/*    */     private RecyclerTraceType() {} }
/* 78 */   public ViewDebug() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 81 */   public static void trace(View view, RecyclerTraceType type, int... parameters) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 84 */   public static void startRecyclerTracing(String prefix, View view) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 87 */   public static void stopRecyclerTracing() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 90 */   public static void trace(View view, HierarchyTraceType type) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 93 */   public static void startHierarchyTracing(String prefix, View view) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 95 */   public static void stopHierarchyTracing() { throw new RuntimeException("Stub!"); }
/* 96 */   public static void dumpCapturedView(String tag, Object view) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\ViewDebug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */