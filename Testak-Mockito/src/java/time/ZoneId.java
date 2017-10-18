/*    */ package java.time;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.format.TextStyle;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.zone.ZoneRules;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ public abstract class ZoneId
/*    */   implements Serializable
/*    */ {
/* 66 */   ZoneId() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ZoneId systemDefault() { throw new RuntimeException("Stub!"); }
/* 68 */   public static Set<String> getAvailableZoneIds() { throw new RuntimeException("Stub!"); }
/* 69 */   public static ZoneId of(String zoneId, Map<String, String> aliasMap) { throw new RuntimeException("Stub!"); }
/* 70 */   public static ZoneId of(String zoneId) { throw new RuntimeException("Stub!"); }
/* 71 */   public static ZoneId ofOffset(String prefix, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 72 */   public static ZoneId from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getId();
/* 74 */   public String getDisplayName(TextStyle style, Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ZoneRules getRules();
/* 76 */   public ZoneId normalized() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 78 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 79 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 81 */   public static final Map<String, String> SHORT_IDS = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\ZoneId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */