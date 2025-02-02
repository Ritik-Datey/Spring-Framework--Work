package com.springwork.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springwork.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void save(Employee employee) {
		entityManager.persist(employee);
		System.out.println("Employee Added!");
	}
	
	public Employee getById(int id) {
		return entityManager.find(Employee.class, id);
	}
	
	public List<Employee> getAll(){
		 return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
	}
	
	
	public void delete(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		if(emp!=null) {
			entityManager.remove(emp);
		}
		
	}

}
