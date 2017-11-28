/*    */ package android.widget;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.database.DataSetObserver;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AlphabetIndexer
/*    */   extends DataSetObserver
/*    */   implements SectionIndexer
/*    */ {
/*    */   protected CharSequence mAlphabet;
/*    */   protected int mColumnIndex;
/*    */   protected Cursor mDataCursor;
/*    */   
/* 22 */   public AlphabetIndexer(Cursor cursor, int sortedColumnIndex, CharSequence alphabet) { throw new RuntimeException("Stub!"); }
/* 23 */   public Object[] getSections() { throw new RuntimeException("Stub!"); }
/* 24 */   public void setCursor(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 25 */   protected int compare(String word, String letter) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getPositionForSection(int sectionIndex) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getSectionForPosition(int position) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onChanged() { throw new RuntimeException("Stub!"); }
/* 29 */   public void onInvalidated() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\AlphabetIndexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */