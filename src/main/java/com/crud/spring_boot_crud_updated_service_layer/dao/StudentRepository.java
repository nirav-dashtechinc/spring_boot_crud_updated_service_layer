package com.crud.spring_boot_crud_updated_service_layer.dao;

import org.springframework.stereotype.Repository;
import com.crud.spring_boot_crud_updated_service_layer.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends
	JpaRepository<Student, Integer>, StudentCustomRepo {
}

