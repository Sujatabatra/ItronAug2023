package com.sujata.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @BeforeAll
    public static void setUpBeforeClass(){
        System.out.println("Hi I am setUpBeforeClass()");
    }

    @AfterAll
    public static void tearDownAfterClass(){
        System.out.println("Hi I am tearDownAfterClass");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Hi I am setUp Method");

    }

    @AfterEach
    void tearDown() {
        System.out.println("Hi I am tearDownMethod");
    }

    @Test
    void testCaseOne() {
        System.out.println("Hi I am Test Case One");
    }

    @Test
    void testCaseTwo() {
        System.out.println("Hi I am Test Case Two");
    }
}