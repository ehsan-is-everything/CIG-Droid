/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class LocaleDisplayNames
/*    */ {
/*    */   public static enum DialectHandling
/*    */   {
/* 15 */     DIALECT_NAMES, 
/* 16 */     STANDARD_NAMES;
/*    */     
/*    */     private DialectHandling() {} }
/*    */   public static class UiListItem { public final ULocale minimized; public final ULocale modified;
/* 20 */     public UiListItem(ULocale minimized, ULocale modified, String nameInDisplayLocale, String nameInSelf) { throw new RuntimeException("Stub!"); }
/* 21 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 22 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 23 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */     public static Comparator<UiListItem> getComparator(Comparator<Object> comparator, boolean inSelf) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public final String nameInDisplayLocale;
/*    */     public final String nameInSelf;
/*    */   }
/*    */   
/* 30 */   LocaleDisplayNames() { throw new RuntimeException("Stub!"); }
/* 31 */   public static LocaleDisplayNames getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 32 */   public static LocaleDisplayNames getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 33 */   public static LocaleDisplayNames getInstance(ULocale locale, DialectHandling dialectHandling) { throw new RuntimeException("Stub!"); }
/* 34 */   public static LocaleDisplayNames getInstance(ULocale locale, DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
/* 35 */   public static LocaleDisplayNames getInstance(Locale locale, DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ULocale getLocale();
/*    */   public abstract DialectHandling getDialectHandling();
/*    */   public abstract DisplayContext getContext(DisplayContext.Type paramType);
/*    */   public abstract String localeDisplayName(ULocale paramULocale);
/*    */   public abstract String localeDisplayName(Locale paramLocale);
/*    */   public abstract String localeDisplayName(String paramString);
/*    */   public abstract String languageDisplayName(String paramString);
/*    */   public abstract String scriptDisplayName(String paramString);
/*    */   public abstract String scriptDisplayName(int paramInt);
/*    */   public abstract String regionDisplayName(String paramString);
/*    */   public abstract String variantDisplayName(String paramString);
/*    */   public abstract String keyDisplayName(String paramString);
/*    */   public abstract String keyValueDisplayName(String paramString1, String paramString2);
/* 49 */   public List<UiListItem> getUiList(Set<ULocale> localeSet, boolean inSelf, Comparator<Object> collator) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract List<UiListItem> getUiListCompareWholeItems(Set<ULocale> paramSet, Comparator<UiListItem> paramComparator);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\LocaleDisplayNames.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */