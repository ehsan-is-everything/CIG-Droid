/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package gov.nasa.jpf.symbc;
import gov.nasa.jpf.symbc.Symbolic;

public class ExSymExe35 {
	
	@Symbolic ("true")
	static int staticGlobalFloat = 1;
	@Symbolic ("true")
	int globalFloat = 4;
	@Symbolic ("true")
	static int staticGlobalInt = 0;
	@Symbolic ("true")
	int globalInt = 4;
	
  public static void main (String[] args) {
	  int x = 3;
	  int y = 5;
//	  ExSymExe35 inst = new ExSymExe35();
//	  inst.test(x, y, 9);
		test(x, y, 9);
  }

  /*
   * test FNEG, FADD, FSUB, FDIV, FMUL, FREM, FCMPG & FCMPL bytecodes
   */
  
  //public void test (int x, int z, int r) { //invokevirtual
  public static void test (int x, int z, int r) { //invokestatic
  //private void test (int x, int z, int r) { //invokespecial
	  
	  float a = staticGlobalFloat;
	  float b = z;
	  float c = 3.45f; 
	  float d = z - staticGlobalFloat;
	  
	  float negate = -r; //FNEG
	  
	  float sum = a + b; //FADD
	  float sum2 = z + 5.5f; //FADD
	  float sum3 = 5.5f + z; //FADD
	  
	  float diff = a - b; //FSUB
	  float diff2 = d - 1.0f; //FSUB
	  float diff3 = 2.3f - a; //FSUB
	  
	  float div = a / b; //FDIV
	  float div2 = 1.0f / a; //FDIV
	  float div3 = d / 2.2f; //FDIV
	  
	  float mul = a * b; //FMUL
	  float mul2 = a * 2.2f; //FMUL
	  float mul3 = 2.2f * d; //FMUL
	  
	  float remain = a % d; //FREM - not supported
	  	  
	  System.out.println("Testing ExSymExe35"+ staticGlobalFloat);
	  if(staticGlobalFloat==1){
		System.out.println("branch assert");
		assert(false);
		}
	  if ( x < z) //FCMPG
	  //if ( mul2 <= mul) //FCMPG
	  //if ( mul2 != mul) //FCMPL
		  System.out.println("branch FOO1");
	  else
		  System.out.println("branch FOO2");
	  if (x > r)  //FCMPL
		  System.out.println("branch BOO1");
	  else
		  System.out.println("branch BOO2");
		  
  }
}
