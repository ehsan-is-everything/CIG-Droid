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

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Activity extends Context {
	View mWindow;
	Intent mIntent;
	public static final int RESULT_CANCELED = 0;
	public static final int RESULT_OK = -1;

	public void setContentView(int layoutResID) {

	}

	public final boolean requestWindowFeature(int featureId) {
		return false;
	}

	public final void setProgressBarIndeterminateVisibility(boolean visible) {

	}

	public void sendBroadcast(Intent intent) {

	}

	public final void showDialog(int id) {
		showDialog(id, null);
	}

	public final boolean showDialog(int id, Bundle args) {
		// TODO Auto-generated method stub
		return true;
	}

	public final void removeDialog(int id) {

	}

	protected void onPrepareDialog(int id, Dialog dialog) {
		// dialog.setOwnerActivity(this);
	}

	protected Dialog onCreateDialog(int id, Bundle args) {
		return onCreateDialog(id);
	}

	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText(int n) {
		return new String("");
	}

	public void finish() {
		// finish(false);
	}

	public Context getContext() {
		return new Context();
	}

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

		startActivityForResult(intent, -1, options);

	}

	public void startActivityForResult(Intent intent, int requestCode) {
		startActivityForResult(intent, requestCode, null);
	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	}

	public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
		try {
			Activity mActivity = (Activity) Class.forName(intent.getCls().getName()).newInstance();
			mActivity.setIntent(intent);
			mActivity.onCreate(options);

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void onResume() {

	}

	public boolean onPrepareOptionsMenu(Menu menu) {
		return false;
	}

	public ContentResolver getContentResolver() {
		return new ContentResolver();
	}

	public Object getSystemService(String s) {
		return null;
	}

	public final void setResult(int resultCode, Intent intent) {
		this.mIntent = intent;
	}

	public final void setResult(int resultCode) {

	}

	public LayoutInflater getLayoutInflater() {
		return new LayoutInflater();
	}
}
