/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.SelectionKey;
/*    */ import java.nio.channels.Selector;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ public abstract class AbstractSelector
/*    */   extends Selector
/*    */ {
/* 30 */   protected AbstractSelector(SelectorProvider provider) { throw new RuntimeException("Stub!"); }
/* 31 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void implCloseSelector() throws IOException;
/* 33 */   public final boolean isOpen() { throw new RuntimeException("Stub!"); }
/* 34 */   public final SelectorProvider provider() { throw new RuntimeException("Stub!"); }
/* 35 */   protected final Set<SelectionKey> cancelledKeys() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract SelectionKey register(AbstractSelectableChannel paramAbstractSelectableChannel, int paramInt, Object paramObject);
/* 37 */   protected final void deregister(AbstractSelectionKey key) { throw new RuntimeException("Stub!"); }
/* 38 */   protected final void begin() { throw new RuntimeException("Stub!"); }
/* 39 */   protected final void end() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\spi\AbstractSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */