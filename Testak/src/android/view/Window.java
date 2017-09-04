package android.view;

public abstract class Window {
	public abstract View getDecorView();
	public View findViewById( int id) {
        return getDecorView().findViewById(id);
    }
}
