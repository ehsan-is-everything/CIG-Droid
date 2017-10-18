/*     */ package java.util.concurrent;
/*     */ 
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CompletableFuture<T>
/*     */   implements Future<T>, CompletionStage<T>
/*     */ {
/*  43 */   public CompletableFuture() { throw new RuntimeException("Stub!"); }
/*  44 */   public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier) { throw new RuntimeException("Stub!"); }
/*  45 */   public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor) { throw new RuntimeException("Stub!"); }
/*  46 */   public static CompletableFuture<Void> runAsync(Runnable runnable) { throw new RuntimeException("Stub!"); }
/*  47 */   public static CompletableFuture<Void> runAsync(Runnable runnable, Executor executor) { throw new RuntimeException("Stub!"); }
/*  48 */   public static <U> CompletableFuture<U> completedFuture(U value) { throw new RuntimeException("Stub!"); }
/*  49 */   public boolean isDone() { throw new RuntimeException("Stub!"); }
/*  50 */   public T get() throws InterruptedException, ExecutionException { throw new RuntimeException("Stub!"); }
/*  51 */   public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException { throw new RuntimeException("Stub!"); }
/*  52 */   public T join() { throw new RuntimeException("Stub!"); }
/*  53 */   public T getNow(T valueIfAbsent) { throw new RuntimeException("Stub!"); }
/*  54 */   public boolean complete(T value) { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean completeExceptionally(Throwable ex) { throw new RuntimeException("Stub!"); }
/*  56 */   public <U> CompletableFuture<U> thenApply(Function<? super T, ? extends U> fn) { throw new RuntimeException("Stub!"); }
/*  57 */   public <U> CompletableFuture<U> thenApplyAsync(Function<? super T, ? extends U> fn) { throw new RuntimeException("Stub!"); }
/*  58 */   public <U> CompletableFuture<U> thenApplyAsync(Function<? super T, ? extends U> fn, Executor executor) { throw new RuntimeException("Stub!"); }
/*  59 */   public CompletableFuture<Void> thenAccept(Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/*  60 */   public CompletableFuture<Void> thenAcceptAsync(Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/*  61 */   public CompletableFuture<Void> thenAcceptAsync(Consumer<? super T> action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  62 */   public CompletableFuture<Void> thenRun(Runnable action) { throw new RuntimeException("Stub!"); }
/*  63 */   public CompletableFuture<Void> thenRunAsync(Runnable action) { throw new RuntimeException("Stub!"); }
/*  64 */   public CompletableFuture<Void> thenRunAsync(Runnable action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  65 */   public <U, V> CompletableFuture<V> thenCombine(CompletionStage<? extends U> other, BiFunction<? super T, ? super U, ? extends V> fn) { throw new RuntimeException("Stub!"); }
/*  66 */   public <U, V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other, BiFunction<? super T, ? super U, ? extends V> fn) { throw new RuntimeException("Stub!"); }
/*  67 */   public <U, V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other, BiFunction<? super T, ? super U, ? extends V> fn, Executor executor) { throw new RuntimeException("Stub!"); }
/*  68 */   public <U> CompletableFuture<Void> thenAcceptBoth(CompletionStage<? extends U> other, BiConsumer<? super T, ? super U> action) { throw new RuntimeException("Stub!"); }
/*  69 */   public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other, BiConsumer<? super T, ? super U> action) { throw new RuntimeException("Stub!"); }
/*  70 */   public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other, BiConsumer<? super T, ? super U> action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  71 */   public CompletableFuture<Void> runAfterBoth(CompletionStage<?> other, Runnable action) { throw new RuntimeException("Stub!"); }
/*  72 */   public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action) { throw new RuntimeException("Stub!"); }
/*  73 */   public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  74 */   public <U> CompletableFuture<U> applyToEither(CompletionStage<? extends T> other, Function<? super T, U> fn) { throw new RuntimeException("Stub!"); }
/*  75 */   public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends T> other, Function<? super T, U> fn) { throw new RuntimeException("Stub!"); }
/*  76 */   public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends T> other, Function<? super T, U> fn, Executor executor) { throw new RuntimeException("Stub!"); }
/*  77 */   public CompletableFuture<Void> acceptEither(CompletionStage<? extends T> other, Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/*  78 */   public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends T> other, Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/*  79 */   public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends T> other, Consumer<? super T> action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  80 */   public CompletableFuture<Void> runAfterEither(CompletionStage<?> other, Runnable action) { throw new RuntimeException("Stub!"); }
/*  81 */   public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action) { throw new RuntimeException("Stub!"); }
/*  82 */   public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  83 */   public <U> CompletableFuture<U> thenCompose(Function<? super T, ? extends CompletionStage<U>> fn) { throw new RuntimeException("Stub!"); }
/*  84 */   public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn) { throw new RuntimeException("Stub!"); }
/*  85 */   public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn, Executor executor) { throw new RuntimeException("Stub!"); }
/*  86 */   public CompletableFuture<T> whenComplete(BiConsumer<? super T, ? super Throwable> action) { throw new RuntimeException("Stub!"); }
/*  87 */   public CompletableFuture<T> whenCompleteAsync(BiConsumer<? super T, ? super Throwable> action) { throw new RuntimeException("Stub!"); }
/*  88 */   public CompletableFuture<T> whenCompleteAsync(BiConsumer<? super T, ? super Throwable> action, Executor executor) { throw new RuntimeException("Stub!"); }
/*  89 */   public <U> CompletableFuture<U> handle(BiFunction<? super T, Throwable, ? extends U> fn) { throw new RuntimeException("Stub!"); }
/*  90 */   public <U> CompletableFuture<U> handleAsync(BiFunction<? super T, Throwable, ? extends U> fn) { throw new RuntimeException("Stub!"); }
/*  91 */   public <U> CompletableFuture<U> handleAsync(BiFunction<? super T, Throwable, ? extends U> fn, Executor executor) { throw new RuntimeException("Stub!"); }
/*  92 */   public CompletableFuture<T> toCompletableFuture() { throw new RuntimeException("Stub!"); }
/*  93 */   public CompletableFuture<T> exceptionally(Function<Throwable, ? extends T> fn) { throw new RuntimeException("Stub!"); }
/*  94 */   public static CompletableFuture<Void> allOf(CompletableFuture<?>... cfs) { throw new RuntimeException("Stub!"); }
/*  95 */   public static CompletableFuture<Object> anyOf(CompletableFuture<?>... cfs) { throw new RuntimeException("Stub!"); }
/*  96 */   public boolean cancel(boolean mayInterruptIfRunning) { throw new RuntimeException("Stub!"); }
/*  97 */   public boolean isCancelled() { throw new RuntimeException("Stub!"); }
/*  98 */   public boolean isCompletedExceptionally() { throw new RuntimeException("Stub!"); }
/*  99 */   public void obtrudeValue(T value) { throw new RuntimeException("Stub!"); }
/* 100 */   public void obtrudeException(Throwable ex) { throw new RuntimeException("Stub!"); }
/* 101 */   public int getNumberOfDependents() { throw new RuntimeException("Stub!"); }
/* 102 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static abstract interface AsynchronousCompletionTask {}
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\CompletableFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */