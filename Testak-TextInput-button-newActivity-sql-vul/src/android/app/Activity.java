/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Activity {
	View mWindow;
	Intent mIntent;

	protected void onCreate(Bundle savedInstanceState) {
		mWindow = new View();
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	public MenuInflater getMenuInflater() {

		return null;
	}

	public View findViewById(int id) {
		return mWindow.findViewById(id);
	}

	public Intent getIntent() {
		return mIntent;
	}

	public void setIntent(Intent newIntent) {
		mIntent = newIntent;
	}

	
	public void startActivity(Intent intent) {
		this.startActivity(intent, null);
	}

	
	public void startActivity(Intent intent, Bundle options) {

		startActivityForResult(intent, -1,options);

	}
	public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
		try {
			Activity mActivity =(Activity) Class.forName(intent.getCls().getName()).newInstance();
			mActivity.setIntent(intent);
			mActivity.onCreate(options);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
