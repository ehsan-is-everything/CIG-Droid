package android.Util;

import java.util.ArrayList;
import java.util.Set;

public class ArrayMap<T1, T2> {
	
	private int size=0;
	private ArrayList<T1> keies;
	private ArrayList<T2> values;
	
	public ArrayMap(int capacity) {
		this.keies=new ArrayList<>(capacity);
		this.values=new ArrayList<>(capacity);
	}

	public ArrayMap() {
		this.keies=new ArrayList<>();
		this.values=new ArrayList<>();
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public Object valueAt(int i) {
		// TODO Auto-generated method stub
		return values.get(i);
	}

	public boolean isEmpty() {
		if(size!=0)
		return false;
		else {
			return true;
		}
	}

	public void clear() {
		size=0;
		keies.clear();
		values.clear();
		
	}

	public boolean containsKey(T1 key) {
		// TODO Auto-generated method stub
		return keies.contains(key);
	}

	public Object get(T1 key) {
		// TODO Auto-generated method stub
		return values.get(keies.indexOf(key));
	}

	public void remove(T1 key) {
		// TODO Auto-generated method stub
		values.remove(keies.indexOf(key));
		keies.remove(key);
		size--;
	}

	public void putAll(ArrayMap map) {
		this.keies=map.keies;
		this.values=map.values;
		this.size=map.size;
	}

	public Set<T1> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public void put(T1 key, T2 value) {
		// TODO Auto-generated method stub
		keies.add(key);
		values.add(value);
		size++;
	}


}
