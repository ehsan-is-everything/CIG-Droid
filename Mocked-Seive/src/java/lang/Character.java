/*     */ package java.lang;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Character
/*     */   implements Serializable, Comparable<Character>
/*     */ {
/*     */   public static final int BYTES = 2;
/*     */   public static final byte COMBINING_SPACING_MARK = 8;
/*     */   public static final byte CONNECTOR_PUNCTUATION = 23;
/*     */   public static final byte CONTROL = 15;
/*     */   public static final byte CURRENCY_SYMBOL = 26;
/*     */   public static final byte DASH_PUNCTUATION = 20;
/*     */   public static final byte DECIMAL_DIGIT_NUMBER = 9;
/*     */   public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;
/*     */   public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;
/*     */   public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;
/*     */   public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;
/*     */   
/*     */   public static class Subset
/*     */   {
/*  32 */     protected Subset(String name) { throw new RuntimeException("Stub!"); }
/*  33 */     public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  34 */     public final int hashCode() { throw new RuntimeException("Stub!"); }
/*  35 */     public final String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class UnicodeBlock extends Character.Subset {
/*     */     UnicodeBlock() {
/*  40 */       super();throw new RuntimeException("Stub!"); }
/*  41 */     public static UnicodeBlock of(char c) { throw new RuntimeException("Stub!"); }
/*  42 */     public static UnicodeBlock of(int codePoint) { throw new RuntimeException("Stub!"); }
/*  43 */     public static final UnicodeBlock forName(String blockName) { throw new RuntimeException("Stub!"); }
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
/* 266 */     public static final UnicodeBlock YI_SYLLABLES = null; public static final UnicodeBlock YI_RADICALS = null; public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null; public static final UnicodeBlock VERTICAL_FORMS = null; public static final UnicodeBlock VEDIC_EXTENSIONS = null; public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null; public static final UnicodeBlock VARIATION_SELECTORS = null; public static final UnicodeBlock VAI = null; public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null; public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null; public static final UnicodeBlock UGARITIC = null; public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS = null; public static final UnicodeBlock TIFINAGH = null; public static final UnicodeBlock TIBETAN = null; public static final UnicodeBlock THAI = null; public static final UnicodeBlock THAANA = null; public static final UnicodeBlock TELUGU = null; public static final UnicodeBlock TAMIL = null; public static final UnicodeBlock TAKRI = null; public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS = null; public static final UnicodeBlock TAI_VIET = null; public static final UnicodeBlock TAI_THAM = null; public static final UnicodeBlock TAI_LE = null; public static final UnicodeBlock TAGS = null; public static final UnicodeBlock TAGBANWA = null; public static final UnicodeBlock TAGALOG = null; public static final UnicodeBlock SYRIAC = null; public static final UnicodeBlock SYLOTI_NAGRI = null; @Deprecated
/* 266 */     public static final UnicodeBlock SURROGATES_AREA = null; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null; public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION = null; public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B = null; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A = null; public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null; public static final UnicodeBlock SUNDANESE_SUPPLEMENT = null; public static final UnicodeBlock SUNDANESE = null; public static final UnicodeBlock SPECIALS = null; public static final UnicodeBlock SPACING_MODIFIER_LETTERS = null; public static final UnicodeBlock SORA_SOMPENG = null; public static final UnicodeBlock SMALL_FORM_VARIANTS = null; public static final UnicodeBlock SINHALA = null; public static final UnicodeBlock SHAVIAN = null; public static final UnicodeBlock SHARADA = null; public static final UnicodeBlock SAURASHTRA = null; public static final UnicodeBlock SAMARITAN = null; public static final UnicodeBlock RUNIC = null; public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS = null; public static final UnicodeBlock REJANG = null; public static final UnicodeBlock PRIVATE_USE_AREA = null; public static final UnicodeBlock PLAYING_CARDS = null; public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT = null; public static final UnicodeBlock PHONETIC_EXTENSIONS = null; public static final UnicodeBlock PHOENICIAN = null; public static final UnicodeBlock PHAISTOS_DISC = null; public static final UnicodeBlock PHAGS_PA = null; public static final UnicodeBlock OSMANYA = null; public static final UnicodeBlock ORIYA = null; public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null; public static final UnicodeBlock OL_CHIKI = null; public static final UnicodeBlock OLD_TURKIC = null; public static final UnicodeBlock OLD_SOUTH_ARABIAN = null; public static final UnicodeBlock OLD_PERSIAN = null; public static final UnicodeBlock OLD_ITALIC = null; public static final UnicodeBlock OGHAM = null; public static final UnicodeBlock NUMBER_FORMS = null; public static final UnicodeBlock NKO = null; public static final UnicodeBlock NEW_TAI_LUE = null; public static final UnicodeBlock MYANMAR_EXTENDED_A = null; public static final UnicodeBlock MYANMAR = null; public static final UnicodeBlock MUSICAL_SYMBOLS = null; public static final UnicodeBlock MONGOLIAN = null; public static final UnicodeBlock MODIFIER_TONE_LETTERS = null; public static final UnicodeBlock MISCELLANEOUS_TECHNICAL = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS = null; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null; public static final UnicodeBlock MIAO = null; public static final UnicodeBlock MEROITIC_HIEROGLYPHS = null; public static final UnicodeBlock MEROITIC_CURSIVE = null; public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS = null; public static final UnicodeBlock MEETEI_MAYEK = null; public static final UnicodeBlock MATHEMATICAL_OPERATORS = null; public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null; public static final UnicodeBlock MANDAIC = null; public static final UnicodeBlock MALAYALAM = null; public static final UnicodeBlock MAHJONG_TILES = null; public static final UnicodeBlock LYDIAN = null; public static final UnicodeBlock LYCIAN = null; public static final UnicodeBlock LOW_SURROGATES = null; public static final UnicodeBlock LISU = null; public static final UnicodeBlock LINEAR_B_SYLLABARY = null; public static final UnicodeBlock LINEAR_B_IDEOGRAMS = null; public static final UnicodeBlock LIMBU = null; public static final UnicodeBlock LETTERLIKE_SYMBOLS = null; public static final UnicodeBlock LEPCHA = null; public static final UnicodeBlock LATIN_EXTENDED_D = null; public static final UnicodeBlock LATIN_EXTENDED_C = null; public static final UnicodeBlock LATIN_EXTENDED_B = null; public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null; public static final UnicodeBlock LATIN_EXTENDED_A = null; public static final UnicodeBlock LATIN_1_SUPPLEMENT = null; public static final UnicodeBlock LAO = null; public static final UnicodeBlock KHMER_SYMBOLS = null; public static final UnicodeBlock KHMER = null; public static final UnicodeBlock KHAROSHTHI = null; public static final UnicodeBlock KAYAH_LI = null; public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null; public static final UnicodeBlock KATAKANA = null; public static final UnicodeBlock KANNADA = null; public static final UnicodeBlock KANGXI_RADICALS = null; public static final UnicodeBlock KANBUN = null; public static final UnicodeBlock KANA_SUPPLEMENT = null; public static final UnicodeBlock KAITHI = null; public static final UnicodeBlock JAVANESE = null; public static final UnicodeBlock IPA_EXTENSIONS = null; public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN = null; public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI = null; public static final UnicodeBlock IMPERIAL_ARAMAIC = null; public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null; public static final UnicodeBlock HIRAGANA = null; public static final UnicodeBlock HIGH_SURROGATES = null; public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null; public static final UnicodeBlock HEBREW = null; public static final UnicodeBlock HANUNOO = null; public static final UnicodeBlock HANGUL_SYLLABLES = null; public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B = null; public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A = null; public static final UnicodeBlock HANGUL_JAMO = null; public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null; public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null; public static final UnicodeBlock GURMUKHI = null; public static final UnicodeBlock GUJARATI = null; public static final UnicodeBlock GREEK_EXTENDED = null; public static final UnicodeBlock GREEK = null; public static final UnicodeBlock GOTHIC = null; public static final UnicodeBlock GLAGOLITIC = null; public static final UnicodeBlock GEORGIAN_SUPPLEMENT = null; public static final UnicodeBlock GEORGIAN = null; public static final UnicodeBlock GEOMETRIC_SHAPES = null; public static final UnicodeBlock GENERAL_PUNCTUATION = null; public static final UnicodeBlock ETHIOPIC_SUPPLEMENT = null; public static final UnicodeBlock ETHIOPIC_EXTENDED_A = null; public static final UnicodeBlock ETHIOPIC_EXTENDED = null; public static final UnicodeBlock ETHIOPIC = null; public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null; public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null; public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null; public static final UnicodeBlock ENCLOSED_ALPHANUMERICS = null; public static final UnicodeBlock EMOTICONS = null; public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS = null; public static final UnicodeBlock DOMINO_TILES = null; public static final UnicodeBlock DINGBATS = null; public static final UnicodeBlock DEVANAGARI_EXTENDED = null; public static final UnicodeBlock DEVANAGARI = null; public static final UnicodeBlock DESERET = null; public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY = null; public static final UnicodeBlock CYRILLIC_EXTENDED_B = null; public static final UnicodeBlock CYRILLIC_EXTENDED_A = null; public static final UnicodeBlock CYRILLIC = null; public static final UnicodeBlock CYPRIOT_SYLLABARY = null; public static final UnicodeBlock CURRENCY_SYMBOLS = null; public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION = null; public static final UnicodeBlock CUNEIFORM = null; public static final UnicodeBlock COUNTING_ROD_NUMERALS = null; public static final UnicodeBlock COPTIC = null; public static final UnicodeBlock CONTROL_PICTURES = null; public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS = null; public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null; public static final UnicodeBlock COMBINING_HALF_MARKS = null; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null; public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null; public static final UnicodeBlock CJK_STROKES = null; public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT = null; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null; public static final UnicodeBlock CJK_COMPATIBILITY_FORMS = null; public static final UnicodeBlock CJK_COMPATIBILITY = null; public static final UnicodeBlock CHEROKEE = null; public static final UnicodeBlock CHAM = null; public static final UnicodeBlock CHAKMA = null; public static final UnicodeBlock CARIAN = null; public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null; public static final UnicodeBlock BUHID = null; public static final UnicodeBlock BUGINESE = null; public static final UnicodeBlock BRAILLE_PATTERNS = null; public static final UnicodeBlock BRAHMI = null; public static final UnicodeBlock BOX_DRAWING = null; public static final UnicodeBlock BOPOMOFO_EXTENDED = null; public static final UnicodeBlock BOPOMOFO = null; public static final UnicodeBlock BLOCK_ELEMENTS = null; public static final UnicodeBlock BENGALI = null; public static final UnicodeBlock BATAK = null; public static final UnicodeBlock BASIC_LATIN = null; public static final UnicodeBlock BAMUM_SUPPLEMENT = null; public static final UnicodeBlock BAMUM = null; public static final UnicodeBlock BALINESE = null; public static final UnicodeBlock AVESTAN = null; public static final UnicodeBlock ARROWS = null; public static final UnicodeBlock ARMENIAN = null; public static final UnicodeBlock ARABIC_SUPPLEMENT = null; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null; public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null; public static final UnicodeBlock ARABIC_EXTENDED_A = null; public static final UnicodeBlock ARABIC = null; public static final UnicodeBlock ANCIENT_SYMBOLS = null; public static final UnicodeBlock ANCIENT_GREEK_NUMBERS = null; public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION = null; public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null; public static final UnicodeBlock ALCHEMICAL_SYMBOLS = null; public static final UnicodeBlock AEGEAN_NUMBERS = null;
/*     */   }
/*     */   
/*     */   public static enum UnicodeScript {
/* 270 */     ARABIC, 
/* 271 */     ARMENIAN, 
/* 272 */     AVESTAN, 
/* 273 */     BALINESE, 
/* 274 */     BAMUM, 
/* 275 */     BATAK, 
/* 276 */     BENGALI, 
/* 277 */     BOPOMOFO, 
/* 278 */     BRAHMI, 
/* 279 */     BRAILLE, 
/* 280 */     BUGINESE, 
/* 281 */     BUHID, 
/* 282 */     CANADIAN_ABORIGINAL, 
/* 283 */     CARIAN, 
/* 284 */     CHAKMA, 
/* 285 */     CHAM, 
/* 286 */     CHEROKEE, 
/* 287 */     COMMON, 
/* 288 */     COPTIC, 
/* 289 */     CUNEIFORM, 
/* 290 */     CYPRIOT, 
/* 291 */     CYRILLIC, 
/* 292 */     DESERET, 
/* 293 */     DEVANAGARI, 
/* 294 */     EGYPTIAN_HIEROGLYPHS, 
/* 295 */     ETHIOPIC, 
/* 296 */     GEORGIAN, 
/* 297 */     GLAGOLITIC, 
/* 298 */     GOTHIC, 
/* 299 */     GREEK, 
/* 300 */     GUJARATI, 
/* 301 */     GURMUKHI, 
/* 302 */     HAN, 
/* 303 */     HANGUL, 
/* 304 */     HANUNOO, 
/* 305 */     HEBREW, 
/* 306 */     HIRAGANA, 
/* 307 */     IMPERIAL_ARAMAIC, 
/* 308 */     INHERITED, 
/* 309 */     INSCRIPTIONAL_PAHLAVI, 
/* 310 */     INSCRIPTIONAL_PARTHIAN, 
/* 311 */     JAVANESE, 
/* 312 */     KAITHI, 
/* 313 */     KANNADA, 
/* 314 */     KATAKANA, 
/* 315 */     KAYAH_LI, 
/* 316 */     KHAROSHTHI, 
/* 317 */     KHMER, 
/* 318 */     LAO, 
/* 319 */     LATIN, 
/* 320 */     LEPCHA, 
/* 321 */     LIMBU, 
/* 322 */     LINEAR_B, 
/* 323 */     LISU, 
/* 324 */     LYCIAN, 
/* 325 */     LYDIAN, 
/* 326 */     MALAYALAM, 
/* 327 */     MANDAIC, 
/* 328 */     MEETEI_MAYEK, 
/* 329 */     MEROITIC_CURSIVE, 
/* 330 */     MEROITIC_HIEROGLYPHS, 
/* 331 */     MIAO, 
/* 332 */     MONGOLIAN, 
/* 333 */     MYANMAR, 
/* 334 */     NEW_TAI_LUE, 
/* 335 */     NKO, 
/* 336 */     OGHAM, 
/* 337 */     OLD_ITALIC, 
/* 338 */     OLD_PERSIAN, 
/* 339 */     OLD_SOUTH_ARABIAN, 
/* 340 */     OLD_TURKIC, 
/* 341 */     OL_CHIKI, 
/* 342 */     ORIYA, 
/* 343 */     OSMANYA, 
/* 344 */     PHAGS_PA, 
/* 345 */     PHOENICIAN, 
/* 346 */     REJANG, 
/* 347 */     RUNIC, 
/* 348 */     SAMARITAN, 
/* 349 */     SAURASHTRA, 
/* 350 */     SHARADA, 
/* 351 */     SHAVIAN, 
/* 352 */     SINHALA, 
/* 353 */     SORA_SOMPENG, 
/* 354 */     SUNDANESE, 
/* 355 */     SYLOTI_NAGRI, 
/* 356 */     SYRIAC, 
/* 357 */     TAGALOG, 
/* 358 */     TAGBANWA, 
/* 359 */     TAI_LE, 
/* 360 */     TAI_THAM, 
/* 361 */     TAI_VIET, 
/* 362 */     TAKRI, 
/* 363 */     TAMIL, 
/* 364 */     TELUGU, 
/* 365 */     THAANA, 
/* 366 */     THAI, 
/* 367 */     TIBETAN, 
/* 368 */     TIFINAGH, 
/* 369 */     UGARITIC, 
/* 370 */     UNKNOWN, 
/* 371 */     VAI, 
/* 372 */     YI;
/* 373 */     private UnicodeScript() {} public static UnicodeScript of(int codePoint) { throw new RuntimeException("Stub!"); }
/* 374 */     public static final UnicodeScript forName(String scriptName) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 376 */   public Character(char value) { throw new RuntimeException("Stub!"); }
/* 377 */   public static Character valueOf(char c) { throw new RuntimeException("Stub!"); }
/* 378 */   public char charValue() { throw new RuntimeException("Stub!"); }
/* 379 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 380 */   public static int hashCode(char value) { throw new RuntimeException("Stub!"); }
/* 381 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 382 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 383 */   public static String toString(char c) { throw new RuntimeException("Stub!"); }
/* 384 */   public static boolean isValidCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
/* 385 */   public static boolean isBmpCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
/* 386 */   public static boolean isSupplementaryCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
/* 387 */   public static boolean isHighSurrogate(char ch) { throw new RuntimeException("Stub!"); }
/* 388 */   public static boolean isLowSurrogate(char ch) { throw new RuntimeException("Stub!"); }
/* 389 */   public static boolean isSurrogate(char ch) { throw new RuntimeException("Stub!"); }
/* 390 */   public static boolean isSurrogatePair(char high, char low) { throw new RuntimeException("Stub!"); }
/* 391 */   public static int charCount(int codePoint) { throw new RuntimeException("Stub!"); }
/* 392 */   public static int toCodePoint(char high, char low) { throw new RuntimeException("Stub!"); }
/* 393 */   public static int codePointAt(CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
/* 394 */   public static int codePointAt(char[] a, int index) { throw new RuntimeException("Stub!"); }
/* 395 */   public static int codePointAt(char[] a, int index, int limit) { throw new RuntimeException("Stub!"); }
/* 396 */   public static int codePointBefore(CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
/* 397 */   public static int codePointBefore(char[] a, int index) { throw new RuntimeException("Stub!"); }
/* 398 */   public static int codePointBefore(char[] a, int index, int start) { throw new RuntimeException("Stub!"); }
/* 399 */   public static char highSurrogate(int codePoint) { throw new RuntimeException("Stub!"); }
/* 400 */   public static char lowSurrogate(int codePoint) { throw new RuntimeException("Stub!"); }
/* 401 */   public static int toChars(int codePoint, char[] dst, int dstIndex) { throw new RuntimeException("Stub!"); }
/* 402 */   public static char[] toChars(int codePoint) { throw new RuntimeException("Stub!"); }
/* 403 */   public static int codePointCount(CharSequence seq, int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/* 404 */   public static int codePointCount(char[] a, int offset, int count) { throw new RuntimeException("Stub!"); }
/* 405 */   public static int offsetByCodePoints(CharSequence seq, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/* 406 */   public static int offsetByCodePoints(char[] a, int start, int count, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/* 407 */   public static boolean isLowerCase(char ch) { throw new RuntimeException("Stub!"); }
/* 408 */   public static boolean isLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 409 */   public static boolean isUpperCase(char ch) { throw new RuntimeException("Stub!"); }
/* 410 */   public static boolean isUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 411 */   public static boolean isTitleCase(char ch) { throw new RuntimeException("Stub!"); }
/* 412 */   public static boolean isTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 413 */   public static boolean isDigit(char ch) { throw new RuntimeException("Stub!"); }
/* 414 */   public static boolean isDigit(int codePoint) { throw new RuntimeException("Stub!"); }
/* 415 */   public static boolean isDefined(char ch) { throw new RuntimeException("Stub!"); }
/* 416 */   public static boolean isDefined(int codePoint) { throw new RuntimeException("Stub!"); }
/* 417 */   public static boolean isLetter(char ch) { throw new RuntimeException("Stub!"); }
/* 418 */   public static boolean isLetter(int codePoint) { throw new RuntimeException("Stub!"); }
/* 419 */   public static boolean isLetterOrDigit(char ch) { throw new RuntimeException("Stub!"); }
/* 420 */   public static boolean isLetterOrDigit(int codePoint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 422 */   public static boolean isJavaLetter(char ch) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 424 */   public static boolean isJavaLetterOrDigit(char ch) { throw new RuntimeException("Stub!"); }
/* 425 */   public static boolean isAlphabetic(int codePoint) { throw new RuntimeException("Stub!"); }
/* 426 */   public static boolean isIdeographic(int codePoint) { throw new RuntimeException("Stub!"); }
/* 427 */   public static boolean isJavaIdentifierStart(char ch) { throw new RuntimeException("Stub!"); }
/* 428 */   public static boolean isJavaIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
/* 429 */   public static boolean isJavaIdentifierPart(char ch) { throw new RuntimeException("Stub!"); }
/* 430 */   public static boolean isJavaIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
/* 431 */   public static boolean isUnicodeIdentifierStart(char ch) { throw new RuntimeException("Stub!"); }
/* 432 */   public static boolean isUnicodeIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
/* 433 */   public static boolean isUnicodeIdentifierPart(char ch) { throw new RuntimeException("Stub!"); }
/* 434 */   public static boolean isUnicodeIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
/* 435 */   public static boolean isIdentifierIgnorable(char ch) { throw new RuntimeException("Stub!"); }
/* 436 */   public static boolean isIdentifierIgnorable(int codePoint) { throw new RuntimeException("Stub!"); }
/* 437 */   public static char toLowerCase(char ch) { throw new RuntimeException("Stub!"); }
/* 438 */   public static int toLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 439 */   public static char toUpperCase(char ch) { throw new RuntimeException("Stub!"); }
/* 440 */   public static int toUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 441 */   public static char toTitleCase(char ch) { throw new RuntimeException("Stub!"); }
/* 442 */   public static int toTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
/* 443 */   public static int digit(char ch, int radix) { throw new RuntimeException("Stub!"); }
/* 444 */   public static int digit(int codePoint, int radix) { throw new RuntimeException("Stub!"); }
/* 445 */   public static int getNumericValue(char ch) { throw new RuntimeException("Stub!"); }
/* 446 */   public static int getNumericValue(int codePoint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 448 */   public static boolean isSpace(char ch) { throw new RuntimeException("Stub!"); }
/* 449 */   public static boolean isSpaceChar(char ch) { throw new RuntimeException("Stub!"); }
/* 450 */   public static boolean isSpaceChar(int codePoint) { throw new RuntimeException("Stub!"); }
/* 451 */   public static boolean isWhitespace(char ch) { throw new RuntimeException("Stub!"); }
/* 452 */   public static boolean isWhitespace(int codePoint) { throw new RuntimeException("Stub!"); }
/* 453 */   public static boolean isISOControl(char ch) { throw new RuntimeException("Stub!"); }
/* 454 */   public static boolean isISOControl(int codePoint) { throw new RuntimeException("Stub!"); }
/* 455 */   public static int getType(char ch) { throw new RuntimeException("Stub!"); }
/* 456 */   public static int getType(int codePoint) { throw new RuntimeException("Stub!"); }
/* 457 */   public static char forDigit(int digit, int radix) { throw new RuntimeException("Stub!"); }
/* 458 */   public static byte getDirectionality(char ch) { throw new RuntimeException("Stub!"); }
/* 459 */   public static byte getDirectionality(int codePoint) { throw new RuntimeException("Stub!"); }
/* 460 */   public static boolean isMirrored(char ch) { throw new RuntimeException("Stub!"); }
/* 461 */   public static boolean isMirrored(int codePoint) { throw new RuntimeException("Stub!"); }
/* 462 */   public int compareTo(Character anotherCharacter) { throw new RuntimeException("Stub!"); }
/* 463 */   public static int compare(char x, char y) { throw new RuntimeException("Stub!"); }
/* 464 */   public static char reverseBytes(char ch) { throw new RuntimeException("Stub!"); }
/* 465 */   public static String getName(int codePoint) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */   public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;
/*     */   
/*     */   public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;
/*     */   
/*     */   public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;
/*     */   
/*     */   public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;
/*     */   
/*     */   public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;
/*     */   
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;
/*     */   
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;
/*     */   
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;
/*     */   
/*     */   public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;
/*     */   
/*     */   public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;
/*     */   
/*     */   public static final byte DIRECTIONALITY_UNDEFINED = -1;
/*     */   
/*     */   public static final byte DIRECTIONALITY_WHITESPACE = 12;
/*     */   
/*     */   public static final byte ENCLOSING_MARK = 7;
/*     */   
/*     */   public static final byte END_PUNCTUATION = 22;
/*     */   
/*     */   public static final byte FINAL_QUOTE_PUNCTUATION = 30;
/*     */   
/*     */   public static final byte FORMAT = 16;
/*     */   
/*     */   public static final byte INITIAL_QUOTE_PUNCTUATION = 29;
/*     */   
/*     */   public static final byte LETTER_NUMBER = 10;
/*     */   public static final byte LINE_SEPARATOR = 13;
/*     */   public static final byte LOWERCASE_LETTER = 2;
/*     */   public static final byte MATH_SYMBOL = 25;
/*     */   public static final int MAX_CODE_POINT = 1114111;
/*     */   public static final char MAX_HIGH_SURROGATE = '?';
/*     */   public static final char MAX_LOW_SURROGATE = '?';
/*     */   public static final int MAX_RADIX = 36;
/*     */   public static final char MAX_SURROGATE = '?';
/*     */   public static final char MAX_VALUE = '￿';
/*     */   public static final int MIN_CODE_POINT = 0;
/*     */   public static final char MIN_HIGH_SURROGATE = '?';
/*     */   public static final char MIN_LOW_SURROGATE = '?';
/*     */   public static final int MIN_RADIX = 2;
/*     */   public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*     */   public static final char MIN_SURROGATE = '?';
/*     */   public static final char MIN_VALUE = '\000';
/*     */   public static final byte MODIFIER_LETTER = 4;
/*     */   public static final byte MODIFIER_SYMBOL = 27;
/*     */   public static final byte NON_SPACING_MARK = 6;
/*     */   public static final byte OTHER_LETTER = 5;
/*     */   public static final byte OTHER_NUMBER = 11;
/*     */   public static final byte OTHER_PUNCTUATION = 24;
/*     */   public static final byte OTHER_SYMBOL = 28;
/*     */   public static final byte PARAGRAPH_SEPARATOR = 14;
/*     */   public static final byte PRIVATE_USE = 18;
/*     */   public static final int SIZE = 16;
/*     */   public static final byte SPACE_SEPARATOR = 12;
/*     */   public static final byte START_PUNCTUATION = 21;
/*     */   public static final byte SURROGATE = 19;
/*     */   public static final byte TITLECASE_LETTER = 3;
/* 533 */   public static final Class<Character> TYPE = null;
/*     */   public static final byte UNASSIGNED = 0;
/*     */   public static final byte UPPERCASE_LETTER = 1;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\Character.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */