/*    */ package android.accounts;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractAccountAuthenticator
/*    */ {
/*    */   public static final String KEY_CUSTOM_TOKEN_EXPIRY = "android.accounts.expiry";
/*    */   
/* 20 */   public AbstractAccountAuthenticator(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public final IBinder getIBinder() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString);
/*    */   public abstract Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle) throws NetworkErrorException;
/*    */   public abstract Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle) throws NetworkErrorException;
/*    */   public abstract Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle) throws NetworkErrorException;
/*    */   public abstract String getAuthTokenLabel(String paramString);
/*    */   public abstract Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle) throws NetworkErrorException;
/*    */   public abstract Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString) throws NetworkErrorException;
/* 29 */   public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 30 */   public Bundle getAccountCredentialsForCloning(AccountAuthenticatorResponse response, Account account) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 31 */   public Bundle addAccountFromCredentials(AccountAuthenticatorResponse response, Account account, Bundle accountCredentials) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 32 */   public Bundle startAddAccountSession(AccountAuthenticatorResponse response, String accountType, String authTokenType, String[] requiredFeatures, Bundle options) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 33 */   public Bundle startUpdateCredentialsSession(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 34 */   public Bundle finishSession(AccountAuthenticatorResponse response, String accountType, Bundle sessionBundle) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/* 35 */   public Bundle isCredentialsUpdateSuggested(AccountAuthenticatorResponse response, Account account, String statusToken) throws NetworkErrorException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accounts\AbstractAccountAuthenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */