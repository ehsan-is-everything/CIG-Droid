/*     */ package android.icu.text;
/*     */ 
/*     */ import java.text.ParsePosition;
/*     */ 
/*     */ public class UnicodeSet extends UnicodeFilter
/*     */   implements Iterable<String>, Comparable<UnicodeSet>, android.icu.util.Freezable<UnicodeSet>
/*     */ {
/*     */   public static final int MIN_VALUE = 0;
/*     */   public static final int MAX_VALUE = 1114111;
/*     */   public static final int IGNORE_SPACE = 1;
/*     */   
/*     */   public static class EntryRange
/*     */   {
/*     */     public int codepoint;
/*     */     public int codepointEnd;
/*     */     
/*  17 */     EntryRange() { throw new RuntimeException("Stub!"); }
/*  18 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */ 
/*     */   public static enum ComparisonStyle
/*     */   {
/*  24 */     LEXICOGRAPHIC, 
/*  25 */     LONGER_FIRST, 
/*  26 */     SHORTER_FIRST;
/*     */     
/*     */     private ComparisonStyle() {} }
/*     */   
/*  30 */   public static enum SpanCondition { CONDITION_COUNT, 
/*  31 */     CONTAINED, 
/*  32 */     NOT_CONTAINED, 
/*  33 */     SIMPLE;
/*     */     private SpanCondition() {} }
/*  35 */   public UnicodeSet() { throw new RuntimeException("Stub!"); }
/*  36 */   public UnicodeSet(UnicodeSet other) { throw new RuntimeException("Stub!"); }
/*  37 */   public UnicodeSet(int start, int end) { throw new RuntimeException("Stub!"); }
/*  38 */   public UnicodeSet(int... pairs) { throw new RuntimeException("Stub!"); }
/*  39 */   public UnicodeSet(String pattern) { throw new RuntimeException("Stub!"); }
/*  40 */   public UnicodeSet(String pattern, boolean ignoreWhitespace) { throw new RuntimeException("Stub!"); }
/*  41 */   public UnicodeSet(String pattern, int options) { throw new RuntimeException("Stub!"); }
/*  42 */   public UnicodeSet(String pattern, ParsePosition pos, SymbolTable symbols) { throw new RuntimeException("Stub!"); }
/*  43 */   public UnicodeSet(String pattern, ParsePosition pos, SymbolTable symbols, int options) { throw new RuntimeException("Stub!"); }
/*  44 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  45 */   public UnicodeSet set(int start, int end) { throw new RuntimeException("Stub!"); }
/*  46 */   public UnicodeSet set(UnicodeSet other) { throw new RuntimeException("Stub!"); }
/*  47 */   public final UnicodeSet applyPattern(String pattern) { throw new RuntimeException("Stub!"); }
/*  48 */   public UnicodeSet applyPattern(String pattern, boolean ignoreWhitespace) { throw new RuntimeException("Stub!"); }
/*  49 */   public UnicodeSet applyPattern(String pattern, int options) { throw new RuntimeException("Stub!"); }
/*  50 */   public String toPattern(boolean escapeUnprintable) { throw new RuntimeException("Stub!"); }
/*  51 */   public StringBuffer _generatePattern(StringBuffer result, boolean escapeUnprintable) { throw new RuntimeException("Stub!"); }
/*  52 */   public StringBuffer _generatePattern(StringBuffer result, boolean escapeUnprintable, boolean includeStrings) { throw new RuntimeException("Stub!"); }
/*  53 */   public int size() { throw new RuntimeException("Stub!"); }
/*  54 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean matchesIndexValue(int v) { throw new RuntimeException("Stub!"); }
/*  56 */   public int matches(Replaceable text, int[] offset, int limit, boolean incremental) { throw new RuntimeException("Stub!"); }
/*  57 */   public void addMatchSetTo(UnicodeSet toUnionTo) { throw new RuntimeException("Stub!"); }
/*  58 */   public int indexOf(int c) { throw new RuntimeException("Stub!"); }
/*  59 */   public int charAt(int index) { throw new RuntimeException("Stub!"); }
/*  60 */   public UnicodeSet add(int start, int end) { throw new RuntimeException("Stub!"); }
/*  61 */   public UnicodeSet addAll(int start, int end) { throw new RuntimeException("Stub!"); }
/*  62 */   public final UnicodeSet add(int c) { throw new RuntimeException("Stub!"); }
/*  63 */   public final UnicodeSet add(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  64 */   public final UnicodeSet addAll(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  65 */   public final UnicodeSet retainAll(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  66 */   public final UnicodeSet complementAll(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  67 */   public final UnicodeSet removeAll(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  68 */   public final UnicodeSet removeAllStrings() { throw new RuntimeException("Stub!"); }
/*  69 */   public static UnicodeSet from(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  70 */   public static UnicodeSet fromAll(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  71 */   public UnicodeSet retain(int start, int end) { throw new RuntimeException("Stub!"); }
/*  72 */   public final UnicodeSet retain(int c) { throw new RuntimeException("Stub!"); }
/*  73 */   public final UnicodeSet retain(CharSequence cs) { throw new RuntimeException("Stub!"); }
/*  74 */   public UnicodeSet remove(int start, int end) { throw new RuntimeException("Stub!"); }
/*  75 */   public final UnicodeSet remove(int c) { throw new RuntimeException("Stub!"); }
/*  76 */   public final UnicodeSet remove(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  77 */   public UnicodeSet complement(int start, int end) { throw new RuntimeException("Stub!"); }
/*  78 */   public final UnicodeSet complement(int c) { throw new RuntimeException("Stub!"); }
/*  79 */   public UnicodeSet complement() { throw new RuntimeException("Stub!"); }
/*  80 */   public final UnicodeSet complement(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  81 */   public boolean contains(int c) { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean contains(int start, int end) { throw new RuntimeException("Stub!"); }
/*  83 */   public final boolean contains(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean containsAll(UnicodeSet b) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean containsAll(String s) { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean containsNone(int start, int end) { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean containsNone(UnicodeSet b) { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean containsNone(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  89 */   public final boolean containsSome(int start, int end) { throw new RuntimeException("Stub!"); }
/*  90 */   public final boolean containsSome(UnicodeSet s) { throw new RuntimeException("Stub!"); }
/*  91 */   public final boolean containsSome(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  92 */   public UnicodeSet addAll(UnicodeSet c) { throw new RuntimeException("Stub!"); }
/*  93 */   public UnicodeSet retainAll(UnicodeSet c) { throw new RuntimeException("Stub!"); }
/*  94 */   public UnicodeSet removeAll(UnicodeSet c) { throw new RuntimeException("Stub!"); }
/*  95 */   public UnicodeSet complementAll(UnicodeSet c) { throw new RuntimeException("Stub!"); }
/*  96 */   public UnicodeSet clear() { throw new RuntimeException("Stub!"); }
/*  97 */   public int getRangeCount() { throw new RuntimeException("Stub!"); }
/*  98 */   public int getRangeStart(int index) { throw new RuntimeException("Stub!"); }
/*  99 */   public int getRangeEnd(int index) { throw new RuntimeException("Stub!"); }
/* 100 */   public UnicodeSet compact() { throw new RuntimeException("Stub!"); }
/* 101 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 102 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 103 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 104 */   public <T extends java.util.Collection<String>> T addAllTo(T target) { throw new RuntimeException("Stub!"); }
/* 105 */   public UnicodeSet add(Iterable<?> source) { throw new RuntimeException("Stub!"); }
/* 106 */   public UnicodeSet addAll(Iterable<?> source) { throw new RuntimeException("Stub!"); }
/* 107 */   public UnicodeSet applyIntPropertyValue(int prop, int value) { throw new RuntimeException("Stub!"); }
/* 108 */   public UnicodeSet applyPropertyAlias(String propertyAlias, String valueAlias) { throw new RuntimeException("Stub!"); }
/* 109 */   public UnicodeSet applyPropertyAlias(String propertyAlias, String valueAlias, SymbolTable symbols) { throw new RuntimeException("Stub!"); }
/* 110 */   public UnicodeSet closeOver(int attribute) { throw new RuntimeException("Stub!"); }
/* 111 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 112 */   public UnicodeSet freeze() { throw new RuntimeException("Stub!"); }
/* 113 */   public int span(CharSequence s, SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 114 */   public int span(CharSequence s, int start, SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 115 */   public int spanBack(CharSequence s, SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 116 */   public int spanBack(CharSequence s, int fromIndex, SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
/* 117 */   public UnicodeSet cloneAsThawed() { throw new RuntimeException("Stub!"); }
/* 118 */   public Iterable<EntryRange> ranges() { throw new RuntimeException("Stub!"); }
/* 119 */   public java.util.Iterator<String> iterator() { throw new RuntimeException("Stub!"); }
/* 120 */   public <T extends CharSequence> boolean containsAll(Iterable<T> collection) { throw new RuntimeException("Stub!"); }
/* 121 */   public <T extends CharSequence> boolean containsNone(Iterable<T> collection) { throw new RuntimeException("Stub!"); }
/* 122 */   public final <T extends CharSequence> boolean containsSome(Iterable<T> collection) { throw new RuntimeException("Stub!"); }
/*     */   
/* 124 */   public <T extends CharSequence> UnicodeSet addAll(T... collection) { throw new RuntimeException("Stub!"); }
/* 125 */   public <T extends CharSequence> UnicodeSet removeAll(Iterable<T> collection) { throw new RuntimeException("Stub!"); }
/* 126 */   public <T extends CharSequence> UnicodeSet retainAll(Iterable<T> collection) { throw new RuntimeException("Stub!"); }
/* 127 */   public int compareTo(UnicodeSet o) { throw new RuntimeException("Stub!"); }
/* 128 */   public int compareTo(UnicodeSet o, ComparisonStyle style) { throw new RuntimeException("Stub!"); }
/* 129 */   public int compareTo(Iterable<String> other) { throw new RuntimeException("Stub!"); }
/* 130 */   public java.util.Collection<String> strings() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */   public static final UnicodeSet EMPTY = null; public static final int CASE_INSENSITIVE = 2; public static final int CASE = 2; public static final UnicodeSet ALL_CODE_POINTS = null;
/*     */   public static final int ADD_CASE_MAPPINGS = 4;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\UnicodeSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */