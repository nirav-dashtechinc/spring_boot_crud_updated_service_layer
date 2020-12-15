package com.crud.spring_boot_crud_updated_service_layer.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring_boot_crud_updated_service_layer.entity.Student;
import com.crud.spring_boot_crud_updated_service_layer.service.StudentService;

@RestController
@RequestMapping("/students")
public class RestStudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/city/{city}")
	public List<Student> findByCity(@PathVariable("city") String city) {
		System.out.println("city student contoller: " + city);
		return studentService.findByCity(city);
	}

	@GetMapping("/{id}")
	public Optional<Student> findById(@PathVariable("id") int id) {
		return studentService.findById(id);
	}

	@PostMapping
	public List<Student> save(@RequestBody Student student) {
		studentService.save(student);
		return studentService.findAll();
	}

	@PutMapping
	public List<Student> update(@RequestBody Student student) {
		studentService.update(student);
		return studentService.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Student> delete(@PathVariable("id") int id) {
		studentService.delete(id);
		return studentService.findAll();
	}
}
