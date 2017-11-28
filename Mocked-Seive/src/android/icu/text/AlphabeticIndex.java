/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AlphabeticIndex<V>
/*    */   implements Iterable<Bucket<V>>
/*    */ {
/*    */   public static final class ImmutableIndex<V>
/*    */     implements Iterable<AlphabeticIndex.Bucket<V>>
/*    */   {
/* 17 */     ImmutableIndex() { throw new RuntimeException("Stub!"); }
/* 18 */     public int getBucketCount() { throw new RuntimeException("Stub!"); }
/* 19 */     public int getBucketIndex(CharSequence name) { throw new RuntimeException("Stub!"); }
/* 20 */     public AlphabeticIndex.Bucket<V> getBucket(int index) { throw new RuntimeException("Stub!"); }
/* 21 */     public Iterator<AlphabeticIndex.Bucket<V>> iterator() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class Record<V> {
/* 25 */     Record() { throw new RuntimeException("Stub!"); }
/* 26 */     public CharSequence getName() { throw new RuntimeException("Stub!"); }
/* 27 */     public V getData() { throw new RuntimeException("Stub!"); }
/* 28 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class Bucket<V> implements Iterable<AlphabeticIndex.Record<V>>
/*    */   {
/*    */     public static enum LabelType
/*    */     {
/* 35 */       INFLOW, 
/* 36 */       NORMAL, 
/* 37 */       OVERFLOW, 
/* 38 */       UNDERFLOW;
/*    */       private LabelType() {} }
/* 40 */     Bucket() { throw new RuntimeException("Stub!"); }
/* 41 */     public String getLabel() { throw new RuntimeException("Stub!"); }
/* 42 */     public LabelType getLabelType() { throw new RuntimeException("Stub!"); }
/* 43 */     public int size() { throw new RuntimeException("Stub!"); }
/* 44 */     public Iterator<AlphabeticIndex.Record<V>> iterator() { throw new RuntimeException("Stub!"); }
/* 45 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 47 */   public AlphabeticIndex(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 48 */   public AlphabeticIndex(Locale locale) { throw new RuntimeException("Stub!"); }
/* 49 */   public AlphabeticIndex(RuleBasedCollator collator) { throw new RuntimeException("Stub!"); }
/* 50 */   public AlphabeticIndex<V> addLabels(UnicodeSet additions) { throw new RuntimeException("Stub!"); }
/* 51 */   public AlphabeticIndex<V> addLabels(ULocale... additions) { throw new RuntimeException("Stub!"); }
/* 52 */   public AlphabeticIndex<V> addLabels(Locale... additions) { throw new RuntimeException("Stub!"); }
/* 53 */   public AlphabeticIndex<V> setOverflowLabel(String overflowLabel) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getUnderflowLabel() { throw new RuntimeException("Stub!"); }
/* 55 */   public AlphabeticIndex<V> setUnderflowLabel(String underflowLabel) { throw new RuntimeException("Stub!"); }
/* 56 */   public String getOverflowLabel() { throw new RuntimeException("Stub!"); }
/* 57 */   public AlphabeticIndex<V> setInflowLabel(String inflowLabel) { throw new RuntimeException("Stub!"); }
/* 58 */   public String getInflowLabel() { throw new RuntimeException("Stub!"); }
/* 59 */   public int getMaxLabelCount() { throw new RuntimeException("Stub!"); }
/* 60 */   public AlphabeticIndex<V> setMaxLabelCount(int maxLabelCount) { throw new RuntimeException("Stub!"); }
/* 61 */   public ImmutableIndex<V> buildImmutableIndex() { throw new RuntimeException("Stub!"); }
/* 62 */   public List<String> getBucketLabels() { throw new RuntimeException("Stub!"); }
/* 63 */   public RuleBasedCollator getCollator() { throw new RuntimeException("Stub!"); }
/* 64 */   public AlphabeticIndex<V> addRecord(CharSequence name, V data) { throw new RuntimeException("Stub!"); }
/* 65 */   public int getBucketIndex(CharSequence name) { throw new RuntimeException("Stub!"); }
/* 66 */   public AlphabeticIndex<V> clearRecords() { throw new RuntimeException("Stub!"); }
/* 67 */   public int getBucketCount() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getRecordCount() { throw new RuntimeException("Stub!"); }
/* 69 */   public Iterator<Bucket<V>> iterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\AlphabeticIndex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */