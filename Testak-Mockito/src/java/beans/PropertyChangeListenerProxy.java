/*    */ package java.beans;
/*    */ 
/*    */ import java.util.EventListenerProxy;
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
/*    */ 
/*    */ public class PropertyChangeListenerProxy
/*    */   extends EventListenerProxy<PropertyChangeListener>
/*    */   implements PropertyChangeListener
/*    */ {
/*    */   public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener)
/*    */   {
/* 31 */     super(null);throw new RuntimeException("Stub!"); }
/* 32 */   public void propertyChange(PropertyChangeEvent event) { throw new RuntimeException("Stub!"); }
/* 33 */   public String getPropertyName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\beans\PropertyChangeListenerProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */