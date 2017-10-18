package java.security.cert;

public abstract interface CertSelector
  extends Cloneable
{
  public abstract boolean match(Certificate paramCertificate);
  
  public abstract Object clone();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */