/*     */ package android.preference;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.SharedPreferences;
/*     */ import android.content.SharedPreferences.Editor;
/*     */ import android.content.res.TypedArray;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.AbsSavedState;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Preference
/*     */   implements Comparable<Preference>
/*     */ {
/*     */   public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
/*     */   
/*     */   public static class BaseSavedState
/*     */     extends AbsSavedState
/*     */   {
/*     */     public BaseSavedState(Parcel source)
/*     */     {
/*  32 */       super((ClassLoader)null);throw new RuntimeException("Stub!"); }
/*  33 */     public BaseSavedState(Parcelable superState) { super((ClassLoader)null);throw new RuntimeException("Stub!"); }
/*     */     
/*  35 */     public static final Parcelable.Creator<BaseSavedState> CREATOR = null; }
/*     */   
/*  37 */   public Preference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/*  38 */   public Preference(Context context, AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); }
/*  39 */   public Preference(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/*  40 */   public Preference(Context context) { throw new RuntimeException("Stub!"); }
/*  41 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); }
/*  42 */   public void setIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/*  43 */   public Intent getIntent() { throw new RuntimeException("Stub!"); }
/*  44 */   public void setFragment(String fragment) { throw new RuntimeException("Stub!"); }
/*  45 */   public String getFragment() { throw new RuntimeException("Stub!"); }
/*  46 */   public void setPreferenceDataStore(PreferenceDataStore dataStore) { throw new RuntimeException("Stub!"); }
/*  47 */   public PreferenceDataStore getPreferenceDataStore() { throw new RuntimeException("Stub!"); }
/*  48 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  49 */   public Bundle peekExtras() { throw new RuntimeException("Stub!"); }
/*  50 */   public void setLayoutResource(int layoutResId) { throw new RuntimeException("Stub!"); }
/*  51 */   public int getLayoutResource() { throw new RuntimeException("Stub!"); }
/*  52 */   public void setWidgetLayoutResource(int widgetLayoutResId) { throw new RuntimeException("Stub!"); }
/*  53 */   public int getWidgetLayoutResource() { throw new RuntimeException("Stub!"); }
/*  54 */   public View getView(View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*  55 */   protected View onCreateView(ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*  56 */   protected void onBindView(View view) { throw new RuntimeException("Stub!"); }
/*  57 */   public void setOrder(int order) { throw new RuntimeException("Stub!"); }
/*  58 */   public int getOrder() { throw new RuntimeException("Stub!"); }
/*  59 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/*  60 */   public void setTitle(int titleResId) { throw new RuntimeException("Stub!"); }
/*  61 */   public int getTitleRes() { throw new RuntimeException("Stub!"); }
/*  62 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/*  63 */   public void setIcon(Drawable icon) { throw new RuntimeException("Stub!"); }
/*  64 */   public void setIcon(int iconResId) { throw new RuntimeException("Stub!"); }
/*  65 */   public Drawable getIcon() { throw new RuntimeException("Stub!"); }
/*  66 */   public CharSequence getSummary() { throw new RuntimeException("Stub!"); }
/*  67 */   public void setSummary(CharSequence summary) { throw new RuntimeException("Stub!"); }
/*  68 */   public void setSummary(int summaryResId) { throw new RuntimeException("Stub!"); }
/*  69 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  70 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/*  71 */   public void setSelectable(boolean selectable) { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean isSelectable() { throw new RuntimeException("Stub!"); }
/*  73 */   public void setShouldDisableView(boolean shouldDisableView) { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean getShouldDisableView() { throw new RuntimeException("Stub!"); }
/*  75 */   public void setRecycleEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isRecycleEnabled() { throw new RuntimeException("Stub!"); }
/*  77 */   public void setSingleLineTitle(boolean singleLineTitle) { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean isSingleLineTitle() { throw new RuntimeException("Stub!"); }
/*  79 */   public void setIconSpaceReserved(boolean iconSpaceReserved) { throw new RuntimeException("Stub!"); }
/*  80 */   public boolean isIconSpaceReserved() { throw new RuntimeException("Stub!"); }
/*  81 */   protected void onClick() { throw new RuntimeException("Stub!"); }
/*  82 */   public void setKey(String key) { throw new RuntimeException("Stub!"); }
/*  83 */   public String getKey() { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean hasKey() { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean isPersistent() { throw new RuntimeException("Stub!"); }
/*  86 */   protected boolean shouldPersist() { throw new RuntimeException("Stub!"); }
/*  87 */   public void setPersistent(boolean persistent) { throw new RuntimeException("Stub!"); }
/*  88 */   protected boolean callChangeListener(Object newValue) { throw new RuntimeException("Stub!"); }
/*  89 */   public void setOnPreferenceChangeListener(OnPreferenceChangeListener onPreferenceChangeListener) { throw new RuntimeException("Stub!"); }
/*  90 */   public OnPreferenceChangeListener getOnPreferenceChangeListener() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setOnPreferenceClickListener(OnPreferenceClickListener onPreferenceClickListener) { throw new RuntimeException("Stub!"); }
/*  92 */   public OnPreferenceClickListener getOnPreferenceClickListener() { throw new RuntimeException("Stub!"); }
/*  93 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/*  94 */   public SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); }
/*  95 */   public SharedPreferences.Editor getEditor() { throw new RuntimeException("Stub!"); }
/*  96 */   public boolean shouldCommit() { throw new RuntimeException("Stub!"); }
/*  97 */   public int compareTo(Preference another) { throw new RuntimeException("Stub!"); }
/*  98 */   protected void notifyChanged() { throw new RuntimeException("Stub!"); }
/*  99 */   protected void notifyHierarchyChanged() { throw new RuntimeException("Stub!"); }
/* 100 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
/* 101 */   protected void onAttachedToHierarchy(PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); }
/* 102 */   protected void onAttachedToActivity() { throw new RuntimeException("Stub!"); }
/* 103 */   protected Preference findPreferenceInHierarchy(String key) { throw new RuntimeException("Stub!"); }
/* 104 */   public void notifyDependencyChange(boolean disableDependents) { throw new RuntimeException("Stub!"); }
/* 105 */   public void onDependencyChanged(Preference dependency, boolean disableDependent) { throw new RuntimeException("Stub!"); }
/* 106 */   public void onParentChanged(Preference parent, boolean disableChild) { throw new RuntimeException("Stub!"); }
/* 107 */   public boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); }
/* 108 */   public void setDependency(String dependencyKey) { throw new RuntimeException("Stub!"); }
/* 109 */   public String getDependency() { throw new RuntimeException("Stub!"); }
/* 110 */   public PreferenceGroup getParent() { throw new RuntimeException("Stub!"); }
/* 111 */   protected void onPrepareForRemoval() { throw new RuntimeException("Stub!"); }
/* 112 */   public void setDefaultValue(Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 113 */   protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 114 */   protected boolean persistString(String value) { throw new RuntimeException("Stub!"); }
/* 115 */   protected String getPersistedString(String defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 116 */   public boolean persistStringSet(Set<String> values) { throw new RuntimeException("Stub!"); }
/* 117 */   public Set<String> getPersistedStringSet(Set<String> defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 118 */   protected boolean persistInt(int value) { throw new RuntimeException("Stub!"); }
/* 119 */   protected int getPersistedInt(int defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 120 */   protected boolean persistFloat(float value) { throw new RuntimeException("Stub!"); }
/* 121 */   protected float getPersistedFloat(float defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 122 */   protected boolean persistLong(long value) { throw new RuntimeException("Stub!"); }
/* 123 */   protected long getPersistedLong(long defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 124 */   protected boolean persistBoolean(boolean value) { throw new RuntimeException("Stub!"); }
/* 125 */   protected boolean getPersistedBoolean(boolean defaultReturnValue) { throw new RuntimeException("Stub!"); }
/* 126 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 127 */   public void saveHierarchyState(Bundle container) { throw new RuntimeException("Stub!"); }
/* 128 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 129 */   public void restoreHierarchyState(Bundle container) { throw new RuntimeException("Stub!"); }
/* 130 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static abstract interface OnPreferenceClickListener
/*     */   {
/*     */     public abstract boolean onPreferenceClick(Preference paramPreference);
/*     */   }
/*     */   
/*     */   public static abstract interface OnPreferenceChangeListener
/*     */   {
/*     */     public abstract boolean onPreferenceChange(Preference paramPreference, Object paramObject);
/*     */   }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\preference\Preference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */