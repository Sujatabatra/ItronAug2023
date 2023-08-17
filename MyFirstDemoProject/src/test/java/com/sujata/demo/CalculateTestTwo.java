package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing all methods of Calculate class")
class CalculateTestTwo {

    private Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate=new Calculate();
    }

    @AfterEach
    void tearDown() {
        calculate=null;
    }

    @DisplayName("Testing divide() method")
    @Nested
    class DivideTest {
        @DisplayName("divide(20,5)=4")
        @Test
        void R001_T001() throws NegativeNumberException {
            assertEquals(4, calculate.divide(20, 5));
        }

        @DisplayName("divide(-20,5)=NegativeNumberException")
        @Test
        void R001_T002() {
            assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, 5));
        }

        @DisplayName("divide(20,-5)=NegativeNumberException")
        @Test
        void R001_T003() {
            assertThrows(NegativeNumberException.class, () -> calculate.divide(20, -5));
        }

        @DisplayName("divide(-20,-5)=NegativeNumberException")
        @Test
        void R001_T004() {
            assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, -5));
        }

        @DisplayName("divide(0,5)=0")
        @Test
        void R001_T005() throws NegativeNumberException {
            assertEquals(0, calculate.divide(0, 5));
        }

        @DisplayName("divide(20,0)=ArithmeticException")
        @Test
        void R001_T006() {
            assertThrows(ArithmeticException.class, () -> calculate.divide(20, 0));
        }

        @DisplayName("divide(0,-5)=NegativeNumberException")
        @Test
        void R001_T007() {
            assertThrows(NegativeNumberException.class, () -> calculate.divide(0, -5));
        }

        @DisplayName("divide(-20,0)=NegativeNumberException")
        @Test
        void R001_T008() {
            assertThrows(NegativeNumberException.class, () -> calculate.divide(-20, 0));
        }
    }

    @DisplayName("Testing add() method")
    @Nested
    class AddTest{
    @Test
    void R002_T001(){
        assertEquals(40,calculate.add(30,10));
    }

    @Test
    void R002_T002(){
        assertThrows(NegativeNumberException.class,()->calculate.add(-30,10));
    }
    @Test
    void R002_T003(){
        assertThrows(NegativeNumberException.class,()->calculate.add(30,-10));
    }
    @Test
    void R002_T004(){
        assertThrows(NegativeNumberException.class,()->calculate.add(-30,-10));
    }
    @Test
    void R002_T005(){
        assertEquals(30,calculate.add(30,0));
    }
    @Test
    void R002_T006(){
        assertEquals(10,calculate.add(0,10));
    }
    @Test
    void R002_T007(){
        assertThrows(NegativeNumberException.class,()->calculate.add(-30,0));
    }
    @Test
    void R002_T008(){
        assertThrows(NegativeNumberException.class,()->calculate.add(0,-10));
    }
    }
}