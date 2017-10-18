/*     */ package java.util;
/*     */ 
/*     */ import java.util.function.BinaryOperator;
/*     */ import java.util.function.DoubleBinaryOperator;
/*     */ import java.util.function.IntBinaryOperator;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.function.IntToDoubleFunction;
/*     */ import java.util.function.IntToLongFunction;
/*     */ import java.util.function.IntUnaryOperator;
/*     */ import java.util.function.LongBinaryOperator;
/*     */ import java.util.stream.DoubleStream;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Arrays
/*     */ {
/*  30 */   Arrays() { throw new RuntimeException("Stub!"); }
/*  31 */   public static void sort(int[] a) { throw new RuntimeException("Stub!"); }
/*  32 */   public static void sort(int[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  33 */   public static void sort(long[] a) { throw new RuntimeException("Stub!"); }
/*  34 */   public static void sort(long[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  35 */   public static void sort(short[] a) { throw new RuntimeException("Stub!"); }
/*  36 */   public static void sort(short[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  37 */   public static void sort(char[] a) { throw new RuntimeException("Stub!"); }
/*  38 */   public static void sort(char[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  39 */   public static void sort(byte[] a) { throw new RuntimeException("Stub!"); }
/*  40 */   public static void sort(byte[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  41 */   public static void sort(float[] a) { throw new RuntimeException("Stub!"); }
/*  42 */   public static void sort(float[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  43 */   public static void sort(double[] a) { throw new RuntimeException("Stub!"); }
/*  44 */   public static void sort(double[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  45 */   public static void parallelSort(byte[] a) { throw new RuntimeException("Stub!"); }
/*  46 */   public static void parallelSort(byte[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  47 */   public static void parallelSort(char[] a) { throw new RuntimeException("Stub!"); }
/*  48 */   public static void parallelSort(char[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  49 */   public static void parallelSort(short[] a) { throw new RuntimeException("Stub!"); }
/*  50 */   public static void parallelSort(short[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  51 */   public static void parallelSort(int[] a) { throw new RuntimeException("Stub!"); }
/*  52 */   public static void parallelSort(int[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  53 */   public static void parallelSort(long[] a) { throw new RuntimeException("Stub!"); }
/*  54 */   public static void parallelSort(long[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  55 */   public static void parallelSort(float[] a) { throw new RuntimeException("Stub!"); }
/*  56 */   public static void parallelSort(float[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  57 */   public static void parallelSort(double[] a) { throw new RuntimeException("Stub!"); }
/*  58 */   public static void parallelSort(double[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*     */   
/*  60 */   public static <T extends Comparable<? super T>> void parallelSort(T[] a) { throw new RuntimeException("Stub!"); }
/*     */   
/*  62 */   public static <T extends Comparable<? super T>> void parallelSort(T[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*     */   
/*  64 */   public static <T> void parallelSort(T[] a, Comparator<? super T> cmp) { throw new RuntimeException("Stub!"); }
/*     */   
/*  66 */   public static <T> void parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp) { throw new RuntimeException("Stub!"); }
/*  67 */   public static void sort(Object[] a) { throw new RuntimeException("Stub!"); }
/*  68 */   public static void sort(Object[] a, int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*  69 */   public static <T> void sort(T[] a, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*  70 */   public static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*  71 */   public static <T> void parallelPrefix(T[] array, BinaryOperator<T> op) { throw new RuntimeException("Stub!"); }
/*  72 */   public static <T> void parallelPrefix(T[] array, int fromIndex, int toIndex, BinaryOperator<T> op) { throw new RuntimeException("Stub!"); }
/*  73 */   public static void parallelPrefix(long[] array, LongBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  74 */   public static void parallelPrefix(long[] array, int fromIndex, int toIndex, LongBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  75 */   public static void parallelPrefix(double[] array, DoubleBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  76 */   public static void parallelPrefix(double[] array, int fromIndex, int toIndex, DoubleBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  77 */   public static void parallelPrefix(int[] array, IntBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  78 */   public static void parallelPrefix(int[] array, int fromIndex, int toIndex, IntBinaryOperator op) { throw new RuntimeException("Stub!"); }
/*  79 */   public static int binarySearch(long[] a, long key) { throw new RuntimeException("Stub!"); }
/*  80 */   public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) { throw new RuntimeException("Stub!"); }
/*  81 */   public static int binarySearch(int[] a, int key) { throw new RuntimeException("Stub!"); }
/*  82 */   public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) { throw new RuntimeException("Stub!"); }
/*  83 */   public static int binarySearch(short[] a, short key) { throw new RuntimeException("Stub!"); }
/*  84 */   public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) { throw new RuntimeException("Stub!"); }
/*  85 */   public static int binarySearch(char[] a, char key) { throw new RuntimeException("Stub!"); }
/*  86 */   public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) { throw new RuntimeException("Stub!"); }
/*  87 */   public static int binarySearch(byte[] a, byte key) { throw new RuntimeException("Stub!"); }
/*  88 */   public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) { throw new RuntimeException("Stub!"); }
/*  89 */   public static int binarySearch(double[] a, double key) { throw new RuntimeException("Stub!"); }
/*  90 */   public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) { throw new RuntimeException("Stub!"); }
/*  91 */   public static int binarySearch(float[] a, float key) { throw new RuntimeException("Stub!"); }
/*  92 */   public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) { throw new RuntimeException("Stub!"); }
/*  93 */   public static int binarySearch(Object[] a, Object key) { throw new RuntimeException("Stub!"); }
/*  94 */   public static int binarySearch(Object[] a, int fromIndex, int toIndex, Object key) { throw new RuntimeException("Stub!"); }
/*  95 */   public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*  96 */   public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) { throw new RuntimeException("Stub!"); }
/*  97 */   public static boolean equals(long[] a, long[] a2) { throw new RuntimeException("Stub!"); }
/*  98 */   public static boolean equals(int[] a, int[] a2) { throw new RuntimeException("Stub!"); }
/*  99 */   public static boolean equals(short[] a, short[] a2) { throw new RuntimeException("Stub!"); }
/* 100 */   public static boolean equals(char[] a, char[] a2) { throw new RuntimeException("Stub!"); }
/* 101 */   public static boolean equals(byte[] a, byte[] a2) { throw new RuntimeException("Stub!"); }
/* 102 */   public static boolean equals(boolean[] a, boolean[] a2) { throw new RuntimeException("Stub!"); }
/* 103 */   public static boolean equals(double[] a, double[] a2) { throw new RuntimeException("Stub!"); }
/* 104 */   public static boolean equals(float[] a, float[] a2) { throw new RuntimeException("Stub!"); }
/* 105 */   public static boolean equals(Object[] a, Object[] a2) { throw new RuntimeException("Stub!"); }
/* 106 */   public static void fill(long[] a, long val) { throw new RuntimeException("Stub!"); }
/* 107 */   public static void fill(long[] a, int fromIndex, int toIndex, long val) { throw new RuntimeException("Stub!"); }
/* 108 */   public static void fill(int[] a, int val) { throw new RuntimeException("Stub!"); }
/* 109 */   public static void fill(int[] a, int fromIndex, int toIndex, int val) { throw new RuntimeException("Stub!"); }
/* 110 */   public static void fill(short[] a, short val) { throw new RuntimeException("Stub!"); }
/* 111 */   public static void fill(short[] a, int fromIndex, int toIndex, short val) { throw new RuntimeException("Stub!"); }
/* 112 */   public static void fill(char[] a, char val) { throw new RuntimeException("Stub!"); }
/* 113 */   public static void fill(char[] a, int fromIndex, int toIndex, char val) { throw new RuntimeException("Stub!"); }
/* 114 */   public static void fill(byte[] a, byte val) { throw new RuntimeException("Stub!"); }
/* 115 */   public static void fill(byte[] a, int fromIndex, int toIndex, byte val) { throw new RuntimeException("Stub!"); }
/* 116 */   public static void fill(boolean[] a, boolean val) { throw new RuntimeException("Stub!"); }
/* 117 */   public static void fill(boolean[] a, int fromIndex, int toIndex, boolean val) { throw new RuntimeException("Stub!"); }
/* 118 */   public static void fill(double[] a, double val) { throw new RuntimeException("Stub!"); }
/* 119 */   public static void fill(double[] a, int fromIndex, int toIndex, double val) { throw new RuntimeException("Stub!"); }
/* 120 */   public static void fill(float[] a, float val) { throw new RuntimeException("Stub!"); }
/* 121 */   public static void fill(float[] a, int fromIndex, int toIndex, float val) { throw new RuntimeException("Stub!"); }
/* 122 */   public static void fill(Object[] a, Object val) { throw new RuntimeException("Stub!"); }
/* 123 */   public static void fill(Object[] a, int fromIndex, int toIndex, Object val) { throw new RuntimeException("Stub!"); }
/*     */   
/* 125 */   public static <T> T[] copyOf(T[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 126 */   public static <T, U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) { throw new RuntimeException("Stub!"); }
/* 127 */   public static byte[] copyOf(byte[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 128 */   public static short[] copyOf(short[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 129 */   public static int[] copyOf(int[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 130 */   public static long[] copyOf(long[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 131 */   public static char[] copyOf(char[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 132 */   public static float[] copyOf(float[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 133 */   public static double[] copyOf(double[] original, int newLength) { throw new RuntimeException("Stub!"); }
/* 134 */   public static boolean[] copyOf(boolean[] original, int newLength) { throw new RuntimeException("Stub!"); }
/*     */   
/* 136 */   public static <T> T[] copyOfRange(T[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 137 */   public static <T, U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType) { throw new RuntimeException("Stub!"); }
/* 138 */   public static byte[] copyOfRange(byte[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 139 */   public static short[] copyOfRange(short[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 140 */   public static int[] copyOfRange(int[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 141 */   public static long[] copyOfRange(long[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 142 */   public static char[] copyOfRange(char[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 143 */   public static float[] copyOfRange(float[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 144 */   public static double[] copyOfRange(double[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/* 145 */   public static boolean[] copyOfRange(boolean[] original, int from, int to) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   @SafeVarargs
/* 148 */   public static <T> List<T> asList(T... a) { throw new RuntimeException("Stub!"); }
/* 149 */   public static int hashCode(long[] a) { throw new RuntimeException("Stub!"); }
/* 150 */   public static int hashCode(int[] a) { throw new RuntimeException("Stub!"); }
/* 151 */   public static int hashCode(short[] a) { throw new RuntimeException("Stub!"); }
/* 152 */   public static int hashCode(char[] a) { throw new RuntimeException("Stub!"); }
/* 153 */   public static int hashCode(byte[] a) { throw new RuntimeException("Stub!"); }
/* 154 */   public static int hashCode(boolean[] a) { throw new RuntimeException("Stub!"); }
/* 155 */   public static int hashCode(float[] a) { throw new RuntimeException("Stub!"); }
/* 156 */   public static int hashCode(double[] a) { throw new RuntimeException("Stub!"); }
/* 157 */   public static int hashCode(Object[] a) { throw new RuntimeException("Stub!"); }
/* 158 */   public static int deepHashCode(Object[] a) { throw new RuntimeException("Stub!"); }
/* 159 */   public static boolean deepEquals(Object[] a1, Object[] a2) { throw new RuntimeException("Stub!"); }
/* 160 */   public static String toString(long[] a) { throw new RuntimeException("Stub!"); }
/* 161 */   public static String toString(int[] a) { throw new RuntimeException("Stub!"); }
/* 162 */   public static String toString(short[] a) { throw new RuntimeException("Stub!"); }
/* 163 */   public static String toString(char[] a) { throw new RuntimeException("Stub!"); }
/* 164 */   public static String toString(byte[] a) { throw new RuntimeException("Stub!"); }
/* 165 */   public static String toString(boolean[] a) { throw new RuntimeException("Stub!"); }
/* 166 */   public static String toString(float[] a) { throw new RuntimeException("Stub!"); }
/* 167 */   public static String toString(double[] a) { throw new RuntimeException("Stub!"); }
/* 168 */   public static String toString(Object[] a) { throw new RuntimeException("Stub!"); }
/* 169 */   public static String deepToString(Object[] a) { throw new RuntimeException("Stub!"); }
/* 170 */   public static <T> void setAll(T[] array, IntFunction<? extends T> generator) { throw new RuntimeException("Stub!"); }
/* 171 */   public static <T> void parallelSetAll(T[] array, IntFunction<? extends T> generator) { throw new RuntimeException("Stub!"); }
/* 172 */   public static void setAll(int[] array, IntUnaryOperator generator) { throw new RuntimeException("Stub!"); }
/* 173 */   public static void parallelSetAll(int[] array, IntUnaryOperator generator) { throw new RuntimeException("Stub!"); }
/* 174 */   public static void setAll(long[] array, IntToLongFunction generator) { throw new RuntimeException("Stub!"); }
/* 175 */   public static void parallelSetAll(long[] array, IntToLongFunction generator) { throw new RuntimeException("Stub!"); }
/* 176 */   public static void setAll(double[] array, IntToDoubleFunction generator) { throw new RuntimeException("Stub!"); }
/* 177 */   public static void parallelSetAll(double[] array, IntToDoubleFunction generator) { throw new RuntimeException("Stub!"); }
/* 178 */   public static <T> Spliterator<T> spliterator(T[] array) { throw new RuntimeException("Stub!"); }
/* 179 */   public static <T> Spliterator<T> spliterator(T[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 180 */   public static Spliterator.OfInt spliterator(int[] array) { throw new RuntimeException("Stub!"); }
/* 181 */   public static Spliterator.OfInt spliterator(int[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 182 */   public static Spliterator.OfLong spliterator(long[] array) { throw new RuntimeException("Stub!"); }
/* 183 */   public static Spliterator.OfLong spliterator(long[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 184 */   public static Spliterator.OfDouble spliterator(double[] array) { throw new RuntimeException("Stub!"); }
/* 185 */   public static Spliterator.OfDouble spliterator(double[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 186 */   public static <T> Stream<T> stream(T[] array) { throw new RuntimeException("Stub!"); }
/* 187 */   public static <T> Stream<T> stream(T[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 188 */   public static IntStream stream(int[] array) { throw new RuntimeException("Stub!"); }
/* 189 */   public static IntStream stream(int[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 190 */   public static LongStream stream(long[] array) { throw new RuntimeException("Stub!"); }
/* 191 */   public static LongStream stream(long[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 192 */   public static DoubleStream stream(double[] array) { throw new RuntimeException("Stub!"); }
/* 193 */   public static DoubleStream stream(double[] array, int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Arrays.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */