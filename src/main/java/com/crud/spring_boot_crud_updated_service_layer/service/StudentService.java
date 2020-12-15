package com.crud.spring_boot_crud_updated_service_layer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring_boot_crud_updated_service_layer.dao.StudentRepository;
import com.crud.spring_boot_crud_updated_service_layer.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Optional<Student> findById(int id) {
		return studentRepository.findById(id);
	}

	public List<Student> save(Student student) {
		studentRepository.save(student);
		return studentRepository.findAll();
	}

	public List<Student> update(Student student) {
		studentRepository.save(student);
		return studentRepository.findAll();
	}

	public List<Student> delete(int id) {
		studentRepository.delete(studentRepository.findById(id).get());
		return studentRepository.findAll();
	}

	public List<Student> findByCity(String city) {
		return studentRepository.findByCity(city);
	}
}
