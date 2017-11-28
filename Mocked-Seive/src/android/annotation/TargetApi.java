package android.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface TargetApi
{
  int value();
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\annotation\TargetApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */