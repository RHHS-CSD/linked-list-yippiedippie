/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

import hospital.Patient;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;
    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        if (head == null){
            return 0;
        }
        int size = 1;
        Node current = head;
        while(current != tail){
            size++;
            current = current.getNext();
        }
        return size;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Data item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    public Patient get(int index) {
        if (index < 0){
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        if (current == null){
                return null;
        }
        return current.getItem();
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Patient item) {
        Node end = new Node(item);
        if (head == null){
            head = end;
            tail = end;
        }
        else{
            tail.setNext(end);
            tail = end;
        }
        return true;
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    @Override
    public boolean add(Patient item, int index) {
        Node adding = new Node(item);
        if (index < 0){
            return false;
        }
        if (index == 0){
            adding.setNext(head);
            head = adding;
            if (tail == null){
                tail = adding;
            }
            return true;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++){
            if (current == null){
                return false;
            }
            current = current.getNext();
        }
        if (current == null){
                return false;
        }

        adding.setNext(current.getNext());
        current.setNext(adding);
        if (adding.getNext() == null){
            tail = adding;
        }
        return true;
    }
}
