package com.daniebeler.list;

public class Main {

    public static void main(String[] args) {
        HTLLinkedList list = new HTLLinkedList();

        list.add(7);
        list.add(12);
        list.add(90);
        list.remove(2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
