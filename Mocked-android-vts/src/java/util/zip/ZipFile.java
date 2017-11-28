/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public class ZipFile
/*    */   implements java.io.Closeable
/*    */ {
/*    */   public static final int CENATT = 36;
/*    */   public static final int CENATX = 38;
/*    */   public static final int CENCOM = 32;
/*    */   public static final int CENCRC = 16;
/*    */   public static final int CENDSK = 34;
/*    */   public static final int CENEXT = 30;
/*    */   public static final int CENFLG = 8;
/*    */   public static final int CENHDR = 46;
/*    */   public static final int CENHOW = 10;
/*    */   public static final int CENLEN = 24;
/*    */   public static final int CENNAM = 28;
/*    */   public static final int CENOFF = 42;
/*    */   public static final long CENSIG = 33639248L;
/*    */   public static final int CENSIZ = 20;
/*    */   public static final int CENTIM = 12;
/*    */   public static final int CENVEM = 4;
/*    */   public static final int CENVER = 6;
/*    */   public static final int ENDCOM = 20;
/*    */   public static final int ENDHDR = 22;
/*    */   public static final int ENDOFF = 16;
/*    */   public static final long ENDSIG = 101010256L;
/*    */   
/* 31 */   public ZipFile(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public ZipFile(java.io.File file, int mode) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public ZipFile(java.io.File file) throws ZipException, IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public ZipFile(java.io.File file, int mode, java.nio.charset.Charset charset) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public ZipFile(String name, java.nio.charset.Charset charset) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public ZipFile(java.io.File file, java.nio.charset.Charset charset) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public String getComment() { throw new RuntimeException("Stub!"); }
/* 38 */   public ZipEntry getEntry(String name) { throw new RuntimeException("Stub!"); }
/* 39 */   public java.io.InputStream getInputStream(ZipEntry entry) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 41 */   public java.util.Enumeration<? extends ZipEntry> entries() { throw new RuntimeException("Stub!"); }
/* 42 */   public java.util.stream.Stream<? extends ZipEntry> stream() { throw new RuntimeException("Stub!"); }
/* 43 */   public int size() { throw new RuntimeException("Stub!"); }
/* 44 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   protected void finalize() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int ENDSIZ = 12;
/*    */   public static final int ENDSUB = 8;
/*    */   public static final int ENDTOT = 10;
/*    */   public static final int EXTCRC = 4;
/*    */   public static final int EXTHDR = 16;
/*    */   public static final int EXTLEN = 12;
/*    */   public static final long EXTSIG = 134695760L;
/*    */   public static final int EXTSIZ = 8;
/*    */   public static final int LOCCRC = 14;
/*    */   public static final int LOCEXT = 28;
/*    */   public static final int LOCFLG = 6;
/*    */   public static final int LOCHDR = 30;
/*    */   public static final int LOCHOW = 8;
/*    */   public static final int LOCLEN = 22;
/*    */   public static final int LOCNAM = 26;
/*    */   public static final long LOCSIG = 67324752L;
/*    */   public static final int LOCSIZ = 18;
/*    */   public static final int LOCTIM = 10;
/*    */   public static final int LOCVER = 4;
/*    */   public static final int OPEN_DELETE = 4;
/*    */   public static final int OPEN_READ = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\zip\ZipFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */