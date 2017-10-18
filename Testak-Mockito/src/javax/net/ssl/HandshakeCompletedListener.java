package javax.net.ssl;

import java.util.EventListener;

public abstract interface HandshakeCompletedListener
  extends EventListener
{
  public abstract void handshakeCompleted(HandshakeCompletedEvent paramHandshakeCompletedEvent);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\HandshakeCompletedListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */