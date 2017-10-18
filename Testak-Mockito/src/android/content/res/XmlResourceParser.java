package android.content.res;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract interface XmlResourceParser
  extends XmlPullParser, AttributeSet, AutoCloseable
{
  public abstract void close();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\res\XmlResourceParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */