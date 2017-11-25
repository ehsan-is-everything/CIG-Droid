package android.view;

import android.graphics.drawable.Drawable;

public abstract interface ContextMenu
  extends Menu
{
  public abstract ContextMenu setHeaderTitle(int paramInt);
  
  public abstract ContextMenu setHeaderTitle(CharSequence paramCharSequence);
  
  public abstract ContextMenu setHeaderIcon(int paramInt);
  
  public abstract ContextMenu setHeaderIcon(Drawable paramDrawable);
  
  public abstract ContextMenu setHeaderView(View paramView);
  
  public abstract void clearHeader();
  
  public static abstract interface ContextMenuInfo {}
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ContextMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */