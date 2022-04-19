package com.controller;


public class DeleteAdminException extends RuntimeException{

	private int id;
	public DeleteAdminException(int id) {
		super("id " + id + " not found");
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "id " + id + " is not avaliable";
	}
	
}

