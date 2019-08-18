package Lecture29_HashMaps;

import java.util.ArrayList;

public class Map<K, V> {
    private ArrayList<MapNode<K, V>> buckets;
    private int TotalEntries;
    private int numBuckets;

    public Map() {
        buckets = new ArrayList<>();
        numBuckets = 10;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % numBuckets;
    }

    private double getLoadFactor() {
        return (0.1 * TotalEntries) / numBuckets;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        MapNode<K, V> node = new MapNode<>(key, value);
        node.next = head;
        buckets.set(bucketIndex, node);
        TotalEntries++;
        if (getLoadFactor() > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        ArrayList<MapNode<K, V>> tempBuckets = buckets;
        buckets = new ArrayList<>();
        numBuckets = (int) (1.5 * numBuckets);
        TotalEntries = 0;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
        for (MapNode<K, V> temp : tempBuckets) {
            while (temp != null) {
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> current = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                TotalEntries--;
                if (prev == null) {
                    buckets.set(bucketIndex, current.next);
                    return current.value;
                } else {
                    prev.next = current.next;
                    return current.value;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public V getvalue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
}