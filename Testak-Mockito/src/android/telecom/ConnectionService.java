/*    */ package android.telecom;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ConnectionService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.telecom.ConnectionService";
/*    */   
/* 21 */   public ConnectionService() { throw new RuntimeException("Stub!"); }
/* 22 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 24 */   public final RemoteConnection createRemoteIncomingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 25 */   public final RemoteConnection createRemoteOutgoingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 26 */   public final void conferenceRemoteConnections(RemoteConnection remoteConnection1, RemoteConnection remoteConnection2) { throw new RuntimeException("Stub!"); }
/* 27 */   public final void addConference(Conference conference) { throw new RuntimeException("Stub!"); }
/* 28 */   public final void addExistingConnection(PhoneAccountHandle phoneAccountHandle, Connection connection) { throw new RuntimeException("Stub!"); }
/* 29 */   public final Collection<Connection> getAllConnections() { throw new RuntimeException("Stub!"); }
/* 30 */   public final Collection<Conference> getAllConferences() { throw new RuntimeException("Stub!"); }
/* 31 */   public Connection onCreateIncomingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onCreateIncomingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 33 */   public void onCreateOutgoingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 34 */   public Connection onCreateOutgoingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onConference(Connection connection1, Connection connection2) { throw new RuntimeException("Stub!"); }
/* 36 */   public void onRemoteConferenceAdded(RemoteConference conference) { throw new RuntimeException("Stub!"); }
/* 37 */   public void onRemoteExistingConnectionAdded(RemoteConnection connection) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\ConnectionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */