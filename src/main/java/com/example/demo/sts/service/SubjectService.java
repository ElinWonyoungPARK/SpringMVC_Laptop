package com.example.demo.sts.service;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.sts.service.GradeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	@Autowired SubjectMapper subjectMapper;
	@Autowired DummyGenerator dummy;
	
	public void insertMany(int count) {
		
		var l1 = Arrays.asList("Java","Spring","Python","jQuery","eGovframe");
		var l2 = Arrays.asList("Java 언어","Spring 프레임워크","Python 언어","jQuery 라이브러리","전자정부 ");
		Subject s = null;
		var list = new ArrayList<Subject>();
		for(int i=0; i< count; i++) {
			s = new Subject();
			s.setDescription(l2.get(i));
			s.setSubject(l1.get(i));
			list.add(s);
		}
		subjectMapper.insertMany(list);
    }
}
