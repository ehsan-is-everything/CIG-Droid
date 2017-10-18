package java.lang.annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface Retention
{
  RetentionPolicy value();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\annotation\Retention.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */