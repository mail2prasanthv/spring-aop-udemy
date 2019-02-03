package com.example.aop.aopproject.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.aopproject.dao.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	@TrackTime
	public String calculateSomething() {
		System.out.println("Inside Business 2 Layer");
		return dao2.getData();
	}
}
