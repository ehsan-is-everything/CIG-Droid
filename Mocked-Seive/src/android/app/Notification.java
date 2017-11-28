/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.drawable.Icon;
/*     */ import android.media.AudioAttributes;
/*     */ import android.media.session.MediaSession.Token;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.widget.RemoteViews;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Notification
/*     */   implements Parcelable
/*     */ {
/*     */   public static class Action
/*     */     implements Parcelable
/*     */   {
/*     */     public static final class Builder
/*     */     {
/*     */       @Deprecated
/*  27 */       public Builder(int icon, CharSequence title, PendingIntent intent) { throw new RuntimeException("Stub!"); }
/*  28 */       public Builder(Icon icon, CharSequence title, PendingIntent intent) { throw new RuntimeException("Stub!"); }
/*  29 */       public Builder(Notification.Action action) { throw new RuntimeException("Stub!"); }
/*  30 */       public Builder addExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/*  31 */       public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  32 */       public Builder addRemoteInput(RemoteInput remoteInput) { throw new RuntimeException("Stub!"); }
/*  33 */       public Builder setAllowGeneratedReplies(boolean allowGeneratedReplies) { throw new RuntimeException("Stub!"); }
/*  34 */       public Builder extend(Notification.Action.Extender extender) { throw new RuntimeException("Stub!"); }
/*  35 */       public Notification.Action build() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static abstract interface Extender {
/*     */       public abstract Notification.Action.Builder extend(Notification.Action.Builder paramBuilder);
/*     */     }
/*     */     
/*     */     public static final class WearableExtender
/*     */       implements Notification.Action.Extender {
/*  44 */       public WearableExtender() { throw new RuntimeException("Stub!"); }
/*  45 */       public WearableExtender(Notification.Action action) { throw new RuntimeException("Stub!"); }
/*  46 */       public Notification.Action.Builder extend(Notification.Action.Builder builder) { throw new RuntimeException("Stub!"); }
/*  47 */       public WearableExtender clone() { throw new RuntimeException("Stub!"); }
/*  48 */       public WearableExtender setAvailableOffline(boolean availableOffline) { throw new RuntimeException("Stub!"); }
/*  49 */       public boolean isAvailableOffline() { throw new RuntimeException("Stub!"); }
/*  50 */       public WearableExtender setInProgressLabel(CharSequence label) { throw new RuntimeException("Stub!"); }
/*  51 */       public CharSequence getInProgressLabel() { throw new RuntimeException("Stub!"); }
/*  52 */       public WearableExtender setConfirmLabel(CharSequence label) { throw new RuntimeException("Stub!"); }
/*  53 */       public CharSequence getConfirmLabel() { throw new RuntimeException("Stub!"); }
/*  54 */       public WearableExtender setCancelLabel(CharSequence label) { throw new RuntimeException("Stub!"); }
/*  55 */       public CharSequence getCancelLabel() { throw new RuntimeException("Stub!"); }
/*  56 */       public WearableExtender setHintLaunchesActivity(boolean hintLaunchesActivity) { throw new RuntimeException("Stub!"); }
/*  57 */       public boolean getHintLaunchesActivity() { throw new RuntimeException("Stub!"); }
/*  58 */       public WearableExtender setHintDisplayActionInline(boolean hintDisplayInline) { throw new RuntimeException("Stub!"); }
/*  59 */       public boolean getHintDisplayActionInline() { throw new RuntimeException("Stub!"); } }
/*     */     
/*     */     @Deprecated
/*  62 */     public Action(int icon, CharSequence title, PendingIntent intent) { throw new RuntimeException("Stub!"); }
/*  63 */     public Icon getIcon() { throw new RuntimeException("Stub!"); }
/*  64 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  65 */     public boolean getAllowGeneratedReplies() { throw new RuntimeException("Stub!"); }
/*  66 */     public RemoteInput[] getRemoteInputs() { throw new RuntimeException("Stub!"); }
/*  67 */     public RemoteInput[] getDataOnlyRemoteInputs() { throw new RuntimeException("Stub!"); }
/*  68 */     public Action clone() { throw new RuntimeException("Stub!"); }
/*  69 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  70 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */     public static final Parcelable.Creator<Action> CREATOR = null;
/*     */     public PendingIntent actionIntent;
/*     */     @Deprecated
/*     */     public int icon; public CharSequence title; }
/*  80 */   public static class Builder { public Builder(Context context, String channelId) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  82 */     public Builder(Context context) { throw new RuntimeException("Stub!"); }
/*  83 */     public Builder setShortcutId(String shortcutId) { throw new RuntimeException("Stub!"); }
/*  84 */     public Builder setBadgeIconType(int icon) { throw new RuntimeException("Stub!"); }
/*  85 */     public Builder setGroupAlertBehavior(int groupAlertBehavior) { throw new RuntimeException("Stub!"); }
/*  86 */     public Builder setChannelId(String channelId) { throw new RuntimeException("Stub!"); }
/*  87 */     public Builder setTimeoutAfter(long durationMs) { throw new RuntimeException("Stub!"); }
/*  88 */     public Builder setWhen(long when) { throw new RuntimeException("Stub!"); }
/*  89 */     public Builder setShowWhen(boolean show) { throw new RuntimeException("Stub!"); }
/*  90 */     public Builder setUsesChronometer(boolean b) { throw new RuntimeException("Stub!"); }
/*  91 */     public Builder setChronometerCountDown(boolean countDown) { throw new RuntimeException("Stub!"); }
/*  92 */     public Builder setSmallIcon(int icon) { throw new RuntimeException("Stub!"); }
/*  93 */     public Builder setSmallIcon(int icon, int level) { throw new RuntimeException("Stub!"); }
/*  94 */     public Builder setSmallIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/*  95 */     public Builder setContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/*  96 */     public Builder setContentText(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  97 */     public Builder setSubText(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  98 */     public Builder setSettingsText(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  99 */     public Builder setRemoteInputHistory(CharSequence[] text) { throw new RuntimeException("Stub!"); }
/* 100 */     public Builder setNumber(int number) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 102 */     public Builder setContentInfo(CharSequence info) { throw new RuntimeException("Stub!"); }
/* 103 */     public Builder setProgress(int max, int progress, boolean indeterminate) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 105 */     public Builder setContent(RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 106 */     public Builder setCustomContentView(RemoteViews contentView) { throw new RuntimeException("Stub!"); }
/* 107 */     public Builder setCustomBigContentView(RemoteViews contentView) { throw new RuntimeException("Stub!"); }
/* 108 */     public Builder setCustomHeadsUpContentView(RemoteViews contentView) { throw new RuntimeException("Stub!"); }
/* 109 */     public Builder setContentIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); }
/* 110 */     public Builder setDeleteIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); }
/* 111 */     public Builder setFullScreenIntent(PendingIntent intent, boolean highPriority) { throw new RuntimeException("Stub!"); }
/* 112 */     public Builder setTicker(CharSequence tickerText) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 114 */     public Builder setTicker(CharSequence tickerText, RemoteViews views) { throw new RuntimeException("Stub!"); }
/* 115 */     public Builder setLargeIcon(Bitmap b) { throw new RuntimeException("Stub!"); }
/* 116 */     public Builder setLargeIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 118 */     public Builder setSound(Uri sound) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 120 */     public Builder setSound(Uri sound, int streamType) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 122 */     public Builder setSound(Uri sound, AudioAttributes audioAttributes) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 124 */     public Builder setVibrate(long[] pattern) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 126 */     public Builder setLights(int argb, int onMs, int offMs) { throw new RuntimeException("Stub!"); }
/* 127 */     public Builder setOngoing(boolean ongoing) { throw new RuntimeException("Stub!"); }
/* 128 */     public Builder setColorized(boolean colorize) { throw new RuntimeException("Stub!"); }
/* 129 */     public Builder setOnlyAlertOnce(boolean onlyAlertOnce) { throw new RuntimeException("Stub!"); }
/* 130 */     public Builder setAutoCancel(boolean autoCancel) { throw new RuntimeException("Stub!"); }
/* 131 */     public Builder setLocalOnly(boolean localOnly) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 133 */     public Builder setDefaults(int defaults) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 135 */     public Builder setPriority(int pri) { throw new RuntimeException("Stub!"); }
/* 136 */     public Builder setCategory(String category) { throw new RuntimeException("Stub!"); }
/* 137 */     public Builder addPerson(String uri) { throw new RuntimeException("Stub!"); }
/* 138 */     public Builder setGroup(String groupKey) { throw new RuntimeException("Stub!"); }
/* 139 */     public Builder setGroupSummary(boolean isGroupSummary) { throw new RuntimeException("Stub!"); }
/* 140 */     public Builder setSortKey(String sortKey) { throw new RuntimeException("Stub!"); }
/* 141 */     public Builder addExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 142 */     public Builder setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 143 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 145 */     public Builder addAction(int icon, CharSequence title, PendingIntent intent) { throw new RuntimeException("Stub!"); }
/* 146 */     public Builder addAction(Notification.Action action) { throw new RuntimeException("Stub!"); }
/* 147 */     public Builder setActions(Notification.Action... actions) { throw new RuntimeException("Stub!"); }
/* 148 */     public Builder setStyle(Notification.Style style) { throw new RuntimeException("Stub!"); }
/* 149 */     public Builder setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 150 */     public Builder setPublicVersion(Notification n) { throw new RuntimeException("Stub!"); }
/* 151 */     public Builder extend(Notification.Extender extender) { throw new RuntimeException("Stub!"); }
/* 152 */     public Builder setColor(int argb) { throw new RuntimeException("Stub!"); }
/* 153 */     public RemoteViews createContentView() { throw new RuntimeException("Stub!"); }
/* 154 */     public RemoteViews createBigContentView() { throw new RuntimeException("Stub!"); }
/* 155 */     public RemoteViews createHeadsUpContentView() { throw new RuntimeException("Stub!"); }
/* 156 */     public static Builder recoverBuilder(Context context, Notification n) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 158 */     public Notification getNotification() { throw new RuntimeException("Stub!"); }
/* 159 */     public Notification build() { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static abstract class Style { protected Notification.Builder mBuilder;
/*     */     
/* 163 */     public Style() { throw new RuntimeException("Stub!"); }
/* 164 */     protected void internalSetBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 165 */     protected void internalSetSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); }
/* 166 */     public void setBuilder(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 167 */     protected void checkBuilder() { throw new RuntimeException("Stub!"); }
/* 168 */     protected RemoteViews getStandardView(int layoutId) { throw new RuntimeException("Stub!"); }
/* 169 */     public Notification build() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class BigPictureStyle
/*     */     extends Notification.Style
/*     */   {
/* 175 */     public BigPictureStyle() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 177 */     public BigPictureStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 178 */     public BigPictureStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 179 */     public BigPictureStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); }
/* 180 */     public BigPictureStyle bigPicture(Bitmap b) { throw new RuntimeException("Stub!"); }
/* 181 */     public BigPictureStyle bigLargeIcon(Bitmap b) { throw new RuntimeException("Stub!"); }
/* 182 */     public BigPictureStyle bigLargeIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class BigTextStyle
/*     */     extends Notification.Style {
/* 187 */     public BigTextStyle() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 189 */     public BigTextStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 190 */     public BigTextStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 191 */     public BigTextStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); }
/* 192 */     public BigTextStyle bigText(CharSequence cs) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class MessagingStyle extends Notification.Style {
/*     */     public static final int MAXIMUM_RETAINED_MESSAGES = 25;
/*     */     
/*     */     public static final class Message {
/* 199 */       public Message(CharSequence text, long timestamp, CharSequence sender) { throw new RuntimeException("Stub!"); }
/* 200 */       public Message setData(String dataMimeType, Uri dataUri) { throw new RuntimeException("Stub!"); }
/* 201 */       public CharSequence getText() { throw new RuntimeException("Stub!"); }
/* 202 */       public long getTimestamp() { throw new RuntimeException("Stub!"); }
/* 203 */       public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 204 */       public CharSequence getSender() { throw new RuntimeException("Stub!"); }
/* 205 */       public String getDataMimeType() { throw new RuntimeException("Stub!"); }
/* 206 */       public Uri getDataUri() { throw new RuntimeException("Stub!"); } }
/*     */     
/* 208 */     public MessagingStyle(CharSequence userDisplayName) { throw new RuntimeException("Stub!"); }
/* 209 */     public CharSequence getUserDisplayName() { throw new RuntimeException("Stub!"); }
/* 210 */     public MessagingStyle setConversationTitle(CharSequence conversationTitle) { throw new RuntimeException("Stub!"); }
/* 211 */     public CharSequence getConversationTitle() { throw new RuntimeException("Stub!"); }
/* 212 */     public MessagingStyle addMessage(CharSequence text, long timestamp, CharSequence sender) { throw new RuntimeException("Stub!"); }
/* 213 */     public MessagingStyle addMessage(Message message) { throw new RuntimeException("Stub!"); }
/* 214 */     public MessagingStyle addHistoricMessage(Message message) { throw new RuntimeException("Stub!"); }
/* 215 */     public List<Message> getMessages() { throw new RuntimeException("Stub!"); }
/* 216 */     public List<Message> getHistoricMessages() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class InboxStyle
/*     */     extends Notification.Style
/*     */   {
/* 222 */     public InboxStyle() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 224 */     public InboxStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 225 */     public InboxStyle setBigContentTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 226 */     public InboxStyle setSummaryText(CharSequence cs) { throw new RuntimeException("Stub!"); }
/* 227 */     public InboxStyle addLine(CharSequence cs) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class MediaStyle
/*     */     extends Notification.Style {
/* 232 */     public MediaStyle() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 234 */     public MediaStyle(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 235 */     public MediaStyle setShowActionsInCompactView(int... actions) { throw new RuntimeException("Stub!"); }
/* 236 */     public MediaStyle setMediaSession(MediaSession.Token token) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class DecoratedCustomViewStyle extends Notification.Style {
/*     */     public DecoratedCustomViewStyle() {
/* 241 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static class DecoratedMediaCustomViewStyle extends Notification.MediaStyle {
/* 246 */     public DecoratedMediaCustomViewStyle() { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static abstract interface Extender { public abstract Notification.Builder extend(Notification.Builder paramBuilder); }
/*     */   
/*     */   public static final class WearableExtender implements Notification.Extender { public static final int SCREEN_TIMEOUT_LONG = -1;
/*     */     public static final int SCREEN_TIMEOUT_SHORT = 0;
/*     */     public static final int SIZE_DEFAULT = 0;
/*     */     public static final int SIZE_FULL_SCREEN = 5;
/*     */     
/* 255 */     public WearableExtender() { throw new RuntimeException("Stub!"); }
/* 256 */     public WearableExtender(Notification notif) { throw new RuntimeException("Stub!"); }
/* 257 */     public Notification.Builder extend(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 258 */     public WearableExtender clone() { throw new RuntimeException("Stub!"); }
/* 259 */     public WearableExtender addAction(Notification.Action action) { throw new RuntimeException("Stub!"); }
/* 260 */     public WearableExtender addActions(List<Notification.Action> actions) { throw new RuntimeException("Stub!"); }
/* 261 */     public WearableExtender clearActions() { throw new RuntimeException("Stub!"); }
/* 262 */     public List<Notification.Action> getActions() { throw new RuntimeException("Stub!"); }
/* 263 */     public WearableExtender setDisplayIntent(PendingIntent intent) { throw new RuntimeException("Stub!"); }
/* 264 */     public PendingIntent getDisplayIntent() { throw new RuntimeException("Stub!"); }
/* 265 */     public WearableExtender addPage(Notification page) { throw new RuntimeException("Stub!"); }
/* 266 */     public WearableExtender addPages(List<Notification> pages) { throw new RuntimeException("Stub!"); }
/* 267 */     public WearableExtender clearPages() { throw new RuntimeException("Stub!"); }
/* 268 */     public List<Notification> getPages() { throw new RuntimeException("Stub!"); }
/* 269 */     public WearableExtender setBackground(Bitmap background) { throw new RuntimeException("Stub!"); }
/* 270 */     public Bitmap getBackground() { throw new RuntimeException("Stub!"); }
/* 271 */     public WearableExtender setContentIcon(int icon) { throw new RuntimeException("Stub!"); }
/* 272 */     public int getContentIcon() { throw new RuntimeException("Stub!"); }
/* 273 */     public WearableExtender setContentIconGravity(int contentIconGravity) { throw new RuntimeException("Stub!"); }
/* 274 */     public int getContentIconGravity() { throw new RuntimeException("Stub!"); }
/* 275 */     public WearableExtender setContentAction(int actionIndex) { throw new RuntimeException("Stub!"); }
/* 276 */     public int getContentAction() { throw new RuntimeException("Stub!"); }
/* 277 */     public WearableExtender setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 278 */     public int getGravity() { throw new RuntimeException("Stub!"); }
/* 279 */     public WearableExtender setCustomSizePreset(int sizePreset) { throw new RuntimeException("Stub!"); }
/* 280 */     public int getCustomSizePreset() { throw new RuntimeException("Stub!"); }
/* 281 */     public WearableExtender setCustomContentHeight(int height) { throw new RuntimeException("Stub!"); }
/* 282 */     public int getCustomContentHeight() { throw new RuntimeException("Stub!"); }
/* 283 */     public WearableExtender setStartScrollBottom(boolean startScrollBottom) { throw new RuntimeException("Stub!"); }
/* 284 */     public boolean getStartScrollBottom() { throw new RuntimeException("Stub!"); }
/* 285 */     public WearableExtender setContentIntentAvailableOffline(boolean contentIntentAvailableOffline) { throw new RuntimeException("Stub!"); }
/* 286 */     public boolean getContentIntentAvailableOffline() { throw new RuntimeException("Stub!"); }
/* 287 */     public WearableExtender setHintHideIcon(boolean hintHideIcon) { throw new RuntimeException("Stub!"); }
/* 288 */     public boolean getHintHideIcon() { throw new RuntimeException("Stub!"); }
/* 289 */     public WearableExtender setHintShowBackgroundOnly(boolean hintShowBackgroundOnly) { throw new RuntimeException("Stub!"); }
/* 290 */     public boolean getHintShowBackgroundOnly() { throw new RuntimeException("Stub!"); }
/* 291 */     public WearableExtender setHintAvoidBackgroundClipping(boolean hintAvoidBackgroundClipping) { throw new RuntimeException("Stub!"); }
/* 292 */     public boolean getHintAvoidBackgroundClipping() { throw new RuntimeException("Stub!"); }
/* 293 */     public WearableExtender setHintScreenTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 294 */     public int getHintScreenTimeout() { throw new RuntimeException("Stub!"); }
/* 295 */     public WearableExtender setHintAmbientBigPicture(boolean hintAmbientBigPicture) { throw new RuntimeException("Stub!"); }
/* 296 */     public boolean getHintAmbientBigPicture() { throw new RuntimeException("Stub!"); }
/* 297 */     public WearableExtender setHintContentIntentLaunchesActivity(boolean hintContentIntentLaunchesActivity) { throw new RuntimeException("Stub!"); }
/* 298 */     public boolean getHintContentIntentLaunchesActivity() { throw new RuntimeException("Stub!"); }
/* 299 */     public WearableExtender setDismissalId(String dismissalId) { throw new RuntimeException("Stub!"); }
/* 300 */     public String getDismissalId() { throw new RuntimeException("Stub!"); }
/* 301 */     public WearableExtender setBridgeTag(String bridgeTag) { throw new RuntimeException("Stub!"); }
/* 302 */     public String getBridgeTag() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final int SIZE_LARGE = 4;
/*     */     
/*     */     public static final int SIZE_MEDIUM = 3;
/*     */     public static final int SIZE_SMALL = 2;
/*     */     public static final int SIZE_XSMALL = 1;
/*     */     public static final int UNSET_ACTION_INDEX = -1;
/*     */   }
/*     */   
/*     */   public static final class CarExtender
/*     */     implements Notification.Extender
/*     */   {
/*     */     public static class UnreadConversation
/*     */     {
/* 318 */       UnreadConversation() { throw new RuntimeException("Stub!"); }
/* 319 */       public String[] getMessages() { throw new RuntimeException("Stub!"); }
/* 320 */       public RemoteInput getRemoteInput() { throw new RuntimeException("Stub!"); }
/* 321 */       public PendingIntent getReplyPendingIntent() { throw new RuntimeException("Stub!"); }
/* 322 */       public PendingIntent getReadPendingIntent() { throw new RuntimeException("Stub!"); }
/* 323 */       public String[] getParticipants() { throw new RuntimeException("Stub!"); }
/* 324 */       public String getParticipant() { throw new RuntimeException("Stub!"); }
/* 325 */       public long getLatestTimestamp() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static class Builder {
/* 329 */       public Builder(String name) { throw new RuntimeException("Stub!"); }
/* 330 */       public Builder addMessage(String message) { throw new RuntimeException("Stub!"); }
/* 331 */       public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) { throw new RuntimeException("Stub!"); }
/* 332 */       public Builder setReadPendingIntent(PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
/* 333 */       public Builder setLatestTimestamp(long timestamp) { throw new RuntimeException("Stub!"); }
/* 334 */       public Notification.CarExtender.UnreadConversation build() { throw new RuntimeException("Stub!"); } }
/*     */     
/* 336 */     public CarExtender() { throw new RuntimeException("Stub!"); }
/* 337 */     public CarExtender(Notification notif) { throw new RuntimeException("Stub!"); }
/* 338 */     public Notification.Builder extend(Notification.Builder builder) { throw new RuntimeException("Stub!"); }
/* 339 */     public CarExtender setColor(int color) { throw new RuntimeException("Stub!"); }
/* 340 */     public int getColor() { throw new RuntimeException("Stub!"); }
/* 341 */     public CarExtender setLargeIcon(Bitmap largeIcon) { throw new RuntimeException("Stub!"); }
/* 342 */     public Bitmap getLargeIcon() { throw new RuntimeException("Stub!"); }
/* 343 */     public CarExtender setUnreadConversation(UnreadConversation unreadConversation) { throw new RuntimeException("Stub!"); }
/* 344 */     public UnreadConversation getUnreadConversation() { throw new RuntimeException("Stub!"); } }
/*     */   
/* 346 */   public Notification() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 348 */   public Notification(int icon, CharSequence tickerText, long when) { throw new RuntimeException("Stub!"); }
/*     */   
/* 350 */   public Notification(Parcel parcel) { throw new RuntimeException("Stub!"); }
/* 351 */   public String getGroup() { throw new RuntimeException("Stub!"); }
/* 352 */   public String getSortKey() { throw new RuntimeException("Stub!"); }
/* 353 */   public Notification clone() { throw new RuntimeException("Stub!"); }
/* 354 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 355 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 356 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 357 */   public String getChannelId() { throw new RuntimeException("Stub!"); }
/* 358 */   public long getTimeoutAfter() { throw new RuntimeException("Stub!"); }
/* 359 */   public int getBadgeIconType() { throw new RuntimeException("Stub!"); }
/* 360 */   public String getShortcutId() { throw new RuntimeException("Stub!"); }
/* 361 */   public CharSequence getSettingsText() { throw new RuntimeException("Stub!"); }
/* 362 */   public int getGroupAlertBehavior() { throw new RuntimeException("Stub!"); }
/* 363 */   public Icon getSmallIcon() { throw new RuntimeException("Stub!"); }
/* 364 */   public Icon getLargeIcon() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */   public Action[] actions = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   @Deprecated
/* 496 */   public long[] vibrate = null;
/*     */   
/*     */ 
/*     */ 
/* 500 */   public static final AudioAttributes AUDIO_ATTRIBUTES_DEFAULT = null; public static final Parcelable.Creator<Notification> CREATOR = null;
/*     */   public static final int BADGE_ICON_LARGE = 2;
/*     */   public static final int BADGE_ICON_NONE = 0;
/*     */   public static final int BADGE_ICON_SMALL = 1;
/*     */   public static final String CATEGORY_ALARM = "alarm";
/*     */   public static final String CATEGORY_CALL = "call";
/*     */   public static final String CATEGORY_EMAIL = "email";
/*     */   public static final String CATEGORY_ERROR = "err";
/*     */   public static final String CATEGORY_EVENT = "event";
/*     */   public static final String CATEGORY_MESSAGE = "msg";
/*     */   public static final String CATEGORY_PROGRESS = "progress";
/*     */   public static final String CATEGORY_PROMO = "promo";
/*     */   public static final String CATEGORY_RECOMMENDATION = "recommendation";
/*     */   public static final String CATEGORY_REMINDER = "reminder";
/*     */   public static final String CATEGORY_SERVICE = "service";
/*     */   public static final String CATEGORY_SOCIAL = "social";
/*     */   public static final String CATEGORY_STATUS = "status";
/*     */   public static final String CATEGORY_SYSTEM = "sys";
/*     */   public static final String CATEGORY_TRANSPORT = "transport";
/*     */   public static final int COLOR_DEFAULT = 0;
/*     */   public static final int DEFAULT_ALL = -1;
/*     */   public static final int DEFAULT_LIGHTS = 4;
/*     */   public static final int DEFAULT_SOUND = 1;
/*     */   public static final int DEFAULT_VIBRATE = 2;
/*     */   public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
/*     */   public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
/*     */   public static final String EXTRA_BIG_TEXT = "android.bigText";
/*     */   public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
/*     */   public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
/*     */   public static final String EXTRA_COLORIZED = "android.colorized";
/*     */   public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
/*     */   public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
/*     */   public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
/*     */   public static final String EXTRA_INFO_TEXT = "android.infoText";
/*     */   @Deprecated
/*     */   public static final String EXTRA_LARGE_ICON = "android.largeIcon";
/*     */   public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
/*     */   public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
/*     */   public static final String EXTRA_MESSAGES = "android.messages";
/*     */   public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
/*     */   public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
/*     */   public static final String EXTRA_PEOPLE = "android.people";
/*     */   public static final String EXTRA_PICTURE = "android.picture";
/*     */   public static final String EXTRA_PROGRESS = "android.progress";
/*     */   public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
/*     */   public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
/*     */   public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
/*     */   public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
/*     */   public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
/*     */   public static final String EXTRA_SHOW_WHEN = "android.showWhen";
/*     */   @Deprecated
/*     */   public static final String EXTRA_SMALL_ICON = "android.icon";
/*     */   public static final String EXTRA_SUB_TEXT = "android.subText";
/*     */   public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
/*     */   public static final String EXTRA_TEMPLATE = "android.template";
/*     */   public static final String EXTRA_TEXT = "android.text";
/*     */   public static final String EXTRA_TEXT_LINES = "android.textLines";
/*     */   public static final String EXTRA_TITLE = "android.title";
/*     */   public static final String EXTRA_TITLE_BIG = "android.title.big";
/*     */   public static final int FLAG_AUTO_CANCEL = 16;
/*     */   public static final int FLAG_FOREGROUND_SERVICE = 64;
/*     */   public static final int FLAG_GROUP_SUMMARY = 512;
/*     */   @Deprecated
/*     */   public static final int FLAG_HIGH_PRIORITY = 128;
/*     */   public static final int FLAG_INSISTENT = 4;
/*     */   public static final int FLAG_LOCAL_ONLY = 256;
/*     */   public static final int FLAG_NO_CLEAR = 32;
/*     */   public static final int FLAG_ONGOING_EVENT = 2;
/*     */   public static final int FLAG_ONLY_ALERT_ONCE = 8;
/*     */   @Deprecated
/*     */   public static final int FLAG_SHOW_LIGHTS = 1;
/*     */   public static final int GROUP_ALERT_ALL = 0;
/*     */   public static final int GROUP_ALERT_CHILDREN = 2;
/*     */   public static final int GROUP_ALERT_SUMMARY = 1;
/*     */   public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
/*     */   @Deprecated
/*     */   public static final int PRIORITY_DEFAULT = 0;
/*     */   @Deprecated
/*     */   public static final int PRIORITY_HIGH = 1;
/*     */   @Deprecated
/*     */   public static final int PRIORITY_LOW = -1;
/*     */   @Deprecated
/*     */   public static final int PRIORITY_MAX = 2;
/*     */   @Deprecated
/*     */   public static final int PRIORITY_MIN = -2;
/*     */   @Deprecated
/*     */   public static final int STREAM_DEFAULT = -1;
/*     */   public static final int VISIBILITY_PRIVATE = 0;
/*     */   public static final int VISIBILITY_PUBLIC = 1;
/*     */   public static final int VISIBILITY_SECRET = -1;
/*     */   @Deprecated
/*     */   public AudioAttributes audioAttributes;
/*     */   @Deprecated
/*     */   public int audioStreamType;
/*     */   @Deprecated
/*     */   public RemoteViews bigContentView;
/*     */   public String category;
/*     */   public int color;
/*     */   public PendingIntent contentIntent;
/*     */   @Deprecated
/*     */   public RemoteViews contentView;
/*     */   @Deprecated
/*     */   public int defaults;
/*     */   public PendingIntent deleteIntent;
/*     */   public Bundle extras;
/*     */   public int flags;
/*     */   public PendingIntent fullScreenIntent;
/*     */   @Deprecated
/*     */   public RemoteViews headsUpContentView;
/*     */   @Deprecated
/*     */   public int icon;
/*     */   public int iconLevel;
/*     */   @Deprecated
/*     */   public Bitmap largeIcon;
/*     */   @Deprecated
/*     */   public int ledARGB;
/*     */   @Deprecated
/*     */   public int ledOffMS;
/*     */   @Deprecated
/*     */   public int ledOnMS;
/*     */   public int number;
/*     */   @Deprecated
/*     */   public int priority;
/*     */   public Notification publicVersion;
/*     */   @Deprecated
/*     */   public Uri sound;
/*     */   public CharSequence tickerText;
/*     */   @Deprecated
/*     */   public RemoteViews tickerView;
/*     */   public int visibility;
/*     */   public long when;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\Notification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */