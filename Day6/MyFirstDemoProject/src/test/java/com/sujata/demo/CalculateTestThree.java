package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTestThree {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate=new Calculate();
    }

    @AfterEach
    void tearDown() {
        calculate=null;
    }


    @ParameterizedTest(name="#{index}={0}/{1} throws exception {2}")
    @MethodSource("valuesForTestCases")
    void testDivide(int number1,int number2,Class exception){
        assertThrows(exception,()->calculate.divide(number1,number2));
    }
    static Stream<Arguments> valuesForTestCases(){
        return Stream.of(Arguments.arguments(-20,5,NegativeNumberException.class),
                Arguments.arguments(20,-5,NegativeNumberException.class),
                Arguments.arguments(-20,-5,NegativeNumberException.class),
                Arguments.arguments(20,0,ArithmeticException.class),
                Arguments.arguments(-20,0,NegativeNumberException.class),
                Arguments.arguments(0,-5,NegativeNumberException.class));
    }

    @DisplayName("divide(20,5)=4")
    @Test
    void R001_T001() throws NegativeNumberException {
        assertEquals(4, calculate.divide(20, 5));
    }

//    @DisplayName("divide(-20,5)=NegativeNumberException")
//    @Test
//    void R001_T002() {
//        assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, 5));
//    }
//
//    @DisplayName("divide(20,-5)=NegativeNumberException")
//    @Test
//    void R001_T003() {
//        assertThrows(NegativeNumberException.class, () -> calculate.divide(20, -5));
//    }
//
//    @DisplayName("divide(-20,-5)=NegativeNumberException")
//    @Test
//    void R001_T004() {
//        assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, -5));
//    }

    @DisplayName("divide(0,5)=0")
    @Test
    void R001_T005() throws NegativeNumberException {
        assertEquals(0, calculate.divide(0, 5));
    }

//    @DisplayName("divide(20,0)=ArithmeticException")
//    @Test
//    void R001_T006() {
//        assertThrows(ArithmeticException.class, () -> calculate.divide(20, 0));
//    }
//
//    @DisplayName("divide(0,-5)=NegativeNumberException")
//    @Test
//    void R001_T007() {
//        assertThrows(NegativeNumberException.class, () -> calculate.divide(0, -5));
//    }
//
//    @DisplayName("divide(-20,0)=NegativeNumberException")
//    @Test
//    void R001_T008() {
//        assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, 0));
//    }

}