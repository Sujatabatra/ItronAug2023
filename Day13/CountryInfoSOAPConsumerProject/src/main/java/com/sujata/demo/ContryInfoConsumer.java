package com.sujata.demo;

import org.oorsprong.websamples.ArrayOftContinent;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TContinent;

import java.util.List;

public class ContryInfoConsumer {
    public static void main(String[] args) {

        CountryInfoService countryInfoService=new CountryInfoService();

        CountryInfoServiceSoapType countryInfoServiceSoapType=countryInfoService.getCountryInfoServiceSoap();

        ArrayOftContinent arrayOftContinent=countryInfoServiceSoapType.listOfContinentsByName();

        List<TContinent> myList=arrayOftContinent.getTContinent();
        for(TContinent continent:myList){
            System.out.println(continent.getSCode()+"  "+continent.getSName());
        }
    }
}
