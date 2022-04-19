package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdminService;

@RestController
public class AdminRestController {
@Autowired
AdminService adminservices;

}

