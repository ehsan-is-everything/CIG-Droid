/*    */ package java.nio.file.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.net.URI;
/*    */ import java.nio.channels.AsynchronousFileChannel;
/*    */ import java.nio.channels.FileChannel;
/*    */ import java.nio.channels.SeekableByteChannel;
/*    */ import java.nio.file.AccessMode;
/*    */ import java.nio.file.CopyOption;
/*    */ import java.nio.file.DirectoryStream;
/*    */ import java.nio.file.DirectoryStream.Filter;
/*    */ import java.nio.file.FileSystem;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.BasicFileAttributes;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.nio.file.attribute.FileAttributeView;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class FileSystemProvider
/*    */ {
/* 29 */   protected FileSystemProvider() { throw new RuntimeException("Stub!"); }
/* 30 */   public static java.util.List<FileSystemProvider> installedProviders() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getScheme();
/*    */   public abstract FileSystem newFileSystem(URI paramURI, Map<String, ?> paramMap) throws IOException;
/*    */   public abstract FileSystem getFileSystem(URI paramURI);
/*    */   public abstract Path getPath(URI paramURI);
/* 35 */   public FileSystem newFileSystem(Path path, Map<String, ?> env) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public InputStream newInputStream(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public OutputStream newOutputStream(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public FileChannel newFileChannel(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set<? extends OpenOption> options, ExecutorService executor, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract SeekableByteChannel newByteChannel(Path paramPath, Set<? extends OpenOption> paramSet, FileAttribute<?>... paramVarArgs) throws IOException;
/*    */   public abstract DirectoryStream<Path> newDirectoryStream(Path paramPath, DirectoryStream.Filter<? super Path> paramFilter) throws IOException;
/*    */   public abstract void createDirectory(Path paramPath, FileAttribute<?>... paramVarArgs) throws IOException;
/* 43 */   public void createSymbolicLink(Path link, Path target, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public void createLink(Path link, Path existing) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract void delete(Path paramPath) throws IOException;
/* 46 */   public boolean deleteIfExists(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public Path readSymbolicLink(Path link) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void copy(Path paramPath1, Path paramPath2, CopyOption... paramVarArgs)
/*    */     throws IOException;
/*    */   
/*    */   public abstract void move(Path paramPath1, Path paramPath2, CopyOption... paramVarArgs)
/*    */     throws IOException;
/*    */   
/*    */   public abstract boolean isSameFile(Path paramPath1, Path paramPath2)
/*    */     throws IOException;
/*    */   
/*    */   public abstract boolean isHidden(Path paramPath)
/*    */     throws IOException;
/*    */   
/*    */   public abstract java.nio.file.FileStore getFileStore(Path paramPath)
/*    */     throws IOException;
/*    */   
/*    */   public abstract void checkAccess(Path paramPath, AccessMode... paramVarArgs)
/*    */     throws IOException;
/*    */   
/*    */   public abstract <V extends FileAttributeView> V getFileAttributeView(Path paramPath, Class<V> paramClass, LinkOption... paramVarArgs);
/*    */   
/*    */   public abstract <A extends BasicFileAttributes> A readAttributes(Path paramPath, Class<A> paramClass, LinkOption... paramVarArgs)
/*    */     throws IOException;
/*    */   
/*    */   public abstract Map<String, Object> readAttributes(Path paramPath, String paramString, LinkOption... paramVarArgs)
/*    */     throws IOException;
/*    */   
/*    */   public abstract void setAttribute(Path paramPath, String paramString, Object paramObject, LinkOption... paramVarArgs)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\spi\FileSystemProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */