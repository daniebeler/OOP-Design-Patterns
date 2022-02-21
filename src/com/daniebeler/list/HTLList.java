package com.daniebeler.list;

public interface HTLList {
    void add(int value);
    boolean remove(int index);
    void removeIndex(int index);
    int get(int index) throws Exception;
    boolean contains(int value);
}
