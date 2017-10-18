package java.security.cert;

public enum PKIXReason
  implements CertPathValidatorException.Reason
{
  INVALID_KEY_USAGE,  INVALID_NAME,  INVALID_POLICY,  NAME_CHAINING,  NOT_CA_CERT,  NO_TRUST_ANCHOR,  PATH_TOO_LONG,  UNRECOGNIZED_CRIT_EXT;
  
  private PKIXReason() {}
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\PKIXReason.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */