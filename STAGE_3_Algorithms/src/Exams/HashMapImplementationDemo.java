package Exarms;

// Java program to implement HashMap API

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class HashMapImplementation<K, V> {
    private HashMap<K, V> hashMap;

    // Constructs an empty HashMap with the default initial
    // capacity (16) and the default load factor (0.75).

    public HashMapImplementation()
    {
        hashMap = new HashMap<K, V>();
    }

    // Constructs an empty HashMap with the specified
    // initial capacity and the default load factor (0.75).

    public HashMapImplementation(int initialCapacity)
    {
        hashMap = new HashMap<K, V>(initialCapacity);
    }

    // Constructs an empty HashMap with the specified
    // initial capacity and load factor.

    public HashMapImplementation(int initialCapacity,
                                 float loadFactor)
    {
        hashMap = new HashMap<K, V>(initialCapacity,
                loadFactor);
    }

    // Constructs a new HashMap with the same mappings as
    // the specified Map.
    public HashMapImplementation(Map<? extends K, ? extends V> m)
    {
        hashMap = new HashMap<K, V>(m);
    }

    // Removes all of the mappings from this map.
    public void clear() { hashMap.clear(); }

    // Returns a shallow copy of this HashMap instance: the
    // keys and values
    // themselves are not cloned.

    public Object clone() { return hashMap.clone(); }

    // return true if map contains given key
    public boolean containsKey(Object key)
    {
        return hashMap.containsKey(key);
    }

    // Returns true if this map maps one or more keys to the
    // specified value.
    public boolean containsValue(Object value)
    {
        return hashMap.containsValue(value);
    }

    // Returns a Set view of the mappings contained in this
    // map.
    public Set<Map.Entry<K, V> > entrySet()
    {
        return hashMap.entrySet();
    }

    // return the value for which the key is mapped , if key
    // is not mapped with any value then it will return null
    public V get(Object key) { return hashMap.get(key); }

    // return true if hashmap is empty else false
    public boolean isEmpty() { return hashMap.isEmpty(); }

    // Returns a Set view of the keys contained in this map.
    public Set<K> keySet() { return hashMap.keySet(); }

    // map the key with value
    public V put(K key, V value)
    {
        return hashMap.put(key, value);
    }

    // copy all the mapping to this map
    public void putAll(Map<? extends K, ? extends V> m)
    {
        hashMap.putAll(m);
    }

    // remove the mapping of given key
    public V remove(Object key)
    {
        return hashMap.remove(key);
    }

    // returns the size of map(number of key )
    public int size() { return hashMap.size(); }

    // Returns a Collection view of the values contained in
    // this map.
    public Collection<V> values()
    {
        return hashMap.values();
    }
}
