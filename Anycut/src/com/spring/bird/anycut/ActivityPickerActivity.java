package com.spring.bird.anycut;

import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ResolveInfo.DisplayNameComparator;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ActivityPickerActivity
  extends ListActivity
{
  PackageManager a;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(5);
    setContentView(2130903068);
    getListView().setTextFilterEnabled(true);
    this.a = getPackageManager();
    new b(null).c((Object[])null);
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    ResolveInfo localResolveInfo = ((c)getListAdapter().getItem(paramInt)).a();
    Intent localIntent1 = new Intent();
    localIntent1.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
    Intent localIntent2 = new Intent();
    localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
    localIntent2.putExtra("android.intent.extra.shortcut.NAME", localResolveInfo.loadLabel(this.a));
    Drawable localDrawable = localResolveInfo.loadIcon(this.a);
    if ((localDrawable instanceof BitmapDrawable)) {
      localIntent2.putExtra("android.intent.extra.shortcut.ICON", ((BitmapDrawable)localDrawable).getBitmap());
    }
    setResult(-1, localIntent2);
    finish();
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  private class a
    extends ArrayAdapter<ActivityPickerActivity.c>
  {
    LayoutInflater a;
    
    public a(ArrayList<ActivityPickerActivity.c> paramArrayList)
    {
      super(0, localList);
      this.a = paramArrayList.getLayoutInflater();
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      ActivityPickerActivity.c localc = (ActivityPickerActivity.c)getItem(paramInt);
      if (paramView == null)
      {
        paramView = this.a.inflate(17367043, paramViewGroup, false);
        paramView.setTag(paramView.findViewById(16908308));
      }
      ((TextView)paramView.getTag()).setText(localc.a().loadLabel(ActivityPickerActivity.this.a));
      return paramView;
    }
  }
  
  private final class b
    extends a<Object, Object, ActivityPickerActivity.a>
  {
    private b() {}
    
    public void a()
    {
      ActivityPickerActivity.this.setProgressBarIndeterminateVisibility(true);
    }
    
    public void a(ActivityPickerActivity.a parama)
    {
      ActivityPickerActivity.this.setProgressBarIndeterminateVisibility(false);
      ActivityPickerActivity.this.setListAdapter(parama);
    }
    
    public ActivityPickerActivity.a d(Object... paramVarArgs)
    {
      Intent localIntent = new Intent("android.intent.action.MAIN");
      List localList = ActivityPickerActivity.this.a.queryIntentActivities(localIntent, 0);
      Collections.sort(localList, new ResolveInfo.DisplayNameComparator(ActivityPickerActivity.this.a));
      ArrayList localArrayList = new ArrayList(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        localArrayList.add(new ActivityPickerActivity.c(ActivityPickerActivity.this, localResolveInfo));
      }
      return new ActivityPickerActivity.a(ActivityPickerActivity.this, ActivityPickerActivity.this, localArrayList);
    }
  }
  
  private final class c
  {
    private ResolveInfo b;
    
    public c(ResolveInfo paramResolveInfo)
    {
      this.b = paramResolveInfo;
    }
    
    public ResolveInfo a()
    {
      return this.b;
    }
    
    public String toString()
    {
      return this.b.loadLabel(ActivityPickerActivity.this.a).toString();
    }
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\spring\bird\anycut\ActivityPickerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */