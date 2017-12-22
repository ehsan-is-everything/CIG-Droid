package android.app;

import android.content.Context;
import android.content.DialogInterface;
//import android.content.DialogInterface.OnCancelListener;
//import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;

public class AlertDialog extends Dialog implements DialogInterface {

	private static final CharSequence BUTTON_NEUTRAL = null;


	public AlertDialog(Context paramContext) {
		// TODO Auto-generated constructor stub
	}

	public Bundle onSaveInstanceState() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void onCreate(Bundle paramBundle) {
		// TODO Auto-generated method stub

	}
	public void setButton(CharSequence text, final OnClickListener listener) {
//        setButton(BUTTON_NEUTRAL, text, listener);
    }
	public void setButton2(CharSequence text, final OnClickListener listener) {
//        setButton(BUTTON_NEUTRAL, text, listener);
    }
	public void setButton3(CharSequence text, final OnClickListener listener) {
//        setButton(BUTTON_NEUTRAL, text, listener);
    }
	
	public /*Builder*/void setOnCancelListener(OnCancelListener onCancelListener) {
//        P.mOnCancelListener = onCancelListener;
//        return this;
    }
	 public /*Builder*/void setCancelable(boolean cancelable) {
        // P.mCancelable = cancelable;
       //  return this;
     }
	 public /*Builder*/ void setView(View view) {
//         P.mView = null;
//         P.mViewLayoutResId = layoutResId;
//         P.mViewSpacingSpecified = false;
//         return this;
     }
	 

	public void setTitle(CharSequence title) {

	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismiss() {
		// TODO Auto-generated method stub
		
	}
}
