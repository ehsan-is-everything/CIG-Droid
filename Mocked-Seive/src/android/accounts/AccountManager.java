/*    */ package android.accounts;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AccountManager
/*    */ {
/*    */   public static final String ACTION_ACCOUNT_REMOVED = "android.accounts.action.ACCOUNT_REMOVED";
/*    */   public static final String ACTION_AUTHENTICATOR_INTENT = "android.accounts.AccountAuthenticator";
/*    */   public static final String AUTHENTICATOR_ATTRIBUTES_NAME = "account-authenticator";
/*    */   public static final String AUTHENTICATOR_META_DATA_NAME = "android.accounts.AccountAuthenticator";
/*    */   public static final int ERROR_CODE_BAD_ARGUMENTS = 7;
/*    */   public static final int ERROR_CODE_BAD_AUTHENTICATION = 9;
/*    */   public static final int ERROR_CODE_BAD_REQUEST = 8;
/*    */   public static final int ERROR_CODE_CANCELED = 4;
/*    */   public static final int ERROR_CODE_INVALID_RESPONSE = 5;
/*    */   public static final int ERROR_CODE_NETWORK_ERROR = 3;
/*    */   
/* 20 */   AccountManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public static AccountManager get(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPassword(Account account) { throw new RuntimeException("Stub!"); }
/* 23 */   public String getUserData(Account account, String key) { throw new RuntimeException("Stub!"); }
/* 24 */   public AuthenticatorDescription[] getAuthenticatorTypes() { throw new RuntimeException("Stub!"); }
/* 25 */   public Account[] getAccounts() { throw new RuntimeException("Stub!"); }
/* 26 */   public Account[] getAccountsByTypeForPackage(String type, String packageName) { throw new RuntimeException("Stub!"); }
/* 27 */   public Account[] getAccountsByType(String type) { throw new RuntimeException("Stub!"); }
/* 28 */   public AccountManagerFuture<Boolean> hasFeatures(Account account, String[] features, AccountManagerCallback<Boolean> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 29 */   public AccountManagerFuture<Account[]> getAccountsByTypeAndFeatures(String type, String[] features, AccountManagerCallback<Account[]> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean addAccountExplicitly(Account account, String password, Bundle userdata) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean addAccountExplicitly(Account account, String password, Bundle extras, java.util.Map<String, Integer> visibility) { throw new RuntimeException("Stub!"); }
/* 32 */   public java.util.Map<String, Integer> getPackagesAndVisibilityForAccount(Account account) { throw new RuntimeException("Stub!"); }
/* 33 */   public java.util.Map<Account, Integer> getAccountsAndVisibilityForPackage(String packageName, String accountType) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean setAccountVisibility(Account account, String packageName, int visibility) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getAccountVisibility(Account account, String packageName) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean notifyAccountAuthenticated(Account account) { throw new RuntimeException("Stub!"); }
/* 37 */   public AccountManagerFuture<Account> renameAccount(Account account, String newName, AccountManagerCallback<Account> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 38 */   public String getPreviousName(Account account) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public AccountManagerFuture<Boolean> removeAccount(Account account, AccountManagerCallback<Boolean> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 41 */   public AccountManagerFuture<Bundle> removeAccount(Account account, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean removeAccountExplicitly(Account account) { throw new RuntimeException("Stub!"); }
/* 43 */   public void invalidateAuthToken(String accountType, String authToken) { throw new RuntimeException("Stub!"); }
/* 44 */   public String peekAuthToken(Account account, String authTokenType) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setPassword(Account account, String password) { throw new RuntimeException("Stub!"); }
/* 46 */   public void clearPassword(Account account) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setUserData(Account account, String key, String value) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setAuthToken(Account account, String authTokenType, String authToken) { throw new RuntimeException("Stub!"); }
/* 49 */   public String blockingGetAuthToken(Account account, String authTokenType, boolean notifyAuthFailure) throws OperationCanceledException, java.io.IOException, AuthenticatorException { throw new RuntimeException("Stub!"); }
/* 50 */   public AccountManagerFuture<Bundle> getAuthToken(Account account, String authTokenType, Bundle options, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 52 */   public AccountManagerFuture<Bundle> getAuthToken(Account account, String authTokenType, boolean notifyAuthFailure, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 53 */   public AccountManagerFuture<Bundle> getAuthToken(Account account, String authTokenType, Bundle options, boolean notifyAuthFailure, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 54 */   public AccountManagerFuture<Bundle> addAccount(String accountType, String authTokenType, String[] requiredFeatures, Bundle addAccountOptions, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 55 */   public AccountManagerFuture<Bundle> confirmCredentials(Account account, Bundle options, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 56 */   public AccountManagerFuture<Bundle> updateCredentials(Account account, String authTokenType, Bundle options, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 57 */   public AccountManagerFuture<Bundle> editProperties(String accountType, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 58 */   public AccountManagerFuture<Bundle> getAuthTokenByFeatures(String accountType, String authTokenType, String[] features, android.app.Activity activity, Bundle addAccountOptions, Bundle getAuthTokenOptions, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 60 */   public static android.content.Intent newChooseAccountIntent(Account selectedAccount, java.util.ArrayList<Account> allowableAccounts, String[] allowableAccountTypes, boolean alwaysPromptForAccount, String descriptionOverrideText, String addAccountAuthTokenType, String[] addAccountRequiredFeatures, Bundle addAccountOptions) { throw new RuntimeException("Stub!"); }
/* 61 */   public static android.content.Intent newChooseAccountIntent(Account selectedAccount, java.util.List<Account> allowableAccounts, String[] allowableAccountTypes, String descriptionOverrideText, String addAccountAuthTokenType, String[] addAccountRequiredFeatures, Bundle addAccountOptions) { throw new RuntimeException("Stub!"); }
/* 62 */   public void addOnAccountsUpdatedListener(OnAccountsUpdateListener listener, android.os.Handler handler, boolean updateImmediately) { throw new RuntimeException("Stub!"); }
/* 63 */   public void addOnAccountsUpdatedListener(OnAccountsUpdateListener listener, android.os.Handler handler, boolean updateImmediately, String[] accountTypes) { throw new RuntimeException("Stub!"); }
/* 64 */   public void removeOnAccountsUpdatedListener(OnAccountsUpdateListener listener) { throw new RuntimeException("Stub!"); }
/* 65 */   public AccountManagerFuture<Bundle> startAddAccountSession(String accountType, String authTokenType, String[] requiredFeatures, Bundle options, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 66 */   public AccountManagerFuture<Bundle> startUpdateCredentialsSession(Account account, String authTokenType, Bundle options, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 67 */   public AccountManagerFuture<Bundle> finishSession(Bundle sessionBundle, android.app.Activity activity, AccountManagerCallback<Bundle> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 68 */   public AccountManagerFuture<Boolean> isCredentialsUpdateSuggested(Account account, String statusToken, AccountManagerCallback<Boolean> callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int ERROR_CODE_REMOTE_EXCEPTION = 1;
/*    */   public static final int ERROR_CODE_UNSUPPORTED_OPERATION = 6;
/*    */   public static final String KEY_ACCOUNTS = "accounts";
/*    */   public static final String KEY_ACCOUNT_AUTHENTICATOR_RESPONSE = "accountAuthenticatorResponse";
/*    */   public static final String KEY_ACCOUNT_MANAGER_RESPONSE = "accountManagerResponse";
/*    */   public static final String KEY_ACCOUNT_NAME = "authAccount";
/*    */   public static final String KEY_ACCOUNT_SESSION_BUNDLE = "accountSessionBundle";
/*    */   public static final String KEY_ACCOUNT_STATUS_TOKEN = "accountStatusToken";
/*    */   public static final String KEY_ACCOUNT_TYPE = "accountType";
/*    */   public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
/*    */   public static final String KEY_AUTHENTICATOR_TYPES = "authenticator_types";
/*    */   public static final String KEY_AUTHTOKEN = "authtoken";
/*    */   public static final String KEY_AUTH_FAILED_MESSAGE = "authFailedMessage";
/*    */   public static final String KEY_AUTH_TOKEN_LABEL = "authTokenLabelKey";
/*    */   public static final String KEY_BOOLEAN_RESULT = "booleanResult";
/*    */   public static final String KEY_CALLER_PID = "callerPid";
/*    */   public static final String KEY_CALLER_UID = "callerUid";
/*    */   public static final String KEY_ERROR_CODE = "errorCode";
/*    */   public static final String KEY_ERROR_MESSAGE = "errorMessage";
/*    */   public static final String KEY_INTENT = "intent";
/*    */   public static final String KEY_LAST_AUTHENTICATED_TIME = "lastAuthenticatedTime";
/*    */   public static final String KEY_PASSWORD = "password";
/*    */   public static final String KEY_USERDATA = "userdata";
/*    */   @Deprecated
/*    */   public static final String LOGIN_ACCOUNTS_CHANGED_ACTION = "android.accounts.LOGIN_ACCOUNTS_CHANGED";
/*    */   public static final String PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE = "android:accounts:key_legacy_not_visible";
/*    */   public static final String PACKAGE_NAME_KEY_LEGACY_VISIBLE = "android:accounts:key_legacy_visible";
/*    */   public static final int VISIBILITY_NOT_VISIBLE = 3;
/*    */   public static final int VISIBILITY_UNDEFINED = 0;
/*    */   public static final int VISIBILITY_USER_MANAGED_NOT_VISIBLE = 4;
/*    */   public static final int VISIBILITY_USER_MANAGED_VISIBLE = 2;
/*    */   public static final int VISIBILITY_VISIBLE = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accounts\AccountManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */