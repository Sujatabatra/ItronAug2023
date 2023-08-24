package com.sujata.consumer;

import com.sujata.producer.Performer;
import com.sujata.producer.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Auditorium {

    private Performer performer;

    public Auditorium(Performer performer) {
        this.performer = performer;
    }

    public void performance(){
        performer.perform();
    }
}
