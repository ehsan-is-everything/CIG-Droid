/*     */ package android.system;
/*     */ 
/*     */ import android.util.MutableInt;
/*     */ import android.util.MutableLong;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.InterruptedIOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.SocketException;
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Os
/*     */ {
/*  20 */   Os() { throw new RuntimeException("Stub!"); }
/*  21 */   public static FileDescriptor accept(FileDescriptor fd, InetSocketAddress peerAddress) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  22 */   public static boolean access(String path, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  23 */   public static void bind(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  24 */   public static void chmod(String path, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  25 */   public static void chown(String path, int uid, int gid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  26 */   public static void close(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  27 */   public static void connect(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  28 */   public static FileDescriptor dup(FileDescriptor oldFd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  29 */   public static FileDescriptor dup2(FileDescriptor oldFd, int newFd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  30 */   public static String[] environ() { throw new RuntimeException("Stub!"); }
/*  31 */   public static void execv(String filename, String[] argv) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  32 */   public static void execve(String filename, String[] argv, String[] envp) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  33 */   public static void fchmod(FileDescriptor fd, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  34 */   public static void fchown(FileDescriptor fd, int uid, int gid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  35 */   public static void fdatasync(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  36 */   public static StructStat fstat(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  37 */   public static StructStatVfs fstatvfs(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  38 */   public static void fsync(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  39 */   public static void ftruncate(FileDescriptor fd, long length) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  40 */   public static String gai_strerror(int error) { throw new RuntimeException("Stub!"); }
/*  41 */   public static int getegid() { throw new RuntimeException("Stub!"); }
/*  42 */   public static int geteuid() { throw new RuntimeException("Stub!"); }
/*  43 */   public static int getgid() { throw new RuntimeException("Stub!"); }
/*  44 */   public static String getenv(String name) { throw new RuntimeException("Stub!"); }
/*  45 */   public static SocketAddress getpeername(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  46 */   public static int getpid() { throw new RuntimeException("Stub!"); }
/*  47 */   public static int getppid() { throw new RuntimeException("Stub!"); }
/*  48 */   public static SocketAddress getsockname(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  49 */   public static int gettid() { throw new RuntimeException("Stub!"); }
/*  50 */   public static int getuid() { throw new RuntimeException("Stub!"); }
/*  51 */   public static byte[] getxattr(String path, String name) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  52 */   public static String if_indextoname(int index) { throw new RuntimeException("Stub!"); }
/*  53 */   public static int if_nametoindex(String name) { throw new RuntimeException("Stub!"); }
/*  54 */   public static InetAddress inet_pton(int family, String address) { throw new RuntimeException("Stub!"); }
/*  55 */   public static boolean isatty(FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/*  56 */   public static void kill(int pid, int signal) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  57 */   public static void lchown(String path, int uid, int gid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  58 */   public static void link(String oldPath, String newPath) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  59 */   public static void listen(FileDescriptor fd, int backlog) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  60 */   public static String[] listxattr(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  61 */   public static long lseek(FileDescriptor fd, long offset, int whence) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  62 */   public static StructStat lstat(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  63 */   public static void mincore(long address, long byteCount, byte[] vector) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  64 */   public static void mkdir(String path, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  65 */   public static void mkfifo(String path, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  66 */   public static void mlock(long address, long byteCount) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  67 */   public static long mmap(long address, long byteCount, int prot, int flags, FileDescriptor fd, long offset) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  68 */   public static void msync(long address, long byteCount, int flags) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  69 */   public static void munlock(long address, long byteCount) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  70 */   public static void munmap(long address, long byteCount) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  71 */   public static FileDescriptor open(String path, int flags, int mode) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  72 */   public static FileDescriptor[] pipe() throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  73 */   public static int poll(StructPollfd[] fds, int timeoutMs) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  74 */   public static void posix_fallocate(FileDescriptor fd, long offset, long length) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  75 */   public static int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  76 */   public static int pread(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  77 */   public static int pread(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  78 */   public static int pwrite(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  79 */   public static int pwrite(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  80 */   public static int read(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  81 */   public static int read(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  82 */   public static String readlink(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  83 */   public static int readv(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*  84 */   public static int recvfrom(FileDescriptor fd, ByteBuffer buffer, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  85 */   public static int recvfrom(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  86 */   public static void remove(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  87 */   public static void removexattr(String path, String name) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  88 */   public static void rename(String oldPath, String newPath) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  89 */   public static long sendfile(FileDescriptor outFd, FileDescriptor inFd, MutableLong inOffset, long byteCount) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  90 */   public static int sendto(FileDescriptor fd, ByteBuffer buffer, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  91 */   public static int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { throw new RuntimeException("Stub!"); }
/*  92 */   public static void setegid(int egid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  93 */   public static void setenv(String name, String value, boolean overwrite) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  94 */   public static void seteuid(int euid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  95 */   public static void setgid(int gid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  96 */   public static int setsid() throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  97 */   public static void setsockoptInt(FileDescriptor fd, int level, int option, int value) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  98 */   public static void setuid(int uid) throws ErrnoException { throw new RuntimeException("Stub!"); }
/*  99 */   public static void setxattr(String path, String name, byte[] value, int flags) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 100 */   public static void shutdown(FileDescriptor fd, int how) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 101 */   public static FileDescriptor socket(int domain, int type, int protocol) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 102 */   public static void socketpair(int domain, int type, int protocol, FileDescriptor fd1, FileDescriptor fd2) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 103 */   public static StructStat stat(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 104 */   public static StructStatVfs statvfs(String path) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 105 */   public static String strerror(int errno) { throw new RuntimeException("Stub!"); }
/* 106 */   public static String strsignal(int signal) { throw new RuntimeException("Stub!"); }
/* 107 */   public static void symlink(String oldPath, String newPath) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 108 */   public static long sysconf(int name) { throw new RuntimeException("Stub!"); }
/* 109 */   public static void tcdrain(FileDescriptor fd) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 110 */   public static void tcsendbreak(FileDescriptor fd, int duration) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 111 */   public static int umask(int mask) { throw new RuntimeException("Stub!"); }
/* 112 */   public static StructUtsname uname() { throw new RuntimeException("Stub!"); }
/* 113 */   public static void unsetenv(String name) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 114 */   public static int waitpid(int pid, MutableInt status, int options) throws ErrnoException { throw new RuntimeException("Stub!"); }
/* 115 */   public static int write(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/* 116 */   public static int write(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/* 117 */   public static int writev(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\system\Os.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */