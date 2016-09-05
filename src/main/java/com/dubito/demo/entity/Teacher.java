package com.dubito.demo.entity;

import java.util.List;

public class Teacher {

	 private Integer id;                 //id
	 private String name;                //姓名
	 private String number;              //工号,保证唯一
	 private String gender;              //性别
	 private Integer age;                //年龄
	 private List<Student> students;     //所教学生集合
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	 
	 
}
