package org.example.factory.warehouse;

public interface Warehouse<K, V> {

    void put(K k, V v);

    V get(K k);

    boolean check(K k);
}
