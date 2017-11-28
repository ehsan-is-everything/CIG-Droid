/*    */ package javax.security.auth;
/*    */ 
/*    */ import java.security.DomainCombiner;
/*    */ import java.security.ProtectionDomain;
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
/*    */ 
/*    */ 
/*    */ public class SubjectDomainCombiner
/*    */   implements DomainCombiner
/*    */ {
/* 30 */   public SubjectDomainCombiner(Subject subject) { throw new RuntimeException("Stub!"); }
/* 31 */   public Subject getSubject() { throw new RuntimeException("Stub!"); }
/* 32 */   public ProtectionDomain[] combine(ProtectionDomain[] currentDomains, ProtectionDomain[] assignedDomains) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\security\auth\SubjectDomainCombiner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */