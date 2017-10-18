package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface DHPrivateKey
  extends DHKey, PrivateKey
{
  public static final long serialVersionUID = 2211791113380396553L;
  
  public abstract BigInteger getX();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\interfaces\DHPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */