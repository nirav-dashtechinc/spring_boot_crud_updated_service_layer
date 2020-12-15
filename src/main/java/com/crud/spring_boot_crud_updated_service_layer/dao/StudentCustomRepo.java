package com.crud.spring_boot_crud_updated_service_layer.dao;

import java.util.List;

import com.crud.spring_boot_crud_updated_service_layer.entity.Student;

public interface StudentCustomRepo {
	public List<Student> findByCity(String city);
}
