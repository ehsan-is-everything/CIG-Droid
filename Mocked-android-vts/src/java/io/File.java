/*    */ package java.io;
/*    */ 
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URI;
/*    */ import java.net.URL;
/*    */ import java.nio.file.Path;
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
/*    */ public class File
/*    */   implements Serializable, Comparable<File>
/*    */ {
/* 31 */   public File(String pathname) { throw new RuntimeException("Stub!"); }
/* 32 */   public File(String parent, String child) { throw new RuntimeException("Stub!"); }
/* 33 */   public File(File parent, String child) { throw new RuntimeException("Stub!"); }
/* 34 */   public File(URI uri) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getParent() { throw new RuntimeException("Stub!"); }
/* 37 */   public File getParentFile() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getPath() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getAbsolutePath() { throw new RuntimeException("Stub!"); }
/* 41 */   public File getAbsoluteFile() { throw new RuntimeException("Stub!"); }
/* 42 */   public String getCanonicalPath() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public File getCanonicalFile() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public URL toURL() throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 46 */   public URI toURI() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean canRead() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean canWrite() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean exists() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isDirectory() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isFile() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isHidden() { throw new RuntimeException("Stub!"); }
/* 53 */   public long lastModified() { throw new RuntimeException("Stub!"); }
/* 54 */   public long length() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean createNewFile() throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean delete() { throw new RuntimeException("Stub!"); }
/* 57 */   public void deleteOnExit() { throw new RuntimeException("Stub!"); }
/* 58 */   public String[] list() { throw new RuntimeException("Stub!"); }
/* 59 */   public String[] list(FilenameFilter filter) { throw new RuntimeException("Stub!"); }
/* 60 */   public File[] listFiles() { throw new RuntimeException("Stub!"); }
/* 61 */   public File[] listFiles(FilenameFilter filter) { throw new RuntimeException("Stub!"); }
/* 62 */   public File[] listFiles(FileFilter filter) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean mkdir() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean mkdirs() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean renameTo(File dest) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean setLastModified(long time) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean setReadOnly() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean setWritable(boolean writable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean setWritable(boolean writable) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean setReadable(boolean readable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean setReadable(boolean readable) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean setExecutable(boolean executable, boolean ownerOnly) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean setExecutable(boolean executable) { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean canExecute() { throw new RuntimeException("Stub!"); }
/* 75 */   public static File[] listRoots() { throw new RuntimeException("Stub!"); }
/* 76 */   public long getTotalSpace() { throw new RuntimeException("Stub!"); }
/* 77 */   public long getFreeSpace() { throw new RuntimeException("Stub!"); }
/* 78 */   public long getUsableSpace() { throw new RuntimeException("Stub!"); }
/* 79 */   public static File createTempFile(String prefix, String suffix, File directory) throws IOException { throw new RuntimeException("Stub!"); }
/* 80 */   public static File createTempFile(String prefix, String suffix) throws IOException { throw new RuntimeException("Stub!"); }
/* 81 */   public int compareTo(File pathname) { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 83 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 84 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 85 */   public Path toPath() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 90 */   public static final char separatorChar = '\000'; public static final String separator = null; public static final char pathSeparatorChar = '\000'; public static final String pathSeparator = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\File.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */