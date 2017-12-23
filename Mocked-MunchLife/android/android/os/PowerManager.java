package android.os;

public class PowerManager {
	public static final int SCREEN_DIM_WAKE_LOCK = 0;
	public WakeLock newWakeLock(int levelAndFlags, String tag) {
        //validateWakeLockParameters(levelAndFlags, tag);
        return new WakeLock(levelAndFlags, tag, "");
    }
	public final class WakeLock {
		WakeLock(int flags, String tag, String packageName) {
//            mFlags = flags;
//            mTag = tag;
//            mPackageName = packageName;
//            mToken = new Binder();
//            mTraceName = "WakeLock (" + mTag + ")";
        }

		public void release() {
			// TODO Auto-generated method stub
			
		}

		public void acquire() {
			// TODO Auto-generated method stub
			
		}
	}
}
