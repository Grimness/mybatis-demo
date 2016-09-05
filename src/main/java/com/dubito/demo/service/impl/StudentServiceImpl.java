package com.dubito.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.dubito.demo.dao.StudentMyBatisDao;
import com.dubito.demo.entity.Student;
import com.dubito.demo.service.StudentService;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
	
	 private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	 
	 @Autowired
	 private StudentMyBatisDao studentMyBatisDao;
	 
	@Override
	public void addStudent(Student student) throws Exception {
		 logger.info("添加学生信息{}", JSONObject.toJSONString(student));
		 Student another = studentMyBatisDao.findStudentByNumber(student.getName());
		 if (another != null && another.getId() != student.getId())
	            throw new Exception("参数异常，number重复");
	        int result = studentMyBatisDao.addStudent(student);
	        if (result != 1)
	            throw new Exception("添加学生信息失败");
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Student findStudentByNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllWithTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectTeachers(Long studentId, List<Long> teacherIds) throws Exception {
		// TODO Auto-generated method stub

	}

}
