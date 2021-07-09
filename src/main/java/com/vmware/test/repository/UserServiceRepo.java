package com.vmware.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmware.test.entity.User;


@Repository
public interface UserServiceRepo extends JpaRepository<User, String> {

}
