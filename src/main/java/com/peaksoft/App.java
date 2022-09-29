package com.peaksoft;

import com.peaksoft.entity.Employee;
import com.peaksoft.service.EmployeeService;

import static com.peaksoft.service.EmployeeService.createEmployee;
import static com.peaksoft.service.EmployeeService.getEmployeeByNameAge;
import static com.peaksoft.service.EmployeeService.updateAge;

/**
 * Aidana!
 */
public class App {
    public static void main(String[] args) {

        // CREATE
        createEmployee(new Employee("Aza", "Kadyrov", 18));
        createEmployee(new Employee("Emma", "Todorenko", 25));
        createEmployee(new Employee("Kelly", "Tailor", 28));
        createEmployee(new Employee("Johnson", "Gossip", 22));
        createEmployee(new Employee("Aza", "Umarov", 21));
        createEmployee(new Employee("Aza", "Ulukov", 28));

        // GET age where e.name Aza and age > 20
        getEmployeeByNameAge();

        // UPDATE age where e.name 'Aza' to 18
        updateAge(5, new Employee("Aza", "Umarov", 18));
        updateAge(6, new Employee("Aza", "Ulukov", 18));

        // DELETE BY NAME where e.name = 'Aza'
        EmployeeService.deleteByName("Aza");


    }
}