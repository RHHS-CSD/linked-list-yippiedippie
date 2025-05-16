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
public class Node {
    private Patient item = null;
    private Node next = null;
    
    public Node(Patient insert){
        this.item = insert;
    }
    
    public Patient getItem(){
        return this.item;
    }
    
    public void setItem(Patient item){
        this.item = item;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
}
