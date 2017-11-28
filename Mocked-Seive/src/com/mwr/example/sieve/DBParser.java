package com.mwr.example.sieve;

import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DBParser
{
  public static final String ns = null;
  
  public static String getKey(InputStream paramInputStream)
    throws XmlPullParserException, IOException
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
    localXmlPullParser.setInput(paramInputStream, null);
    localXmlPullParser.nextTag();
    localXmlPullParser.require(2, ns, "Passwords");
    return localXmlPullParser.getAttributeValue(null, "Key");
  }
  
  public static String getPIN(InputStream paramInputStream)
    throws XmlPullParserException, IOException
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
    localXmlPullParser.setInput(paramInputStream, null);
    localXmlPullParser.nextTag();
    localXmlPullParser.require(2, ns, "Passwords");
    return localXmlPullParser.getAttributeValue(null, "Pin");
  }
  
  public static String processElement(PasswordEntry paramPasswordEntry)
  {
    StringBuffer localStringBuffer = new StringBuffer("<entry>");
    localStringBuffer.append("<service>" + paramPasswordEntry.service + "</service>");
    localStringBuffer.append("<username>" + paramPasswordEntry.username + "</username>");
    localStringBuffer.append("<email>" + paramPasswordEntry.email + "</email>");
    localStringBuffer.append("<password>" + paramPasswordEntry.password + "</password>");
    localStringBuffer.append("</entry>");
    return localStringBuffer.toString();
  }
  
  private static String readElement(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException, IOException
  {
    paramXmlPullParser.require(2, ns, paramString);
    String str = readText(paramXmlPullParser);
    paramXmlPullParser.require(3, ns, paramString);
    return str;
  }
  
  private static PasswordEntry readEntry(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    String str2 = null;
    String str1 = null;
    String str4 = null;
    String str3 = null;
    for (;;)
    {
      if (paramXmlPullParser.next() == 3) {
        return new PasswordEntry(str2, str1, str4, str3);
      }
      if (paramXmlPullParser.getEventType() == 2)
      {
        String str5 = paramXmlPullParser.getName();
        if (str5.equals("service")) {
          str2 = readElement(paramXmlPullParser, "service");
        } else if (str5.equals("username")) {
          str1 = readElement(paramXmlPullParser, "username");
        } else if (str5.equals("email")) {
          str4 = readElement(paramXmlPullParser, "email");
        } else if (str5.equals("password")) {
          str3 = readElement(paramXmlPullParser, "password");
        }
      }
    }
  }
  
  private static List<PasswordEntry> readFeed(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    paramXmlPullParser.require(2, ns, "Passwords");
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (paramXmlPullParser.next() == 3) {
        return localLinkedList;
      }
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("entry")) {
          localLinkedList.add(readEntry(paramXmlPullParser));
        } else {
          skip(paramXmlPullParser);
        }
      }
    }
  }
  
  public static List<PasswordEntry> readFile(InputStream paramInputStream)
    throws XmlPullParserException, IOException
  {
    XmlPullParser localXmlPullParser = Xml.newPullParser();
    localXmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
    localXmlPullParser.setInput(paramInputStream, null);
    localXmlPullParser.nextTag();
    return readFeed(localXmlPullParser);
  }
  
  private static String readText(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    String str = "";
    if (paramXmlPullParser.next() == 4)
    {
      str = paramXmlPullParser.getText();
      paramXmlPullParser.nextTag();
    }
    return str;
  }
  
  private static void skip(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    if (paramXmlPullParser.getEventType() != 2)
    {
      Log.i("parser", "IllegalState thrown");
      throw new IllegalStateException();
    }
    int i = 1;
    for (;;)
    {
      if (i == 0) {
        return;
      }
      switch (paramXmlPullParser.next())
      {
      default: 
        break;
      case 2: 
        i += 1;
        break;
      case 3: 
        i -= 1;
      }
    }
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\DBParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */