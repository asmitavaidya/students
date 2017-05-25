package io.cimmarron.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.cimmarron.Dao.StudentDao;
import io.cimmarron.Entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier("postgres")
	private StudentDao studentDao;
	
	public	Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public void removeStudentById(int id) {
		this.studentDao.removeStudentByStudentId(id);
		
	}

	public void updateStudent(int id, Student student) {
		this.studentDao.updateStudent(id, student);		
	}

	public Student insertStudent(Student student) {
		return this.studentDao.insertStudent(student);	
	}


}
