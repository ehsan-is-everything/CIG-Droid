/*     */ package java.util;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Collections
/*     */ {
/*  30 */   Collections() { throw new RuntimeException("Stub!"); }
/*     */   
/*  32 */   public static <T extends Comparable<? super T>> void sort(List<T> list) { throw new RuntimeException("Stub!"); }
/*     */   
/*  34 */   public static <T> void sort(List<T> list, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*  35 */   public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) { throw new RuntimeException("Stub!"); }
/*     */   
/*  37 */   public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*     */   
/*  39 */   public static void reverse(List<?> list) { throw new RuntimeException("Stub!"); }
/*  40 */   public static void shuffle(List<?> list) { throw new RuntimeException("Stub!"); }
/*     */   
/*  42 */   public static void shuffle(List<?> list, Random rnd) { throw new RuntimeException("Stub!"); }
/*     */   
/*  44 */   public static void swap(List<?> list, int i, int j) { throw new RuntimeException("Stub!"); }
/*  45 */   public static <T> void fill(List<? super T> list, T obj) { throw new RuntimeException("Stub!"); }
/*  46 */   public static <T> void copy(List<? super T> dest, List<? extends T> src) { throw new RuntimeException("Stub!"); }
/*  47 */   public static <T,  extends Comparable<? super T>> T min(Collection<? extends T> coll) { throw new RuntimeException("Stub!"); }
/*     */   
/*  49 */   public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) { throw new RuntimeException("Stub!"); }
/*  50 */   public static <T,  extends Comparable<? super T>> T max(Collection<? extends T> coll) { throw new RuntimeException("Stub!"); }
/*     */   
/*  52 */   public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) { throw new RuntimeException("Stub!"); }
/*  53 */   public static void rotate(List<?> list, int distance) { throw new RuntimeException("Stub!"); }
/*  54 */   public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) { throw new RuntimeException("Stub!"); }
/*  55 */   public static int indexOfSubList(List<?> source, List<?> target) { throw new RuntimeException("Stub!"); }
/*  56 */   public static int lastIndexOfSubList(List<?> source, List<?> target) { throw new RuntimeException("Stub!"); }
/*  57 */   public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) { throw new RuntimeException("Stub!"); }
/*  58 */   public static <T> Set<T> unmodifiableSet(Set<? extends T> s) { throw new RuntimeException("Stub!"); }
/*  59 */   public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s) { throw new RuntimeException("Stub!"); }
/*  60 */   public static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s) { throw new RuntimeException("Stub!"); }
/*  61 */   public static <T> List<T> unmodifiableList(List<? extends T> list) { throw new RuntimeException("Stub!"); }
/*  62 */   public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/*  63 */   public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/*  64 */   public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/*  65 */   public static <T> Collection<T> synchronizedCollection(Collection<T> c) { throw new RuntimeException("Stub!"); }
/*  66 */   public static <T> Set<T> synchronizedSet(Set<T> s) { throw new RuntimeException("Stub!"); }
/*  67 */   public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s) { throw new RuntimeException("Stub!"); }
/*  68 */   public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s) { throw new RuntimeException("Stub!"); }
/*  69 */   public static <T> List<T> synchronizedList(List<T> list) { throw new RuntimeException("Stub!"); }
/*  70 */   public static <K, V> Map<K, V> synchronizedMap(Map<K, V> m) { throw new RuntimeException("Stub!"); }
/*  71 */   public static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) { throw new RuntimeException("Stub!"); }
/*  72 */   public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> m) { throw new RuntimeException("Stub!"); }
/*  73 */   public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  74 */   public static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  75 */   public static <E> Set<E> checkedSet(Set<E> s, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  76 */   public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  77 */   public static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  78 */   public static <E> List<E> checkedList(List<E> list, Class<E> type) { throw new RuntimeException("Stub!"); }
/*  79 */   public static <K, V> Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); }
/*  80 */   public static <K, V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); }
/*  81 */   public static <K, V> NavigableMap<K, V> checkedNavigableMap(NavigableMap<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); }
/*     */   
/*  83 */   public static <T> Iterator<T> emptyIterator() { throw new RuntimeException("Stub!"); }
/*     */   
/*  85 */   public static <T> ListIterator<T> emptyListIterator() { throw new RuntimeException("Stub!"); }
/*     */   
/*  87 */   public static <T> Enumeration<T> emptyEnumeration() { throw new RuntimeException("Stub!"); }
/*     */   
/*  89 */   public static final <T> Set<T> emptySet() { throw new RuntimeException("Stub!"); }
/*     */   
/*  91 */   public static <E> SortedSet<E> emptySortedSet() { throw new RuntimeException("Stub!"); }
/*     */   
/*  93 */   public static <E> NavigableSet<E> emptyNavigableSet() { throw new RuntimeException("Stub!"); }
/*     */   
/*  95 */   public static final <T> List<T> emptyList() { throw new RuntimeException("Stub!"); }
/*     */   
/*  97 */   public static final <K, V> Map<K, V> emptyMap() { throw new RuntimeException("Stub!"); }
/*     */   
/*  99 */   public static final <K, V> SortedMap<K, V> emptySortedMap() { throw new RuntimeException("Stub!"); }
/*     */   
/* 101 */   public static final <K, V> NavigableMap<K, V> emptyNavigableMap() { throw new RuntimeException("Stub!"); }
/* 102 */   public static <T> Set<T> singleton(T o) { throw new RuntimeException("Stub!"); }
/* 103 */   public static <T> List<T> singletonList(T o) { throw new RuntimeException("Stub!"); }
/* 104 */   public static <K, V> Map<K, V> singletonMap(K key, V value) { throw new RuntimeException("Stub!"); }
/* 105 */   public static <T> List<T> nCopies(int n, T o) { throw new RuntimeException("Stub!"); }
/*     */   
/* 107 */   public static <T> Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); }
/* 108 */   public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) { throw new RuntimeException("Stub!"); }
/* 109 */   public static <T> Enumeration<T> enumeration(Collection<T> c) { throw new RuntimeException("Stub!"); }
/* 110 */   public static <T> ArrayList<T> list(Enumeration<T> e) { throw new RuntimeException("Stub!"); }
/* 111 */   public static int frequency(Collection<?> c, Object o) { throw new RuntimeException("Stub!"); }
/* 112 */   public static boolean disjoint(Collection<?> c1, Collection<?> c2) { throw new RuntimeException("Stub!"); }
/*     */   @SafeVarargs
/* 114 */   public static <T> boolean addAll(Collection<? super T> c, T... elements) { throw new RuntimeException("Stub!"); }
/* 115 */   public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) { throw new RuntimeException("Stub!"); }
/* 116 */   public static <T> Queue<T> asLifoQueue(Deque<T> deque) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */   public static final Set EMPTY_SET = null; public static final Map EMPTY_MAP = null; public static final List EMPTY_LIST = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Collections.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */