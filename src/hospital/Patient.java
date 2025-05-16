/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Lemue
 */
public class Patient implements Comparable<Patient>{
    //create instance variables
    String firstName;
    String lastName;
    int num;
    int priority;
    Patient(String firstName, String lastName, int num, int priority){
        firstName = this.firstName;
        lastName = this.lastName;
        num = this.num;
        priority = this.priority;
    }

    @Override
    public int compareTo(Patient o) {
        return this.num - o.num;
    }
    
}
