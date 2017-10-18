/*     */ package android.app.admin;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ 
/*     */ 
/*     */ public class DevicePolicyManager
/*     */ {
/*     */   public static final String ACTION_ADD_DEVICE_ADMIN = "android.app.action.ADD_DEVICE_ADMIN";
/*     */   public static final String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
/*     */   public static final String ACTION_DEVICE_ADMIN_SERVICE = "android.app.action.DEVICE_ADMIN_SERVICE";
/*     */   public static final String ACTION_DEVICE_OWNER_CHANGED = "android.app.action.DEVICE_OWNER_CHANGED";
/*     */   public static final String ACTION_MANAGED_PROFILE_PROVISIONED = "android.app.action.MANAGED_PROFILE_PROVISIONED";
/*     */   public static final String ACTION_PROVISIONING_SUCCESSFUL = "android.app.action.PROVISIONING_SUCCESSFUL";
/*     */   public static final String ACTION_PROVISION_MANAGED_DEVICE = "android.app.action.PROVISION_MANAGED_DEVICE";
/*     */   public static final String ACTION_PROVISION_MANAGED_PROFILE = "android.app.action.PROVISION_MANAGED_PROFILE";
/*     */   public static final String ACTION_SET_NEW_PARENT_PROFILE_PASSWORD = "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD";
/*     */   public static final String ACTION_SET_NEW_PASSWORD = "android.app.action.SET_NEW_PASSWORD";
/*     */   public static final String ACTION_START_ENCRYPTION = "android.app.action.START_ENCRYPTION";
/*     */   
/*  20 */   DevicePolicyManager() { throw new RuntimeException("Stub!"); }
/*  21 */   public boolean isAdminActive(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  22 */   public java.util.List<ComponentName> getActiveAdmins() { throw new RuntimeException("Stub!"); }
/*  23 */   public void removeActiveAdmin(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  24 */   public boolean hasGrantedPolicy(ComponentName admin, int usesPolicy) { throw new RuntimeException("Stub!"); }
/*  25 */   public void setPasswordQuality(ComponentName admin, int quality) { throw new RuntimeException("Stub!"); }
/*  26 */   public int getPasswordQuality(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  27 */   public void setPasswordMinimumLength(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  28 */   public int getPasswordMinimumLength(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  29 */   public void setPasswordMinimumUpperCase(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  30 */   public int getPasswordMinimumUpperCase(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  31 */   public void setPasswordMinimumLowerCase(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  32 */   public int getPasswordMinimumLowerCase(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  33 */   public void setPasswordMinimumLetters(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  34 */   public int getPasswordMinimumLetters(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  35 */   public void setPasswordMinimumNumeric(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  36 */   public int getPasswordMinimumNumeric(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  37 */   public void setPasswordMinimumSymbols(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  38 */   public int getPasswordMinimumSymbols(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  39 */   public void setPasswordMinimumNonLetter(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  40 */   public int getPasswordMinimumNonLetter(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  41 */   public void setPasswordHistoryLength(ComponentName admin, int length) { throw new RuntimeException("Stub!"); }
/*  42 */   public void setPasswordExpirationTimeout(ComponentName admin, long timeout) { throw new RuntimeException("Stub!"); }
/*  43 */   public long getPasswordExpirationTimeout(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  44 */   public long getPasswordExpiration(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  45 */   public int getPasswordHistoryLength(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  46 */   public int getPasswordMaximumLength(int quality) { throw new RuntimeException("Stub!"); }
/*  47 */   public boolean isActivePasswordSufficient() { throw new RuntimeException("Stub!"); }
/*  48 */   public int getCurrentFailedPasswordAttempts() { throw new RuntimeException("Stub!"); }
/*  49 */   public void setMaximumFailedPasswordsForWipe(ComponentName admin, int num) { throw new RuntimeException("Stub!"); }
/*  50 */   public int getMaximumFailedPasswordsForWipe(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  51 */   public boolean resetPassword(String password, int flags) { throw new RuntimeException("Stub!"); }
/*  52 */   public boolean setResetPasswordToken(ComponentName admin, byte[] token) { throw new RuntimeException("Stub!"); }
/*  53 */   public boolean clearResetPasswordToken(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  54 */   public boolean isResetPasswordTokenActive(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean resetPasswordWithToken(ComponentName admin, String password, byte[] token, int flags) { throw new RuntimeException("Stub!"); }
/*  56 */   public void setMaximumTimeToLock(ComponentName admin, long timeMs) { throw new RuntimeException("Stub!"); }
/*  57 */   public long getMaximumTimeToLock(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  58 */   public void setRequiredStrongAuthTimeout(ComponentName admin, long timeoutMs) { throw new RuntimeException("Stub!"); }
/*  59 */   public long getRequiredStrongAuthTimeout(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  60 */   public void lockNow() { throw new RuntimeException("Stub!"); }
/*  61 */   public void lockNow(int flags) { throw new RuntimeException("Stub!"); }
/*  62 */   public void wipeData(int flags) { throw new RuntimeException("Stub!"); }
/*  63 */   public void setRecommendedGlobalProxy(ComponentName admin, android.net.ProxyInfo proxyInfo) { throw new RuntimeException("Stub!"); }
/*  64 */   public int setStorageEncryption(ComponentName admin, boolean encrypt) { throw new RuntimeException("Stub!"); }
/*  65 */   public boolean getStorageEncryption(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  66 */   public int getStorageEncryptionStatus() { throw new RuntimeException("Stub!"); }
/*  67 */   public boolean installCaCert(ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
/*  68 */   public void uninstallCaCert(ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
/*  69 */   public java.util.List<byte[]> getInstalledCaCerts(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  70 */   public void uninstallAllUserCaCerts(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean hasCaCertInstalled(ComponentName admin, byte[] certBuffer) { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean installKeyPair(ComponentName admin, java.security.PrivateKey privKey, java.security.cert.Certificate cert, String alias) { throw new RuntimeException("Stub!"); }
/*  73 */   public boolean installKeyPair(ComponentName admin, java.security.PrivateKey privKey, java.security.cert.Certificate[] certs, String alias, boolean requestAccess) { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean removeKeyPair(ComponentName admin, String alias) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  76 */   public void setCertInstallerPackage(ComponentName admin, String installerPackage) throws SecurityException { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  78 */   public String getCertInstallerPackage(ComponentName admin) throws SecurityException { throw new RuntimeException("Stub!"); }
/*  79 */   public void setDelegatedScopes(ComponentName admin, String delegatePackage, java.util.List<String> scopes) { throw new RuntimeException("Stub!"); }
/*  80 */   public java.util.List<String> getDelegatedScopes(ComponentName admin, String delegatedPackage) { throw new RuntimeException("Stub!"); }
/*  81 */   public java.util.List<String> getDelegatePackages(ComponentName admin, String delegationScope) { throw new RuntimeException("Stub!"); }
/*  82 */   public void setAlwaysOnVpnPackage(ComponentName admin, String vpnPackage, boolean lockdownEnabled) throws android.content.pm.PackageManager.NameNotFoundException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*  83 */   public String getAlwaysOnVpnPackage(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  84 */   public void setCameraDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean getCameraDisabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean requestBugreport(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  87 */   public void setScreenCaptureDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean getScreenCaptureDisabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  89 */   public void setAutoTimeRequired(ComponentName admin, boolean required) { throw new RuntimeException("Stub!"); }
/*  90 */   public boolean getAutoTimeRequired() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setKeyguardDisabledFeatures(ComponentName admin, int which) { throw new RuntimeException("Stub!"); }
/*  92 */   public int getKeyguardDisabledFeatures(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  93 */   public boolean isDeviceOwnerApp(String packageName) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  95 */   public void clearDeviceOwnerApp(String packageName) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  97 */   public void clearProfileOwner(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*  98 */   public void setDeviceOwnerLockScreenInfo(ComponentName admin, CharSequence info) { throw new RuntimeException("Stub!"); }
/*  99 */   public CharSequence getDeviceOwnerLockScreenInfo() { throw new RuntimeException("Stub!"); }
/* 100 */   public String[] setPackagesSuspended(ComponentName admin, String[] packageNames, boolean suspended) { throw new RuntimeException("Stub!"); }
/* 101 */   public boolean isPackageSuspended(ComponentName admin, String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 102 */   public void setProfileEnabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 103 */   public void setProfileName(ComponentName admin, String profileName) { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean isProfileOwnerApp(String packageName) { throw new RuntimeException("Stub!"); }
/* 105 */   public void addPersistentPreferredActivity(ComponentName admin, android.content.IntentFilter filter, ComponentName activity) { throw new RuntimeException("Stub!"); }
/* 106 */   public void clearPackagePersistentPreferredActivities(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 108 */   public void setApplicationRestrictionsManagingPackage(ComponentName admin, String packageName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 110 */   public String getApplicationRestrictionsManagingPackage(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 112 */   public boolean isCallerApplicationRestrictionsManagingPackage() { throw new RuntimeException("Stub!"); }
/* 113 */   public void setApplicationRestrictions(ComponentName admin, String packageName, android.os.Bundle settings) { throw new RuntimeException("Stub!"); }
/* 114 */   public void setTrustAgentConfiguration(ComponentName admin, ComponentName target, android.os.PersistableBundle configuration) { throw new RuntimeException("Stub!"); }
/* 115 */   public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(ComponentName admin, ComponentName agent) { throw new RuntimeException("Stub!"); }
/* 116 */   public void setCrossProfileCallerIdDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 117 */   public boolean getCrossProfileCallerIdDisabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 118 */   public void setCrossProfileContactsSearchDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 119 */   public boolean getCrossProfileContactsSearchDisabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 120 */   public void setBluetoothContactSharingDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 121 */   public boolean getBluetoothContactSharingDisabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 122 */   public void addCrossProfileIntentFilter(ComponentName admin, android.content.IntentFilter filter, int flags) { throw new RuntimeException("Stub!"); }
/* 123 */   public void clearCrossProfileIntentFilters(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 124 */   public boolean setPermittedAccessibilityServices(ComponentName admin, java.util.List<String> packageNames) { throw new RuntimeException("Stub!"); }
/* 125 */   public java.util.List<String> getPermittedAccessibilityServices(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 126 */   public boolean setPermittedInputMethods(ComponentName admin, java.util.List<String> packageNames) { throw new RuntimeException("Stub!"); }
/* 127 */   public java.util.List<String> getPermittedInputMethods(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 128 */   public boolean setPermittedCrossProfileNotificationListeners(ComponentName admin, java.util.List<String> packageList) { throw new RuntimeException("Stub!"); }
/* 129 */   public java.util.List<String> getPermittedCrossProfileNotificationListeners(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 130 */   public android.os.UserHandle createAndManageUser(ComponentName admin, String name, ComponentName profileOwner, android.os.PersistableBundle adminExtras, int flags) { throw new RuntimeException("Stub!"); }
/* 131 */   public boolean removeUser(ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
/* 132 */   public boolean switchUser(ComponentName admin, android.os.UserHandle userHandle) { throw new RuntimeException("Stub!"); }
/* 133 */   public android.os.Bundle getApplicationRestrictions(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 134 */   public void addUserRestriction(ComponentName admin, String key) { throw new RuntimeException("Stub!"); }
/* 135 */   public void clearUserRestriction(ComponentName admin, String key) { throw new RuntimeException("Stub!"); }
/* 136 */   public android.os.Bundle getUserRestrictions(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 137 */   public android.content.Intent createAdminSupportIntent(String restriction) { throw new RuntimeException("Stub!"); }
/* 138 */   public boolean setApplicationHidden(ComponentName admin, String packageName, boolean hidden) { throw new RuntimeException("Stub!"); }
/* 139 */   public boolean isApplicationHidden(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 140 */   public void enableSystemApp(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 141 */   public int enableSystemApp(ComponentName admin, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 142 */   public void setAccountManagementDisabled(ComponentName admin, String accountType, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 143 */   public String[] getAccountTypesWithManagementDisabled() { throw new RuntimeException("Stub!"); }
/* 144 */   public void setLockTaskPackages(ComponentName admin, String[] packages) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 145 */   public String[] getLockTaskPackages(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 146 */   public boolean isLockTaskPermitted(String pkg) { throw new RuntimeException("Stub!"); }
/* 147 */   public void setGlobalSetting(ComponentName admin, String setting, String value) { throw new RuntimeException("Stub!"); }
/* 148 */   public void setSecureSetting(ComponentName admin, String setting, String value) { throw new RuntimeException("Stub!"); }
/* 149 */   public void setRestrictionsProvider(ComponentName admin, ComponentName provider) { throw new RuntimeException("Stub!"); }
/* 150 */   public void setMasterVolumeMuted(ComponentName admin, boolean on) { throw new RuntimeException("Stub!"); }
/* 151 */   public boolean isMasterVolumeMuted(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 152 */   public void setUninstallBlocked(ComponentName admin, String packageName, boolean uninstallBlocked) { throw new RuntimeException("Stub!"); }
/* 153 */   public boolean isUninstallBlocked(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 154 */   public boolean addCrossProfileWidgetProvider(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 155 */   public boolean removeCrossProfileWidgetProvider(ComponentName admin, String packageName) { throw new RuntimeException("Stub!"); }
/* 156 */   public java.util.List<String> getCrossProfileWidgetProviders(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 157 */   public void setUserIcon(ComponentName admin, android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
/* 158 */   public void setSystemUpdatePolicy(ComponentName admin, SystemUpdatePolicy policy) { throw new RuntimeException("Stub!"); }
/* 159 */   public SystemUpdatePolicy getSystemUpdatePolicy() { throw new RuntimeException("Stub!"); }
/* 160 */   public boolean setKeyguardDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 161 */   public boolean setStatusBarDisabled(ComponentName admin, boolean disabled) { throw new RuntimeException("Stub!"); }
/* 162 */   public SystemUpdateInfo getPendingSystemUpdate(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 163 */   public void setPermissionPolicy(ComponentName admin, int policy) { throw new RuntimeException("Stub!"); }
/* 164 */   public int getPermissionPolicy(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 165 */   public boolean setPermissionGrantState(ComponentName admin, String packageName, String permission, int grantState) { throw new RuntimeException("Stub!"); }
/* 166 */   public int getPermissionGrantState(ComponentName admin, String packageName, String permission) { throw new RuntimeException("Stub!"); }
/* 167 */   public boolean isProvisioningAllowed(String action) { throw new RuntimeException("Stub!"); }
/* 168 */   public boolean isManagedProfile(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 169 */   public String getWifiMacAddress(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 170 */   public void reboot(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 171 */   public void setShortSupportMessage(ComponentName admin, CharSequence message) { throw new RuntimeException("Stub!"); }
/* 172 */   public CharSequence getShortSupportMessage(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 173 */   public void setLongSupportMessage(ComponentName admin, CharSequence message) { throw new RuntimeException("Stub!"); }
/* 174 */   public CharSequence getLongSupportMessage(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 175 */   public DevicePolicyManager getParentProfileInstance(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 176 */   public void setSecurityLoggingEnabled(ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 177 */   public boolean isSecurityLoggingEnabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 178 */   public java.util.List<SecurityLog.SecurityEvent> retrieveSecurityLogs(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 179 */   public java.util.List<SecurityLog.SecurityEvent> retrievePreRebootSecurityLogs(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 180 */   public void setOrganizationColor(ComponentName admin, int color) { throw new RuntimeException("Stub!"); }
/* 181 */   public int getOrganizationColor(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 182 */   public void setOrganizationName(ComponentName admin, CharSequence title) { throw new RuntimeException("Stub!"); }
/* 183 */   public CharSequence getOrganizationName(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 184 */   public void setAffiliationIds(ComponentName admin, java.util.Set<String> ids) { throw new RuntimeException("Stub!"); }
/* 185 */   public java.util.Set<String> getAffiliationIds(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 186 */   public void setBackupServiceEnabled(ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 187 */   public boolean isBackupServiceEnabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 188 */   public void setNetworkLoggingEnabled(ComponentName admin, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 189 */   public boolean isNetworkLoggingEnabled(ComponentName admin) { throw new RuntimeException("Stub!"); }
/* 190 */   public java.util.List<NetworkEvent> retrieveNetworkLogs(ComponentName admin, long batchToken) { throw new RuntimeException("Stub!"); }
/* 191 */   public boolean bindDeviceAdminServiceAsUser(ComponentName admin, android.content.Intent serviceIntent, android.content.ServiceConnection conn, int flags, android.os.UserHandle targetUser) { throw new RuntimeException("Stub!"); }
/* 192 */   public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(ComponentName admin) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED";
/*     */   public static final String DELEGATION_APP_RESTRICTIONS = "delegation-app-restrictions";
/*     */   public static final String DELEGATION_BLOCK_UNINSTALL = "delegation-block-uninstall";
/*     */   public static final String DELEGATION_CERT_INSTALL = "delegation-cert-install";
/*     */   public static final String DELEGATION_ENABLE_SYSTEM_APP = "delegation-enable-system-app";
/*     */   public static final String DELEGATION_PACKAGE_ACCESS = "delegation-package-access";
/*     */   public static final String DELEGATION_PERMISSION_GRANT = "delegation-permission-grant";
/*     */   public static final int ENCRYPTION_STATUS_ACTIVATING = 2;
/*     */   public static final int ENCRYPTION_STATUS_ACTIVE = 3;
/*     */   public static final int ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY = 4;
/*     */   public static final int ENCRYPTION_STATUS_ACTIVE_PER_USER = 5;
/*     */   public static final int ENCRYPTION_STATUS_INACTIVE = 1;
/*     */   public static final int ENCRYPTION_STATUS_UNSUPPORTED = 0;
/*     */   public static final String EXTRA_ADD_EXPLANATION = "android.app.extra.ADD_EXPLANATION";
/*     */   public static final String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
/*     */   public static final String EXTRA_DEVICE_ADMIN = "android.app.extra.DEVICE_ADMIN";
/*     */   public static final String EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE = "android.app.extra.PROVISIONING_ACCOUNT_TO_MIGRATE";
/*     */   public static final String EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE = "android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = "android.app.extra.PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION";
/*     */   @Deprecated
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME = "android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME";
/*     */   public static final String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = "android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM";
/*     */   public static final String EXTRA_PROVISIONING_DISCLAIMERS = "android.app.extra.PROVISIONING_DISCLAIMERS";
/*     */   public static final String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = "android.app.extra.PROVISIONING_DISCLAIMER_CONTENT";
/*     */   public static final String EXTRA_PROVISIONING_DISCLAIMER_HEADER = "android.app.extra.PROVISIONING_DISCLAIMER_HEADER";
/*     */   @Deprecated
/*     */   public static final String EXTRA_PROVISIONING_EMAIL_ADDRESS = "android.app.extra.PROVISIONING_EMAIL_ADDRESS";
/*     */   public static final String EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION = "android.app.extra.PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION";
/*     */   public static final String EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED = "android.app.extra.PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED";
/*     */   public static final String EXTRA_PROVISIONING_LOCALE = "android.app.extra.PROVISIONING_LOCALE";
/*     */   public static final String EXTRA_PROVISIONING_LOCAL_TIME = "android.app.extra.PROVISIONING_LOCAL_TIME";
/*     */   public static final String EXTRA_PROVISIONING_LOGO_URI = "android.app.extra.PROVISIONING_LOGO_URI";
/*     */   public static final String EXTRA_PROVISIONING_MAIN_COLOR = "android.app.extra.PROVISIONING_MAIN_COLOR";
/*     */   public static final String EXTRA_PROVISIONING_SKIP_ENCRYPTION = "android.app.extra.PROVISIONING_SKIP_ENCRYPTION";
/*     */   public static final String EXTRA_PROVISIONING_SKIP_USER_CONSENT = "android.app.extra.PROVISIONING_SKIP_USER_CONSENT";
/*     */   public static final String EXTRA_PROVISIONING_TIME_ZONE = "android.app.extra.PROVISIONING_TIME_ZONE";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_HIDDEN = "android.app.extra.PROVISIONING_WIFI_HIDDEN";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_PAC_URL = "android.app.extra.PROVISIONING_WIFI_PAC_URL";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_PASSWORD = "android.app.extra.PROVISIONING_WIFI_PASSWORD";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_PROXY_BYPASS = "android.app.extra.PROVISIONING_WIFI_PROXY_BYPASS";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_PROXY_HOST = "android.app.extra.PROVISIONING_WIFI_PROXY_HOST";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_PROXY_PORT = "android.app.extra.PROVISIONING_WIFI_PROXY_PORT";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_SECURITY_TYPE = "android.app.extra.PROVISIONING_WIFI_SECURITY_TYPE";
/*     */   public static final String EXTRA_PROVISIONING_WIFI_SSID = "android.app.extra.PROVISIONING_WIFI_SSID";
/*     */   public static final int FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY = 1;
/*     */   public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = 2;
/*     */   public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = 1;
/*     */   public static final int KEYGUARD_DISABLE_FEATURES_ALL = Integer.MAX_VALUE;
/*     */   public static final int KEYGUARD_DISABLE_FEATURES_NONE = 0;
/*     */   public static final int KEYGUARD_DISABLE_FINGERPRINT = 32;
/*     */   public static final int KEYGUARD_DISABLE_REMOTE_INPUT = 64;
/*     */   public static final int KEYGUARD_DISABLE_SECURE_CAMERA = 2;
/*     */   public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = 4;
/*     */   public static final int KEYGUARD_DISABLE_TRUST_AGENTS = 16;
/*     */   public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = 8;
/*     */   public static final int KEYGUARD_DISABLE_WIDGETS_ALL = 1;
/*     */   public static final String MIME_TYPE_PROVISIONING_NFC = "application/com.android.managedprovisioning";
/*     */   public static final int PASSWORD_QUALITY_ALPHABETIC = 262144;
/*     */   public static final int PASSWORD_QUALITY_ALPHANUMERIC = 327680;
/*     */   public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = 32768;
/*     */   public static final int PASSWORD_QUALITY_COMPLEX = 393216;
/*     */   public static final int PASSWORD_QUALITY_NUMERIC = 131072;
/*     */   public static final int PASSWORD_QUALITY_NUMERIC_COMPLEX = 196608;
/*     */   public static final int PASSWORD_QUALITY_SOMETHING = 65536;
/*     */   public static final int PASSWORD_QUALITY_UNSPECIFIED = 0;
/*     */   public static final int PERMISSION_GRANT_STATE_DEFAULT = 0;
/*     */   public static final int PERMISSION_GRANT_STATE_DENIED = 2;
/*     */   public static final int PERMISSION_GRANT_STATE_GRANTED = 1;
/*     */   public static final int PERMISSION_POLICY_AUTO_DENY = 2;
/*     */   public static final int PERMISSION_POLICY_AUTO_GRANT = 1;
/*     */   public static final int PERMISSION_POLICY_PROMPT = 0;
/*     */   public static final String POLICY_DISABLE_CAMERA = "policy_disable_camera";
/*     */   public static final String POLICY_DISABLE_SCREEN_CAPTURE = "policy_disable_screen_capture";
/*     */   public static final int RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT = 2;
/*     */   public static final int RESET_PASSWORD_REQUIRE_ENTRY = 1;
/*     */   public static final int SKIP_SETUP_WIZARD = 1;
/*     */   public static final int WIPE_EXTERNAL_STORAGE = 1;
/*     */   public static final int WIPE_RESET_PROTECTION_DATA = 2;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\admin\DevicePolicyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */