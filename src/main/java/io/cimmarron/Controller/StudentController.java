package io.cimmarron.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.cimmarron.Entity.Student;
import io.cimmarron.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id) {
		studentService.removeStudentById(id);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void updateStudentById(@PathVariable("id") int id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Student insertStudent(@RequestBody Student student) {
		System.out.println(student);
		return studentService.insertStudent(student); 
	}
	
}
