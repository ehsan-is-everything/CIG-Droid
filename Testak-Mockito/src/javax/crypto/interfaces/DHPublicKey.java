package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface DHPublicKey
  extends DHKey, PublicKey
{
  public static final long serialVersionUID = -6628103563352519193L;
  
  public abstract BigInteger getY();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\interfaces\DHPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */