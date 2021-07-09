package com.vmware.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmware.test.entity.Cab;
import com.vmware.test.entity.Driver;
import com.vmware.test.entity.User;
import com.vmware.test.repository.CabServiceRepo;
import com.vmware.test.repository.DriverServiceRepo;
import com.vmware.test.repository.UserServiceRepo;

@Service
public class CabService {

	@Autowired
	CabServiceRepo cabRepo;
	@Autowired
	DriverServiceRepo driverRepo;
	@Autowired
	UserServiceRepo userRepo;

	public boolean registerCab(Cab cab) {

		boolean status = cabRepo.save(cab) != null;

		return status;

	}

	public boolean registerDriver(Driver driver) {

		boolean status = driverRepo.save(driver) != null;

		return status;

	}

	public boolean registerUser(User user) {

		boolean status = userRepo.save(user) != null;

		return status;

	}

}
