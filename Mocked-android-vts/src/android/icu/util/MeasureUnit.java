/*     */ package android.icu.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MeasureUnit
/*     */   implements Serializable
/*     */ {
/*  14 */   MeasureUnit() { throw new RuntimeException("Stub!"); }
/*  15 */   public String getType() { throw new RuntimeException("Stub!"); }
/*  16 */   public String getSubtype() { throw new RuntimeException("Stub!"); }
/*  17 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  18 */   public boolean equals(Object rhs) { throw new RuntimeException("Stub!"); }
/*  19 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  20 */   public static synchronized Set<String> getAvailableTypes() { throw new RuntimeException("Stub!"); }
/*  21 */   public static synchronized Set<MeasureUnit> getAvailable(String type) { throw new RuntimeException("Stub!"); }
/*  22 */   public static synchronized Set<MeasureUnit> getAvailable() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */   public static final TimeUnit YEAR = null; public static final MeasureUnit YARD = null; public static final TimeUnit WEEK = null; public static final MeasureUnit WATT = null; public static final MeasureUnit VOLT = null; public static final MeasureUnit TON = null; public static final MeasureUnit TERABYTE = null; public static final MeasureUnit TERABIT = null; public static final MeasureUnit TEASPOON = null; public static final MeasureUnit TABLESPOON = null; public static final MeasureUnit STONE = null; public static final MeasureUnit SQUARE_YARD = null; public static final MeasureUnit SQUARE_MILE = null; public static final MeasureUnit SQUARE_METER = null; public static final MeasureUnit SQUARE_KILOMETER = null; public static final MeasureUnit SQUARE_INCH = null; public static final MeasureUnit SQUARE_FOOT = null; public static final MeasureUnit SQUARE_CENTIMETER = null; public static final TimeUnit SECOND = null; public static final MeasureUnit REVOLUTION_ANGLE = null; public static final MeasureUnit RADIAN = null; public static final MeasureUnit QUART = null; public static final MeasureUnit POUND_PER_SQUARE_INCH = null; public static final MeasureUnit POUND = null; public static final MeasureUnit PINT_METRIC = null; public static final MeasureUnit PINT = null; public static final MeasureUnit PICOMETER = null; public static final MeasureUnit PARSEC = null; public static final MeasureUnit OUNCE_TROY = null; public static final MeasureUnit OUNCE = null; public static final MeasureUnit OHM = null; public static final MeasureUnit NAUTICAL_MILE = null; public static final MeasureUnit NANOSECOND = null; public static final MeasureUnit NANOMETER = null; public static final TimeUnit MONTH = null; public static final TimeUnit MINUTE = null; public static final MeasureUnit MILLIWATT = null; public static final MeasureUnit MILLISECOND = null; public static final MeasureUnit MILLIMETER_OF_MERCURY = null; public static final MeasureUnit MILLIMETER = null; public static final MeasureUnit MILLILITER = null; public static final MeasureUnit MILLIGRAM = null; public static final MeasureUnit MILLIBAR = null; public static final MeasureUnit MILLIAMPERE = null; public static final MeasureUnit MILE_SCANDINAVIAN = null; public static final MeasureUnit MILE_PER_HOUR = null; public static final MeasureUnit MILE_PER_GALLON = null; public static final MeasureUnit MILE = null; public static final MeasureUnit MICROSECOND = null; public static final MeasureUnit MICROMETER = null; public static final MeasureUnit MICROGRAM = null; public static final MeasureUnit METRIC_TON = null; public static final MeasureUnit METER_PER_SECOND_SQUARED = null; public static final MeasureUnit METER_PER_SECOND = null; public static final MeasureUnit METER = null; public static final MeasureUnit MEGAWATT = null; public static final MeasureUnit MEGALITER = null; public static final MeasureUnit MEGAHERTZ = null; public static final MeasureUnit MEGABYTE = null; public static final MeasureUnit MEGABIT = null; public static final MeasureUnit LUX = null; public static final MeasureUnit LITER_PER_KILOMETER = null; public static final MeasureUnit LITER_PER_100KILOMETERS = null; public static final MeasureUnit LITER = null; public static final MeasureUnit LIGHT_YEAR = null; public static final MeasureUnit KNOT = null; public static final MeasureUnit KILOWATT_HOUR = null; public static final MeasureUnit KILOWATT = null; public static final MeasureUnit KILOMETER_PER_HOUR = null; public static final MeasureUnit KILOMETER = null; public static final MeasureUnit KILOJOULE = null; public static final MeasureUnit KILOHERTZ = null; public static final MeasureUnit KILOGRAM = null; public static final MeasureUnit KILOCALORIE = null; public static final MeasureUnit KILOBYTE = null; public static final MeasureUnit KILOBIT = null; public static final MeasureUnit KELVIN = null; public static final MeasureUnit KARAT = null; public static final MeasureUnit JOULE = null; public static final MeasureUnit INCH_HG = null; public static final MeasureUnit INCH = null; public static final TimeUnit HOUR = null; public static final MeasureUnit HORSEPOWER = null; public static final MeasureUnit HERTZ = null; public static final MeasureUnit HECTOPASCAL = null; public static final MeasureUnit HECTOLITER = null; public static final MeasureUnit HECTARE = null; public static final MeasureUnit G_FORCE = null; public static final MeasureUnit GRAM = null; public static final MeasureUnit GIGAWATT = null; public static final MeasureUnit GIGAHERTZ = null; public static final MeasureUnit GIGABYTE = null; public static final MeasureUnit GIGABIT = null; public static final MeasureUnit GENERIC_TEMPERATURE = null; public static final MeasureUnit GALLON = null; public static final MeasureUnit FURLONG = null; public static final MeasureUnit FOOT = null; public static final MeasureUnit FOODCALORIE = null; public static final MeasureUnit FLUID_OUNCE = null; public static final MeasureUnit FATHOM = null; public static final MeasureUnit FAHRENHEIT = null; public static final MeasureUnit DEGREE = null; public static final MeasureUnit DECIMETER = null; public static final MeasureUnit DECILITER = null; public static final TimeUnit DAY = null; public static final MeasureUnit CUP_METRIC = null; public static final MeasureUnit CUP = null; public static final MeasureUnit CUBIC_YARD = null; public static final MeasureUnit CUBIC_MILE = null; public static final MeasureUnit CUBIC_METER = null; public static final MeasureUnit CUBIC_KILOMETER = null; public static final MeasureUnit CUBIC_INCH = null; public static final MeasureUnit CUBIC_FOOT = null; public static final MeasureUnit CUBIC_CENTIMETER = null; public static final MeasureUnit CENTURY = null; public static final MeasureUnit CENTIMETER = null; public static final MeasureUnit CENTILITER = null; public static final MeasureUnit CELSIUS = null; public static final MeasureUnit CARAT = null; public static final MeasureUnit CALORIE = null; public static final MeasureUnit BYTE = null; public static final MeasureUnit BUSHEL = null; public static final MeasureUnit BIT = null; public static final MeasureUnit ASTRONOMICAL_UNIT = null; public static final MeasureUnit ARC_SECOND = null; public static final MeasureUnit ARC_MINUTE = null; public static final MeasureUnit AMPERE = null; public static final MeasureUnit ACRE_FOOT = null; public static final MeasureUnit ACRE = null;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\MeasureUnit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */