package android.test.suitebuilder.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
public @interface LargeTest {}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\suitebuilder\annotation\LargeTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */