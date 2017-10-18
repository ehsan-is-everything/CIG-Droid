package android.app.backup;

import android.os.ParcelFileDescriptor;

public abstract interface BackupHelper
{
  public abstract void performBackup(ParcelFileDescriptor paramParcelFileDescriptor1, BackupDataOutput paramBackupDataOutput, ParcelFileDescriptor paramParcelFileDescriptor2);
  
  public abstract void restoreEntity(BackupDataInputStream paramBackupDataInputStream);
  
  public abstract void writeNewStateDescription(ParcelFileDescriptor paramParcelFileDescriptor);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\backup\BackupHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */