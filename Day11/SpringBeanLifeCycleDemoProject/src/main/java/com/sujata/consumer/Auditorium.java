package com.sujata.consumer;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;

public class Auditorium {
    //IOC : Seperate the dependency logic from actual bussiness logic of an application
    private Performer performer;

    //Hard coded the dependency logic
//    private Performer performer=new Singer();

    public Auditorium(){

        System.out.println("Auditorium Constructor");
    }
    public Auditorium(Performer performer) {
        this.performer = performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    public void performance(){
        performer.perform();
    }
}
