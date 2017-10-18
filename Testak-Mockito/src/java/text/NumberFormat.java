/*     */ package java.text;
/*     */ 
/*     */ import java.io.InvalidObjectException;
/*     */ import java.math.RoundingMode;
/*     */ import java.util.Currency;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class NumberFormat
/*     */   extends Format
/*     */ {
/*     */   public static final int FRACTION_FIELD = 1;
/*     */   public static final int INTEGER_FIELD = 0;
/*     */   
/*     */   public static class Field
/*     */     extends Format.Field
/*     */   {
/*     */     protected Field(String name)
/*     */     {
/*  47 */       super();throw new RuntimeException("Stub!"); }
/*  48 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */     public static final Field SIGN = null; public static final Field PERMILLE = null; public static final Field PERCENT = null; public static final Field INTEGER = null; public static final Field GROUPING_SEPARATOR = null; public static final Field FRACTION = null; public static final Field EXPONENT_SYMBOL = null; public static final Field EXPONENT_SIGN = null; public static final Field EXPONENT = null; public static final Field DECIMAL_SEPARATOR = null; public static final Field CURRENCY = null; }
/*     */   
/*  62 */   protected NumberFormat() { throw new RuntimeException("Stub!"); }
/*  63 */   public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/*  64 */   public final Object parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/*  65 */   public final String format(double number) { throw new RuntimeException("Stub!"); }
/*  66 */   public final String format(long number) { throw new RuntimeException("Stub!"); }
/*     */   public abstract StringBuffer format(double paramDouble, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*     */   public abstract StringBuffer format(long paramLong, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/*     */   public abstract Number parse(String paramString, ParsePosition paramParsePosition);
/*  70 */   public Number parse(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
/*  72 */   public void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
/*  73 */   public static final NumberFormat getInstance() { throw new RuntimeException("Stub!"); }
/*  74 */   public static NumberFormat getInstance(Locale inLocale) { throw new RuntimeException("Stub!"); }
/*  75 */   public static final NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }
/*  76 */   public static NumberFormat getNumberInstance(Locale inLocale) { throw new RuntimeException("Stub!"); }
/*  77 */   public static final NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }
/*  78 */   public static NumberFormat getIntegerInstance(Locale inLocale) { throw new RuntimeException("Stub!"); }
/*  79 */   public static final NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }
/*  80 */   public static NumberFormat getCurrencyInstance(Locale inLocale) { throw new RuntimeException("Stub!"); }
/*  81 */   public static final NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }
/*  82 */   public static NumberFormat getPercentInstance(Locale inLocale) { throw new RuntimeException("Stub!"); }
/*  83 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*  84 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  86 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
/*  88 */   public void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }
/*  89 */   public int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
/*  90 */   public void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/*  91 */   public int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
/*  92 */   public void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/*  93 */   public int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
/*  94 */   public void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/*  95 */   public int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
/*  96 */   public void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/*  97 */   public Currency getCurrency() { throw new RuntimeException("Stub!"); }
/*  98 */   public void setCurrency(Currency currency) { throw new RuntimeException("Stub!"); }
/*  99 */   public RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setRoundingMode(RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\NumberFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */