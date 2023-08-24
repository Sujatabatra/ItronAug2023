package com.sujata.consumer;

import com.sujata.producer.Dancer;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PerformerConfig {


    @Bean("Amrit")
    public Singer getSinger(){
        Singer singer=new Singer();
        singer.setSong("Home");
        return singer;
    }

    @Bean("Krithik")
    public Dancer getDance(){
        Dancer dancer=new Dancer();
        dancer.setStyle("Free Style");
        return dancer;
    }

    @Bean("Prateek")
    public Juggler getJuggler(){
        return new Juggler(4);
    }


    @Bean("fikkiAuditorium")
    public Auditorium getAuditorium(){
        return new Auditorium(getDance());
    }
}
