package android.view.inputmethod;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract interface InputMethodSession
{
  public abstract void finishInput();
  
  public abstract void updateSelection(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public abstract void viewClicked(boolean paramBoolean);
  
  public abstract void updateCursor(Rect paramRect);
  
  public abstract void displayCompletions(CompletionInfo[] paramArrayOfCompletionInfo);
  
  public abstract void updateExtractedText(int paramInt, ExtractedText paramExtractedText);
  
  public abstract void dispatchKeyEvent(int paramInt, KeyEvent paramKeyEvent, EventCallback paramEventCallback);
  
  public abstract void dispatchTrackballEvent(int paramInt, MotionEvent paramMotionEvent, EventCallback paramEventCallback);
  
  public abstract void dispatchGenericMotionEvent(int paramInt, MotionEvent paramMotionEvent, EventCallback paramEventCallback);
  
  public abstract void appPrivateCommand(String paramString, Bundle paramBundle);
  
  public abstract void toggleSoftInput(int paramInt1, int paramInt2);
  
  public abstract void updateCursorAnchorInfo(CursorAnchorInfo paramCursorAnchorInfo);
  
  public static abstract interface EventCallback
  {
    public abstract void finishedEvent(int paramInt, boolean paramBoolean);
  }
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\InputMethodSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */