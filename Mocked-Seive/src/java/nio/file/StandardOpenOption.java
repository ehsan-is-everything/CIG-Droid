package java.nio.file;

public enum StandardOpenOption
  implements OpenOption
{
  APPEND,  CREATE,  CREATE_NEW,  DELETE_ON_CLOSE,  DSYNC,  READ,  SPARSE,  SYNC,  TRUNCATE_EXISTING,  WRITE;
  
  private StandardOpenOption() {}
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\StandardOpenOption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */