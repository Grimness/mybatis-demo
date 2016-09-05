package com.dubito.demo.service;

import java.util.List;

import com.dubito.demo.entity.Student;

public interface StudentService {

	public void addStudent(Student student) throws Exception;

	public void updateStudent(Student student) throws Exception;

	public Student findStudentByNumber(String number);

	public List<Student> findAll();

	public List<Student> findAllWithTeachers();

	public void selectTeachers(Long studentId, List<Long> teacherIds) throws Exception;
}
