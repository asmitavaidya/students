package io.cimmarron.Dao;

import java.util.Collection;

import io.cimmarron.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void removeStudentByStudentId(int id);

	void updateStudent(int id, Student student);

	Student insertStudent(Student student);

}