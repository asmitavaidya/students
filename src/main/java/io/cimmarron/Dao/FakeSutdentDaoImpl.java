package io.cimmarron.Dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import io.cimmarron.Entity.*;

@Repository
public class FakeSutdentDaoImpl implements StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Saiyid", "Computer Science"));
				put(2, new Student(2, "Alex", "Math"));
				put(3, new Student(3, "Anna", "Physics"));
			}
			
		};
	}
	
	/* (non-Javadoc)
	 * @see io.cimmarron.Dao.StudentDao#getAllStudents()
	 */
	@Override
	public	Collection<Student> getAllStudents() {
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see io.cimmarron.Dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see io.cimmarron.Dao.StudentDao#removeStudentByStudentId(int)
	 */
	@Override
	public void removeStudentByStudentId(int id) {
		this.students.remove(id);
	}

	/* (non-Javadoc)
	 * @see io.cimmarron.Dao.StudentDao#updateStudent(io.cimmarron.Entity.Student)
	 */
	@Override
	public void updateStudent(int id, Student student) {
		Student s = students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());		
	}

	/* (non-Javadoc)
	 * @see io.cimmarron.Dao.StudentDao#insertStudent(io.cimmarron.Entity.Student)
	 */
	@Override
	public Student insertStudent(Student student) {
		return this.students.put(student.getId(), student);
	}

}
