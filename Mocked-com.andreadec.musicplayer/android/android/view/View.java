package android.view;


public class View {
	public OnClickListener mOnClickListener;
	public OnKeyListener mOnKeyListener;
	protected OnFocusChangeListener mOnFocusChangeListener;
	 /**
     * Interface definition for a callback to be invoked when a view is clicked.
     */
    public interface OnClickListener {
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        void onClick(View v);
    }
 
    public interface OnKeyListener{

		boolean onKey(View v, int keyCode, KeyEvent event);
    	
    }
public interface OnFocusChangeListener{

	void onFocusChange(View view, boolean hasFocus);
    	
    }
	public void setOnClickListener(OnClickListener l) {
       mOnClickListener=l; 
    }
	public final View findViewById(int id) {
        if (id < 0) {
            return null;
        }
        return this;
    }
}
