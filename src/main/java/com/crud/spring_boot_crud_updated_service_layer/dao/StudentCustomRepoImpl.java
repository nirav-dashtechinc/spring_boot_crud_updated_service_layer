package com.crud.spring_boot_crud_updated_service_layer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.spring_boot_crud_updated_service_layer.entity.Student;

public class StudentCustomRepoImpl implements StudentCustomRepo {

	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByCity(String city) {
		Query query = entityManager
				.createNativeQuery("SELECT * FROM crm.students WHERE city LIKE '%" + city + "%'",
				Student.class);
		return query.getResultList();
	}
}
