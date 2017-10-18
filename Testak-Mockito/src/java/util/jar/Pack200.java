/*    */ package java.util.jar;
/*    */ 
/*    */ import java.beans.PropertyChangeListener;
/*    */ 
/*    */ public abstract class Pack200 {
/*    */   public static abstract interface Packer {
/*    */     public static final String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
/*    */     public static final String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
/*    */     public static final String DEFLATE_HINT = "pack.deflate.hint";
/*    */     public static final String EFFORT = "pack.effort";
/*    */     public static final String ERROR = "error";
/*    */     public static final String FALSE = "false";
/*    */     public static final String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
/*    */     public static final String KEEP = "keep";
/*    */     public static final String KEEP_FILE_ORDER = "pack.keep.file.order";
/*    */     public static final String LATEST = "latest";
/*    */     public static final String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
/*    */     public static final String MODIFICATION_TIME = "pack.modification.time";
/*    */     public static final String PASS = "pass";
/*    */     public static final String PASS_FILE_PFX = "pack.pass.file.";
/*    */     public static final String PROGRESS = "pack.progress";
/*    */     public static final String SEGMENT_LIMIT = "pack.segment.limit";
/*    */     public static final String STRIP = "strip";
/*    */     public static final String TRUE = "true";
/*    */     public static final String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";
/*    */     
/*    */     public abstract java.util.SortedMap<String, String> properties();
/*    */     
/*    */     public abstract void pack(JarFile paramJarFile, java.io.OutputStream paramOutputStream) throws java.io.IOException;
/*    */     
/*    */     public abstract void pack(JarInputStream paramJarInputStream, java.io.OutputStream paramOutputStream) throws java.io.IOException;
/*    */     
/*    */     @Deprecated
/* 34 */     public void addPropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 36 */     public void removePropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public static abstract interface Unpacker
/*    */   {
/*    */     public static final String DEFLATE_HINT = "unpack.deflate.hint";
/*    */     
/*    */ 
/*    */     public static final String FALSE = "false";
/*    */     
/*    */     public static final String KEEP = "keep";
/*    */     
/*    */     public static final String PROGRESS = "unpack.progress";
/*    */     
/*    */     public static final String TRUE = "true";
/*    */     
/*    */     public abstract java.util.SortedMap<String, String> properties();
/*    */     
/*    */     public abstract void unpack(java.io.InputStream paramInputStream, JarOutputStream paramJarOutputStream)
/*    */       throws java.io.IOException;
/*    */     
/*    */     public abstract void unpack(java.io.File paramFile, JarOutputStream paramJarOutputStream)
/*    */       throws java.io.IOException;
/*    */     
/*    */     @Deprecated
/* 63 */     public void addPropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 65 */     public void removePropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */   Pack200() { throw new RuntimeException("Stub!"); }
/* 73 */   public static synchronized Packer newPacker() { throw new RuntimeException("Stub!"); }
/* 74 */   public static Unpacker newUnpacker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\Pack200.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */