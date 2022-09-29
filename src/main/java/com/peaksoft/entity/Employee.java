package com.peaksoft.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString


public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_lastname")
    private String lastname;
    private int age;

    public Employee() {

    }

    public Employee(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }


}
