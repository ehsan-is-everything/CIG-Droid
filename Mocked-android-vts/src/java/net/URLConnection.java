/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.security.Permission;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public abstract class URLConnection
/*    */ {
/*    */   protected boolean allowUserInteraction;
/*    */   protected boolean connected;
/*    */   protected boolean doInput;
/*    */   protected boolean doOutput;
/*    */   protected long ifModifiedSince;
/*    */   protected URL url;
/*    */   protected boolean useCaches;
/*    */   
/* 30 */   protected URLConnection(URL url) { throw new RuntimeException("Stub!"); }
/* 31 */   public static synchronized FileNameMap getFileNameMap() { throw new RuntimeException("Stub!"); }
/* 32 */   public static void setFileNameMap(FileNameMap map) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void connect() throws IOException;
/* 34 */   public void setConnectTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getConnectTimeout() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setReadTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getReadTimeout() { throw new RuntimeException("Stub!"); }
/* 38 */   public URL getURL() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getContentLength() { throw new RuntimeException("Stub!"); }
/* 40 */   public long getContentLengthLong() { throw new RuntimeException("Stub!"); }
/* 41 */   public String getContentType() { throw new RuntimeException("Stub!"); }
/* 42 */   public String getContentEncoding() { throw new RuntimeException("Stub!"); }
/* 43 */   public long getExpiration() { throw new RuntimeException("Stub!"); }
/* 44 */   public long getDate() { throw new RuntimeException("Stub!"); }
/* 45 */   public long getLastModified() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getHeaderField(String name) { throw new RuntimeException("Stub!"); }
/* 47 */   public Map<String, List<String>> getHeaderFields() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getHeaderFieldInt(String name, int Default) { throw new RuntimeException("Stub!"); }
/* 49 */   public long getHeaderFieldLong(String name, long Default) { throw new RuntimeException("Stub!"); }
/*    */   
/* 51 */   public long getHeaderFieldDate(String name, long Default) { throw new RuntimeException("Stub!"); }
/* 52 */   public String getHeaderFieldKey(int n) { throw new RuntimeException("Stub!"); }
/* 53 */   public String getHeaderField(int n) { throw new RuntimeException("Stub!"); }
/* 54 */   public Object getContent() throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public Object getContent(Class[] classes) throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public Permission getPermission() throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public void setDoInput(boolean doinput) { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean getDoInput() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setDoOutput(boolean dooutput) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean getDoOutput() { throw new RuntimeException("Stub!"); }
/* 64 */   public void setAllowUserInteraction(boolean allowuserinteraction) { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean getAllowUserInteraction() { throw new RuntimeException("Stub!"); }
/* 66 */   public static void setDefaultAllowUserInteraction(boolean defaultallowuserinteraction) { throw new RuntimeException("Stub!"); }
/* 67 */   public static boolean getDefaultAllowUserInteraction() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setUseCaches(boolean usecaches) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean getUseCaches() { throw new RuntimeException("Stub!"); }
/* 70 */   public void setIfModifiedSince(long ifmodifiedsince) { throw new RuntimeException("Stub!"); }
/* 71 */   public long getIfModifiedSince() { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean getDefaultUseCaches() { throw new RuntimeException("Stub!"); }
/* 73 */   public void setDefaultUseCaches(boolean defaultusecaches) { throw new RuntimeException("Stub!"); }
/* 74 */   public void setRequestProperty(String key, String value) { throw new RuntimeException("Stub!"); }
/* 75 */   public void addRequestProperty(String key, String value) { throw new RuntimeException("Stub!"); }
/* 76 */   public String getRequestProperty(String key) { throw new RuntimeException("Stub!"); }
/* 77 */   public Map<String, List<String>> getRequestProperties() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 79 */   public static void setDefaultRequestProperty(String key, String value) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 81 */   public static String getDefaultRequestProperty(String key) { throw new RuntimeException("Stub!"); }
/* 82 */   public static synchronized void setContentHandlerFactory(ContentHandlerFactory fac) { throw new RuntimeException("Stub!"); }
/* 83 */   public static String guessContentTypeFromName(String fname) { throw new RuntimeException("Stub!"); }
/* 84 */   public static String guessContentTypeFromStream(InputStream is) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\URLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */