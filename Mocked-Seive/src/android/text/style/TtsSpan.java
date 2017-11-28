/*     */ package android.text.style;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ 
/*     */ public class TtsSpan implements android.text.ParcelableSpan { public static final String ANIMACY_ANIMATE = "android.animate";
/*     */   public static final String ANIMACY_INANIMATE = "android.inanimate";
/*     */   public static final String ARG_ANIMACY = "android.arg.animacy";
/*     */   public static final String ARG_CASE = "android.arg.case";
/*     */   public static final String ARG_COUNTRY_CODE = "android.arg.country_code";
/*     */   public static final String ARG_CURRENCY = "android.arg.money";
/*     */   public static final String ARG_DAY = "android.arg.day";
/*     */   public static final String ARG_DENOMINATOR = "android.arg.denominator";
/*     */   public static final String ARG_DIGITS = "android.arg.digits";
/*     */   public static final String ARG_DOMAIN = "android.arg.domain";
/*     */   public static final String ARG_EXTENSION = "android.arg.extension";
/*     */   public static final String ARG_FRACTIONAL_PART = "android.arg.fractional_part";
/*     */   public static final String ARG_FRAGMENT_ID = "android.arg.fragment_id";
/*     */   public static final String ARG_GENDER = "android.arg.gender";
/*     */   public static final String ARG_HOURS = "android.arg.hours";
/*     */   public static final String ARG_INTEGER_PART = "android.arg.integer_part";
/*     */   public static final String ARG_MINUTES = "android.arg.minutes";
/*     */   public static final String ARG_MONTH = "android.arg.month"; public static final String ARG_MULTIPLICITY = "android.arg.multiplicity"; public static final String ARG_NUMBER = "android.arg.number";
/*  23 */   public static class Builder<C extends Builder<?>> { public Builder(String type) { throw new RuntimeException("Stub!"); }
/*  24 */     public TtsSpan build() { throw new RuntimeException("Stub!"); }
/*     */     
/*  26 */     public C setStringArgument(String arg, String value) { throw new RuntimeException("Stub!"); }
/*     */     
/*  28 */     public C setIntArgument(String arg, int value) { throw new RuntimeException("Stub!"); }
/*     */     
/*  30 */     public C setLongArgument(String arg, long value) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String ARG_NUMBER_PARTS = "android.arg.number_parts";
/*     */   public static final String ARG_NUMERATOR = "android.arg.numerator";
/*     */   public static final String ARG_PASSWORD = "android.arg.password"; public static final String ARG_PATH = "android.arg.path"; public static final String ARG_PORT = "android.arg.port"; public static final String ARG_PROTOCOL = "android.arg.protocol"; public static final String ARG_QUANTITY = "android.arg.quantity"; public static final String ARG_QUERY_STRING = "android.arg.query_string"; public static final String ARG_TEXT = "android.arg.text"; public static final String ARG_UNIT = "android.arg.unit";
/*  35 */   public static class SemioticClassBuilder<C extends SemioticClassBuilder<?>> extends TtsSpan.Builder<C> { public SemioticClassBuilder(String type) { super();throw new RuntimeException("Stub!"); }
/*  36 */     public C setGender(String gender) { throw new RuntimeException("Stub!"); }
/*  37 */     public C setAnimacy(String animacy) { throw new RuntimeException("Stub!"); }
/*  38 */     public C setMultiplicity(String multiplicity) { throw new RuntimeException("Stub!"); }
/*  39 */     public C setCase(String grammaticalCase) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String ARG_USERNAME = "android.arg.username";
/*     */   public static final String ARG_VERBATIM = "android.arg.verbatim";
/*     */   public static final String ARG_WEEKDAY = "android.arg.weekday"; public static final String ARG_YEAR = "android.arg.year"; public static final String CASE_ABLATIVE = "android.ablative";
/*  44 */   public static class TextBuilder extends TtsSpan.SemioticClassBuilder<TextBuilder> { public TextBuilder() { super();throw new RuntimeException("Stub!"); }
/*  45 */     public TextBuilder(String text) { super();throw new RuntimeException("Stub!"); }
/*  46 */     public TextBuilder setText(String text) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String CASE_ACCUSATIVE = "android.accusative";
/*     */   public static final String CASE_DATIVE = "android.dative";
/*     */   public static final String CASE_GENITIVE = "android.genitive"; public static final String CASE_INSTRUMENTAL = "android.instrumental"; public static final String CASE_LOCATIVE = "android.locative";
/*  51 */   public static class CardinalBuilder extends TtsSpan.SemioticClassBuilder<CardinalBuilder> { public CardinalBuilder() { super();throw new RuntimeException("Stub!"); }
/*  52 */     public CardinalBuilder(long number) { super();throw new RuntimeException("Stub!"); }
/*  53 */     public CardinalBuilder(String number) { super();throw new RuntimeException("Stub!"); }
/*  54 */     public CardinalBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
/*  55 */     public CardinalBuilder setNumber(String number) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String CASE_NOMINATIVE = "android.nominative";
/*     */   public static final String CASE_VOCATIVE = "android.vocative";
/*     */   public static final String GENDER_FEMALE = "android.female"; public static final String GENDER_MALE = "android.male"; public static final String GENDER_NEUTRAL = "android.neutral"; public static final int MONTH_APRIL = 3;
/*  60 */   public static class OrdinalBuilder extends TtsSpan.SemioticClassBuilder<OrdinalBuilder> { public OrdinalBuilder() { super();throw new RuntimeException("Stub!"); }
/*  61 */     public OrdinalBuilder(long number) { super();throw new RuntimeException("Stub!"); }
/*  62 */     public OrdinalBuilder(String number) { super();throw new RuntimeException("Stub!"); }
/*  63 */     public OrdinalBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
/*  64 */     public OrdinalBuilder setNumber(String number) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final int MONTH_AUGUST = 7;
/*     */   public static final int MONTH_DECEMBER = 11;
/*     */   public static final int MONTH_FEBRUARY = 1; public static final int MONTH_JANUARY = 0; public static final int MONTH_JULY = 6; public static final int MONTH_JUNE = 5; public static final int MONTH_MARCH = 2;
/*  69 */   public static class DecimalBuilder extends TtsSpan.SemioticClassBuilder<DecimalBuilder> { public DecimalBuilder() { super();throw new RuntimeException("Stub!"); }
/*  70 */     public DecimalBuilder(double number, int minimumFractionDigits, int maximumFractionDigits) { super();throw new RuntimeException("Stub!"); }
/*  71 */     public DecimalBuilder(String integerPart, String fractionalPart) { super();throw new RuntimeException("Stub!"); }
/*  72 */     public DecimalBuilder setArgumentsFromDouble(double number, int minimumFractionDigits, int maximumFractionDigits) { throw new RuntimeException("Stub!"); }
/*  73 */     public DecimalBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
/*  74 */     public DecimalBuilder setIntegerPart(String integerPart) { throw new RuntimeException("Stub!"); }
/*  75 */     public DecimalBuilder setFractionalPart(String fractionalPart) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final int MONTH_MAY = 4;
/*     */   public static final int MONTH_NOVEMBER = 10;
/*     */   public static final int MONTH_OCTOBER = 9; public static final int MONTH_SEPTEMBER = 8; public static final String MULTIPLICITY_DUAL = "android.dual"; public static final String MULTIPLICITY_PLURAL = "android.plural"; public static final String MULTIPLICITY_SINGLE = "android.single"; public static final String TYPE_CARDINAL = "android.type.cardinal"; public static final String TYPE_DATE = "android.type.date"; public static final String TYPE_DECIMAL = "android.type.decimal"; public static final String TYPE_DIGITS = "android.type.digits"; public static final String TYPE_ELECTRONIC = "android.type.electronic"; public static final String TYPE_FRACTION = "android.type.fraction"; public static final String TYPE_MEASURE = "android.type.measure"; public static final String TYPE_MONEY = "android.type.money"; public static final String TYPE_ORDINAL = "android.type.ordinal"; public static final String TYPE_TELEPHONE = "android.type.telephone";
/*  80 */   public static class FractionBuilder extends TtsSpan.SemioticClassBuilder<FractionBuilder> { public FractionBuilder() { super();throw new RuntimeException("Stub!"); }
/*  81 */     public FractionBuilder(long integerPart, long numerator, long denominator) { super();throw new RuntimeException("Stub!"); }
/*  82 */     public FractionBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
/*  83 */     public FractionBuilder setIntegerPart(String integerPart) { throw new RuntimeException("Stub!"); }
/*  84 */     public FractionBuilder setNumerator(long numerator) { throw new RuntimeException("Stub!"); }
/*  85 */     public FractionBuilder setNumerator(String numerator) { throw new RuntimeException("Stub!"); }
/*  86 */     public FractionBuilder setDenominator(long denominator) { throw new RuntimeException("Stub!"); }
/*  87 */     public FractionBuilder setDenominator(String denominator) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final String TYPE_TEXT = "android.type.text";
/*     */   public static final String TYPE_TIME = "android.type.time";
/*     */   public static final String TYPE_VERBATIM = "android.type.verbatim";
/*  92 */   public static final int WEEKDAY_FRIDAY = 6; public static final int WEEKDAY_MONDAY = 2; public static final int WEEKDAY_SATURDAY = 7; public static final int WEEKDAY_SUNDAY = 1; public static final int WEEKDAY_THURSDAY = 5; public static final int WEEKDAY_TUESDAY = 3; public static final int WEEKDAY_WEDNESDAY = 4; public static class MeasureBuilder extends TtsSpan.SemioticClassBuilder<MeasureBuilder> { public MeasureBuilder() { super();throw new RuntimeException("Stub!"); }
/*  93 */     public MeasureBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
/*  94 */     public MeasureBuilder setNumber(String number) { throw new RuntimeException("Stub!"); }
/*  95 */     public MeasureBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
/*  96 */     public MeasureBuilder setIntegerPart(String integerPart) { throw new RuntimeException("Stub!"); }
/*  97 */     public MeasureBuilder setFractionalPart(String fractionalPart) { throw new RuntimeException("Stub!"); }
/*  98 */     public MeasureBuilder setNumerator(long numerator) { throw new RuntimeException("Stub!"); }
/*  99 */     public MeasureBuilder setNumerator(String numerator) { throw new RuntimeException("Stub!"); }
/* 100 */     public MeasureBuilder setDenominator(long denominator) { throw new RuntimeException("Stub!"); }
/* 101 */     public MeasureBuilder setDenominator(String denominator) { throw new RuntimeException("Stub!"); }
/* 102 */     public MeasureBuilder setUnit(String unit) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class TimeBuilder extends TtsSpan.SemioticClassBuilder<TimeBuilder> {
/*     */     public TimeBuilder() {
/* 107 */       super();throw new RuntimeException("Stub!"); }
/* 108 */     public TimeBuilder(int hours, int minutes) { super();throw new RuntimeException("Stub!"); }
/* 109 */     public TimeBuilder setHours(int hours) { throw new RuntimeException("Stub!"); }
/* 110 */     public TimeBuilder setMinutes(int minutes) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class DateBuilder extends TtsSpan.SemioticClassBuilder<DateBuilder> {
/*     */     public DateBuilder() {
/* 115 */       super();throw new RuntimeException("Stub!"); }
/* 116 */     public DateBuilder(Integer weekday, Integer day, Integer month, Integer year) { super();throw new RuntimeException("Stub!"); }
/* 117 */     public DateBuilder setWeekday(int weekday) { throw new RuntimeException("Stub!"); }
/* 118 */     public DateBuilder setDay(int day) { throw new RuntimeException("Stub!"); }
/* 119 */     public DateBuilder setMonth(int month) { throw new RuntimeException("Stub!"); }
/* 120 */     public DateBuilder setYear(int year) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class MoneyBuilder extends TtsSpan.SemioticClassBuilder<MoneyBuilder> {
/*     */     public MoneyBuilder() {
/* 125 */       super();throw new RuntimeException("Stub!"); }
/* 126 */     public MoneyBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
/* 127 */     public MoneyBuilder setIntegerPart(String integerPart) { throw new RuntimeException("Stub!"); }
/* 128 */     public MoneyBuilder setFractionalPart(String fractionalPart) { throw new RuntimeException("Stub!"); }
/* 129 */     public MoneyBuilder setCurrency(String currency) { throw new RuntimeException("Stub!"); }
/* 130 */     public MoneyBuilder setQuantity(String quantity) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class TelephoneBuilder extends TtsSpan.SemioticClassBuilder<TelephoneBuilder> {
/*     */     public TelephoneBuilder() {
/* 135 */       super();throw new RuntimeException("Stub!"); }
/* 136 */     public TelephoneBuilder(String numberParts) { super();throw new RuntimeException("Stub!"); }
/* 137 */     public TelephoneBuilder setCountryCode(String countryCode) { throw new RuntimeException("Stub!"); }
/* 138 */     public TelephoneBuilder setNumberParts(String numberParts) { throw new RuntimeException("Stub!"); }
/* 139 */     public TelephoneBuilder setExtension(String extension) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class ElectronicBuilder extends TtsSpan.SemioticClassBuilder<ElectronicBuilder> {
/*     */     public ElectronicBuilder() {
/* 144 */       super();throw new RuntimeException("Stub!"); }
/* 145 */     public ElectronicBuilder setEmailArguments(String username, String domain) { throw new RuntimeException("Stub!"); }
/* 146 */     public ElectronicBuilder setProtocol(String protocol) { throw new RuntimeException("Stub!"); }
/* 147 */     public ElectronicBuilder setUsername(String username) { throw new RuntimeException("Stub!"); }
/* 148 */     public ElectronicBuilder setPassword(String password) { throw new RuntimeException("Stub!"); }
/* 149 */     public ElectronicBuilder setDomain(String domain) { throw new RuntimeException("Stub!"); }
/* 150 */     public ElectronicBuilder setPort(int port) { throw new RuntimeException("Stub!"); }
/* 151 */     public ElectronicBuilder setPath(String path) { throw new RuntimeException("Stub!"); }
/* 152 */     public ElectronicBuilder setQueryString(String queryString) { throw new RuntimeException("Stub!"); }
/* 153 */     public ElectronicBuilder setFragmentId(String fragmentId) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class DigitsBuilder extends TtsSpan.SemioticClassBuilder<DigitsBuilder> {
/*     */     public DigitsBuilder() {
/* 158 */       super();throw new RuntimeException("Stub!"); }
/* 159 */     public DigitsBuilder(String digits) { super();throw new RuntimeException("Stub!"); }
/* 160 */     public DigitsBuilder setDigits(String digits) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class VerbatimBuilder extends TtsSpan.SemioticClassBuilder<VerbatimBuilder> {
/*     */     public VerbatimBuilder() {
/* 165 */       super();throw new RuntimeException("Stub!"); }
/* 166 */     public VerbatimBuilder(String verbatim) { super();throw new RuntimeException("Stub!"); }
/* 167 */     public VerbatimBuilder setVerbatim(String verbatim) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 169 */   public TtsSpan(String type, android.os.PersistableBundle args) { throw new RuntimeException("Stub!"); }
/* 170 */   public TtsSpan(Parcel src) { throw new RuntimeException("Stub!"); }
/* 171 */   public String getType() { throw new RuntimeException("Stub!"); }
/* 172 */   public android.os.PersistableBundle getArgs() { throw new RuntimeException("Stub!"); }
/* 173 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 174 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 175 */   public int getSpanTypeId() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\TtsSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */