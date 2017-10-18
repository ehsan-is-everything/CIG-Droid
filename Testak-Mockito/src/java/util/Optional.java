/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Optional<T>
/*    */ {
/* 28 */   Optional() { throw new RuntimeException("Stub!"); }
/* 29 */   public static <T> Optional<T> empty() { throw new RuntimeException("Stub!"); }
/* 30 */   public static <T> Optional<T> of(T value) { throw new RuntimeException("Stub!"); }
/* 31 */   public static <T> Optional<T> ofNullable(T value) { throw new RuntimeException("Stub!"); }
/* 32 */   public T get() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isPresent() { throw new RuntimeException("Stub!"); }
/* 34 */   public void ifPresent(Consumer<? super T> consumer) { throw new RuntimeException("Stub!"); }
/* 35 */   public Optional<T> filter(Predicate<? super T> predicate) { throw new RuntimeException("Stub!"); }
/* 36 */   public <U> Optional<U> map(Function<? super T, ? extends U> mapper) { throw new RuntimeException("Stub!"); }
/* 37 */   public <U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper) { throw new RuntimeException("Stub!"); }
/* 38 */   public T orElse(T other) { throw new RuntimeException("Stub!"); }
/* 39 */   public T orElseGet(Supplier<? extends T> other) { throw new RuntimeException("Stub!"); }
/* 40 */   public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws Throwable { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 42 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Optional.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */