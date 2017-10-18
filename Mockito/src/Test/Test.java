package Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


//@RunWith(MockitoJUnitRunner.class)
public class Test {
	
//	@Mock
//	A a;
//	
//	@InjectMocks
//	B b=new B(10, 0, false, a);
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@org.junit.Test
	public void test() {
		//System.out.println("KHAR");
		//when(a.getA1()).thenReturn(20);
		//System.out.println(b.doC());
		A a=mock(A.class);
//		doNothing().when(a).setA1(anyInt());
//		doNothing().when(a).setA3(anyBoolean());
//		doReturn(RETURNS_DEFAULTS).when(a).mult();
		B b =new B(0, 0, false, a);
		
		System.out.println(b.doC());
		//a.setA1(11);
		//a.setA3(true);
//		verify(a, times(2)).setA1(anyInt());;
		//assertTrue(!b.doC());
//		b.doC();
	}

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.setUp();
			t.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
