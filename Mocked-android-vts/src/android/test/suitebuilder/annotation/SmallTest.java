package android.test.suitebuilder.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
public @interface SmallTest {}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\suitebuilder\annotation\SmallTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */