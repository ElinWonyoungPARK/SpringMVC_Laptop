package com.example.demo.sym.service;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
	public int insertMany(List<Teacher>list);
}