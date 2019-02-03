package com.example.aop.aopproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.aopproject.dao.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String calculateSomething() {
		System.out.println("Inside Business 1 Layer");
		return dao1.getData();
	}

}
