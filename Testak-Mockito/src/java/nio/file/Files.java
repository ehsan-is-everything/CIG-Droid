/*    */ package java.nio.file;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.channels.SeekableByteChannel;
/*    */ import java.nio.charset.Charset;
/*    */ import java.nio.file.attribute.BasicFileAttributes;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.nio.file.attribute.FileAttributeView;
/*    */ import java.nio.file.attribute.FileTime;
/*    */ import java.nio.file.attribute.PosixFilePermission;
/*    */ import java.nio.file.attribute.UserPrincipal;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiPredicate;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Files
/*    */ {
/* 29 */   Files() { throw new RuntimeException("Stub!"); }
/* 30 */   public static InputStream newInputStream(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public static OutputStream newOutputStream(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public static SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static SeekableByteChannel newByteChannel(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public static DirectoryStream<Path> newDirectoryStream(Path dir) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public static DirectoryStream<Path> newDirectoryStream(Path dir, String glob) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public static DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<? super Path> filter) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public static Path createFile(Path path, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public static Path createDirectory(Path dir, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public static Path createDirectories(Path dir, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public static Path createTempFile(Path dir, String prefix, String suffix, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public static Path createTempFile(String prefix, String suffix, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public static Path createTempDirectory(Path dir, String prefix, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public static Path createTempDirectory(String prefix, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public static Path createSymbolicLink(Path link, Path target, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public static Path createLink(Path link, Path existing) throws IOException { throw new RuntimeException("Stub!"); }
/* 46 */   public static void delete(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public static boolean deleteIfExists(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   public static Path copy(Path source, Path target, CopyOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 49 */   public static Path move(Path source, Path target, CopyOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public static Path readSymbolicLink(Path link) throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public static FileStore getFileStore(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 52 */   public static boolean isSameFile(Path path, Path path2) throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public static boolean isHidden(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public static String probeContentType(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public static <V extends FileAttributeView> V getFileAttributeView(Path path, Class<V> type, LinkOption... options) { throw new RuntimeException("Stub!"); }
/* 56 */   public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public static Path setAttribute(Path path, String attribute, Object value, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public static Object getAttribute(Path path, String attribute, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   public static Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 60 */   public static Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 61 */   public static Path setPosixFilePermissions(Path path, Set<PosixFilePermission> perms) throws IOException { throw new RuntimeException("Stub!"); }
/* 62 */   public static UserPrincipal getOwner(Path path, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 63 */   public static Path setOwner(Path path, UserPrincipal owner) throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public static boolean isSymbolicLink(Path path) { throw new RuntimeException("Stub!"); }
/* 65 */   public static boolean isDirectory(Path path, LinkOption... options) { throw new RuntimeException("Stub!"); }
/* 66 */   public static boolean isRegularFile(Path path, LinkOption... options) { throw new RuntimeException("Stub!"); }
/* 67 */   public static FileTime getLastModifiedTime(Path path, LinkOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 68 */   public static Path setLastModifiedTime(Path path, FileTime time) throws IOException { throw new RuntimeException("Stub!"); }
/* 69 */   public static long size(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 70 */   public static boolean exists(Path path, LinkOption... options) { throw new RuntimeException("Stub!"); }
/* 71 */   public static boolean notExists(Path path, LinkOption... options) { throw new RuntimeException("Stub!"); }
/* 72 */   public static boolean isReadable(Path path) { throw new RuntimeException("Stub!"); }
/* 73 */   public static boolean isWritable(Path path) { throw new RuntimeException("Stub!"); }
/* 74 */   public static boolean isExecutable(Path path) { throw new RuntimeException("Stub!"); }
/* 75 */   public static Path walkFileTree(Path start, Set<FileVisitOption> options, int maxDepth, FileVisitor<? super Path> visitor) throws IOException { throw new RuntimeException("Stub!"); }
/* 76 */   public static Path walkFileTree(Path start, FileVisitor<? super Path> visitor) throws IOException { throw new RuntimeException("Stub!"); }
/* 77 */   public static BufferedReader newBufferedReader(Path path, Charset cs) throws IOException { throw new RuntimeException("Stub!"); }
/* 78 */   public static BufferedReader newBufferedReader(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 79 */   public static BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 80 */   public static BufferedWriter newBufferedWriter(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 81 */   public static long copy(InputStream in, Path target, CopyOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 82 */   public static long copy(Path source, OutputStream out) throws IOException { throw new RuntimeException("Stub!"); }
/* 83 */   public static byte[] readAllBytes(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 84 */   public static List<String> readAllLines(Path path, Charset cs) throws IOException { throw new RuntimeException("Stub!"); }
/* 85 */   public static List<String> readAllLines(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/* 86 */   public static Path write(Path path, byte[] bytes, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 87 */   public static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 88 */   public static Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 89 */   public static Stream<Path> list(Path dir) throws IOException { throw new RuntimeException("Stub!"); }
/* 90 */   public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 91 */   public static Stream<Path> walk(Path start, FileVisitOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 92 */   public static Stream<Path> find(Path start, int maxDepth, BiPredicate<Path, BasicFileAttributes> matcher, FileVisitOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/* 93 */   public static Stream<String> lines(Path path, Charset cs) throws IOException { throw new RuntimeException("Stub!"); }
/* 94 */   public static Stream<String> lines(Path path) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\Files.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */