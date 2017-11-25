/*    */ package android.view.textclassifier;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.view.View.OnClickListener;
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
/*    */ public final class TextClassification
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 22 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder setText(String text) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setEntityType(String type, float confidenceScore) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setIcon(Drawable icon) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setLabel(String label) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setOnClickListener(View.OnClickListener onClickListener) { throw new RuntimeException("Stub!"); }
/* 29 */     public TextClassification build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   TextClassification() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getText() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getEntityCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getEntity(int index) { throw new RuntimeException("Stub!"); }
/* 35 */   public float getConfidenceScore(String entity) { throw new RuntimeException("Stub!"); }
/* 36 */   public Drawable getIcon() { throw new RuntimeException("Stub!"); }
/* 37 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 38 */   public Intent getIntent() { throw new RuntimeException("Stub!"); }
/* 39 */   public View.OnClickListener getOnClickListener() { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\textclassifier\TextClassification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */