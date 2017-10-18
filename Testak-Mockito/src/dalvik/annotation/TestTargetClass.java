package dalvik.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
@Deprecated
public @interface TestTargetClass
{
  Class<?> value();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\dalvik\annotation\TestTargetClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */