package android.support.v7.app;

import android.app.Notification.MediaStyle;
import android.media.session.MediaSession.Token;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

class NotificationCompatImpl21
{
  public static void addMediaStyle(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor, int[] paramArrayOfInt, Object paramObject)
  {
    Notification.MediaStyle localMediaStyle = new Notification.MediaStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder());
    if (paramArrayOfInt != null) {
      localMediaStyle.setShowActionsInCompactView(paramArrayOfInt);
    }
    if (paramObject != null) {
      localMediaStyle.setMediaSession((MediaSession.Token)paramObject);
    }
  }
}


/* Location:              C:\Users\Lab\Desktop\testak-testiput-button-dex2jar.jar!\android\support\v7\app\NotificationCompatImpl21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */