package com.jkuat.dit;

import com.jkuat.dit.loose.coupling.Bus;
import com.jkuat.dit.loose.coupling.Motorbike;

public class PersonLoose {
    //Member variable
    Transport transport;

    //Constructor
    public PersonLoose(Transport transport) {
        this.transport = transport;
    }

    //Method to display mode of transport started
    public void start(){
        transport.start();
    }


    public static void main(String[] args) {
        Bus bus = new Bus();
        PersonLoose person1 = new PersonLoose(bus);
        person1.start();



        /*
         *Suppose the person changes his/her mind and want's to use a motorbike
         * This means we have to create another class called Motorbike,
         * Instanciate an object in the main method
         * Hence loose coupling
         */

        /*
        Motorbike motorbike = new Motorbike();
        PersonLoose person2 = new PersonLoose(motorbike);
        person2.start();
        */
   }
}
