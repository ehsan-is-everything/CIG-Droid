/*     */ package android.icu.lang;
/*     */ 
/*     */ import android.icu.text.BreakIterator;
/*     */ 
/*     */ public final class UCharacter implements UCharacterEnums.ECharacterCategory, UCharacterEnums.ECharacterDirection { public static abstract interface BidiPairedBracketType { public static final int CLOSE = 2;
/*     */     public static final int NONE = 0;
/*     */     public static final int OPEN = 1; }
/*     */   public static abstract interface HangulSyllableType { public static final int LEADING_JAMO = 1; public static final int LVT_SYLLABLE = 5; public static final int LV_SYLLABLE = 4; public static final int NOT_APPLICABLE = 0; public static final int TRAILING_JAMO = 3; public static final int VOWEL_JAMO = 2; }
/*     */   public static abstract interface NumericType { public static final int DECIMAL = 1; public static final int DIGIT = 2; public static final int NONE = 0; public static final int NUMERIC = 3; }
/*     */   public static abstract interface LineBreak { public static final int ALPHABETIC = 2; public static final int AMBIGUOUS = 1; public static final int BREAK_AFTER = 4; public static final int BREAK_BEFORE = 5; public static final int BREAK_BOTH = 3; public static final int BREAK_SYMBOLS = 27; public static final int CARRIAGE_RETURN = 10; public static final int CLOSE_PARENTHESIS = 36; public static final int CLOSE_PUNCTUATION = 8; public static final int COMBINING_MARK = 9; public static final int COMPLEX_CONTEXT = 24; public static final int CONDITIONAL_JAPANESE_STARTER = 37; public static final int CONTINGENT_BREAK = 7; public static final int EXCLAMATION = 11; public static final int E_BASE = 40; public static final int E_MODIFIER = 41; public static final int GLUE = 12; public static final int H2 = 31; public static final int H3 = 32; public static final int HEBREW_LETTER = 38; public static final int HYPHEN = 13; public static final int IDEOGRAPHIC = 14; public static final int INFIX_NUMERIC = 16; public static final int INSEPARABLE = 15; public static final int INSEPERABLE = 15; public static final int JL = 33; public static final int JT = 34; public static final int JV = 35; public static final int LINE_FEED = 17; public static final int MANDATORY_BREAK = 6; public static final int NEXT_LINE = 29; public static final int NONSTARTER = 18; public static final int NUMERIC = 19; public static final int OPEN_PUNCTUATION = 20; public static final int POSTFIX_NUMERIC = 21; public static final int PREFIX_NUMERIC = 22; public static final int QUOTATION = 23; public static final int REGIONAL_INDICATOR = 39; public static final int SPACE = 26; public static final int SURROGATE = 25; public static final int UNKNOWN = 0; public static final int WORD_JOINER = 30; public static final int ZWJ = 42; public static final int ZWSPACE = 28; }
/*     */   public static abstract interface SentenceBreak { public static final int ATERM = 1; public static final int CLOSE = 2; public static final int CR = 11; public static final int EXTEND = 12; public static final int FORMAT = 3; public static final int LF = 13; public static final int LOWER = 4; public static final int NUMERIC = 5; public static final int OLETTER = 6; public static final int OTHER = 0; public static final int SCONTINUE = 14; public static final int SEP = 7; public static final int SP = 8; public static final int STERM = 9; public static final int UPPER = 10; }
/*     */   public static abstract interface WordBreak { public static final int ALETTER = 1; public static final int CR = 8; public static final int DOUBLE_QUOTE = 16; public static final int EXTEND = 9; public static final int EXTENDNUMLET = 7; public static final int E_BASE = 17; public static final int E_BASE_GAZ = 18; public static final int E_MODIFIER = 19; public static final int FORMAT = 2; public static final int GLUE_AFTER_ZWJ = 20; public static final int HEBREW_LETTER = 14; public static final int KATAKANA = 3; public static final int LF = 10; public static final int MIDLETTER = 4; public static final int MIDNUM = 5; public static final int MIDNUMLET = 11; public static final int NEWLINE = 12; public static final int NUMERIC = 6; public static final int OTHER = 0; public static final int REGIONAL_INDICATOR = 13; public static final int SINGLE_QUOTE = 15; public static final int ZWJ = 21; }
/*     */   public static abstract interface GraphemeClusterBreak { public static final int CONTROL = 1; public static final int CR = 2; public static final int EXTEND = 3; public static final int E_BASE = 13; public static final int E_BASE_GAZ = 14; public static final int E_MODIFIER = 15; public static final int GLUE_AFTER_ZWJ = 16; public static final int L = 4; public static final int LF = 5; public static final int LV = 6; public static final int LVT = 7; public static final int OTHER = 0; public static final int PREPEND = 11; public static final int REGIONAL_INDICATOR = 12; public static final int SPACING_MARK = 10; public static final int T = 8; public static final int V = 9; public static final int ZWJ = 17; }
/*     */   public static abstract interface JoiningGroup { public static final int AFRICAN_FEH = 86; public static final int AFRICAN_NOON = 87; public static final int AFRICAN_QAF = 88; public static final int AIN = 1; public static final int ALAPH = 2; public static final int ALEF = 3; public static final int BEH = 4; public static final int BETH = 5; public static final int BURUSHASKI_YEH_BARREE = 54; public static final int DAL = 6; public static final int DALATH_RISH = 7; public static final int E = 8; public static final int FARSI_YEH = 55; public static final int FE = 51; public static final int FEH = 9; public static final int FINAL_SEMKATH = 10; public static final int GAF = 11; public static final int GAMAL = 12; public static final int HAH = 13; public static final int HAMZA_ON_HEH_GOAL = 14; public static final int HE = 15; public static final int HEH = 16; public static final int HEH_GOAL = 17; public static final int HETH = 18; public static final int KAF = 19; public static final int KAPH = 20; public static final int KHAPH = 52; public static final int KNOTTED_HEH = 21; public static final int LAM = 22; public static final int LAMADH = 23; public static final int MANICHAEAN_ALEPH = 58; public static final int MANICHAEAN_AYIN = 59; public static final int MANICHAEAN_BETH = 60; public static final int MANICHAEAN_DALETH = 61; public static final int MANICHAEAN_DHAMEDH = 62; public static final int MANICHAEAN_FIVE = 63; public static final int MANICHAEAN_GIMEL = 64; public static final int MANICHAEAN_HETH = 65; public static final int MANICHAEAN_HUNDRED = 66; public static final int MANICHAEAN_KAPH = 67; public static final int MANICHAEAN_LAMEDH = 68; public static final int MANICHAEAN_MEM = 69; public static final int MANICHAEAN_NUN = 70; public static final int MANICHAEAN_ONE = 71; public static final int MANICHAEAN_PE = 72; public static final int MANICHAEAN_QOPH = 73; public static final int MANICHAEAN_RESH = 74; public static final int MANICHAEAN_SADHE = 75; public static final int MANICHAEAN_SAMEKH = 76; public static final int MANICHAEAN_TAW = 77; public static final int MANICHAEAN_TEN = 78; public static final int MANICHAEAN_TETH = 79; public static final int MANICHAEAN_THAMEDH = 80; public static final int MANICHAEAN_TWENTY = 81; public static final int MANICHAEAN_WAW = 82; public static final int MANICHAEAN_YODH = 83; public static final int MANICHAEAN_ZAYIN = 84; public static final int MEEM = 24; public static final int MIM = 25; public static final int NOON = 26; public static final int NO_JOINING_GROUP = 0; public static final int NUN = 27; public static final int NYA = 56; public static final int PE = 28; public static final int QAF = 29; public static final int QAPH = 30; public static final int REH = 31; public static final int REVERSED_PE = 32; public static final int ROHINGYA_YEH = 57; public static final int SAD = 33; public static final int SADHE = 34; public static final int SEEN = 35; public static final int SEMKATH = 36; public static final int SHIN = 37; public static final int STRAIGHT_WAW = 85; public static final int SWASH_KAF = 38; public static final int SYRIAC_WAW = 39; public static final int TAH = 40; public static final int TAW = 41; public static final int TEH_MARBUTA = 42; public static final int TEH_MARBUTA_GOAL = 14; public static final int TETH = 43; public static final int WAW = 44; public static final int YEH = 45; public static final int YEH_BARREE = 46; public static final int YEH_WITH_TAIL = 47; public static final int YUDH = 48; public static final int YUDH_HE = 49; public static final int ZAIN = 50; public static final int ZHAIN = 53; }
/*     */   public static abstract interface JoiningType { public static final int DUAL_JOINING = 2; public static final int JOIN_CAUSING = 1; public static final int LEFT_JOINING = 3; public static final int NON_JOINING = 0; public static final int RIGHT_JOINING = 4; public static final int TRANSPARENT = 5; }
/*     */   public static abstract interface DecompositionType { public static final int CANONICAL = 1; public static final int CIRCLE = 3; public static final int COMPAT = 2; public static final int FINAL = 4; public static final int FONT = 5; public static final int FRACTION = 6; public static final int INITIAL = 7; public static final int ISOLATED = 8; public static final int MEDIAL = 9; public static final int NARROW = 10; public static final int NOBREAK = 11; public static final int NONE = 0; public static final int SMALL = 12; public static final int SQUARE = 13; public static final int SUB = 14; public static final int SUPER = 15; public static final int VERTICAL = 16; public static final int WIDE = 17; }
/*     */   public static abstract interface EastAsianWidth { public static final int AMBIGUOUS = 1; public static final int FULLWIDTH = 3; public static final int HALFWIDTH = 2; public static final int NARROW = 4; public static final int NEUTRAL = 0; public static final int WIDE = 5; }
/*  18 */   public static final class UnicodeBlock extends Character.Subset { UnicodeBlock() { super();throw new RuntimeException("Stub!"); }
/*  19 */     public static UnicodeBlock getInstance(int id) { throw new RuntimeException("Stub!"); }
/*  20 */     public static UnicodeBlock of(int ch) { throw new RuntimeException("Stub!"); }
/*  21 */     public static final UnicodeBlock forName(String blockName) { throw new RuntimeException("Stub!"); }
/*  22 */     public int getID() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public static final int YI_SYLLABLES_ID = 72;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 576 */     public static final UnicodeBlock YI_SYLLABLES = null; public static final int YI_RADICALS_ID = 73; public static final UnicodeBlock YI_RADICALS = null; public static final int YIJING_HEXAGRAM_SYMBOLS_ID = 116; public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null; public static final int WARANG_CITI_ID = 252; public static final UnicodeBlock WARANG_CITI = null; public static final int VERTICAL_FORMS_ID = 145; public static final UnicodeBlock VERTICAL_FORMS = null; public static final int VEDIC_EXTENSIONS_ID = 175; public static final UnicodeBlock VEDIC_EXTENSIONS = null; public static final int VARIATION_SELECTORS_SUPPLEMENT_ID = 125; public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null; public static final int VARIATION_SELECTORS_ID = 108; public static final UnicodeBlock VARIATION_SELECTORS = null; public static final int VAI_ID = 159; public static final UnicodeBlock VAI = null; public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_ID = 33; public static final int UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED_ID = 173; public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null; public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null; public static final int UGARITIC_ID = 120; public static final UnicodeBlock UGARITIC = null; public static final int TRANSPORT_AND_MAP_SYMBOLS_ID = 207; public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS = null; public static final int TIRHUTA_ID = 251; public static final UnicodeBlock TIRHUTA = null; public static final int TIFINAGH_ID = 144; public static final UnicodeBlock TIFINAGH = null; public static final int TIBETAN_ID = 27; public static final UnicodeBlock TIBETAN = null; public static final int THAI_ID = 25; public static final UnicodeBlock THAI = null; public static final int THAANA_ID = 14; public static final UnicodeBlock THAANA = null; public static final int TELUGU_ID = 21; public static final UnicodeBlock TELUGU = null; public static final int TANGUT_ID = 272; public static final int TANGUT_COMPONENTS_ID = 273; public static final UnicodeBlock TANGUT_COMPONENTS = null; public static final UnicodeBlock TANGUT = null; public static final int TAMIL_ID = 20; public static final UnicodeBlock TAMIL = null; public static final int TAKRI_ID = 220; public static final UnicodeBlock TAKRI = null; public static final int TAI_XUAN_JING_SYMBOLS_ID = 124; public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS = null; public static final int TAI_VIET_ID = 183; public static final UnicodeBlock TAI_VIET = null; public static final int TAI_THAM_ID = 174; public static final UnicodeBlock TAI_THAM = null; public static final int TAI_LE_ID = 112; public static final UnicodeBlock TAI_LE = null; public static final int TAGS_ID = 96; public static final UnicodeBlock TAGS = null; public static final int TAGBANWA_ID = 101; public static final UnicodeBlock TAGBANWA = null; public static final int TAGALOG_ID = 98; public static final UnicodeBlock TAGALOG = null; public static final int SYRIAC_ID = 13; public static final UnicodeBlock SYRIAC = null; public static final int SYLOTI_NAGRI_ID = 143; public static final UnicodeBlock SYLOTI_NAGRI = null; public static final int SUTTON_SIGNWRITING_ID = 262; public static final UnicodeBlock SUTTON_SIGNWRITING = null; public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_B_ID = 110; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null; public static final int SUPPLEMENTARY_PRIVATE_USE_AREA_A_ID = 109; public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null; public static final int SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS_ID = 261; public static final UnicodeBlock SUPPLEMENTAL_SYMBOLS_AND_PICTOGRAPHS = null; public static final int SUPPLEMENTAL_PUNCTUATION_ID = 142; public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION = null; public static final int SUPPLEMENTAL_MATHEMATICAL_OPERATORS_ID = 106; public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null; public static final int SUPPLEMENTAL_ARROWS_C_ID = 250; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_C = null; public static final int SUPPLEMENTAL_ARROWS_B_ID = 104; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B = null; public static final int SUPPLEMENTAL_ARROWS_A_ID = 103; public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A = null; public static final int SUPERSCRIPTS_AND_SUBSCRIPTS_ID = 41; public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null; public static final int SUNDANESE_SUPPLEMENT_ID = 219; public static final UnicodeBlock SUNDANESE_SUPPLEMENT = null; public static final int SUNDANESE_ID = 155; public static final UnicodeBlock SUNDANESE = null; public static final int SPECIALS_ID = 86; public static final UnicodeBlock SPECIALS = null; public static final int SPACING_MODIFIER_LETTERS_ID = 6; public static final UnicodeBlock SPACING_MODIFIER_LETTERS = null; public static final int SORA_SOMPENG_ID = 218; public static final UnicodeBlock SORA_SOMPENG = null; public static final int SMALL_FORM_VARIANTS_ID = 84; public static final UnicodeBlock SMALL_FORM_VARIANTS = null; public static final int SINHALA_ID = 24; public static final int SINHALA_ARCHAIC_NUMBERS_ID = 249; public static final UnicodeBlock SINHALA_ARCHAIC_NUMBERS = null; public static final UnicodeBlock SINHALA = null; public static final int SIDDHAM_ID = 248; public static final UnicodeBlock SIDDHAM = null; public static final int SHORTHAND_FORMAT_CONTROLS_ID = 247; public static final UnicodeBlock SHORTHAND_FORMAT_CONTROLS = null; public static final int SHAVIAN_ID = 121; public static final UnicodeBlock SHAVIAN = null; public static final int SHARADA_ID = 217; public static final UnicodeBlock SHARADA = null; public static final int SAURASHTRA_ID = 161; public static final UnicodeBlock SAURASHTRA = null; public static final int SAMARITAN_ID = 172; public static final UnicodeBlock SAMARITAN = null; public static final int RUNIC_ID = 35; public static final UnicodeBlock RUNIC = null; public static final int RUMI_NUMERAL_SYMBOLS_ID = 192; public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS = null; public static final int REJANG_ID = 163; public static final UnicodeBlock REJANG = null; public static final int PSALTER_PAHLAVI_ID = 246; public static final UnicodeBlock PSALTER_PAHLAVI = null; public static final int PRIVATE_USE_ID = 78; public static final int PRIVATE_USE_AREA_ID = 78; public static final UnicodeBlock PRIVATE_USE_AREA = null; public static final UnicodeBlock PRIVATE_USE = null; public static final int PLAYING_CARDS_ID = 204; public static final UnicodeBlock PLAYING_CARDS = null; public static final int PHONETIC_EXTENSIONS_SUPPLEMENT_ID = 141; public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT = null; public static final int PHONETIC_EXTENSIONS_ID = 114; public static final UnicodeBlock PHONETIC_EXTENSIONS = null; public static final int PHOENICIAN_ID = 151; public static final UnicodeBlock PHOENICIAN = null; public static final int PHAISTOS_DISC_ID = 166; public static final UnicodeBlock PHAISTOS_DISC = null; public static final int PHAGS_PA_ID = 150; public static final UnicodeBlock PHAGS_PA = null; public static final int PAU_CIN_HAU_ID = 245; public static final UnicodeBlock PAU_CIN_HAU = null; public static final int PALMYRENE_ID = 244; public static final UnicodeBlock PALMYRENE = null; public static final int PAHAWH_HMONG_ID = 243; public static final UnicodeBlock PAHAWH_HMONG = null; public static final int OSMANYA_ID = 122; public static final UnicodeBlock OSMANYA = null; public static final int OSAGE_ID = 271; public static final UnicodeBlock OSAGE = null; public static final int ORNAMENTAL_DINGBATS_ID = 242; public static final UnicodeBlock ORNAMENTAL_DINGBATS = null; public static final int ORIYA_ID = 19; public static final UnicodeBlock ORIYA = null; public static final int OPTICAL_CHARACTER_RECOGNITION_ID = 50; public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null; public static final int OL_CHIKI_ID = 157; public static final UnicodeBlock OL_CHIKI = null; public static final int OLD_TURKIC_ID = 191; public static final UnicodeBlock OLD_TURKIC = null; public static final int OLD_SOUTH_ARABIAN_ID = 187; public static final UnicodeBlock OLD_SOUTH_ARABIAN = null; public static final int OLD_PERSIAN_ID = 140; public static final UnicodeBlock OLD_PERSIAN = null; public static final int OLD_PERMIC_ID = 241; public static final UnicodeBlock OLD_PERMIC = null; public static final int OLD_NORTH_ARABIAN_ID = 240; public static final UnicodeBlock OLD_NORTH_ARABIAN = null; public static final int OLD_ITALIC_ID = 88; public static final UnicodeBlock OLD_ITALIC = null; public static final int OLD_HUNGARIAN_ID = 260; public static final UnicodeBlock OLD_HUNGARIAN = null; public static final int OGHAM_ID = 34; public static final UnicodeBlock OGHAM = null; public static final int NUMBER_FORMS_ID = 45; public static final UnicodeBlock NUMBER_FORMS = null; public static final UnicodeBlock NO_BLOCK = null; public static final int NKO_ID = 146; public static final UnicodeBlock NKO = null; public static final int NEW_TAI_LUE_ID = 139; public static final UnicodeBlock NEW_TAI_LUE = null; public static final int NEWA_ID = 270; public static final UnicodeBlock NEWA = null; public static final int NABATAEAN_ID = 239; public static final UnicodeBlock NABATAEAN = null; public static final int MYANMAR_ID = 28; public static final int MYANMAR_EXTENDED_B_ID = 238; public static final UnicodeBlock MYANMAR_EXTENDED_B = null; public static final int MYANMAR_EXTENDED_A_ID = 182; public static final UnicodeBlock MYANMAR_EXTENDED_A = null; public static final UnicodeBlock MYANMAR = null; public static final int MUSICAL_SYMBOLS_ID = 92; public static final UnicodeBlock MUSICAL_SYMBOLS = null; public static final int MULTANI_ID = 259; public static final UnicodeBlock MULTANI = null; public static final int MRO_ID = 237; public static final UnicodeBlock MRO = null; public static final int MONGOLIAN_SUPPLEMENT_ID = 269; public static final UnicodeBlock MONGOLIAN_SUPPLEMENT = null; public static final int MONGOLIAN_ID = 37; public static final UnicodeBlock MONGOLIAN = null; public static final int MODI_ID = 236; public static final int MODIFIER_TONE_LETTERS_ID = 138; public static final UnicodeBlock MODIFIER_TONE_LETTERS = null; public static final UnicodeBlock MODI = null; public static final int MISCELLANEOUS_TECHNICAL_ID = 48; public static final UnicodeBlock MISCELLANEOUS_TECHNICAL = null; public static final int MISCELLANEOUS_SYMBOLS_ID = 55; public static final int MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS_ID = 205; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null; public static final int MISCELLANEOUS_SYMBOLS_AND_ARROWS_ID = 115; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null; public static final UnicodeBlock MISCELLANEOUS_SYMBOLS = null; public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B_ID = 105; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null; public static final int MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A_ID = 102; public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null; public static final int MIAO_ID = 216; public static final UnicodeBlock MIAO = null; public static final int MEROITIC_HIEROGLYPHS_ID = 215; public static final UnicodeBlock MEROITIC_HIEROGLYPHS = null; public static final int MEROITIC_CURSIVE_ID = 214; public static final UnicodeBlock MEROITIC_CURSIVE = null; public static final int MENDE_KIKAKUI_ID = 235; public static final UnicodeBlock MENDE_KIKAKUI = null; public static final int MEETEI_MAYEK_ID = 184; public static final int MEETEI_MAYEK_EXTENSIONS_ID = 213; public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS = null; public static final UnicodeBlock MEETEI_MAYEK = null; public static final int MATHEMATICAL_OPERATORS_ID = 47; public static final UnicodeBlock MATHEMATICAL_OPERATORS = null; public static final int MATHEMATICAL_ALPHANUMERIC_SYMBOLS_ID = 93; public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null; public static final int MARCHEN_ID = 268; public static final UnicodeBlock MARCHEN = null; public static final int MANICHAEAN_ID = 234; public static final UnicodeBlock MANICHAEAN = null; public static final int MANDAIC_ID = 198; public static final UnicodeBlock MANDAIC = null; public static final int MALAYALAM_ID = 23; public static final UnicodeBlock MALAYALAM = null; public static final int MAHJONG_TILES_ID = 170; public static final UnicodeBlock MAHJONG_TILES = null; public static final int MAHAJANI_ID = 233; public static final UnicodeBlock MAHAJANI = null; public static final int LYDIAN_ID = 169; public static final UnicodeBlock LYDIAN = null; public static final int LYCIAN_ID = 167; public static final UnicodeBlock LYCIAN = null; public static final int LOW_SURROGATES_ID = 77; public static final UnicodeBlock LOW_SURROGATES = null; public static final int LISU_ID = 176; public static final UnicodeBlock LISU = null; public static final int LINEAR_B_SYLLABARY_ID = 117; public static final UnicodeBlock LINEAR_B_SYLLABARY = null; public static final int LINEAR_B_IDEOGRAMS_ID = 118; public static final UnicodeBlock LINEAR_B_IDEOGRAMS = null; public static final int LINEAR_A_ID = 232; public static final UnicodeBlock LINEAR_A = null; public static final int LIMBU_ID = 111; public static final UnicodeBlock LIMBU = null; public static final int LETTERLIKE_SYMBOLS_ID = 44; public static final UnicodeBlock LETTERLIKE_SYMBOLS = null; public static final int LEPCHA_ID = 156; public static final UnicodeBlock LEPCHA = null; public static final int LATIN_EXTENDED_E_ID = 231; public static final UnicodeBlock LATIN_EXTENDED_E = null; public static final int LATIN_EXTENDED_D_ID = 149; public static final UnicodeBlock LATIN_EXTENDED_D = null; public static final int LATIN_EXTENDED_C_ID = 148; public static final UnicodeBlock LATIN_EXTENDED_C = null; public static final int LATIN_EXTENDED_B_ID = 4; public static final UnicodeBlock LATIN_EXTENDED_B = null; public static final int LATIN_EXTENDED_A_ID = 3; public static final int LATIN_EXTENDED_ADDITIONAL_ID = 38; public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null; public static final UnicodeBlock LATIN_EXTENDED_A = null; public static final int LATIN_1_SUPPLEMENT_ID = 2; public static final UnicodeBlock LATIN_1_SUPPLEMENT = null; public static final int LAO_ID = 26; public static final UnicodeBlock LAO = null; public static final int KHUDAWADI_ID = 230; public static final UnicodeBlock KHUDAWADI = null; public static final int KHOJKI_ID = 229; public static final UnicodeBlock KHOJKI = null; public static final int KHMER_SYMBOLS_ID = 113; public static final UnicodeBlock KHMER_SYMBOLS = null; public static final int KHMER_ID = 36; public static final UnicodeBlock KHMER = null; public static final int KHAROSHTHI_ID = 137; public static final UnicodeBlock KHAROSHTHI = null; public static final int KAYAH_LI_ID = 162; public static final UnicodeBlock KAYAH_LI = null; public static final int KATAKANA_PHONETIC_EXTENSIONS_ID = 107; public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null; public static final int KATAKANA_ID = 63; public static final UnicodeBlock KATAKANA = null; public static final int KANNADA_ID = 22; public static final UnicodeBlock KANNADA = null; public static final int KANGXI_RADICALS_ID = 59; public static final UnicodeBlock KANGXI_RADICALS = null; public static final int KANBUN_ID = 66; public static final UnicodeBlock KANBUN = null; public static final int KANA_SUPPLEMENT_ID = 203; public static final UnicodeBlock KANA_SUPPLEMENT = null; public static final int KAITHI_ID = 193; public static final UnicodeBlock KAITHI = null; public static final int JAVANESE_ID = 181; public static final UnicodeBlock JAVANESE = null; public static final int IPA_EXTENSIONS_ID = 5; public static final UnicodeBlock IPA_EXTENSIONS = null; public static final int INVALID_CODE_ID = -1; public static final UnicodeBlock INVALID_CODE = null; public static final int INSCRIPTIONAL_PARTHIAN_ID = 189; public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN = null; public static final int INSCRIPTIONAL_PAHLAVI_ID = 190; public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI = null; public static final int IMPERIAL_ARAMAIC_ID = 186; public static final UnicodeBlock IMPERIAL_ARAMAIC = null; public static final int IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION_ID = 267; public static final UnicodeBlock IDEOGRAPHIC_SYMBOLS_AND_PUNCTUATION = null; public static final int IDEOGRAPHIC_DESCRIPTION_CHARACTERS_ID = 60; public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null; public static final int HIRAGANA_ID = 62; public static final UnicodeBlock HIRAGANA = null; public static final int HIGH_SURROGATES_ID = 75; public static final UnicodeBlock HIGH_SURROGATES = null; public static final int HIGH_PRIVATE_USE_SURROGATES_ID = 76; public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null; public static final int HEBREW_ID = 11; public static final UnicodeBlock HEBREW = null; public static final int HATRAN_ID = 258; public static final UnicodeBlock HATRAN = null; public static final int HANUNOO_ID = 99; public static final UnicodeBlock HANUNOO = null; public static final int HANGUL_SYLLABLES_ID = 74; public static final UnicodeBlock HANGUL_SYLLABLES = null; public static final int HANGUL_JAMO_ID = 30; public static final int HANGUL_JAMO_EXTENDED_B_ID = 185; public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B = null; public static final int HANGUL_JAMO_EXTENDED_A_ID = 180; public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A = null; public static final UnicodeBlock HANGUL_JAMO = null; public static final int HANGUL_COMPATIBILITY_JAMO_ID = 65; public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null; public static final int HALFWIDTH_AND_FULLWIDTH_FORMS_ID = 87; public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null; public static final int GURMUKHI_ID = 17; public static final UnicodeBlock GURMUKHI = null; public static final int GUJARATI_ID = 18; public static final UnicodeBlock GUJARATI = null; public static final int GREEK_ID = 8; public static final int GREEK_EXTENDED_ID = 39; public static final UnicodeBlock GREEK_EXTENDED = null; public static final UnicodeBlock GREEK = null; public static final int GRANTHA_ID = 228; public static final UnicodeBlock GRANTHA = null; public static final int GOTHIC_ID = 89; public static final UnicodeBlock GOTHIC = null; public static final int GLAGOLITIC_SUPPLEMENT_ID = 266; public static final UnicodeBlock GLAGOLITIC_SUPPLEMENT = null; public static final int GLAGOLITIC_ID = 136; public static final UnicodeBlock GLAGOLITIC = null; public static final int GEORGIAN_SUPPLEMENT_ID = 135; public static final UnicodeBlock GEORGIAN_SUPPLEMENT = null; public static final int GEORGIAN_ID = 29; public static final UnicodeBlock GEORGIAN = null; public static final int GEOMETRIC_SHAPES_ID = 54; public static final int GEOMETRIC_SHAPES_EXTENDED_ID = 227; public static final UnicodeBlock GEOMETRIC_SHAPES_EXTENDED = null; public static final UnicodeBlock GEOMETRIC_SHAPES = null; public static final int GENERAL_PUNCTUATION_ID = 40; public static final UnicodeBlock GENERAL_PUNCTUATION = null; public static final int ETHIOPIC_SUPPLEMENT_ID = 134; public static final UnicodeBlock ETHIOPIC_SUPPLEMENT = null; public static final int ETHIOPIC_ID = 31; public static final int ETHIOPIC_EXTENDED_ID = 133; public static final int ETHIOPIC_EXTENDED_A_ID = 200; public static final UnicodeBlock ETHIOPIC_EXTENDED_A = null; public static final UnicodeBlock ETHIOPIC_EXTENDED = null; public static final UnicodeBlock ETHIOPIC = null; public static final int ENCLOSED_IDEOGRAPHIC_SUPPLEMENT_ID = 196; public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null; public static final int ENCLOSED_CJK_LETTERS_AND_MONTHS_ID = 68; public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null; public static final int ENCLOSED_ALPHANUMERIC_SUPPLEMENT_ID = 195; public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null; public static final int ENCLOSED_ALPHANUMERICS_ID = 51; public static final UnicodeBlock ENCLOSED_ALPHANUMERICS = null; public static final int EMOTICONS_ID = 206; public static final UnicodeBlock EMOTICONS = null; public static final int ELBASAN_ID = 226; public static final UnicodeBlock ELBASAN = null; public static final int EGYPTIAN_HIEROGLYPHS_ID = 194; public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS = null; public static final int EARLY_DYNASTIC_CUNEIFORM_ID = 257; public static final UnicodeBlock EARLY_DYNASTIC_CUNEIFORM = null; public static final int DUPLOYAN_ID = 225; public static final UnicodeBlock DUPLOYAN = null; public static final int DOMINO_TILES_ID = 171; public static final UnicodeBlock DOMINO_TILES = null; public static final int DINGBATS_ID = 56; public static final UnicodeBlock DINGBATS = null; public static final int DEVANAGARI_ID = 15; public static final int DEVANAGARI_EXTENDED_ID = 179; public static final UnicodeBlock DEVANAGARI_EXTENDED = null; public static final UnicodeBlock DEVANAGARI = null; public static final int DESERET_ID = 90; public static final UnicodeBlock DESERET = null; public static final int CYRILLIC_SUPPLEMENT_ID = 97; public static final int CYRILLIC_SUPPLEMENTARY_ID = 97; public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY = null; public static final UnicodeBlock CYRILLIC_SUPPLEMENT = null; public static final int CYRILLIC_ID = 9; public static final int CYRILLIC_EXTENDED_C_ID = 265; public static final UnicodeBlock CYRILLIC_EXTENDED_C = null; public static final int CYRILLIC_EXTENDED_B_ID = 160; public static final UnicodeBlock CYRILLIC_EXTENDED_B = null; public static final int CYRILLIC_EXTENDED_A_ID = 158; public static final UnicodeBlock CYRILLIC_EXTENDED_A = null; public static final UnicodeBlock CYRILLIC = null; public static final int CYPRIOT_SYLLABARY_ID = 123; public static final UnicodeBlock CYPRIOT_SYLLABARY = null; public static final int CURRENCY_SYMBOLS_ID = 42; public static final UnicodeBlock CURRENCY_SYMBOLS = null; public static final int CUNEIFORM_NUMBERS_AND_PUNCTUATION_ID = 153; public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION = null; public static final int CUNEIFORM_ID = 152; public static final UnicodeBlock CUNEIFORM = null; public static final int COUNTING_ROD_NUMERALS_ID = 154; public static final UnicodeBlock COUNTING_ROD_NUMERALS = null; public static final int COPTIC_ID = 132; public static final int COPTIC_EPACT_NUMBERS_ID = 223; public static final UnicodeBlock COPTIC_EPACT_NUMBERS = null; public static final UnicodeBlock COPTIC = null; public static final int CONTROL_PICTURES_ID = 49; public static final UnicodeBlock CONTROL_PICTURES = null; public static final int COMMON_INDIC_NUMBER_FORMS_ID = 178; public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS = null; public static final int COMBINING_MARKS_FOR_SYMBOLS_ID = 43; public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null; public static final int COMBINING_HALF_MARKS_ID = 82; public static final UnicodeBlock COMBINING_HALF_MARKS = null; public static final int COMBINING_DIACRITICAL_MARKS_SUPPLEMENT_ID = 131; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null; public static final int COMBINING_DIACRITICAL_MARKS_ID = 7; public static final int COMBINING_DIACRITICAL_MARKS_EXTENDED_ID = 224; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_EXTENDED = null; public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS = null; public static final int CJK_UNIFIED_IDEOGRAPHS_ID = 71; public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E_ID = 256; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_E = null; public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D_ID = 209; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null; public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C_ID = 197; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null; public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B_ID = 94; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null; public static final int CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A_ID = 70; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null; public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null; public static final int CJK_SYMBOLS_AND_PUNCTUATION_ID = 61; public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null; public static final int CJK_STROKES_ID = 130; public static final UnicodeBlock CJK_STROKES = null; public static final int CJK_RADICALS_SUPPLEMENT_ID = 58; public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT = null; public static final int CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT_ID = 95; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null; public static final int CJK_COMPATIBILITY_IDEOGRAPHS_ID = 79; public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null; public static final int CJK_COMPATIBILITY_ID = 69; public static final int CJK_COMPATIBILITY_FORMS_ID = 83; public static final UnicodeBlock CJK_COMPATIBILITY_FORMS = null; public static final UnicodeBlock CJK_COMPATIBILITY = null; public static final int CHEROKEE_SUPPLEMENT_ID = 255; public static final UnicodeBlock CHEROKEE_SUPPLEMENT = null; public static final int CHEROKEE_ID = 32; public static final UnicodeBlock CHEROKEE = null; public static final int CHAM_ID = 164; public static final UnicodeBlock CHAM = null; public static final int CHAKMA_ID = 212; public static final UnicodeBlock CHAKMA = null; public static final int CAUCASIAN_ALBANIAN_ID = 222; public static final UnicodeBlock CAUCASIAN_ALBANIAN = null; public static final int CARIAN_ID = 168; public static final UnicodeBlock CARIAN = null; public static final int BYZANTINE_MUSICAL_SYMBOLS_ID = 91; public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null; public static final int BUHID_ID = 100; public static final UnicodeBlock BUHID = null; public static final int BUGINESE_ID = 129; public static final UnicodeBlock BUGINESE = null; public static final int BRAILLE_PATTERNS_ID = 57; public static final UnicodeBlock BRAILLE_PATTERNS = null; public static final int BRAHMI_ID = 201; public static final UnicodeBlock BRAHMI = null; public static final int BOX_DRAWING_ID = 52; public static final UnicodeBlock BOX_DRAWING = null; public static final int BOPOMOFO_ID = 64; public static final int BOPOMOFO_EXTENDED_ID = 67; public static final UnicodeBlock BOPOMOFO_EXTENDED = null; public static final UnicodeBlock BOPOMOFO = null; public static final int BLOCK_ELEMENTS_ID = 53; public static final UnicodeBlock BLOCK_ELEMENTS = null; public static final int BHAIKSUKI_ID = 264; public static final UnicodeBlock BHAIKSUKI = null; public static final int BENGALI_ID = 16; public static final UnicodeBlock BENGALI = null; public static final int BATAK_ID = 199; public static final UnicodeBlock BATAK = null; public static final int BASSA_VAH_ID = 221; public static final UnicodeBlock BASSA_VAH = null; public static final int BASIC_LATIN_ID = 1; public static final UnicodeBlock BASIC_LATIN = null; public static final int BAMUM_SUPPLEMENT_ID = 202; public static final UnicodeBlock BAMUM_SUPPLEMENT = null; public static final int BAMUM_ID = 177; public static final UnicodeBlock BAMUM = null; public static final int BALINESE_ID = 147; public static final UnicodeBlock BALINESE = null; public static final int AVESTAN_ID = 188; public static final UnicodeBlock AVESTAN = null; public static final int ARROWS_ID = 46; public static final UnicodeBlock ARROWS = null; public static final int ARMENIAN_ID = 10; public static final UnicodeBlock ARMENIAN = null; public static final int ARABIC_SUPPLEMENT_ID = 128; public static final UnicodeBlock ARABIC_SUPPLEMENT = null; public static final int ARABIC_PRESENTATION_FORMS_B_ID = 85; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null; public static final int ARABIC_PRESENTATION_FORMS_A_ID = 81; public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null; public static final int ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS_ID = 211; public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null; public static final int ARABIC_ID = 12; public static final int ARABIC_EXTENDED_A_ID = 210; public static final UnicodeBlock ARABIC_EXTENDED_A = null; public static final UnicodeBlock ARABIC = null; public static final int ANCIENT_SYMBOLS_ID = 165; public static final UnicodeBlock ANCIENT_SYMBOLS = null; public static final int ANCIENT_GREEK_NUMBERS_ID = 127; public static final UnicodeBlock ANCIENT_GREEK_NUMBERS = null; public static final int ANCIENT_GREEK_MUSICAL_NOTATION_ID = 126; public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION = null; public static final int ANATOLIAN_HIEROGLYPHS_ID = 254; public static final UnicodeBlock ANATOLIAN_HIEROGLYPHS = null; public static final int ALPHABETIC_PRESENTATION_FORMS_ID = 80; public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null; public static final int ALCHEMICAL_SYMBOLS_ID = 208; public static final UnicodeBlock ALCHEMICAL_SYMBOLS = null; public static final int AHOM_ID = 253; public static final UnicodeBlock AHOM = null; public static final int AEGEAN_NUMBERS_ID = 119; public static final UnicodeBlock AEGEAN_NUMBERS = null; public static final int ADLAM_ID = 263; public static final UnicodeBlock ADLAM = null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int FOLD_CASE_DEFAULT = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MAX_CODE_POINT = 1114111;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MAX_HIGH_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MAX_LOW_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MAX_RADIX = 36;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MAX_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MAX_VALUE = 1114111;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MIN_CODE_POINT = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MIN_HIGH_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MIN_LOW_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MIN_RADIX = 2;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final char MIN_SURROGATE = '?';
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int MIN_VALUE = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final double NO_NUMERIC_VALUE = -1.23456789E8D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int REPLACEMENT_CHAR = 65533;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int SUPPLEMENTARY_MIN_VALUE = 65536;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int TITLECASE_NO_BREAK_ADJUSTMENT = 512;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int TITLECASE_NO_LOWERCASE = 256;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 843 */   UCharacter() { throw new RuntimeException("Stub!"); }
/* 844 */   public static int digit(int ch, int radix) { throw new RuntimeException("Stub!"); }
/* 845 */   public static int digit(int ch) { throw new RuntimeException("Stub!"); }
/* 846 */   public static int getNumericValue(int ch) { throw new RuntimeException("Stub!"); }
/* 847 */   public static double getUnicodeNumericValue(int ch) { throw new RuntimeException("Stub!"); }
/* 848 */   public static int getType(int ch) { throw new RuntimeException("Stub!"); }
/* 849 */   public static boolean isDefined(int ch) { throw new RuntimeException("Stub!"); }
/* 850 */   public static boolean isDigit(int ch) { throw new RuntimeException("Stub!"); }
/* 851 */   public static boolean isISOControl(int ch) { throw new RuntimeException("Stub!"); }
/* 852 */   public static boolean isLetter(int ch) { throw new RuntimeException("Stub!"); }
/* 853 */   public static boolean isLetterOrDigit(int ch) { throw new RuntimeException("Stub!"); }
/* 854 */   public static boolean isJavaIdentifierStart(int cp) { throw new RuntimeException("Stub!"); }
/* 855 */   public static boolean isJavaIdentifierPart(int cp) { throw new RuntimeException("Stub!"); }
/* 856 */   public static boolean isLowerCase(int ch) { throw new RuntimeException("Stub!"); }
/* 857 */   public static boolean isWhitespace(int ch) { throw new RuntimeException("Stub!"); }
/* 858 */   public static boolean isSpaceChar(int ch) { throw new RuntimeException("Stub!"); }
/* 859 */   public static boolean isTitleCase(int ch) { throw new RuntimeException("Stub!"); }
/* 860 */   public static boolean isUnicodeIdentifierPart(int ch) { throw new RuntimeException("Stub!"); }
/* 861 */   public static boolean isUnicodeIdentifierStart(int ch) { throw new RuntimeException("Stub!"); }
/* 862 */   public static boolean isIdentifierIgnorable(int ch) { throw new RuntimeException("Stub!"); }
/* 863 */   public static boolean isUpperCase(int ch) { throw new RuntimeException("Stub!"); }
/* 864 */   public static int toLowerCase(int ch) { throw new RuntimeException("Stub!"); }
/* 865 */   public static String toString(int ch) { throw new RuntimeException("Stub!"); }
/* 866 */   public static int toTitleCase(int ch) { throw new RuntimeException("Stub!"); }
/* 867 */   public static int toUpperCase(int ch) { throw new RuntimeException("Stub!"); }
/* 868 */   public static boolean isSupplementary(int ch) { throw new RuntimeException("Stub!"); }
/* 869 */   public static boolean isBMP(int ch) { throw new RuntimeException("Stub!"); }
/* 870 */   public static boolean isPrintable(int ch) { throw new RuntimeException("Stub!"); }
/* 871 */   public static boolean isBaseForm(int ch) { throw new RuntimeException("Stub!"); }
/* 872 */   public static int getDirection(int ch) { throw new RuntimeException("Stub!"); }
/* 873 */   public static boolean isMirrored(int ch) { throw new RuntimeException("Stub!"); }
/* 874 */   public static int getMirror(int ch) { throw new RuntimeException("Stub!"); }
/* 875 */   public static int getBidiPairedBracket(int c) { throw new RuntimeException("Stub!"); }
/* 876 */   public static int getCombiningClass(int ch) { throw new RuntimeException("Stub!"); }
/* 877 */   public static boolean isLegal(int ch) { throw new RuntimeException("Stub!"); }
/* 878 */   public static boolean isLegal(String str) { throw new RuntimeException("Stub!"); }
/* 879 */   public static android.icu.util.VersionInfo getUnicodeVersion() { throw new RuntimeException("Stub!"); }
/* 880 */   public static String getName(int ch) { throw new RuntimeException("Stub!"); }
/* 881 */   public static String getName(String s, String separator) { throw new RuntimeException("Stub!"); }
/* 882 */   public static String getExtendedName(int ch) { throw new RuntimeException("Stub!"); }
/* 883 */   public static String getNameAlias(int ch) { throw new RuntimeException("Stub!"); }
/* 884 */   public static int getCharFromName(String name) { throw new RuntimeException("Stub!"); }
/* 885 */   public static int getCharFromExtendedName(String name) { throw new RuntimeException("Stub!"); }
/* 886 */   public static int getCharFromNameAlias(String name) { throw new RuntimeException("Stub!"); }
/* 887 */   public static String getPropertyName(int property, int nameChoice) { throw new RuntimeException("Stub!"); }
/* 888 */   public static int getPropertyEnum(CharSequence propertyAlias) { throw new RuntimeException("Stub!"); }
/* 889 */   public static String getPropertyValueName(int property, int value, int nameChoice) { throw new RuntimeException("Stub!"); }
/* 890 */   public static int getPropertyValueEnum(int property, CharSequence valueAlias) { throw new RuntimeException("Stub!"); }
/* 891 */   public static int getCodePoint(char lead, char trail) { throw new RuntimeException("Stub!"); }
/* 892 */   public static int getCodePoint(char char16) { throw new RuntimeException("Stub!"); }
/* 893 */   public static String toUpperCase(String str) { throw new RuntimeException("Stub!"); }
/* 894 */   public static String toLowerCase(String str) { throw new RuntimeException("Stub!"); }
/* 895 */   public static String toTitleCase(String str, BreakIterator breakiter) { throw new RuntimeException("Stub!"); }
/* 896 */   public static String toUpperCase(java.util.Locale locale, String str) { throw new RuntimeException("Stub!"); }
/* 897 */   public static String toUpperCase(android.icu.util.ULocale locale, String str) { throw new RuntimeException("Stub!"); }
/* 898 */   public static String toLowerCase(java.util.Locale locale, String str) { throw new RuntimeException("Stub!"); }
/* 899 */   public static String toLowerCase(android.icu.util.ULocale locale, String str) { throw new RuntimeException("Stub!"); }
/* 900 */   public static String toTitleCase(java.util.Locale locale, String str, BreakIterator breakiter) { throw new RuntimeException("Stub!"); }
/* 901 */   public static String toTitleCase(android.icu.util.ULocale locale, String str, BreakIterator titleIter) { throw new RuntimeException("Stub!"); }
/* 902 */   public static String toTitleCase(android.icu.util.ULocale locale, String str, BreakIterator titleIter, int options) { throw new RuntimeException("Stub!"); }
/* 903 */   public static String toTitleCase(java.util.Locale locale, String str, BreakIterator titleIter, int options) { throw new RuntimeException("Stub!"); }
/* 904 */   public static int foldCase(int ch, boolean defaultmapping) { throw new RuntimeException("Stub!"); }
/* 905 */   public static String foldCase(String str, boolean defaultmapping) { throw new RuntimeException("Stub!"); }
/* 906 */   public static int foldCase(int ch, int options) { throw new RuntimeException("Stub!"); }
/* 907 */   public static final String foldCase(String str, int options) { throw new RuntimeException("Stub!"); }
/* 908 */   public static int getHanNumericValue(int ch) { throw new RuntimeException("Stub!"); }
/* 909 */   public static android.icu.util.RangeValueIterator getTypeIterator() { throw new RuntimeException("Stub!"); }
/* 910 */   public static android.icu.util.ValueIterator getNameIterator() { throw new RuntimeException("Stub!"); }
/* 911 */   public static android.icu.util.ValueIterator getExtendedNameIterator() { throw new RuntimeException("Stub!"); }
/* 912 */   public static android.icu.util.VersionInfo getAge(int ch) { throw new RuntimeException("Stub!"); }
/* 913 */   public static boolean hasBinaryProperty(int ch, int property) { throw new RuntimeException("Stub!"); }
/* 914 */   public static boolean isUAlphabetic(int ch) { throw new RuntimeException("Stub!"); }
/* 915 */   public static boolean isULowercase(int ch) { throw new RuntimeException("Stub!"); }
/* 916 */   public static boolean isUUppercase(int ch) { throw new RuntimeException("Stub!"); }
/* 917 */   public static boolean isUWhiteSpace(int ch) { throw new RuntimeException("Stub!"); }
/* 918 */   public static int getIntPropertyValue(int ch, int type) { throw new RuntimeException("Stub!"); }
/* 919 */   public static int getIntPropertyMinValue(int type) { throw new RuntimeException("Stub!"); }
/* 920 */   public static int getIntPropertyMaxValue(int type) { throw new RuntimeException("Stub!"); }
/* 921 */   public static char forDigit(int digit, int radix) { throw new RuntimeException("Stub!"); }
/* 922 */   public static final boolean isValidCodePoint(int cp) { throw new RuntimeException("Stub!"); }
/* 923 */   public static final boolean isSupplementaryCodePoint(int cp) { throw new RuntimeException("Stub!"); }
/* 924 */   public static boolean isHighSurrogate(char ch) { throw new RuntimeException("Stub!"); }
/* 925 */   public static boolean isLowSurrogate(char ch) { throw new RuntimeException("Stub!"); }
/* 926 */   public static final boolean isSurrogatePair(char high, char low) { throw new RuntimeException("Stub!"); }
/* 927 */   public static int charCount(int cp) { throw new RuntimeException("Stub!"); }
/* 928 */   public static final int toCodePoint(char high, char low) { throw new RuntimeException("Stub!"); }
/* 929 */   public static final int codePointAt(CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
/* 930 */   public static final int codePointAt(char[] text, int index) { throw new RuntimeException("Stub!"); }
/* 931 */   public static final int codePointAt(char[] text, int index, int limit) { throw new RuntimeException("Stub!"); }
/* 932 */   public static final int codePointBefore(CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
/* 933 */   public static final int codePointBefore(char[] text, int index) { throw new RuntimeException("Stub!"); }
/* 934 */   public static final int codePointBefore(char[] text, int index, int limit) { throw new RuntimeException("Stub!"); }
/* 935 */   public static final int toChars(int cp, char[] dst, int dstIndex) { throw new RuntimeException("Stub!"); }
/* 936 */   public static final char[] toChars(int cp) { throw new RuntimeException("Stub!"); }
/* 937 */   public static byte getDirectionality(int cp) { throw new RuntimeException("Stub!"); }
/* 938 */   public static int codePointCount(CharSequence text, int start, int limit) { throw new RuntimeException("Stub!"); }
/* 939 */   public static int codePointCount(char[] text, int start, int limit) { throw new RuntimeException("Stub!"); }
/* 940 */   public static int offsetByCodePoints(CharSequence text, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/* 941 */   public static int offsetByCodePoints(char[] text, int start, int count, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\lang\UCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */