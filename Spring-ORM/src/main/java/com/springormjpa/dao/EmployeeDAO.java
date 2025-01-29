package com.springormjpa.dao;

import java.util.List;

import com.springormjpa.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class EmployeeDAO {
    
    private EntityManager entityManager;

    // Constructor Injection
    public EmployeeDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void saveEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class, id);
    }
    
    public void deleteEmployeeById(int id) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            entityManager.remove(employee);
        }
        entityManager.getTransaction().commit();
    }
    
    public void updateEmployeeById(int id, double newSalary) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, id);
        if (employee != null) {
            // Update properties
            employee.setEmpSalary(newSalary);
            
            // No need to explicitly call persist or merge if the entity is managed
       //     entityManager.merge(employee); // This is technically optional, as JPA will automatically track changes to managed entities
        }
        entityManager.getTransaction().commit();
    }

    public List<Employee> getAllEmployees() {
        String jpql = "SELECT e FROM Employee e";
        List<Employee> employees = entityManager.createQuery(jpql, Employee.class).getResultList();
        return employees;
    }

}
