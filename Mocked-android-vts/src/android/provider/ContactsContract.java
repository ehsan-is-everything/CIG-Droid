/*     */ package android.provider;
/*     */ 
/*     */ import android.net.Uri;
/*     */ 
/*     */ public final class ContactsContract { public static final String AUTHORITY = "com.android.contacts";
/*     */   
/*     */   public static final class Directory implements BaseColumns { public static final String TYPE_RESOURCE_ID = "typeResourceId";
/*     */     public static final int SHORTCUT_SUPPORT_NONE = 0;
/*     */     public static final int SHORTCUT_SUPPORT_FULL = 2;
/*     */     public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;
/*     */     public static final String SHORTCUT_SUPPORT = "shortcutSupport";
/*     */     public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;
/*     */     public static final int PHOTO_SUPPORT_NONE = 0;
/*     */     public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;
/*     */     public static final int PHOTO_SUPPORT_FULL = 3;
/*     */     public static final String PHOTO_SUPPORT = "photoSupport";
/*     */     public static final String PACKAGE_NAME = "packageName";
/*     */     public static final long LOCAL_INVISIBLE = 1L;
/*     */     public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;
/*     */     public static final int EXPORT_SUPPORT_NONE = 0;
/*     */     public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;
/*     */     public static final String EXPORT_SUPPORT = "exportSupport";
/*     */     public static final long ENTERPRISE_LOCAL_INVISIBLE = 1000000001L; public static final long ENTERPRISE_DEFAULT = 1000000000L;
/*  24 */     Directory() { throw new RuntimeException("Stub!"); }
/*  25 */     public static boolean isRemoteDirectoryId(long directoryId) { throw new RuntimeException("Stub!"); }
/*  26 */     public static boolean isEnterpriseDirectoryId(long directoryId) { throw new RuntimeException("Stub!"); }
/*  27 */     public static void notifyDirectoryChange(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
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
/*  56 */     public static final Uri ENTERPRISE_CONTENT_URI = null; public static final String DISPLAY_NAME = "displayName"; public static final String DIRECTORY_AUTHORITY = "authority"; public static final long DEFAULT = 0L; public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";
/*     */     public static final String CALLER_PACKAGE_PARAM_KEY = "callerPackage"; public static final String ACCOUNT_TYPE = "accountType"; public static final String ACCOUNT_NAME = "accountName"; }
/*     */   public static final class SyncState implements SyncStateContract.Columns { public static final String CONTENT_DIRECTORY = "syncstate";
/*  61 */     SyncState() { throw new RuntimeException("Stub!"); }
/*  62 */     public static byte[] get(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  63 */     public static android.util.Pair<Uri, byte[]> getWithUri(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  64 */     public static void set(android.content.ContentProviderClient provider, android.accounts.Account account, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  65 */     public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account account, byte[] data) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*  68 */     public static final Uri CONTENT_URI = null;
/*     */   }
/*     */   
/*     */   public static final class ProfileSyncState implements SyncStateContract.Columns { public static final String CONTENT_DIRECTORY = "syncstate";
/*     */     
/*  73 */     ProfileSyncState() { throw new RuntimeException("Stub!"); }
/*  74 */     public static byte[] get(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  75 */     public static android.util.Pair<Uri, byte[]> getWithUri(android.content.ContentProviderClient provider, android.accounts.Account account) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  76 */     public static void set(android.content.ContentProviderClient provider, android.accounts.Account account, byte[] data) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
/*  77 */     public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account account, byte[] data) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*  80 */     public static final Uri CONTENT_URI = null;
/*     */   }
/*     */   
/*     */   protected static abstract interface BaseSyncColumns {
/*     */     public static final String SYNC1 = "sync1";
/*     */     public static final String SYNC2 = "sync2";
/*     */     public static final String SYNC3 = "sync3";
/*     */     public static final String SYNC4 = "sync4";
/*     */   }
/*     */   
/*     */   protected static abstract interface SyncColumns extends ContactsContract.BaseSyncColumns {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String DIRTY = "dirty";
/*     */     public static final String SOURCE_ID = "sourceid";
/*     */     public static final String VERSION = "version";
/*     */   }
/*     */   
/*     */   protected static abstract interface ContactOptionsColumns {
/*     */     public static final String CUSTOM_RINGTONE = "custom_ringtone";
/*     */     public static final String LAST_TIME_CONTACTED = "last_time_contacted";
/*     */     public static final String PINNED = "pinned";
/*     */     public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
/*     */     public static final String STARRED = "starred";
/*     */     public static final String TIMES_CONTACTED = "times_contacted";
/*     */   }
/*     */   
/*     */   protected static abstract interface ContactsColumns {
/*     */     public static final String CONTACT_LAST_UPDATED_TIMESTAMP = "contact_last_updated_timestamp";
/*     */     public static final String DISPLAY_NAME = "display_name";
/*     */     public static final String HAS_PHONE_NUMBER = "has_phone_number";
/*     */     public static final String IN_DEFAULT_DIRECTORY = "in_default_directory";
/*     */     public static final String IN_VISIBLE_GROUP = "in_visible_group";
/*     */     public static final String IS_USER_PROFILE = "is_user_profile";
/*     */     public static final String LOOKUP_KEY = "lookup";
/*     */     public static final String NAME_RAW_CONTACT_ID = "name_raw_contact_id";
/*     */     public static final String PHOTO_FILE_ID = "photo_file_id";
/*     */     public static final String PHOTO_ID = "photo_id";
/*     */     public static final String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";
/*     */     public static final String PHOTO_URI = "photo_uri";
/*     */   }
/*     */   
/*     */   protected static abstract interface ContactStatusColumns {
/*     */     public static final String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";
/*     */     public static final String CONTACT_PRESENCE = "contact_presence";
/*     */     public static final String CONTACT_STATUS = "contact_status";
/*     */     public static final String CONTACT_STATUS_ICON = "contact_status_icon";
/*     */     public static final String CONTACT_STATUS_LABEL = "contact_status_label";
/*     */     public static final String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";
/*     */     public static final String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";
/*     */   }
/*     */   
/*     */   public static abstract interface FullNameStyle {
/*     */     public static final int CHINESE = 3;
/*     */     public static final int CJK = 2;
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */     public static final int UNDEFINED = 0;
/*     */     public static final int WESTERN = 1;
/*     */   }
/*     */   
/*     */   public static abstract interface PhoneticNameStyle {
/*     */     public static final int JAPANESE = 4;
/*     */     public static final int KOREAN = 5;
/*     */     public static final int PINYIN = 3;
/*     */     public static final int UNDEFINED = 0;
/*     */   }
/*     */   
/*     */   public static abstract interface DisplayNameSources {
/*     */     public static final int EMAIL = 10;
/*     */     public static final int NICKNAME = 35;
/*     */     public static final int ORGANIZATION = 30;
/*     */     public static final int PHONE = 20;
/*     */     public static final int STRUCTURED_NAME = 40;
/*     */     public static final int STRUCTURED_PHONETIC_NAME = 37;
/*     */     public static final int UNDEFINED = 0;
/*     */   }
/*     */   
/*     */   protected static abstract interface ContactNameColumns { public static final String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";
/*     */     public static final String DISPLAY_NAME_PRIMARY = "display_name";
/*     */     public static final String DISPLAY_NAME_SOURCE = "display_name_source";
/*     */     public static final String PHONETIC_NAME = "phonetic_name";
/*     */     public static final String PHONETIC_NAME_STYLE = "phonetic_name_style";
/*     */     public static final String SORT_KEY_ALTERNATIVE = "sort_key_alt";
/*     */     public static final String SORT_KEY_PRIMARY = "sort_key";
/*     */   }
/*     */   
/*     */   public static class Contacts implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactStatusColumns { public static final String QUERY_PARAMETER_VCARD_NO_PHOTO = "no_photo";
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */     
/*     */     public static final class Data implements BaseColumns, ContactsContract.DataColumns { public static final String CONTENT_DIRECTORY = "data";
/*     */       
/* 174 */       Data() { throw new RuntimeException("Stub!"); } }
/*     */     
/*     */     public static final class Entity implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.RawContactsColumns, ContactsContract.BaseSyncColumns, ContactsContract.SyncColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, ContactsContract.DataUsageStatColumns { public static final String CONTENT_DIRECTORY = "entities";
/*     */       public static final String DATA_ID = "data_id";
/*     */       public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */       
/* 180 */       Entity() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class AggregationSuggestions
/*     */       implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "suggestions";
/*     */       
/*     */       public static final class Builder
/*     */       {
/* 190 */         public Builder() { throw new RuntimeException("Stub!"); }
/* 191 */         public Builder setContactId(long contactId) { throw new RuntimeException("Stub!"); }
/* 192 */         public Builder addNameParameter(String name) { throw new RuntimeException("Stub!"); }
/* 193 */         public Builder setLimit(int limit) { throw new RuntimeException("Stub!"); }
/* 194 */         public Uri build() { throw new RuntimeException("Stub!"); } }
/*     */       
/* 196 */       AggregationSuggestions() { throw new RuntimeException("Stub!"); } }
/*     */     
/*     */     public static final class Photo implements BaseColumns, ContactsContract.DataColumnsWithJoins { public static final String CONTENT_DIRECTORY = "photo";
/*     */       public static final String DISPLAY_PHOTO = "display_photo";
/*     */       public static final String PHOTO = "data15";
/*     */       public static final String PHOTO_FILE_ID = "data14";
/* 202 */       Photo() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */ 
/*     */     Contacts()
/*     */     {
/* 208 */       throw new RuntimeException("Stub!"); }
/* 209 */     public static Uri getLookupUri(android.content.ContentResolver resolver, Uri contactUri) { throw new RuntimeException("Stub!"); }
/* 210 */     public static Uri getLookupUri(long contactId, String lookupKey) { throw new RuntimeException("Stub!"); }
/* 211 */     public static Uri lookupContact(android.content.ContentResolver resolver, Uri lookupUri) { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/* 213 */     public static void markAsContacted(android.content.ContentResolver resolver, long contactId) { throw new RuntimeException("Stub!"); }
/* 214 */     public static boolean isEnterpriseContactId(long contactId) { throw new RuntimeException("Stub!"); }
/* 215 */     public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver cr, Uri contactUri, boolean preferHighres) { throw new RuntimeException("Stub!"); }
/* 216 */     public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver cr, Uri contactUri) { throw new RuntimeException("Stub!"); }
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
/* 234 */     public static final Uri ENTERPRISE_CONTENT_FILTER_URI = null; public static final Uri CONTENT_VCARD_URI = null; public static final String CONTENT_VCARD_TYPE = "text/x-vcard"; public static final Uri CONTENT_URI = null; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact"; public static final Uri CONTENT_STREQUENT_URI = null; public static final Uri CONTENT_STREQUENT_FILTER_URI = null; public static final Uri CONTENT_MULTI_VCARD_URI = null; public static final Uri CONTENT_LOOKUP_URI = null; public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact"; public static final Uri CONTENT_GROUP_URI = null; public static final Uri CONTENT_FREQUENT_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */   }
/*     */   
/*     */   public static final class Profile implements BaseColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactStatusColumns { public static final long MIN_ID = 9223372034707292160L;
/*     */     
/* 239 */     Profile() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 244 */     public static final Uri CONTENT_VCARD_URI = null; public static final Uri CONTENT_URI = null; public static final Uri CONTENT_RAW_CONTACTS_URI = null;
/*     */   }
/*     */   
/*     */   protected static abstract interface DeletedContactsColumns {
/*     */     public static final String CONTACT_DELETED_TIMESTAMP = "contact_deleted_timestamp";
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */   }
/*     */   
/*     */   public static final class DeletedContacts implements ContactsContract.DeletedContactsColumns {
/*     */     DeletedContacts() {
/* 254 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 257 */     public static final Uri CONTENT_URI = null;
/*     */     public static final long DAYS_KEPT_MILLISECONDS = 2592000000L; }
/*     */   
/*     */   protected static abstract interface RawContactsColumns { public static final String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";
/*     */     public static final String AGGREGATION_MODE = "aggregation_mode";
/*     */     public static final String BACKUP_ID = "backup_id";
/*     */     public static final String CONTACT_ID = "contact_id";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String METADATA_DIRTY = "metadata_dirty";
/*     */     public static final String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";
/*     */     public static final String RAW_CONTACT_IS_USER_PROFILE = "raw_contact_is_user_profile"; }
/*     */   
/*     */   public static final class RawContacts implements BaseColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns, ContactsContract.SyncColumns { public static final int AGGREGATION_MODE_DEFAULT = 0;
/*     */     public static final int AGGREGATION_MODE_DISABLED = 3;
/*     */     @Deprecated
/*     */     public static final int AGGREGATION_MODE_IMMEDIATE = 1;
/*     */     public static final int AGGREGATION_MODE_SUSPENDED = 2;
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact"; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";
/*     */     public static final class Data implements BaseColumns, ContactsContract.DataColumns { public static final String CONTENT_DIRECTORY = "data";
/* 277 */       Data() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class Entity implements BaseColumns, ContactsContract.DataColumns { public static final String CONTENT_DIRECTORY = "entity";
/*     */       public static final String DATA_ID = "data_id";
/*     */       
/* 283 */       Entity() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class DisplayPhoto {
/*     */       public static final String CONTENT_DIRECTORY = "display_photo";
/*     */       
/* 289 */       DisplayPhoto() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/* 292 */     RawContacts() { throw new RuntimeException("Stub!"); }
/* 293 */     public static Uri getContactLookupUri(android.content.ContentResolver resolver, Uri rawContactUri) { throw new RuntimeException("Stub!"); }
/* 294 */     public static android.content.EntityIterator newEntityIterator(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */     public static final Uri CONTENT_URI = null;
/*     */   }
/*     */   
/*     */   protected static abstract interface StatusColumns {
/*     */     public static final int AVAILABLE = 5;
/*     */     public static final int AWAY = 2;
/*     */     public static final int CAPABILITY_HAS_CAMERA = 4;
/*     */     public static final int CAPABILITY_HAS_VIDEO = 2;
/*     */     public static final int CAPABILITY_HAS_VOICE = 1;
/*     */     public static final String CHAT_CAPABILITY = "chat_capability";
/*     */     public static final int DO_NOT_DISTURB = 4;
/*     */     public static final int IDLE = 3;
/*     */     public static final int INVISIBLE = 1;
/*     */     public static final int OFFLINE = 0;
/*     */     public static final String PRESENCE = "mode";
/*     */     @Deprecated
/*     */     public static final String PRESENCE_CUSTOM_STATUS = "status";
/*     */     @Deprecated
/*     */     public static final String PRESENCE_STATUS = "mode";
/*     */     public static final String STATUS = "status";
/*     */     public static final String STATUS_ICON = "status_icon";
/*     */     public static final String STATUS_LABEL = "status_label";
/*     */     public static final String STATUS_RES_PACKAGE = "status_res_package";
/*     */     public static final String STATUS_TIMESTAMP = "status_ts";
/*     */   }
/*     */   
/*     */   protected static abstract interface DataColumns {
/*     */     public static final String CARRIER_PRESENCE = "carrier_presence";
/*     */     public static final int CARRIER_PRESENCE_VT_CAPABLE = 1;
/*     */     public static final String DATA1 = "data1";
/*     */     public static final String DATA10 = "data10";
/*     */     public static final String DATA11 = "data11";
/*     */     public static final String DATA12 = "data12";
/*     */     public static final String DATA13 = "data13";
/*     */     public static final String DATA14 = "data14";
/*     */     public static final String DATA15 = "data15";
/*     */     public static final String DATA2 = "data2";
/*     */     public static final String DATA3 = "data3";
/*     */     public static final String DATA4 = "data4";
/*     */     public static final String DATA5 = "data5";
/*     */     public static final String DATA6 = "data6";
/*     */     public static final String DATA7 = "data7";
/*     */     public static final String DATA8 = "data8";
/*     */     public static final String DATA9 = "data9";
/*     */     public static final String DATA_VERSION = "data_version";
/*     */     public static final String IS_PRIMARY = "is_primary";
/*     */     public static final String IS_READ_ONLY = "is_read_only";
/*     */     public static final String IS_SUPER_PRIMARY = "is_super_primary";
/*     */     public static final String MIMETYPE = "mimetype";
/*     */     public static final String RAW_CONTACT_ID = "raw_contact_id";
/*     */     public static final String RES_PACKAGE = "res_package";
/*     */     public static final String SYNC1 = "data_sync1";
/*     */     public static final String SYNC2 = "data_sync2";
/*     */     public static final String SYNC3 = "data_sync3";
/*     */     public static final String SYNC4 = "data_sync4";
/*     */   }
/*     */   
/*     */   protected static abstract interface DataUsageStatColumns {
/*     */     public static final String LAST_TIME_USED = "last_time_used";
/*     */     public static final String TIMES_USED = "times_used";
/*     */   }
/*     */   
/*     */   protected static abstract interface DataColumnsWithJoins extends BaseColumns, ContactsContract.DataColumns, ContactsContract.StatusColumns, ContactsContract.RawContactsColumns, ContactsContract.ContactsColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, ContactsContract.DataUsageStatColumns
/*     */   {}
/*     */   
/*     */   public static final class Data implements ContactsContract.DataColumnsWithJoins {
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/data";
/*     */     
/* 371 */     Data() { throw new RuntimeException("Stub!"); }
/* 372 */     public static Uri getContactLookupUri(android.content.ContentResolver resolver, Uri dataUri) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */     public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */     public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only"; }
/* 384 */   public static final class RawContactsEntity implements BaseColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns { RawContactsEntity() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 389 */     public static final Uri PROFILE_CONTENT_URI = null; public static final String DATA_ID = "data_id"; public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";
/*     */   }
/*     */   
/*     */   protected static abstract interface PhoneLookupColumns { public static final String CONTACT_ID = "contact_id";
/*     */     public static final String DATA_ID = "data_id";
/*     */     public static final String LABEL = "label";
/*     */     public static final String NORMALIZED_NUMBER = "normalized_number";
/*     */     public static final String NUMBER = "number";
/*     */     public static final String TYPE = "type";
/*     */   }
/*     */   
/*     */   public static final class PhoneLookup implements BaseColumns, ContactsContract.PhoneLookupColumns, ContactsContract.ContactsColumns, ContactsContract.ContactOptionsColumns, ContactsContract.ContactNameColumns { public static final String QUERY_PARAMETER_SIP_ADDRESS = "sip";
/*     */     
/* 403 */     PhoneLookup() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/* 407 */     public static final Uri ENTERPRISE_CONTENT_FILTER_URI = null; public static final Uri CONTENT_FILTER_URI = null;
/*     */   }
/*     */   
/*     */   protected static abstract interface PresenceColumns {
/*     */     public static final String CUSTOM_PROTOCOL = "custom_protocol";
/*     */     public static final String DATA_ID = "presence_data_id";
/*     */     public static final String IM_ACCOUNT = "im_account";
/*     */     public static final String IM_HANDLE = "im_handle";
/*     */     public static final String PROTOCOL = "protocol";
/*     */   }
/*     */   
/*     */   public static class StatusUpdates implements ContactsContract.StatusColumns, ContactsContract.PresenceColumns {
/*     */     StatusUpdates() {
/* 420 */       throw new RuntimeException("Stub!"); }
/* 421 */     public static final int getPresenceIconResourceId(int status) { throw new RuntimeException("Stub!"); }
/* 422 */     public static final int getPresencePrecedence(int status) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 427 */     public static final Uri PROFILE_CONTENT_URI = null; public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";
/*     */   }
/*     */   
/*     */   @Deprecated
/* 433 */   public static final class Presence extends ContactsContract.StatusUpdates { public Presence() { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static class SearchSnippets { public static final String DEFERRED_SNIPPETING_KEY = "deferred_snippeting";
/*     */     public static final String SNIPPET = "snippet";
/* 437 */     public SearchSnippets() { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class CommonDataKinds { public static abstract interface BaseTypes { public static final int TYPE_CUSTOM = 0; }
/*     */     
/*     */     protected static abstract interface CommonColumns extends ContactsContract.CommonDataKinds.BaseTypes { public static final String DATA = "data1";
/*     */       public static final String LABEL = "data3";
/*     */       public static final String TYPE = "data2"; }
/*     */     
/*     */     public static final class StructuredName implements ContactsContract.DataColumnsWithJoins { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";
/*     */       public static final String DISPLAY_NAME = "data1";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String FAMILY_NAME = "data3";
/*     */       public static final String FULL_NAME_STYLE = "data10";
/*     */       public static final String GIVEN_NAME = "data2";
/*     */       public static final String MIDDLE_NAME = "data5";
/*     */       public static final String PHONETIC_FAMILY_NAME = "data9";
/*     */       public static final String PHONETIC_GIVEN_NAME = "data7";
/*     */       public static final String PHONETIC_MIDDLE_NAME = "data8"; public static final String PHONETIC_NAME_STYLE = "data11"; public static final String PREFIX = "data4"; public static final String SUFFIX = "data6";
/* 457 */       StructuredName() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */ 
/*     */     public static final class Nickname
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String NAME = "data1";
/*     */       public static final int TYPE_DEFAULT = 1;
/*     */       public static final int TYPE_INITIALS = 5;
/*     */       public static final int TYPE_MAIDEN_NAME = 3;
/*     */       @Deprecated
/*     */       public static final int TYPE_MAINDEN_NAME = 3;
/*     */       public static final int TYPE_OTHER_NAME = 2;
/*     */       public static final int TYPE_SHORT_NAME = 4;
/*     */       
/* 477 */       Nickname() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class Phone implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final int TYPE_WORK_PAGER = 18;
/*     */       public static final int TYPE_WORK_MOBILE = 17;
/*     */       public static final int TYPE_WORK = 3;
/*     */       public static final int TYPE_TTY_TDD = 16;
/*     */       public static final int TYPE_TELEX = 15;
/*     */       public static final int TYPE_RADIO = 14;
/*     */       public static final int TYPE_PAGER = 6;
/*     */       public static final int TYPE_OTHER_FAX = 13;
/*     */       public static final int TYPE_OTHER = 7;
/*     */       public static final int TYPE_MOBILE = 2;
/*     */       public static final int TYPE_MMS = 20;
/*     */       public static final int TYPE_MAIN = 12;
/*     */       public static final int TYPE_ISDN = 11;
/*     */       
/* 494 */       Phone() { throw new RuntimeException("Stub!"); }
/* 495 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 496 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */       
/*     */ 
/*     */ 
/*     */       public static final int TYPE_HOME = 1;
/*     */       
/*     */ 
/*     */       public static final int TYPE_FAX_WORK = 4;
/*     */       
/*     */       public static final int TYPE_FAX_HOME = 5;
/*     */       
/*     */       public static final int TYPE_COMPANY_MAIN = 10;
/*     */       
/*     */       public static final int TYPE_CAR = 9;
/*     */       
/*     */       public static final int TYPE_CALLBACK = 8;
/*     */       
/*     */       public static final int TYPE_ASSISTANT = 19;
/*     */       
/*     */       public static final String SEARCH_PHONE_NUMBER_KEY = "search_phone_number";
/*     */       
/*     */       public static final String SEARCH_DISPLAY_NAME_KEY = "search_display_name";
/*     */       
/*     */       public static final String NUMBER = "data1";
/*     */       
/*     */       public static final String NORMALIZED_NUMBER = "data4";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       
/* 529 */       public static final Uri ENTERPRISE_CONTENT_FILTER_URI = null; public static final Uri CONTENT_URI = null; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2"; public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2"; public static final Uri CONTENT_FILTER_URI = null; }
/*     */     
/*     */     public static final class Email implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final int TYPE_WORK = 2;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final int TYPE_MOBILE = 4;
/* 534 */       Email() { throw new RuntimeException("Stub!"); }
/* 535 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 536 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public static final int TYPE_HOME = 1;
/*     */       
/*     */ 
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       
/*     */ 
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       
/*     */ 
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       
/*     */ 
/* 553 */       public static final Uri ENTERPRISE_CONTENT_LOOKUP_URI = null; public static final Uri ENTERPRISE_CONTENT_FILTER_URI = null; public static final String DISPLAY_NAME = "data4"; public static final Uri CONTENT_URI = null; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2"; public static final Uri CONTENT_LOOKUP_URI = null; public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2"; public static final Uri CONTENT_FILTER_URI = null;
/*     */       public static final String ADDRESS = "data1"; }
/*     */     
/*     */     public static final class StructuredPostal implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final String CITY = "data7";
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2"; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";
/* 558 */       StructuredPostal() { throw new RuntimeException("Stub!"); }
/* 559 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 560 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
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
/* 578 */       public static final Uri CONTENT_URI = null;
/*     */       public static final String COUNTRY = "data10";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"; public static final String FORMATTED_ADDRESS = "data1"; public static final String NEIGHBORHOOD = "data6"; public static final String POBOX = "data5"; public static final String POSTCODE = "data9"; public static final String REGION = "data8"; public static final String STREET = "data4"; public static final int TYPE_HOME = 1; public static final int TYPE_OTHER = 3; public static final int TYPE_WORK = 2; }
/* 583 */     public static final class Im implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { Im() { throw new RuntimeException("Stub!"); }
/* 584 */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im"; public static final String CUSTOM_PROTOCOL = "data6"; public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX"; public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"; public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"; public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 585 */       public static final String PROTOCOL = "data5"; public static final int PROTOCOL_AIM = 0; public static final int PROTOCOL_CUSTOM = -1; public static final int PROTOCOL_GOOGLE_TALK = 5; public static final int PROTOCOL_ICQ = 6; public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/* 586 */       public static final int PROTOCOL_JABBER = 7; public static final int PROTOCOL_MSN = 1; public static final int getProtocolLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 587 */       public static final int PROTOCOL_NETMEETING = 8; public static final int PROTOCOL_QQ = 4; public static final CharSequence getProtocolLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */       
/*     */       public static final int PROTOCOL_SKYPE = 3;
/*     */       public static final int PROTOCOL_YAHOO = 2;
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final int TYPE_WORK = 2;
/*     */     }
/*     */     
/*     */     public static final class Organization implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final String COMPANY = "data1";
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";
/*     */       public static final String DEPARTMENT = "data5";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String JOB_DESCRIPTION = "data6";
/*     */       public static final String OFFICE_LOCATION = "data9";
/*     */       public static final String PHONETIC_NAME = "data8";
/*     */       public static final String PHONETIC_NAME_STYLE = "data10";
/*     */       public static final String SYMBOL = "data7";
/*     */       public static final String TITLE = "data4";
/*     */       public static final int TYPE_OTHER = 2;
/*     */       public static final int TYPE_WORK = 1;
/*     */       
/* 611 */       Organization() { throw new RuntimeException("Stub!"); }
/* 612 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 613 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); } }
/*     */     
/*     */     public static final class Relation implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String NAME = "data1";
/*     */       public static final int TYPE_ASSISTANT = 1;
/*     */       public static final int TYPE_BROTHER = 2;
/*     */       public static final int TYPE_CHILD = 3;
/*     */       public static final int TYPE_DOMESTIC_PARTNER = 4;
/*     */       public static final int TYPE_FATHER = 5;
/*     */       public static final int TYPE_FRIEND = 6;
/*     */       public static final int TYPE_MANAGER = 7;
/*     */       public static final int TYPE_MOTHER = 8;
/*     */       public static final int TYPE_PARENT = 9;
/*     */       public static final int TYPE_PARTNER = 10;
/*     */       public static final int TYPE_REFERRED_BY = 11;
/*     */       public static final int TYPE_RELATIVE = 12; public static final int TYPE_SISTER = 13; public static final int TYPE_SPOUSE = 14;
/* 632 */       Relation() { throw new RuntimeException("Stub!"); }
/* 633 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 634 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */     public static final class Event
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";
/*     */       
/*     */ 
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       
/*     */       public static final String START_DATE = "data1";
/*     */       
/*     */       public static final int TYPE_ANNIVERSARY = 1;
/*     */       
/*     */       public static final int TYPE_BIRTHDAY = 3;
/*     */       public static final int TYPE_OTHER = 2;
/*     */       
/* 658 */       Event() { throw new RuntimeException("Stub!"); }
/* 659 */       public static int getTypeResource(Integer type) { throw new RuntimeException("Stub!"); }
/* 660 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class Photo implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String PHOTO = "data15";
/*     */       public static final String PHOTO_FILE_ID = "data14";
/*     */       
/*     */       Photo() {
/* 673 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */     
/*     */     public static final class Note implements ContactsContract.DataColumnsWithJoins {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String NOTE = "data1";
/*     */       
/* 684 */       Note() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class GroupMembership implements ContactsContract.DataColumnsWithJoins { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String GROUP_ROW_ID = "data1";
/*     */       public static final String GROUP_SOURCE_ID = "group_sourceid";
/*     */       
/* 694 */       GroupMembership() { throw new RuntimeException("Stub!"); } }
/*     */     
/*     */     public static final class Website implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final int TYPE_BLOG = 2;
/*     */       public static final int TYPE_FTP = 6;
/*     */       public static final int TYPE_HOME = 4;
/*     */       public static final int TYPE_HOMEPAGE = 1;
/*     */       public static final int TYPE_OTHER = 7; public static final int TYPE_PROFILE = 3; public static final int TYPE_WORK = 5; public static final String URL = "data1";
/* 705 */       Website() { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */ 
/*     */     public static final class SipAddress
/*     */       implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";
/*     */       
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String SIP_ADDRESS = "data1";
/*     */       public static final int TYPE_HOME = 1;
/*     */       public static final int TYPE_OTHER = 3;
/*     */       public static final int TYPE_WORK = 2;
/*     */       
/* 722 */       SipAddress() { throw new RuntimeException("Stub!"); }
/* 723 */       public static final int getTypeLabelResource(int type) { throw new RuntimeException("Stub!"); }
/* 724 */       public static final CharSequence getTypeLabel(android.content.res.Resources res, int type, CharSequence label) { throw new RuntimeException("Stub!"); }
/*     */     }
/*     */     
/*     */     public static final class Identity implements ContactsContract.DataColumnsWithJoins
/*     */     {
/*     */       public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/identity";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String IDENTITY = "data1";
/*     */       public static final String NAMESPACE = "data2";
/*     */       
/*     */       Identity() {
/* 737 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */     
/*     */     public static final class Callable implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
/*     */     {
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/*     */       
/*     */       public Callable() {
/* 748 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 755 */       public static final Uri ENTERPRISE_CONTENT_FILTER_URI = null; public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null; }
/*     */     
/*     */     public static final class Contactables implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns { public static final String VISIBLE_CONTACTS_ONLY = "visible_contacts_only";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES";
/*     */       public static final String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"; public static final String EXTRA_ADDRESS_BOOK_INDEX = "android.provider.extra.ADDRESS_BOOK_INDEX";
/* 760 */       public Contactables() { throw new RuntimeException("Stub!"); }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 767 */       public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null; }
/*     */     
/* 769 */     CommonDataKinds() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   protected static abstract interface GroupsColumns {
/*     */     public static final String AUTO_ADD = "auto_add";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String DELETED = "deleted";
/*     */     public static final String FAVORITES = "favorites";
/*     */     public static final String GROUP_IS_READ_ONLY = "group_is_read_only";
/*     */     public static final String GROUP_VISIBLE = "group_visible";
/*     */     public static final String NOTES = "notes";
/*     */     public static final String RES_PACKAGE = "res_package";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String SUMMARY_COUNT = "summ_count";
/*     */     public static final String SUMMARY_WITH_PHONES = "summ_phones";
/*     */     public static final String SYSTEM_ID = "system_id";
/*     */     public static final String TITLE = "title";
/*     */     public static final String TITLE_RES = "title_res";
/*     */   }
/*     */   
/*     */   public static final class Groups implements BaseColumns, ContactsContract.GroupsColumns, ContactsContract.SyncColumns {
/*     */     Groups() {
/* 791 */       throw new RuntimeException("Stub!"); }
/* 792 */     public static android.content.EntityIterator newEntityIterator(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 797 */     public static final Uri CONTENT_URI = null; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/group"; public static final Uri CONTENT_SUMMARY_URI = null;
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group"; }
/*     */   
/*     */   public static final class AggregationExceptions implements BaseColumns { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";
/* 802 */     AggregationExceptions() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 812 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String RAW_CONTACT_ID1 = "raw_contact_id1";
/*     */     public static final String RAW_CONTACT_ID2 = "raw_contact_id2";
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_AUTOMATIC = 0;
/*     */     public static final int TYPE_KEEP_SEPARATE = 2;
/*     */     public static final int TYPE_KEEP_TOGETHER = 1; }
/*     */   
/*     */   protected static abstract interface SettingsColumns { public static final String ACCOUNT_NAME = "account_name";
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */     public static final String ANY_UNSYNCED = "any_unsynced";
/*     */     public static final String DATA_SET = "data_set";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String UNGROUPED_COUNT = "summ_count";
/*     */     public static final String UNGROUPED_VISIBLE = "ungrouped_visible"; public static final String UNGROUPED_WITH_PHONES = "summ_phones"; }
/*     */   public static final class Settings implements ContactsContract.SettingsColumns { public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting"; public static final String CONTENT_TYPE = "vnd.android.cursor.dir/setting";
/* 828 */     Settings() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/* 832 */     public static final Uri CONTENT_URI = null; }
/*     */   
/*     */   public static final class ProviderStatus { public static final String CONTENT_TYPE = "vnd.android.cursor.dir/provider_status";
/*     */     
/* 836 */     ProviderStatus() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 844 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String DATABASE_CREATION_TIMESTAMP = "database_creation_timestamp";
/*     */     public static final String STATUS = "status";
/*     */     public static final int STATUS_BUSY = 1; public static final int STATUS_EMPTY = 2; public static final int STATUS_NORMAL = 0; }
/* 848 */   public static final class DataUsageFeedback { public DataUsageFeedback() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final String USAGE_TYPE_SHORT_TEXT = "short_text";
/*     */     public static final String USAGE_TYPE_LONG_TEXT = "long_text";
/*     */     public static final String USAGE_TYPE_CALL = "call";
/*     */     public static final String USAGE_TYPE = "type";
/* 855 */     public static final Uri FEEDBACK_URI = null; public static final Uri DELETE_USAGE_URI = null; }
/*     */   
/*     */   public static final class PinnedPositions { public static final int DEMOTED = -1;
/*     */     public static final int UNPINNED = 0;
/* 859 */     public PinnedPositions() { throw new RuntimeException("Stub!"); }
/* 860 */     public static void undemote(android.content.ContentResolver contentResolver, long contactId) { throw new RuntimeException("Stub!"); }
/* 861 */     public static void pin(android.content.ContentResolver contentResolver, long contactId, int pinnedPosition) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class QuickContact { public static final String ACTION_QUICK_CONTACT = "android.provider.action.QUICK_CONTACT";
/*     */     public static final String EXTRA_EXCLUDE_MIMES = "android.provider.extra.EXCLUDE_MIMES";
/*     */     public static final String EXTRA_MODE = "android.provider.extra.MODE";
/*     */     public static final String EXTRA_PRIORITIZED_MIMETYPE = "android.provider.extra.PRIORITIZED_MIMETYPE"; public static final int MODE_LARGE = 3; public static final int MODE_MEDIUM = 2; public static final int MODE_SMALL = 1;
/* 867 */     public QuickContact() { throw new RuntimeException("Stub!"); }
/* 868 */     public static void showQuickContact(android.content.Context context, android.view.View target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!"); }
/* 869 */     public static void showQuickContact(android.content.Context context, android.graphics.Rect target, Uri lookupUri, int mode, String[] excludeMimes) { throw new RuntimeException("Stub!"); }
/* 870 */     public static void showQuickContact(android.content.Context context, android.view.View target, Uri lookupUri, String[] excludeMimes, String prioritizedMimeType) { throw new RuntimeException("Stub!"); }
/* 871 */     public static void showQuickContact(android.content.Context context, android.graphics.Rect target, Uri lookupUri, String[] excludeMimes, String prioritizedMimeType) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */ 
/*     */   public static final class DisplayPhoto
/*     */   {
/*     */     public static final String THUMBNAIL_MAX_DIM = "thumbnail_max_dim";
/*     */     public static final String DISPLAY_MAX_DIM = "display_max_dim";
/*     */     
/*     */     DisplayPhoto()
/*     */     {
/* 882 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 887 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_MAX_DIMENSIONS_URI = null; }
/*     */   
/*     */   public static final class Intents { public static final String ACTION_VOICE_SEND_MESSAGE_TO_CONTACTS = "android.provider.action.VOICE_SEND_MESSAGE_TO_CONTACTS";
/*     */     public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
/*     */     public static final String CONTACTS_DATABASE_CREATED = "android.provider.Contacts.DATABASE_CREATED";
/*     */     public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION"; public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE"; public static final String EXTRA_RECIPIENT_CONTACT_CHAT_ID = "android.provider.extra.RECIPIENT_CONTACT_CHAT_ID"; public static final String EXTRA_RECIPIENT_CONTACT_NAME = "android.provider.extra.RECIPIENT_CONTACT_NAME";
/* 893 */     public static final class Insert { public Insert() { throw new RuntimeException("Stub!"); }
/*     */       
/*     */       public static final String ACTION = "android.intent.action.INSERT";
/*     */       public static final String COMPANY = "company";
/*     */       public static final String DATA = "data";
/*     */       public static final String EMAIL = "email";
/*     */       public static final String EMAIL_ISPRIMARY = "email_isprimary";
/*     */       public static final String EMAIL_TYPE = "email_type";
/*     */       public static final String EXTRA_ACCOUNT = "android.provider.extra.ACCOUNT";
/*     */       public static final String EXTRA_DATA_SET = "android.provider.extra.DATA_SET";
/*     */       public static final String FULL_MODE = "full_mode";
/*     */       public static final String IM_HANDLE = "im_handle";
/*     */       public static final String IM_ISPRIMARY = "im_isprimary";
/*     */       public static final String IM_PROTOCOL = "im_protocol";
/*     */       public static final String JOB_TITLE = "job_title";
/*     */       public static final String NAME = "name";
/*     */       public static final String NOTES = "notes";
/*     */       public static final String PHONE = "phone";
/*     */       public static final String PHONETIC_NAME = "phonetic_name";
/*     */       public static final String PHONE_ISPRIMARY = "phone_isprimary";
/*     */       public static final String PHONE_TYPE = "phone_type";
/*     */       public static final String POSTAL = "postal";
/*     */       public static final String POSTAL_ISPRIMARY = "postal_isprimary";
/*     */       public static final String POSTAL_TYPE = "postal_type";
/*     */       public static final String SECONDARY_EMAIL = "secondary_email";
/*     */       public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
/*     */       public static final String SECONDARY_PHONE = "secondary_phone";
/*     */       public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
/*     */       public static final String TERTIARY_EMAIL = "tertiary_email";
/*     */       public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
/*     */       public static final String TERTIARY_PHONE = "tertiary_phone";
/*     */       public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type"; }
/* 925 */     public Intents() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final String EXTRA_RECIPIENT_CONTACT_URI = "android.provider.extra.RECIPIENT_CONTACT_URI";
/*     */     
/*     */     public static final String INVITE_CONTACT = "com.android.contacts.action.INVITE_CONTACT";
/*     */     
/*     */     public static final String METADATA_ACCOUNT_TYPE = "android.provider.account_type";
/*     */     public static final String METADATA_MIMETYPE = "android.provider.mimetype";
/*     */     public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
/*     */     public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
/*     */   }
/*     */   
/*     */   public ContactsContract()
/*     */   {
/* 942 */     throw new RuntimeException("Stub!"); }
/* 943 */   public static boolean isProfileId(long id) { throw new RuntimeException("Stub!"); }
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
/* 955 */   public static final Uri AUTHORITY_URI = null;
/*     */   public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
/*     */   public static final String DEFERRED_SNIPPETING = "deferred_snippeting";
/*     */   public static final String DEFERRED_SNIPPETING_QUERY = "deferred_snippeting_query";
/*     */   public static final String DIRECTORY_PARAM_KEY = "directory";
/*     */   public static final String LIMIT_PARAM_KEY = "limit";
/*     */   public static final String PRIMARY_ACCOUNT_NAME = "name_for_primary_account";
/*     */   public static final String PRIMARY_ACCOUNT_TYPE = "type_for_primary_account";
/*     */   public static final String REMOVE_DUPLICATE_ENTRIES = "remove_duplicate_entries";
/*     */   public static final String STREQUENT_PHONE_ONLY = "strequent_phone_only";
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\provider\ContactsContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */