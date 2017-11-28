/*    */ package android.renderscript;
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
/*    */ public final class ScriptGroup
/*    */   extends BaseObj
/*    */ {
/*    */   public static final class Closure
/*    */     extends BaseObj
/*    */   {
/* 24 */     Closure() { throw new RuntimeException("Stub!"); }
/* 25 */     public void destroy() { throw new RuntimeException("Stub!"); }
/* 26 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 27 */     public ScriptGroup.Future getReturn() { throw new RuntimeException("Stub!"); }
/* 28 */     public ScriptGroup.Future getGlobal(Script.FieldID field) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Future {
/* 32 */     Future() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Input {
/* 36 */     Input() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static final class Builder {
/* 41 */     public Builder(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 42 */     public Builder addKernel(Script.KernelID k) { throw new RuntimeException("Stub!"); }
/* 43 */     public Builder addConnection(Type t, Script.KernelID from, Script.FieldID to) { throw new RuntimeException("Stub!"); }
/* 44 */     public Builder addConnection(Type t, Script.KernelID from, Script.KernelID to) { throw new RuntimeException("Stub!"); }
/* 45 */     public ScriptGroup create() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Binding {
/* 49 */     public Binding(Script.FieldID field, Object value) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class Builder2 {
/* 53 */     public Builder2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 54 */     public ScriptGroup.Input addInput() { throw new RuntimeException("Stub!"); }
/* 55 */     public ScriptGroup.Closure addKernel(Script.KernelID k, Type returnType, Object... argsAndBindings) { throw new RuntimeException("Stub!"); }
/* 56 */     public ScriptGroup.Closure addInvoke(Script.InvokeID invoke, Object... argsAndBindings) { throw new RuntimeException("Stub!"); }
/* 57 */     public ScriptGroup create(String name, ScriptGroup.Future... outputs) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 59 */   ScriptGroup() { throw new RuntimeException("Stub!"); }
/* 60 */   public Object[] execute(Object... inputs) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 62 */   public void setInput(Script.KernelID s, Allocation a) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 64 */   public void setOutput(Script.KernelID s, Allocation a) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 66 */   public void execute() { throw new RuntimeException("Stub!"); }
/* 67 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\ScriptGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */