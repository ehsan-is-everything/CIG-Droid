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
/*    */ public abstract class CharsetDecoder
/*    */ {
/* 32 */   protected CharsetDecoder(Charset cs, float averageCharsPerByte, float maxCharsPerByte) { throw new RuntimeException("Stub!"); }
/* 33 */   public final Charset charset() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String replacement() { throw new RuntimeException("Stub!"); }
/* 35 */   public final CharsetDecoder replaceWith(String newReplacement) { throw new RuntimeException("Stub!"); }
/* 36 */   protected void implReplaceWith(String newReplacement) { throw new RuntimeException("Stub!"); }
/* 37 */   public CodingErrorAction malformedInputAction() { throw new RuntimeException("Stub!"); }
/* 38 */   public final CharsetDecoder onMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void implOnMalformedInput(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 40 */   public CodingErrorAction unmappableCharacterAction() { throw new RuntimeException("Stub!"); }
/* 41 */   public final CharsetDecoder onUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 42 */   protected void implOnUnmappableCharacter(CodingErrorAction newAction) { throw new RuntimeException("Stub!"); }
/* 43 */   public final float averageCharsPerByte() { throw new RuntimeException("Stub!"); }
/* 44 */   public final float maxCharsPerByte() { throw new RuntimeException("Stub!"); }
/* 45 */   public final CoderResult decode(ByteBuffer in, CharBuffer out, boolean endOfInput) { throw new RuntimeException("Stub!"); }
/* 46 */   public final CoderResult flush(CharBuffer out) { throw new RuntimeException("Stub!"); }
/* 47 */   protected CoderResult implFlush(CharBuffer out) { throw new RuntimeException("Stub!"); }
/* 48 */   public final CharsetDecoder reset() { throw new RuntimeException("Stub!"); }
/* 49 */   protected void implReset() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract CoderResult decodeLoop(ByteBuffer paramByteBuffer, CharBuffer paramCharBuffer);
/* 51 */   public final CharBuffer decode(ByteBuffer in) throws CharacterCodingException { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isAutoDetecting() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isCharsetDetected() { throw new RuntimeException("Stub!"); }
/* 54 */   public Charset detectedCharset() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\charset\CharsetDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */