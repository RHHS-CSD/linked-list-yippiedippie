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
    private String firstName;
    private String lastName;
    private int num;
    private int priority;
    public Patient(String firstName, String lastName, int num, int priority){
        this.firstName = firstName;
        this.lastName = lastName;
        this.num = num;
        this.priority = priority;
    }
    @Override
    public int compareTo(Patient o) {
        return this.getNum() - o.getNum();
    }
    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
