/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Matrix;
/*    */ import android.os.Bundle;
/*    */ import android.os.LocaleList;
/*    */ import android.util.Pair;
/*    */ import android.view.autofill.AutofillId;
/*    */ import android.view.autofill.AutofillValue;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ViewStructure
/*    */ {
/*    */   public static abstract class HtmlInfo
/*    */   {
/*    */     public static abstract class Builder
/*    */     {
/* 24 */       public Builder() { throw new RuntimeException("Stub!"); }
/*    */       
/*    */       public abstract Builder addAttribute(String paramString1, String paramString2);
/*    */       public abstract ViewStructure.HtmlInfo build(); }
/* 28 */     public HtmlInfo() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract String getTag();
/*    */     public abstract List<Pair<String, String>> getAttributes(); }
/* 32 */   public ViewStructure() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void setId(int paramInt, String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract void setDimens(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*    */   
/*    */   public abstract void setTransformation(Matrix paramMatrix);
/*    */   
/*    */   public abstract void setElevation(float paramFloat);
/*    */   
/*    */   public abstract void setAlpha(float paramFloat);
/*    */   
/*    */   public abstract void setVisibility(int paramInt);
/*    */   
/*    */   public abstract void setEnabled(boolean paramBoolean);
/*    */   
/*    */   public abstract void setClickable(boolean paramBoolean);
/*    */   
/*    */   public abstract void setLongClickable(boolean paramBoolean);
/*    */   
/*    */   public abstract void setContextClickable(boolean paramBoolean);
/*    */   
/*    */   public abstract void setFocusable(boolean paramBoolean);
/*    */   
/*    */   public abstract void setFocused(boolean paramBoolean);
/*    */   
/*    */   public abstract void setAccessibilityFocused(boolean paramBoolean);
/*    */   
/*    */   public abstract void setCheckable(boolean paramBoolean);
/*    */   
/*    */   public abstract void setChecked(boolean paramBoolean);
/*    */   
/*    */   public abstract void setSelected(boolean paramBoolean);
/*    */   
/*    */   public abstract void setActivated(boolean paramBoolean);
/*    */   
/*    */   public abstract void setOpaque(boolean paramBoolean);
/*    */   
/*    */   public abstract void setClassName(String paramString);
/*    */   
/*    */   public abstract void setContentDescription(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract void setText(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract void setText(CharSequence paramCharSequence, int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract void setTextStyle(float paramFloat, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */   public abstract void setTextLines(int[] paramArrayOfInt1, int[] paramArrayOfInt2);
/*    */   
/*    */   public abstract void setHint(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract CharSequence getText();
/*    */   
/*    */   public abstract int getTextSelectionStart();
/*    */   
/*    */   public abstract int getTextSelectionEnd();
/*    */   
/*    */   public abstract CharSequence getHint();
/*    */   
/*    */   public abstract Bundle getExtras();
/*    */   
/*    */   public abstract boolean hasExtras();
/*    */   
/*    */   public abstract void setChildCount(int paramInt);
/*    */   
/*    */   public abstract int addChildCount(int paramInt);
/*    */   
/*    */   public abstract int getChildCount();
/*    */   
/*    */   public abstract ViewStructure newChild(int paramInt);
/*    */   
/*    */   public abstract ViewStructure asyncNewChild(int paramInt);
/*    */   
/*    */   public abstract AutofillId getAutofillId();
/*    */   
/*    */   public abstract void setAutofillId(AutofillId paramAutofillId);
/*    */   
/*    */   public abstract void setAutofillId(AutofillId paramAutofillId, int paramInt);
/*    */   
/*    */   public abstract void setAutofillType(int paramInt);
/*    */   
/*    */   public abstract void setAutofillHints(String[] paramArrayOfString);
/*    */   
/*    */   public abstract void setAutofillValue(AutofillValue paramAutofillValue);
/*    */   
/*    */   public abstract void setAutofillOptions(CharSequence[] paramArrayOfCharSequence);
/*    */   
/*    */   public abstract void setInputType(int paramInt);
/*    */   
/*    */   public abstract void setDataIsSensitive(boolean paramBoolean);
/*    */   
/*    */   public abstract void asyncCommit();
/*    */   
/*    */   public abstract void setWebDomain(String paramString);
/*    */   
/*    */   public abstract void setLocaleList(LocaleList paramLocaleList);
/*    */   
/*    */   public abstract ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(String paramString);
/*    */   
/*    */   public abstract void setHtmlInfo(HtmlInfo paramHtmlInfo);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ViewStructure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */