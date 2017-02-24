package com.bjsx.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.bjsx.dao.UserDAO;
import com.bjsx.spring.User;

@Component("dao1")
public class UserDAOImpl1 implements UserDAO {

	private int uId;
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	private Set<String> set;

	private List<String> list;
	private Map<String, String> map;
	
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	@Override
	public String toString() {
		//return "uId= "+uId+"/tsetSize="+set.size()+"/tlistSize="+list.size()+"/tmapSize="+map.size();
		return "uId="+uId;
	}

}
