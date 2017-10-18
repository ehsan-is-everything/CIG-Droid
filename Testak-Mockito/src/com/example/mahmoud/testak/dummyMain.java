package com.example.mahmoud.testak;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

//import com.android.internal.telephony.DataCallState.SetupResult;

import android.view.View;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

@RunWith(MockitoJUnitRunner.class)
public class dummyMain {
	@Mock
	Bundle Bundle;

	@Mock
	FloatingActionButton FloatingActionButton;
	@Mock
	AppCompatActivity AppCompatActivity;
	@Mock
	Snackbar Snackbar;
	
	@Mock
	View View;

	@Mock
	Toolbar Toolbar;
	
	
	
	@Mock
	Menu Menu;

	@Mock
	MenuItem MenuItem;	

	@InjectMocks
	MainActivity ma;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		System.out.println("aloo");
		ma = new MainActivity();
		ma.onCreate(null);
		// View v=new View(ma);
		ma.findViewById(R.id.fab).performClick();
	}

	public static void main(String[] args) {
		dummyMain dm = new dummyMain();
		try {
			dm.setUp();
			dm.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}