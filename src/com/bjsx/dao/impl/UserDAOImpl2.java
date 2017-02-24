package com.bjsx.dao.impl;

import org.springframework.stereotype.Component;

import com.bjsx.dao.UserDAO;
import com.bjsx.spring.User;

@Component("dao2")
public class UserDAOImpl2 implements UserDAO{
	
	private int uId;
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}
	@Override
	public void save(User u) {
		System.out.println("Aloha");
		
	}

	@Override
	public String toString() {
		return "uId= "+uId;
	}
}
