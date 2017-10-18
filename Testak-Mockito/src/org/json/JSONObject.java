/*    */ package org.json;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JSONObject
/*    */ {
/* 20 */   public JSONObject() { throw new RuntimeException("Stub!"); }
/* 21 */   public JSONObject(Map copyFrom) { throw new RuntimeException("Stub!"); }
/* 22 */   public JSONObject(JSONTokener readFrom) throws JSONException { throw new RuntimeException("Stub!"); }
/* 23 */   public JSONObject(String json) throws JSONException { throw new RuntimeException("Stub!"); }
/* 24 */   public JSONObject(JSONObject copyFrom, String[] names) throws JSONException { throw new RuntimeException("Stub!"); }
/* 25 */   public int length() { throw new RuntimeException("Stub!"); }
/* 26 */   public JSONObject put(String name, boolean value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 27 */   public JSONObject put(String name, double value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 28 */   public JSONObject put(String name, int value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 29 */   public JSONObject put(String name, long value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 30 */   public JSONObject put(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 31 */   public JSONObject putOpt(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 32 */   public JSONObject accumulate(String name, Object value) throws JSONException { throw new RuntimeException("Stub!"); }
/* 33 */   public Object remove(String name) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isNull(String name) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean has(String name) { throw new RuntimeException("Stub!"); }
/* 36 */   public Object get(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 37 */   public Object opt(String name) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean getBoolean(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean optBoolean(String name) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean optBoolean(String name, boolean fallback) { throw new RuntimeException("Stub!"); }
/* 41 */   public double getDouble(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 42 */   public double optDouble(String name) { throw new RuntimeException("Stub!"); }
/* 43 */   public double optDouble(String name, double fallback) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getInt(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 45 */   public int optInt(String name) { throw new RuntimeException("Stub!"); }
/* 46 */   public int optInt(String name, int fallback) { throw new RuntimeException("Stub!"); }
/* 47 */   public long getLong(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 48 */   public long optLong(String name) { throw new RuntimeException("Stub!"); }
/* 49 */   public long optLong(String name, long fallback) { throw new RuntimeException("Stub!"); }
/* 50 */   public String getString(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 51 */   public String optString(String name) { throw new RuntimeException("Stub!"); }
/* 52 */   public String optString(String name, String fallback) { throw new RuntimeException("Stub!"); }
/* 53 */   public JSONArray getJSONArray(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 54 */   public JSONArray optJSONArray(String name) { throw new RuntimeException("Stub!"); }
/* 55 */   public JSONObject getJSONObject(String name) throws JSONException { throw new RuntimeException("Stub!"); }
/* 56 */   public JSONObject optJSONObject(String name) { throw new RuntimeException("Stub!"); }
/* 57 */   public JSONArray toJSONArray(JSONArray names) throws JSONException { throw new RuntimeException("Stub!"); }
/* 58 */   public Iterator<String> keys() { throw new RuntimeException("Stub!"); }
/* 59 */   public JSONArray names() { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 61 */   public String toString(int indentSpaces) throws JSONException { throw new RuntimeException("Stub!"); }
/* 62 */   public static String numberToString(Number number) throws JSONException { throw new RuntimeException("Stub!"); }
/* 63 */   public static String quote(String data) { throw new RuntimeException("Stub!"); }
/* 64 */   public static Object wrap(Object o) { throw new RuntimeException("Stub!"); }
/*    */   
/* 66 */   public static final Object NULL = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\json\JSONObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */