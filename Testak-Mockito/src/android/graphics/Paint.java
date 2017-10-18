/*     */ package android.graphics;
/*     */ 
/*     */ import android.os.LocaleList;
/*     */ 
/*     */ public class Paint
/*     */ {
/*     */   public static final int ANTI_ALIAS_FLAG = 1;
/*     */   public static final int DEV_KERN_TEXT_FLAG = 256;
/*     */   public static final int DITHER_FLAG = 4;
/*     */   public static final int EMBEDDED_BITMAP_TEXT_FLAG = 1024;
/*     */   public static final int FAKE_BOLD_TEXT_FLAG = 32;
/*     */   public static final int FILTER_BITMAP_FLAG = 2;
/*     */   public static final int HINTING_OFF = 0;
/*     */   public static final int HINTING_ON = 1;
/*     */   public static final int LINEAR_TEXT_FLAG = 64;
/*     */   public static final int STRIKE_THRU_TEXT_FLAG = 16;
/*     */   public static final int SUBPIXEL_TEXT_FLAG = 128;
/*     */   public static final int UNDERLINE_TEXT_FLAG = 8;
/*     */   
/*     */   public static enum Style
/*     */   {
/*  22 */     FILL, 
/*  23 */     FILL_AND_STROKE, 
/*  24 */     STROKE;
/*     */     
/*     */     private Style() {} }
/*     */   
/*  28 */   public static enum Cap { BUTT, 
/*  29 */     ROUND, 
/*  30 */     SQUARE;
/*     */     
/*     */     private Cap() {} }
/*     */   
/*  34 */   public static enum Join { BEVEL, 
/*  35 */     MITER, 
/*  36 */     ROUND;
/*     */     
/*     */     private Join() {} }
/*     */   
/*  40 */   public static enum Align { CENTER, 
/*  41 */     LEFT, 
/*  42 */     RIGHT;
/*     */     
/*     */     private Align() {} }
/*     */   public static class FontMetrics { public float ascent; public float bottom; public float descent;
/*  46 */     public FontMetrics() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public float leading;
/*     */     public float top; }
/*     */   
/*     */   public static class FontMetricsInt { public int ascent;
/*     */     public int bottom;
/*     */     public int descent;
/*     */     
/*  55 */     public FontMetricsInt() { throw new RuntimeException("Stub!"); }
/*  56 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public int leading;
/*     */     public int top;
/*     */   }
/*     */   
/*  63 */   public Paint() { throw new RuntimeException("Stub!"); }
/*  64 */   public Paint(int flags) { throw new RuntimeException("Stub!"); }
/*  65 */   public Paint(Paint paint) { throw new RuntimeException("Stub!"); }
/*  66 */   public void reset() { throw new RuntimeException("Stub!"); }
/*  67 */   public void set(Paint src) { throw new RuntimeException("Stub!"); }
/*  68 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/*  69 */   public void setFlags(int flags) { throw new RuntimeException("Stub!"); }
/*  70 */   public int getHinting() { throw new RuntimeException("Stub!"); }
/*  71 */   public void setHinting(int mode) { throw new RuntimeException("Stub!"); }
/*  72 */   public final boolean isAntiAlias() { throw new RuntimeException("Stub!"); }
/*  73 */   public void setAntiAlias(boolean aa) { throw new RuntimeException("Stub!"); }
/*  74 */   public final boolean isDither() { throw new RuntimeException("Stub!"); }
/*  75 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/*  76 */   public final boolean isLinearText() { throw new RuntimeException("Stub!"); }
/*  77 */   public void setLinearText(boolean linearText) { throw new RuntimeException("Stub!"); }
/*  78 */   public final boolean isSubpixelText() { throw new RuntimeException("Stub!"); }
/*  79 */   public void setSubpixelText(boolean subpixelText) { throw new RuntimeException("Stub!"); }
/*  80 */   public final boolean isUnderlineText() { throw new RuntimeException("Stub!"); }
/*  81 */   public void setUnderlineText(boolean underlineText) { throw new RuntimeException("Stub!"); }
/*  82 */   public final boolean isStrikeThruText() { throw new RuntimeException("Stub!"); }
/*  83 */   public void setStrikeThruText(boolean strikeThruText) { throw new RuntimeException("Stub!"); }
/*  84 */   public final boolean isFakeBoldText() { throw new RuntimeException("Stub!"); }
/*  85 */   public void setFakeBoldText(boolean fakeBoldText) { throw new RuntimeException("Stub!"); }
/*  86 */   public final boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
/*  87 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
/*  88 */   public Style getStyle() { throw new RuntimeException("Stub!"); }
/*  89 */   public void setStyle(Style style) { throw new RuntimeException("Stub!"); }
/*  90 */   public int getColor() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setColor(int color) { throw new RuntimeException("Stub!"); }
/*  92 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/*  93 */   public void setAlpha(int a) { throw new RuntimeException("Stub!"); }
/*  94 */   public void setARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); }
/*  95 */   public float getStrokeWidth() { throw new RuntimeException("Stub!"); }
/*  96 */   public void setStrokeWidth(float width) { throw new RuntimeException("Stub!"); }
/*  97 */   public float getStrokeMiter() { throw new RuntimeException("Stub!"); }
/*  98 */   public void setStrokeMiter(float miter) { throw new RuntimeException("Stub!"); }
/*  99 */   public Cap getStrokeCap() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setStrokeCap(Cap cap) { throw new RuntimeException("Stub!"); }
/* 101 */   public Join getStrokeJoin() { throw new RuntimeException("Stub!"); }
/* 102 */   public void setStrokeJoin(Join join) { throw new RuntimeException("Stub!"); }
/* 103 */   public boolean getFillPath(Path src, Path dst) { throw new RuntimeException("Stub!"); }
/* 104 */   public Shader getShader() { throw new RuntimeException("Stub!"); }
/* 105 */   public Shader setShader(Shader shader) { throw new RuntimeException("Stub!"); }
/* 106 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/* 107 */   public ColorFilter setColorFilter(ColorFilter filter) { throw new RuntimeException("Stub!"); }
/* 108 */   public Xfermode getXfermode() { throw new RuntimeException("Stub!"); }
/* 109 */   public Xfermode setXfermode(Xfermode xfermode) { throw new RuntimeException("Stub!"); }
/* 110 */   public PathEffect getPathEffect() { throw new RuntimeException("Stub!"); }
/* 111 */   public PathEffect setPathEffect(PathEffect effect) { throw new RuntimeException("Stub!"); }
/* 112 */   public MaskFilter getMaskFilter() { throw new RuntimeException("Stub!"); }
/* 113 */   public MaskFilter setMaskFilter(MaskFilter maskfilter) { throw new RuntimeException("Stub!"); }
/* 114 */   public Typeface getTypeface() { throw new RuntimeException("Stub!"); }
/* 115 */   public Typeface setTypeface(Typeface typeface) { throw new RuntimeException("Stub!"); }
/* 116 */   public void setShadowLayer(float radius, float dx, float dy, int shadowColor) { throw new RuntimeException("Stub!"); }
/* 117 */   public void clearShadowLayer() { throw new RuntimeException("Stub!"); }
/* 118 */   public Align getTextAlign() { throw new RuntimeException("Stub!"); }
/* 119 */   public void setTextAlign(Align align) { throw new RuntimeException("Stub!"); }
/* 120 */   public java.util.Locale getTextLocale() { throw new RuntimeException("Stub!"); }
/* 121 */   public LocaleList getTextLocales() { throw new RuntimeException("Stub!"); }
/* 122 */   public void setTextLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 123 */   public void setTextLocales(LocaleList locales) { throw new RuntimeException("Stub!"); }
/* 124 */   public boolean isElegantTextHeight() { throw new RuntimeException("Stub!"); }
/* 125 */   public void setElegantTextHeight(boolean elegant) { throw new RuntimeException("Stub!"); }
/* 126 */   public float getTextSize() { throw new RuntimeException("Stub!"); }
/* 127 */   public void setTextSize(float textSize) { throw new RuntimeException("Stub!"); }
/* 128 */   public float getTextScaleX() { throw new RuntimeException("Stub!"); }
/* 129 */   public void setTextScaleX(float scaleX) { throw new RuntimeException("Stub!"); }
/* 130 */   public float getTextSkewX() { throw new RuntimeException("Stub!"); }
/* 131 */   public void setTextSkewX(float skewX) { throw new RuntimeException("Stub!"); }
/* 132 */   public float getLetterSpacing() { throw new RuntimeException("Stub!"); }
/* 133 */   public void setLetterSpacing(float letterSpacing) { throw new RuntimeException("Stub!"); }
/* 134 */   public String getFontFeatureSettings() { throw new RuntimeException("Stub!"); }
/* 135 */   public void setFontFeatureSettings(String settings) { throw new RuntimeException("Stub!"); }
/* 136 */   public String getFontVariationSettings() { throw new RuntimeException("Stub!"); }
/* 137 */   public boolean setFontVariationSettings(String fontVariationSettings) { throw new RuntimeException("Stub!"); }
/* 138 */   public float ascent() { throw new RuntimeException("Stub!"); }
/* 139 */   public float descent() { throw new RuntimeException("Stub!"); }
/* 140 */   public float getFontMetrics(FontMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 141 */   public FontMetrics getFontMetrics() { throw new RuntimeException("Stub!"); }
/* 142 */   public int getFontMetricsInt(FontMetricsInt fmi) { throw new RuntimeException("Stub!"); }
/* 143 */   public FontMetricsInt getFontMetricsInt() { throw new RuntimeException("Stub!"); }
/* 144 */   public float getFontSpacing() { throw new RuntimeException("Stub!"); }
/* 145 */   public float measureText(char[] text, int index, int count) { throw new RuntimeException("Stub!"); }
/* 146 */   public float measureText(String text, int start, int end) { throw new RuntimeException("Stub!"); }
/* 147 */   public float measureText(String text) { throw new RuntimeException("Stub!"); }
/* 148 */   public float measureText(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
/* 149 */   public int breakText(char[] text, int index, int count, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
/* 150 */   public int breakText(CharSequence text, int start, int end, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
/* 151 */   public int breakText(String text, boolean measureForwards, float maxWidth, float[] measuredWidth) { throw new RuntimeException("Stub!"); }
/* 152 */   public int getTextWidths(char[] text, int index, int count, float[] widths) { throw new RuntimeException("Stub!"); }
/* 153 */   public int getTextWidths(CharSequence text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
/* 154 */   public int getTextWidths(String text, int start, int end, float[] widths) { throw new RuntimeException("Stub!"); }
/* 155 */   public int getTextWidths(String text, float[] widths) { throw new RuntimeException("Stub!"); }
/* 156 */   public void getTextPath(char[] text, int index, int count, float x, float y, Path path) { throw new RuntimeException("Stub!"); }
/* 157 */   public void getTextPath(String text, int start, int end, float x, float y, Path path) { throw new RuntimeException("Stub!"); }
/* 158 */   public void getTextBounds(String text, int start, int end, Rect bounds) { throw new RuntimeException("Stub!"); }
/* 159 */   public void getTextBounds(char[] text, int index, int count, Rect bounds) { throw new RuntimeException("Stub!"); }
/* 160 */   public boolean hasGlyph(String string) { throw new RuntimeException("Stub!"); }
/* 161 */   public float getRunAdvance(char[] text, int start, int end, int contextStart, int contextEnd, boolean isRtl, int offset) { throw new RuntimeException("Stub!"); }
/* 162 */   public float getRunAdvance(CharSequence text, int start, int end, int contextStart, int contextEnd, boolean isRtl, int offset) { throw new RuntimeException("Stub!"); }
/* 163 */   public int getOffsetForAdvance(char[] text, int start, int end, int contextStart, int contextEnd, boolean isRtl, float advance) { throw new RuntimeException("Stub!"); }
/* 164 */   public int getOffsetForAdvance(CharSequence text, int start, int end, int contextStart, int contextEnd, boolean isRtl, float advance) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Paint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */