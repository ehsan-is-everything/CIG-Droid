package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MediaBrowserServiceCompatApi21
{
  public static Object createService(Context paramContext, ServiceCompatProxy paramServiceCompatProxy)
  {
    return new MediaBrowserServiceAdaptor(paramContext, paramServiceCompatProxy);
  }
  
  public static void notifyChildrenChanged(Object paramObject, String paramString)
  {
    ((MediaBrowserService)paramObject).notifyChildrenChanged(paramString);
  }
  
  public static IBinder onBind(Object paramObject, Intent paramIntent)
  {
    return ((MediaBrowserService)paramObject).onBind(paramIntent);
  }
  
  public static void onCreate(Object paramObject)
  {
    ((MediaBrowserService)paramObject).onCreate();
  }
  
  public static void setSessionToken(Object paramObject1, Object paramObject2)
  {
    ((MediaBrowserService)paramObject1).setSessionToken((MediaSession.Token)paramObject2);
  }
  
  static class BrowserRoot
  {
    final Bundle mExtras;
    final String mRootId;
    
    BrowserRoot(String paramString, Bundle paramBundle)
    {
      this.mRootId = paramString;
      this.mExtras = paramBundle;
    }
  }
  
  static class MediaBrowserServiceAdaptor
    extends MediaBrowserService
  {
    final MediaBrowserServiceCompatApi21.ServiceCompatProxy mServiceProxy;
    
    MediaBrowserServiceAdaptor(Context paramContext, MediaBrowserServiceCompatApi21.ServiceCompatProxy paramServiceCompatProxy)
    {
      attachBaseContext(paramContext);
      this.mServiceProxy = paramServiceCompatProxy;
    }
    
    public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
    {
      MediaBrowserServiceCompatApi21.BrowserRoot localBrowserRoot = this.mServiceProxy.onGetRoot(paramString, paramInt, paramBundle);
      if (localBrowserRoot == null) {
        return null;
      }
      return new MediaBrowserService.BrowserRoot(localBrowserRoot.mRootId, localBrowserRoot.mExtras);
    }
    
    public void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
    {
      this.mServiceProxy.onLoadChildren(paramString, new MediaBrowserServiceCompatApi21.ResultWrapper(paramResult));
    }
  }
  
  static class ResultWrapper<T>
  {
    MediaBrowserService.Result mResultObj;
    
    ResultWrapper(MediaBrowserService.Result paramResult)
    {
      this.mResultObj = paramResult;
    }
    
    public void detach()
    {
      this.mResultObj.detach();
    }
    
    List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> paramList)
    {
      Object localObject;
      if (paramList == null) {
        localObject = null;
      }
      for (;;)
      {
        return (List<MediaBrowser.MediaItem>)localObject;
        localObject = new ArrayList();
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          Parcel localParcel = (Parcel)localIterator.next();
          localParcel.setDataPosition(0);
          ((List)localObject).add(MediaBrowser.MediaItem.CREATOR.createFromParcel(localParcel));
          localParcel.recycle();
        }
      }
    }
    
    public void sendResult(T paramT)
    {
      if ((paramT instanceof List))
      {
        this.mResultObj.sendResult(parcelListToItemList((List)paramT));
        return;
      }
      if ((paramT instanceof Parcel))
      {
        Parcel localParcel = (Parcel)paramT;
        this.mResultObj.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(localParcel));
        localParcel.recycle();
        return;
      }
      this.mResultObj.sendResult(null);
    }
  }
  
  public static abstract interface ServiceCompatProxy
  {
    public abstract MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle);
    
    public abstract void onLoadChildren(String paramString, MediaBrowserServiceCompatApi21.ResultWrapper<List<Parcel>> paramResultWrapper);
  }
}


/* Location:              C:\Users\Lab\Desktop\testak-testiput-button-dex2jar.jar!\android\support\v4\media\MediaBrowserServiceCompatApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */