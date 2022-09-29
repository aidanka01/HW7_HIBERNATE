package com.peaksoft.service;

import com.peaksoft.entity.Employee;
import com.peaksoft.util.Util;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class EmployeeService {
    public static Employee createEmployee(Employee employee) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("User successfully created");
        return employee;
    }

    public static List<Employee> getEmployeeByNameAge() {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        List<Employee> employee = session.createQuery("FROM Employee e where e.name = 'Aza' and e.age >20").getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("Found " + employee.size() + " employee");
        return employee;
    }


    public static void updateAge(int id, Employee employee1) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        employee.setName(employee1.getName());
        employee.setLastname(employee1.getLastname());
        employee.setAge(employee1.getAge());
        session.getTransaction().commit();
        session.close();
    }

    public static void deleteByName(String name) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Employee WHERE name =:name").setParameter("name",name);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted all employees with name 'Aza'");
    }

}
