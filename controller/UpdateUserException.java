package com.controller;

public class UpdateUserException<Userr> extends RuntimeException{
	private int id;
	
	public UpdateUserException(Userr userr) {
		super("User Id is not available in Database to update");
		this.id = id;
	}

	@Override
	public String toString() {
		return "User Id "+id+" is not available in Database to update";
	}
	
}
