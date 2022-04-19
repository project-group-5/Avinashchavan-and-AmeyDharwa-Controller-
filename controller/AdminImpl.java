package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDaoImpl;
import com.model.Admin;

@Service
public class AdminImpl<admindao> {
@Autowired
Admin admindao;

	public void add(Admin admin) {
    admindao.addAdmin(admin);
	}

	public Admin find(Admin id) {
		return admindao.addAdmin(id);
	}
	
	public List<Admin> findAll() {
		return admindao.findAllAdmin();
	}
	
	public boolean update(Admin admin) {
		return AdminDaoImpl.update(admin);
	}
	
	public boolean delete(int id) {
		return com.controller.Admin.deleteAdmin(id);
	}
}

