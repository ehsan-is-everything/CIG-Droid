package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import com.example.lab.testak_textinput.MainActivity;
import com.example.lab.testak_textinput.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;


@RunWith(MyRobolectricTestRunner.class)
@Config(manifest=Config.NONE)
public class DummyMain {

	@Test
	public void theGreatTest(){
		System.out.println("Starting dummyMain");
		MainActivity ma=Robolectric.setupActivity(MainActivity.class);
		ma.findViewById(R.id.button).performClick();
        System.out.println("Finished with dummyMain");
	}
}

