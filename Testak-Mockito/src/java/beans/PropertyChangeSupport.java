/*    */ package java.beans;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ 
/*    */ public class PropertyChangeSupport
/*    */   implements Serializable
/*    */ {
/* 29 */   public PropertyChangeSupport(Object sourceBean) { throw new RuntimeException("Stub!"); }
/* 30 */   public void addPropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 31 */   public void removePropertyChangeListener(PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 32 */   public PropertyChangeListener[] getPropertyChangeListeners() { throw new RuntimeException("Stub!"); }
/* 33 */   public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 34 */   public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 35 */   public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) { throw new RuntimeException("Stub!"); }
/* 36 */   public void firePropertyChange(String propertyName, Object oldValue, Object newValue) { throw new RuntimeException("Stub!"); }
/* 37 */   public void firePropertyChange(String propertyName, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
/* 38 */   public void firePropertyChange(String propertyName, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
/* 39 */   public void firePropertyChange(PropertyChangeEvent event) { throw new RuntimeException("Stub!"); }
/* 40 */   public void fireIndexedPropertyChange(String propertyName, int index, Object oldValue, Object newValue) { throw new RuntimeException("Stub!"); }
/* 41 */   public void fireIndexedPropertyChange(String propertyName, int index, int oldValue, int newValue) { throw new RuntimeException("Stub!"); }
/* 42 */   public void fireIndexedPropertyChange(String propertyName, int index, boolean oldValue, boolean newValue) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean hasListeners(String propertyName) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\beans\PropertyChangeSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */