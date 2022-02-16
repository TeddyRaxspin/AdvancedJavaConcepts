package com.jkuat.dit;

import com.jkuat.dit.loose.coupling.Bus;
import com.jkuat.dit.loose.coupling.Train;

public class PersonTight {
    //To demonstrate tight coupling.

    //Member Variables
    Bus bus = new Bus();
    Train train = new Train();

    //Constructor
    public PersonTight(Bus bus, Train train) {
        this.bus = bus;
        this.train = train;
    }

    //Method to display mode of transport started
    public void start(){
        bus.start();
        train.start();
    }


    public static void main(String[] args) {

     Bus bus1 = new Bus();
     Train train1 = new Train();

     PersonTight person1 = new PersonTight(bus1, train1);
     person1.start();

    /*
    *Suppose the person changes his/her mind and want's to use a motorbike
    * This means we have to create another class called Motorbike,
    * Create member variables in class Person
    * Change the constructor parameter in the class Person
    * Instanciate an object in the main method
    * Hence tight coupling
    */

    }
}
