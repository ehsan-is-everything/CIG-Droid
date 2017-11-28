/*    */ package java.nio.charset;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.CharBuffer;
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
/*    */ public abstract class CharsetEncoder
/*    */ {
/* 32 */   protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar, byte[] replacement) { throw new RuntimeException("Stub!"); }
/* 33 */   protected CharsetEncoder(Charset cs, float averageBytesPerChar, float maxBytesPerChar) { throw new RuntimeException("Stub!"); }
/* 34 */   public final Charset charset() { throw new RuntimeException("Stub!"); }
/* 35 */   public final byte[] replacement() { throw new RuntimeException("Stub!"); }
/* 36 */   public final CharsetEncoder replaceWith(byte[] newReplacement) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void implReplaceWith(byte[] newReplacement) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isLegalReplacement(byte[] repl) { throw new RuntimeException("Stub!"); }
/* 39 */   public CodingErrorAction malformedInputAction() { throw new RuntimeException("Stub!"); }
/* 40 */   public final CharsetEncoder onMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void implOnMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 42 */   public CodingErrorAction unmappableCharacterAction() { throw new RuntimeException("Stub!"); }
/* 43 */   public final CharsetEncoder onUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 44 */   protected void implOnUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 45 */   public final float averageBytesPerChar() { throw new RuntimeException("Stub!"); }
/* 46 */   public final float maxBytesPerChar() { throw new RuntimeException("Stub!"); }
/* 47 */   public final CoderResult encode(CharBuffer in, ByteBuffer out, boolean endOfInput) { throw new RuntimeException("Stub!"); }
/* 48 */   public final CoderResult flush(ByteBuffer out) { throw new RuntimeException("Stub!"); }
/* 49 */   protected CoderResult implFlush(ByteBuffer out) { throw new RuntimeException("Stub!"); }
/* 50 */   public final CharsetEncoder reset() { throw new RuntimeException("Stub!"); }
/* 51 */   protected void implReset() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract CoderResult encodeLoop(CharBuffer paramCharBuffer, ByteBuffer paramByteBuffer);
/* 53 */   public final ByteBuffer encode(CharBuffer in) throws CharacterCodingException { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean canEncode(char c) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean canEncode(CharSequence cs) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\charset\CharsetEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */