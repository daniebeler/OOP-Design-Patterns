package com.daniebeler.list;

public class HTLLinkedList implements HTLList{

    private Node root = null;

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
    }

    @Override
    public void remove(int index) {
        Node pointer = root;
        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();
        }
        pointer.setNext(pointer.getNext().getNext());
    }

    @Override
    public int get(int index) {
        Node pointer = root;
        for(int i = 0; i <= index; i++) {
            pointer = pointer.getNext();
        }
        return pointer.getValue();
    }
}
