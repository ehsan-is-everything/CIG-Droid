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

package android.widget;

//import com.andreadec.musicplayer.OnFocusChangeListener;
import com.andreadec.musicplayer.SearchActivity;
import com.spring.bird.anycut.a;

import android.view.View;
import gov.nasa.jpf.symbc.Debug;
//import gov.nasa.jpf.symbc.Debug;

public class EditText extends View {
	String content;

	public EditText(String id) {
		// TODO Auto-generated constructor stub
		this.content = Debug.makeSymbolicString(id);
	}

	public Object getText() {
		// Debug.makeFieldsSymbolic("content", content);
		// Debug.makeSymbolicString("content");
		 //Debug.printSymbolicRef(content, "CONTENT_VALUE!!!:::>>");
		return content;
	}

	public void setOnKeyListener(OnKeyListener keyL) {
		this.mOnKeyListener = keyL;

	}

	public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
		this.mOnFocusChangeListener = onFocusChangeListener;

	}

	public Object getWindowToken() {
		// TODO Auto-generated method stub
		return null;
	}

	public void requestFocus() {
		// TODO Auto-generated method stub
		
	}

	public void setText(String text) {
		// TODO Auto-generated method stub
		this.content=text;
	}

	public void clearFocus() {
		// TODO Auto-generated method stub
		
	}

	public void addTextChangedListener(a a) {
		// TODO Auto-generated method stub
		
	}

	public void setError(Object object) {
		// TODO Auto-generated method stub
		
	}

}
