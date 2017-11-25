/*    */ package java.nio.file.attribute;
/*    */ 
/*    */ import java.util.Set;
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
/*    */ 
/*    */ public final class AclEntry
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 31 */     Builder() { throw new RuntimeException("Stub!"); }
/* 32 */     public AclEntry build() { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setType(AclEntryType type) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setPrincipal(UserPrincipal who) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder setPermissions(Set<AclEntryPermission> perms) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setPermissions(AclEntryPermission... perms) { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder setFlags(Set<AclEntryFlag> flags) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setFlags(AclEntryFlag... flags) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 40 */   AclEntry() { throw new RuntimeException("Stub!"); }
/* 41 */   public static Builder newBuilder() { throw new RuntimeException("Stub!"); }
/* 42 */   public static Builder newBuilder(AclEntry entry) { throw new RuntimeException("Stub!"); }
/* 43 */   public AclEntryType type() { throw new RuntimeException("Stub!"); }
/* 44 */   public UserPrincipal principal() { throw new RuntimeException("Stub!"); }
/* 45 */   public Set<AclEntryPermission> permissions() { throw new RuntimeException("Stub!"); }
/* 46 */   public Set<AclEntryFlag> flags() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 48 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\attribute\AclEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */