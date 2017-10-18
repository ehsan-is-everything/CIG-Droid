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
/*    */ public class ObjectInputStream
/*    */   extends InputStream
/*    */   implements ObjectInput, ObjectStreamConstants
/*    */ {
/*    */   public static abstract class GetField
/*    */   {
/* 34 */     public GetField() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract ObjectStreamClass getObjectStreamClass();
/*    */     public abstract boolean defaulted(String paramString) throws IOException;
/*    */     public abstract boolean get(String paramString, boolean paramBoolean) throws IOException;
/*    */     public abstract byte get(String paramString, byte paramByte) throws IOException;
/*    */     public abstract char get(String paramString, char paramChar) throws IOException;
/*    */     public abstract short get(String paramString, short paramShort) throws IOException;
/*    */     public abstract int get(String paramString, int paramInt) throws IOException;
/*    */     public abstract long get(String paramString, long paramLong) throws IOException;
/*    */     public abstract float get(String paramString, float paramFloat) throws IOException;
/*    */     public abstract double get(String paramString, double paramDouble) throws IOException;
/*    */     public abstract Object get(String paramString, Object paramObject) throws IOException; }
/* 47 */   public ObjectInputStream(InputStream in) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   protected ObjectInputStream() throws IOException, SecurityException { throw new RuntimeException("Stub!"); }
/* 49 */   public final Object readObject() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 50 */   protected Object readObjectOverride() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 51 */   public Object readUnshared() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 52 */   public void defaultReadObject() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 53 */   public GetField readFields() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 54 */   public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException { throw new RuntimeException("Stub!"); }
/* 55 */   protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 56 */   protected Class<?> resolveProxyClass(String[] interfaces) throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 57 */   protected Object resolveObject(Object obj) throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   protected boolean enableResolveObject(boolean enable) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 59 */   protected void readStreamHeader() throws IOException, StreamCorruptedException { throw new RuntimeException("Stub!"); }
/* 60 */   protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 61 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 62 */   public int read(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 63 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean readBoolean() throws IOException { throw new RuntimeException("Stub!"); }
/* 66 */   public byte readByte() throws IOException { throw new RuntimeException("Stub!"); }
/* 67 */   public int readUnsignedByte() throws IOException { throw new RuntimeException("Stub!"); }
/* 68 */   public char readChar() throws IOException { throw new RuntimeException("Stub!"); }
/* 69 */   public short readShort() throws IOException { throw new RuntimeException("Stub!"); }
/* 70 */   public int readUnsignedShort() throws IOException { throw new RuntimeException("Stub!"); }
/* 71 */   public int readInt() throws IOException { throw new RuntimeException("Stub!"); }
/* 72 */   public long readLong() throws IOException { throw new RuntimeException("Stub!"); }
/* 73 */   public float readFloat() throws IOException { throw new RuntimeException("Stub!"); }
/* 74 */   public double readDouble() throws IOException { throw new RuntimeException("Stub!"); }
/* 75 */   public void readFully(byte[] buf) throws IOException { throw new RuntimeException("Stub!"); }
/* 76 */   public void readFully(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 77 */   public int skipBytes(int len) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 79 */   public String readLine() throws IOException { throw new RuntimeException("Stub!"); }
/* 80 */   public String readUTF() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\ObjectInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */