package android.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
public @interface SuppressLint
{
  String[] value();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\annotation\SuppressLint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */