package android.test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FlakyTest
{
  int tolerance() default 1;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\FlakyTest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */