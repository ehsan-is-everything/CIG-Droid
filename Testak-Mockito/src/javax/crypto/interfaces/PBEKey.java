package javax.crypto.interfaces;

import javax.crypto.SecretKey;

public abstract interface PBEKey
  extends SecretKey
{
  public static final long serialVersionUID = -1430015993304333921L;
  
  public abstract char[] getPassword();
  
  public abstract byte[] getSalt();
  
  public abstract int getIterationCount();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\interfaces\PBEKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */