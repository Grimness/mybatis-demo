package com.dubito.demo.dao;

import java.util.List;

import com.dubito.demo.entity.Student;

@MyBatisRepository
public interface StudentMyBatisDao {
 
	
	int addStudent(Student student);

    int updateStudent(Student student);

    Student findStudentByNumber(String number);

    Student findStudentById(Long id);

    List<Student> findAll();

    List<Student> findAllWithTeachers();

    int selectTeachers(Long studentId, List<Long> teacherIds);
}
