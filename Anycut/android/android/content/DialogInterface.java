package android.content;

public class DialogInterface {

	public interface OnCancelListener {
        public void onCancel(DialogInterface dialog);
    }
	
    public interface OnClickListener {
        public void onClick(DialogInterface dialog, int which);
    }


}
