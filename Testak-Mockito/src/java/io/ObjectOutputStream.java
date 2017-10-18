/*    */ package java.io;
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
/*    */ 
/*    */ 
/*    */ public class ObjectOutputStream
/*    */   extends OutputStream
/*    */   implements ObjectOutput, ObjectStreamConstants
/*    */ {
/*    */   public static abstract class PutField
/*    */   {
/* 34 */     public PutField() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void put(String paramString, boolean paramBoolean);
/*    */     public abstract void put(String paramString, byte paramByte);
/*    */     public abstract void put(String paramString, char paramChar);
/*    */     public abstract void put(String paramString, short paramShort);
/*    */     public abstract void put(String paramString, int paramInt);
/*    */     public abstract void put(String paramString, long paramLong);
/*    */     public abstract void put(String paramString, float paramFloat);
/*    */     public abstract void put(String paramString, double paramDouble);
/*    */     public abstract void put(String paramString, Object paramObject);
/*    */     @Deprecated
/*    */     public abstract void write(ObjectOutput paramObjectOutput) throws IOException; }
/* 47 */   public ObjectOutputStream(OutputStream out) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   protected ObjectOutputStream() throws IOException, SecurityException { throw new RuntimeException("Stub!"); }
/* 49 */   public void useProtocolVersion(int version) throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public final void writeObject(Object obj) throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   protected void writeObjectOverride(Object obj) throws IOException { throw new RuntimeException("Stub!"); }
/* 52 */   public void writeUnshared(Object obj) throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public void defaultWriteObject() throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public PutField putFields() throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public void writeFields() throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   protected void annotateClass(Class<?> cl) throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   protected void annotateProxyClass(Class<?> cl) throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   protected Object replaceObject(Object obj) throws IOException { throw new RuntimeException("Stub!"); }
/* 60 */   protected boolean enableReplaceObject(boolean enable) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 61 */   protected void writeStreamHeader() throws IOException { throw new RuntimeException("Stub!"); }
/* 62 */   protected void writeClassDescriptor(ObjectStreamClass desc) throws IOException { throw new RuntimeException("Stub!"); }
/* 63 */   public void write(int val) throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public void write(byte[] buf) throws IOException { throw new RuntimeException("Stub!"); }
/* 65 */   public void write(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 66 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 67 */   protected void drain() throws IOException { throw new RuntimeException("Stub!"); }
/* 68 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 69 */   public void writeBoolean(boolean val) throws IOException { throw new RuntimeException("Stub!"); }
/* 70 */   public void writeByte(int val) throws IOException { throw new RuntimeException("Stub!"); }
/* 71 */   public void writeShort(int val) throws IOException { throw new RuntimeException("Stub!"); }
/* 72 */   public void writeChar(int val) throws IOException { throw new RuntimeException("Stub!"); }
/* 73 */   public void writeInt(int val) throws IOException { throw new RuntimeException("Stub!"); }
/* 74 */   public void writeLong(long val) throws IOException { throw new RuntimeException("Stub!"); }
/* 75 */   public void writeFloat(float val) throws IOException { throw new RuntimeException("Stub!"); }
/* 76 */   public void writeDouble(double val) throws IOException { throw new RuntimeException("Stub!"); }
/* 77 */   public void writeBytes(String str) throws IOException { throw new RuntimeException("Stub!"); }
/* 78 */   public void writeChars(String str) throws IOException { throw new RuntimeException("Stub!"); }
/* 79 */   public void writeUTF(String str) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\ObjectOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */