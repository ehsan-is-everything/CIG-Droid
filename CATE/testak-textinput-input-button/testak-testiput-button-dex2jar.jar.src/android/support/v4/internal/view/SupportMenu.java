package android.support.v4.internal.view;

import android.view.Menu;

public abstract interface SupportMenu
  extends Menu
{
  public static final int CATEGORY_MASK = -65536;
  public static final int CATEGORY_SHIFT = 16;
  public static final int FLAG_KEEP_OPEN_ON_SUBMENU_OPENED = 4;
  public static final int USER_MASK = 65535;
  public static final int USER_SHIFT;
}


/* Location:              C:\Users\Lab\Desktop\testak-testiput-button-dex2jar.jar!\android\support\v4\internal\view\SupportMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */