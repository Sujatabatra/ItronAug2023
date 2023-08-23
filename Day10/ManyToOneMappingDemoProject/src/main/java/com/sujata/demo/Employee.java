package com.sujata.demo;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="EmpHiber")
public class Employee {
    @Id
    private int empId;
    private String empName;
    private String empDesignation;
    private double salary;

    @ManyToOne
    private Project project;
}
