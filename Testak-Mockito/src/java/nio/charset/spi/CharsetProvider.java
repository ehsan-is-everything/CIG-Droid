/*    */ package java.nio.charset.spi;
/*    */ 
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.Iterator;
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
/*    */ public abstract class CharsetProvider
/*    */ {
/*    */   protected CharsetProvider()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Iterator<Charset> charsets();
/*    */   
/*    */   public abstract Charset charsetForName(String paramString);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\charset\spi\CharsetProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */