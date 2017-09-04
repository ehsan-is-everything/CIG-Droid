package android.view;

public class View {

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
	public void setOnClickListener(OnClickListener l) {
        
    }
	public final View findViewById( int id) {
        if (id < 0) {
            return null;
        }
        return null;
    }
}
