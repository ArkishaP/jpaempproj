package jpaempproj.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaempproj.model.Employees;

public class EmpDao {
	public boolean addEmp(Employees emp) {
		boolean flag = false;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			flag=true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return flag;
	}
}
