package com.daniebeler.list;

public class HTLLinkedList implements HTLList{

    private Node root = null;
    private int size = 0;

    @Override
    public void add(int value) {

        if(root == null) {
            this.root = new Node(value);
        }

        Node pointer = root;
        while(pointer.getNext() != null){
            pointer = pointer.getNext();
        }

        pointer.setNext(new Node(value));
        size++;
    }

    @Override
    public boolean remove(int value) {
        Node pointer = root;
        for(int i = 0; i <= size; i++) {
            if(pointer.getValue() == value) {
                pointer.setNext(pointer.getNext().getNext());
                size--;
                return true;
            }
            pointer = pointer.getNext();
        }

        return false;
    }

    @Override
    public void removeIndex(int index) {
        Node pointer = root;
        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();
        }
        pointer.setNext(pointer.getNext().getNext());
        size--;
    }

    @Override
    public int get(int index) {
        Node pointer = root;
        for(int i = 0; i <= index; i++) {
            pointer = pointer.getNext();
        }
        return pointer.getValue();
    }

    @Override
    public boolean contains(int value) {
        Node pointer = root;
        for(int i = 0; i <= size; i++) {
            if(pointer.getValue() == value) {
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }
}
