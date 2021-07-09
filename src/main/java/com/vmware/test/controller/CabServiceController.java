package com.vmware.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.vmware.test.entity.Cab;
import com.vmware.test.entity.Driver;
import com.vmware.test.entity.User;
import com.vmware.test.service.CabService;

@RestController
@RequestMapping("/cabservice/v1")
public class CabServiceController {

	Logger logger = LoggerFactory.getLogger(CabServiceController.class);
	
	@Autowired
	CabService service;

	@PostMapping("/register/cab")
	public String registerCab(@RequestBody Cab cab) {

		boolean status = service.registerCab(cab);
		if (status) {
			logger.info("Registration Successful");
			return "Registration Successful";
		} else {
			return "Registration unsuccessful";
		}
	}

	@PostMapping("/register/driver")
	public String registerDriver(@RequestBody Driver driver) {

		boolean status = service.registerDriver(driver);
		if (status) {
			logger.info("Registration Successful");
			return "Registration Successful";
		} else {
			return "Registration unsuccessful";
		}
	}

	@PostMapping("/register/user")
	public String registerUser(@RequestBody User user) {

		boolean status = service.registerUser(user);
		if (status) {
			logger.info("Registration Successful");
			return "Registration Successful";
		} else {
			return "Registration unsuccessful";
		}
	}

	// url will be with REquestParam /bookCab?lat_x1=XXX.XX&lat_x2=XXX.XX&lon_y1=YYY.YY&lon_y2=YYY.YY
	@PostMapping("/BookCab")
	public Cab bookCab(@RequestParam(value="lat") double lat_x1,
			@RequestParam(value="lat") double lat_x2,
			@RequestParam(value="lat") double lon_y1,
			@RequestParam(value="lon") double lon_y2) {
		
		Cab cab = new Cab();
		
		double distance = Math.sqrt(Math.pow((lat_x1-lat_x2),2.0) + Math.pow((lon_y1-lon_y2), 2.0));
		
		return cab;
	}

}
