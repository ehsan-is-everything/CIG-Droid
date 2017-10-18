/*    */ package java.nio.file.attribute;
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
/*    */ 
/*    */ 
/*    */ public enum AclEntryPermission
/*    */ {
/* 29 */   APPEND_DATA, 
/* 30 */   DELETE, 
/* 31 */   DELETE_CHILD, 
/* 32 */   EXECUTE, 
/* 33 */   READ_ACL, 
/* 34 */   READ_ATTRIBUTES, 
/* 35 */   READ_DATA, 
/* 36 */   READ_NAMED_ATTRS, 
/* 37 */   SYNCHRONIZE, 
/* 38 */   WRITE_ACL, 
/* 39 */   WRITE_ATTRIBUTES, 
/* 40 */   WRITE_DATA, 
/* 41 */   WRITE_NAMED_ATTRS, 
/* 42 */   WRITE_OWNER;
/*    */   
/*    */ 
/*    */ 
/* 46 */   public static final AclEntryPermission LIST_DIRECTORY = null; public static final AclEntryPermission ADD_SUBDIRECTORY = null; public static final AclEntryPermission ADD_FILE = null;
/*    */   
/*    */   private AclEntryPermission() {}
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\attribute\AclEntryPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */