/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package linkedliststarter;

import hospital.Patient;

/**
 *
 * @author michael.roy-diclemen
 */
public interface ILinkedList {
public String toString();
public int size(); //99999
public void clear();
public boolean remove(Data item);
public boolean remove(int index);
public int indexOf(Data item);
public Patient get(int index); //((((
public boolean add(Patient item);//9999
public boolean add(Patient item, int index);//9999
}
