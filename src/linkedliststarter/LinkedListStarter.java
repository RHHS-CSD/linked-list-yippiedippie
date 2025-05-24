/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

import hospital.Patient;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        Patient patient1 = new Patient("Lemuel","Ann",634739,1);
        Patient patient2 = new Patient("E","H",4423,2);
        Patient patient3 = new Patient("E","A", 34234, 3);
        sli1.add(patient1);
        sli1.add(patient2);
        int size = sli1.size();
        System.out.println(sli1.get(1));
        sli1.add(patient3, 1);
        System.out.println(sli1.get(1));
        System.out.println(sli1.get(0));
    }
}
