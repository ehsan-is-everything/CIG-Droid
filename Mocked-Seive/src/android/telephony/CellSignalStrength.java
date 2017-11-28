/*    */ package android.telephony;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CellSignalStrength
/*    */ {
/*    */   public static final int SIGNAL_STRENGTH_GOOD = 3;
/*    */   
/*    */   public static final int SIGNAL_STRENGTH_GREAT = 4;
/*    */   
/*    */   public static final int SIGNAL_STRENGTH_MODERATE = 2;
/*    */   
/*    */   public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
/*    */   
/*    */   public static final int SIGNAL_STRENGTH_POOR = 1;
/*    */   
/*    */ 
/*    */   CellSignalStrength()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract int getLevel();
/*    */   
/*    */   public abstract int getAsuLevel();
/*    */   
/*    */   public abstract int getDbm();
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\CellSignalStrength.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */