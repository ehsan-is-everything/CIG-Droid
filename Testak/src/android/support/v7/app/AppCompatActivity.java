package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;

public class AppCompatActivity extends FragmentActivity{
	
	@Override
    public void setContentView(int layoutResID) {
    
	}
	public void setSupportActionBar(@Nullable Toolbar toolbar) {
        
    }
	@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
    }
	
}
