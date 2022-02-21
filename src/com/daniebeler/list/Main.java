package com.daniebeler.list;

public class Main {

    public static void main(String[] args) {
        HTLLinkedList list = new HTLLinkedList();

        list.add(7);
        list.add(12);
        list.add(90);
        list.add(90);
        list.add(90);
        list.add(90);
        list.removeIndex(2);
        list.remove(7);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.contains(7));
        System.out.println(list.contains(12));
        System.out.println(list.contains(90));
    }
}
