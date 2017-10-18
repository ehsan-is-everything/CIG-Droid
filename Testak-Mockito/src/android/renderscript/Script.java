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
/*    */ public class Script
/*    */   extends BaseObj
/*    */ {
/*    */   public static final class KernelID
/*    */     extends BaseObj
/*    */   {
/*    */     KernelID()
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class InvokeID extends BaseObj {
/* 29 */     InvokeID() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class FieldID
/*    */     extends BaseObj {
/* 34 */     FieldID() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class Builder {
/* 38 */     Builder() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static class FieldBase { protected Allocation mAllocation;
/*    */     
/* 42 */     protected FieldBase() { throw new RuntimeException("Stub!"); }
/* 43 */     protected void init(RenderScript rs, int dimx) { throw new RuntimeException("Stub!"); }
/* 44 */     protected void init(RenderScript rs, int dimx, int usages) { throw new RuntimeException("Stub!"); }
/* 45 */     public Element getElement() { throw new RuntimeException("Stub!"); }
/* 46 */     public Type getType() { throw new RuntimeException("Stub!"); }
/* 47 */     public Allocation getAllocation() { throw new RuntimeException("Stub!"); }
/* 48 */     public void updateAllocation() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     protected Element mElement;
/*    */   }
/*    */   
/*    */   public static final class LaunchOptions {
/* 54 */     public LaunchOptions() { throw new RuntimeException("Stub!"); }
/* 55 */     public LaunchOptions setX(int xstartArg, int xendArg) { throw new RuntimeException("Stub!"); }
/* 56 */     public LaunchOptions setY(int ystartArg, int yendArg) { throw new RuntimeException("Stub!"); }
/* 57 */     public LaunchOptions setZ(int zstartArg, int zendArg) { throw new RuntimeException("Stub!"); }
/* 58 */     public int getXStart() { throw new RuntimeException("Stub!"); }
/* 59 */     public int getXEnd() { throw new RuntimeException("Stub!"); }
/* 60 */     public int getYStart() { throw new RuntimeException("Stub!"); }
/* 61 */     public int getYEnd() { throw new RuntimeException("Stub!"); }
/* 62 */     public int getZStart() { throw new RuntimeException("Stub!"); }
/* 63 */     public int getZEnd() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 65 */   Script() { throw new RuntimeException("Stub!"); }
/* 66 */   protected KernelID createKernelID(int slot, int sig, Element ein, Element eout) { throw new RuntimeException("Stub!"); }
/* 67 */   protected InvokeID createInvokeID(int slot) { throw new RuntimeException("Stub!"); }
/* 68 */   protected FieldID createFieldID(int slot, Element e) { throw new RuntimeException("Stub!"); }
/* 69 */   protected void invoke(int slot) { throw new RuntimeException("Stub!"); }
/* 70 */   protected void invoke(int slot, FieldPacker v) { throw new RuntimeException("Stub!"); }
/* 71 */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v) { throw new RuntimeException("Stub!"); }
/* 72 */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v, LaunchOptions sc) { throw new RuntimeException("Stub!"); }
/* 73 */   protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v) { throw new RuntimeException("Stub!"); }
/* 74 */   protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v, LaunchOptions sc) { throw new RuntimeException("Stub!"); }
/* 75 */   protected void reduce(int slot, Allocation[] ains, Allocation aout, LaunchOptions sc) { throw new RuntimeException("Stub!"); }
/* 76 */   public void bindAllocation(Allocation va, int slot) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setVar(int index, float v) { throw new RuntimeException("Stub!"); }
/* 78 */   public float getVarF(int index) { throw new RuntimeException("Stub!"); }
/* 79 */   public void setVar(int index, double v) { throw new RuntimeException("Stub!"); }
/* 80 */   public double getVarD(int index) { throw new RuntimeException("Stub!"); }
/* 81 */   public void setVar(int index, int v) { throw new RuntimeException("Stub!"); }
/* 82 */   public int getVarI(int index) { throw new RuntimeException("Stub!"); }
/* 83 */   public void setVar(int index, long v) { throw new RuntimeException("Stub!"); }
/* 84 */   public long getVarJ(int index) { throw new RuntimeException("Stub!"); }
/* 85 */   public void setVar(int index, boolean v) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean getVarB(int index) { throw new RuntimeException("Stub!"); }
/* 87 */   public void setVar(int index, BaseObj o) { throw new RuntimeException("Stub!"); }
/* 88 */   public void setVar(int index, FieldPacker v) { throw new RuntimeException("Stub!"); }
/* 89 */   public void setVar(int index, FieldPacker v, Element e, int[] dims) { throw new RuntimeException("Stub!"); }
/* 90 */   public void getVarV(int index, FieldPacker v) { throw new RuntimeException("Stub!"); }
/* 91 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\renderscript\Script.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */