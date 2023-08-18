package com.sujata.persistence;

import com.sujata.entity.Employee;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeDaoImplTest {

    private EmployeeDao employeeDao;
    @BeforeEach
    void setUp() {
        employeeDao=new EmployeeDaoImpl();
    }

    @AfterEach
    void tearDown() {
        employeeDao=null;
    }

    @Order(3)
    @Test
    void testGetRecordByIdPositive() {
        assertTrue(employeeDao.getRecordById(6).isPresent());
    }

    @Order(6)
    @Test
    void testGetRecordByIdNegative() {
        assertFalse(employeeDao.getRecordById(6).isPresent());
    }

    @Order(1)
    @Test
    void testAddRecordPositive(){
        assertEquals(1,employeeDao.addRecord(new Employee(6,"FFFF","Executive","Sales",56000)));

    }

    @Order(2)
    @Test
    void testAddRecordNegative(){
        assertEquals(0,employeeDao.addRecord(new Employee(6,"FFFF","Executive","Sales",56000)));

    }

    @Test
    @Order(4)
    void testDeleteRecordPositive(){
        assertEquals(1,employeeDao.deleteRecordById(6));
    }

    @Test
    @Order(5)
    void testDeleteRecordNegative(){
        assertEquals(0,employeeDao.deleteRecordById(6));
    }
}