/*     */ package java.util;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public final class Locale
/*     */   implements Cloneable, Serializable
/*     */ {
/*     */   public static enum Category
/*     */   {
/*  48 */     DISPLAY, 
/*  49 */     FORMAT;
/*     */     
/*     */     private Category() {} }
/*     */   
/*  53 */   public static final class Builder { public Builder() { throw new RuntimeException("Stub!"); }
/*  54 */     public Builder setLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/*  55 */     public Builder setLanguageTag(String languageTag) { throw new RuntimeException("Stub!"); }
/*  56 */     public Builder setLanguage(String language) { throw new RuntimeException("Stub!"); }
/*  57 */     public Builder setScript(String script) { throw new RuntimeException("Stub!"); }
/*  58 */     public Builder setRegion(String region) { throw new RuntimeException("Stub!"); }
/*  59 */     public Builder setVariant(String variant) { throw new RuntimeException("Stub!"); }
/*  60 */     public Builder setExtension(char key, String value) { throw new RuntimeException("Stub!"); }
/*  61 */     public Builder setUnicodeLocaleKeyword(String key, String type) { throw new RuntimeException("Stub!"); }
/*  62 */     public Builder addUnicodeLocaleAttribute(String attribute) { throw new RuntimeException("Stub!"); }
/*  63 */     public Builder removeUnicodeLocaleAttribute(String attribute) { throw new RuntimeException("Stub!"); }
/*  64 */     public Builder clear() { throw new RuntimeException("Stub!"); }
/*  65 */     public Builder clearExtensions() { throw new RuntimeException("Stub!"); }
/*  66 */     public Locale build() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static enum FilteringMode {
/*  70 */     AUTOSELECT_FILTERING, 
/*  71 */     EXTENDED_FILTERING, 
/*  72 */     IGNORE_EXTENDED_RANGES, 
/*  73 */     MAP_EXTENDED_RANGES, 
/*  74 */     REJECT_EXTENDED_RANGES;
/*     */     
/*     */     private FilteringMode() {} }
/*     */   public static final class LanguageRange { public static final double MAX_WEIGHT = 1.0D;
/*  78 */     public LanguageRange(String range) { throw new RuntimeException("Stub!"); }
/*  79 */     public LanguageRange(String range, double weight) { throw new RuntimeException("Stub!"); }
/*  80 */     public String getRange() { throw new RuntimeException("Stub!"); }
/*  81 */     public double getWeight() { throw new RuntimeException("Stub!"); }
/*  82 */     public static List<LanguageRange> parse(String ranges) { throw new RuntimeException("Stub!"); }
/*  83 */     public static List<LanguageRange> parse(String ranges, Map<String, List<String>> map) { throw new RuntimeException("Stub!"); }
/*  84 */     public static List<LanguageRange> mapEquivalents(List<LanguageRange> priorityList, Map<String, List<String>> map) { throw new RuntimeException("Stub!"); }
/*  85 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  86 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final double MIN_WEIGHT = 0.0D; }
/*     */   
/*  90 */   public Locale(String language, String country, String variant) { throw new RuntimeException("Stub!"); }
/*  91 */   public Locale(String language, String country) { throw new RuntimeException("Stub!"); }
/*  92 */   public Locale(String language) { throw new RuntimeException("Stub!"); }
/*  93 */   public static Locale getDefault() { throw new RuntimeException("Stub!"); }
/*  94 */   public static Locale getDefault(Category category) { throw new RuntimeException("Stub!"); }
/*  95 */   public static synchronized void setDefault(Locale newLocale) { throw new RuntimeException("Stub!"); }
/*  96 */   public static synchronized void setDefault(Category category, Locale newLocale) { throw new RuntimeException("Stub!"); }
/*  97 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*  98 */   public static String[] getISOCountries() { throw new RuntimeException("Stub!"); }
/*  99 */   public static String[] getISOLanguages() { throw new RuntimeException("Stub!"); }
/* 100 */   public String getLanguage() { throw new RuntimeException("Stub!"); }
/* 101 */   public String getScript() { throw new RuntimeException("Stub!"); }
/* 102 */   public String getCountry() { throw new RuntimeException("Stub!"); }
/* 103 */   public String getVariant() { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean hasExtensions() { throw new RuntimeException("Stub!"); }
/* 105 */   public Locale stripExtensions() { throw new RuntimeException("Stub!"); }
/* 106 */   public String getExtension(char key) { throw new RuntimeException("Stub!"); }
/* 107 */   public Set<Character> getExtensionKeys() { throw new RuntimeException("Stub!"); }
/* 108 */   public Set<String> getUnicodeLocaleAttributes() { throw new RuntimeException("Stub!"); }
/* 109 */   public String getUnicodeLocaleType(String key) { throw new RuntimeException("Stub!"); }
/* 110 */   public Set<String> getUnicodeLocaleKeys() { throw new RuntimeException("Stub!"); }
/* 111 */   public final String toString() { throw new RuntimeException("Stub!"); }
/* 112 */   public String toLanguageTag() { throw new RuntimeException("Stub!"); }
/* 113 */   public static Locale forLanguageTag(String languageTag) { throw new RuntimeException("Stub!"); }
/* 114 */   public String getISO3Language() throws MissingResourceException { throw new RuntimeException("Stub!"); }
/* 115 */   public String getISO3Country() throws MissingResourceException { throw new RuntimeException("Stub!"); }
/* 116 */   public final String getDisplayLanguage() { throw new RuntimeException("Stub!"); }
/* 117 */   public String getDisplayLanguage(Locale locale) { throw new RuntimeException("Stub!"); }
/* 118 */   public String getDisplayScript() { throw new RuntimeException("Stub!"); }
/* 119 */   public String getDisplayScript(Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 120 */   public final String getDisplayCountry() { throw new RuntimeException("Stub!"); }
/* 121 */   public String getDisplayCountry(Locale locale) { throw new RuntimeException("Stub!"); }
/* 122 */   public final String getDisplayVariant() { throw new RuntimeException("Stub!"); }
/* 123 */   public String getDisplayVariant(Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 124 */   public final String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 125 */   public String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/* 126 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 127 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 128 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 129 */   public static List<Locale> filter(List<LanguageRange> priorityList, Collection<Locale> locales, FilteringMode mode) { throw new RuntimeException("Stub!"); }
/* 130 */   public static List<Locale> filter(List<LanguageRange> priorityList, Collection<Locale> locales) { throw new RuntimeException("Stub!"); }
/* 131 */   public static List<String> filterTags(List<LanguageRange> priorityList, Collection<String> tags, FilteringMode mode) { throw new RuntimeException("Stub!"); }
/* 132 */   public static List<String> filterTags(List<LanguageRange> priorityList, Collection<String> tags) { throw new RuntimeException("Stub!"); }
/* 133 */   public static Locale lookup(List<LanguageRange> priorityList, Collection<Locale> locales) { throw new RuntimeException("Stub!"); }
/* 134 */   public static String lookupTag(List<LanguageRange> priorityList, Collection<String> tags) { throw new RuntimeException("Stub!"); }
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
/* 159 */   public static final Locale US = null; public static final char UNICODE_LOCALE_EXTENSION = 'u'; public static final Locale UK = null; public static final Locale TRADITIONAL_CHINESE = null; public static final Locale TAIWAN = null; public static final Locale SIMPLIFIED_CHINESE = null; public static final Locale ROOT = null; public static final char PRIVATE_USE_EXTENSION = 'x'; public static final Locale PRC = null; public static final Locale KOREAN = null; public static final Locale KOREA = null; public static final Locale JAPANESE = null; public static final Locale JAPAN = null; public static final Locale ITALY = null; public static final Locale ITALIAN = null; public static final Locale GERMANY = null; public static final Locale GERMAN = null; public static final Locale FRENCH = null; public static final Locale FRANCE = null; public static final Locale ENGLISH = null; public static final Locale CHINESE = null; public static final Locale CHINA = null; public static final Locale CANADA_FRENCH = null; public static final Locale CANADA = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Locale.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */