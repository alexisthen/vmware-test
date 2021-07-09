package com.vmware.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmware.test.entity.Cab;


@Repository
public interface CabServiceRepo extends JpaRepository<Cab, String>{

}
