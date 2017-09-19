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


import android.view.View;
//import gov.nasa.jpf.symbc.Debug;

public class EditText extends View {
    String content;

    public EditText() {
		// TODO Auto-generated constructor stub
    	this.content=new String("97");
	}
    
    public Object getText() {
        //Debug.makeFieldsSymbolic("content", content);
    	//Debug.makeSymbolicString("content");
    	//Debug.printSymbolicRef(content, "CONTENT_VALUE!!!:::>>");
    	return content;
    }

}
