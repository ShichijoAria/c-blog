package org.yorha.cblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yorha.cblog.Entity.PersonEntity;
import org.yorha.cblog.Entity.UserEntity;
import org.yorha.cblog.service.UserService;


@RestController
public class TestController {
	@Autowired
	private UserService userService;

	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@PostMapping("persion/getPersion/{id}.json")
	@ResponseBody
	public PersonEntity getPersion(@PathVariable("id") String id) {
		log.info("ID:" + id);
		return new PersonEntity("1", "leftso", 1, "重庆.大竹林");
	}

}