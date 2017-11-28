/*    */ package android.telephony;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.text.Editable;
/*    */ import android.text.Spannable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PhoneNumberUtils
/*    */ {
/*    */   public static final int FORMAT_JAPAN = 2;
/*    */   public static final int FORMAT_NANP = 1;
/*    */   public static final int FORMAT_UNKNOWN = 0;
/*    */   public static final char PAUSE = ',';
/*    */   public static final int TOA_International = 145;
/*    */   public static final int TOA_Unknown = 129;
/*    */   public static final char WAIT = ';';
/*    */   public static final char WILD = 'N';
/*    */   
/* 20 */   public PhoneNumberUtils() { throw new RuntimeException("Stub!"); }
/* 21 */   public static boolean isISODigit(char c) { throw new RuntimeException("Stub!"); }
/* 22 */   public static final boolean is12Key(char c) { throw new RuntimeException("Stub!"); }
/* 23 */   public static final boolean isDialable(char c) { throw new RuntimeException("Stub!"); }
/* 24 */   public static final boolean isReallyDialable(char c) { throw new RuntimeException("Stub!"); }
/* 25 */   public static final boolean isNonSeparator(char c) { throw new RuntimeException("Stub!"); }
/* 26 */   public static final boolean isStartsPostDial(char c) { throw new RuntimeException("Stub!"); }
/* 27 */   public static String getNumberFromIntent(android.content.Intent intent, Context context) { throw new RuntimeException("Stub!"); }
/* 28 */   public static String extractNetworkPortion(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 29 */   public static String stripSeparators(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 30 */   public static String extractPostDialPortion(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 31 */   public static boolean compare(String a, String b) { throw new RuntimeException("Stub!"); }
/* 32 */   public static boolean compare(Context context, String a, String b) { throw new RuntimeException("Stub!"); }
/* 33 */   public static String toCallerIDMinMatch(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 34 */   public static String getStrippedReversed(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 35 */   public static String stringFromStringAndTOA(String s, int TOA) { throw new RuntimeException("Stub!"); }
/* 36 */   public static int toaFromString(String s) { throw new RuntimeException("Stub!"); }
/* 37 */   public static String calledPartyBCDToString(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 38 */   public static String calledPartyBCDFragmentToString(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 39 */   public static boolean isWellFormedSmsAddress(String address) { throw new RuntimeException("Stub!"); }
/* 40 */   public static boolean isGlobalPhoneNumber(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 41 */   public static byte[] networkPortionToCalledPartyBCD(String s) { throw new RuntimeException("Stub!"); }
/* 42 */   public static byte[] networkPortionToCalledPartyBCDWithLength(String s) { throw new RuntimeException("Stub!"); }
/* 43 */   public static byte[] numberToCalledPartyBCD(String number) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public static String formatNumber(String source) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 47 */   public static int getFormatTypeForLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 49 */   public static void formatNumber(Editable text, int defaultFormattingType) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public static void formatNanpNumber(Editable text) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 53 */   public static void formatJapaneseNumber(Editable text) { throw new RuntimeException("Stub!"); }
/* 54 */   public static String formatNumberToE164(String phoneNumber, String defaultCountryIso) { throw new RuntimeException("Stub!"); }
/* 55 */   public static String formatNumberToRFC3966(String phoneNumber, String defaultCountryIso) { throw new RuntimeException("Stub!"); }
/* 56 */   public static String formatNumber(String phoneNumber, String defaultCountryIso) { throw new RuntimeException("Stub!"); }
/* 57 */   public static String formatNumber(String phoneNumber, String phoneNumberE164, String defaultCountryIso) { throw new RuntimeException("Stub!"); }
/* 58 */   public static String normalizeNumber(String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 59 */   public static String replaceUnicodeDigits(String number) { throw new RuntimeException("Stub!"); }
/* 60 */   public static boolean isEmergencyNumber(String number) { throw new RuntimeException("Stub!"); }
/* 61 */   public static boolean isLocalEmergencyNumber(Context context, String number) { throw new RuntimeException("Stub!"); }
/* 62 */   public static boolean isVoiceMailNumber(String number) { throw new RuntimeException("Stub!"); }
/* 63 */   public static String convertKeypadLettersToDigits(String input) { throw new RuntimeException("Stub!"); }
/* 64 */   public static CharSequence createTtsSpannable(CharSequence phoneNumber) { throw new RuntimeException("Stub!"); }
/* 65 */   public static void addTtsSpan(Spannable s, int start, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 66 */   public static android.text.style.TtsSpan createTtsSpan(String phoneNumberString) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\PhoneNumberUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */